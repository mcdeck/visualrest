package de.van_porten.vrest.ui.diagram.method.action;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ActionSequence;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.util.ResourceUtil;

public abstract class AbstractCreateActionFeature extends AbstractCreateFeature {

	public AbstractCreateActionFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
	}

	@Override
	public final boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof ContainerShape
				&& (ActionUtil.targetIsMethod(context) || ActionUtil
						.targetIsConditionalAction(context));
	}

	@Override
	public abstract String getCreateImageId();

	protected abstract Action createNewAction();

	private void saveToModelFile(EObject obj) {
		try {
			ResourceUtil.saveToModelFile(obj, getDiagram());
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public final Object[] create(ICreateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getTargetContainer());
		Action newAction = createNewAction();

		saveToModelFile(newAction);

		if (bo instanceof Method) {
			Method parent = (Method) bo;

			// If there is already an action in the behavior specification
			// we need to replace it with a action sequence first
			if (parent.getMethodbehavior().getAction() == null) {
				parent.getMethodbehavior().setAction(newAction);
			} else {
				Action oldAction = parent.getMethodbehavior().getAction();
				ActionSequence actionSequence = null;
				if (!(oldAction instanceof ActionSequence)) {
					actionSequence = RestBehaviorFactory.eINSTANCE
							.createActionSequence();
					saveToModelFile(actionSequence);
					parent.getMethodbehavior().setAction(actionSequence);
					actionSequence.getActionelements().add(oldAction);
				} else {
					actionSequence = (ActionSequence) oldAction;
				}
				actionSequence.getActionelements().add(newAction);
			}
		} else if (bo instanceof ConditionalAction) {
			ConditionalAction parent = (ConditionalAction) bo;
			// figure out to which side (TRUE|FALSE) the element was added ...
			if (parent.getActionIfTrue() == null) {
				parent.setActionIfTrue(newAction);
			} else {
				Action oldAction = parent.getActionIfTrue();
				ActionSequence actionSequence = null;
				if (!(oldAction instanceof ActionSequence)) {
					actionSequence = RestBehaviorFactory.eINSTANCE
							.createActionSequence();
					saveToModelFile(actionSequence);
					parent.setActionIfTrue(actionSequence);
					actionSequence.getActionelements().add(oldAction);
				} else {
					actionSequence = (ActionSequence) oldAction;
				}
				actionSequence.getActionelements().add(newAction);
			}
		} else {
			System.out.println("Should not happen");
			return null;
		}

		// do the add
		addGraphicalRepresentation(context, newAction);

		// return newly created business object(s)
		return new Object[] { newAction };
	}
}
