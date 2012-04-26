package de.van_porten.vrest.ui.diagram.method.actionsequence;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.DummyConnection;

public class CreateSequenceConnectionFeature extends AbstractCreateConnectionFeature {

	public CreateSequenceConnectionFeature(IFeatureProvider fp) {
		super(fp, "Sequence Connection", "Create sequence connection between actions");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		Action source = getAction(context.getSourceAnchor());
		Action target = getAction(context.getTargetAnchor());
		if (source != null && target != null) {
			return true;
		}
		return false;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_ACTIONSEQUENCE;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		if (getAction(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		Action source = getAction(context.getSourceAnchor());
		Action target = getAction(context.getTargetAnchor());

		if (source != null && target != null) {
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			// Dummy just used to help decide in the feature provider
			addContext.setNewObject(new DummyConnection());
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);

			/* reorder according to connections made ? */
			// TODO: reordering


		}
		return newConnection;
	}

	private Action getAction(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof Action) {
				return (Action) object;
			}
		}
		return null;
	}
}
