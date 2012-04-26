package de.van_porten.vrest.ui.diagram.state.transition;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.ui.diagram.RestImageProvider;

public class CreateTransitionFeature extends AbstractCreateConnectionFeature {

	public CreateTransitionFeature(IFeatureProvider fp) {
		super(fp, "Transition", "Create Transition between States");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		State source = getState(context.getSourceAnchor());
		State target = getState(context.getTargetAnchor());
		if (source != null && target != null) {
			return true;
		}
		return false;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STATES_TRANSITION;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		if (getState(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		State source = getState(context.getSourceAnchor());
		State target = getState(context.getTargetAnchor());

		if (source != null && target != null) {
			Transition transition = createTransition(source, target);

			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(transition);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
		}

		return newConnection;
	}

	private State getState(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof State) {
				return (State) object;
			}
		}
		return null;
	}

	private Transition createTransition(State source,
			State target) {
		Transition transition = RestBehaviorFactory.eINSTANCE.createTransition();
		transition.setTargetState(target);
		source.getTransitions().add(transition);
		return transition;
	}
}
