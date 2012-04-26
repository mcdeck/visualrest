package de.van_porten.vrest.ui.diagram.method.actionsequence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ActionSequence;
import de.van_porten.vrest.ui.diagram.method.action.ActionUtil;

/**
 * Helper Feature to add an existing action sequence to a diagram
 *
 * @author porten
 *
 */
public class AddActionSequenceFeature extends AbstractAddFeature {

	public AddActionSequenceFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof ActionSequence
				&& context.getTargetContainer() instanceof ContainerShape
				&& (ActionUtil.targetIsMethod(context) || ActionUtil
						.targetIsConditionalAction(context));
	}

	@Override
	public PictogramElement add(IAddContext context) {
		ActionSequence seq = (ActionSequence) context.getNewObject();

		EList<Action> actions = seq.getActionelements();
		AnchorContainer previousAction = null;
		AddSequenceConnectionFeature addConnectionFeature = new AddSequenceConnectionFeature(
				getFeatureProvider());
		for (Action action : actions) {
			AddContext internalAddContext = new AddContext();
			internalAddContext.setNewObject(action);
			internalAddContext.setTargetContainer(context.getTargetContainer());
			internalAddContext.setHeight(context.getHeight());
			internalAddContext.setWidth(context.getWidth());
			internalAddContext.setX(context.getX());
			internalAddContext.setY(context.getY());
			IAddFeature addFeature = getFeatureProvider().getAddFeature(
					internalAddContext);
			if (addFeature != null && addFeature.canAdd(internalAddContext)) {
				PictogramElement thisActionPE = addFeature
						.add(internalAddContext);
				if (thisActionPE != null
						&& thisActionPE instanceof AnchorContainer) {
					if (previousAction != null) {
						Anchor sourceAnchor = previousAction.getAnchors()
								.get(0);
						Anchor targetAnchor = ((AnchorContainer) thisActionPE)
								.getAnchors().get(0);
						IAddConnectionContext addConnectionContext = new AddConnectionContext(
								sourceAnchor, targetAnchor);
						if (addConnectionFeature.canAdd(addConnectionContext)) {
							addConnectionFeature.add(addConnectionContext);
						}
					}
					previousAction = (AnchorContainer) thisActionPE;
				}
			}
		}
		return context.getTargetContainer();
	}

}
