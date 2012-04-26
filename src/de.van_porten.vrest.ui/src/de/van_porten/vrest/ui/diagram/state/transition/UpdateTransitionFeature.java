package de.van_porten.vrest.ui.diagram.state.transition;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.ui.util.LayoutUtil;

public class UpdateTransitionFeature extends AbstractUpdateFeature {

	public UpdateTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (pictogramElement instanceof Shape)
				&& (bo instanceof Transition);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();

		if( !(pictogramElement instanceof Shape) ) {
			return Reason.createFalseReason();
		}

		Shape shape = (Shape) pictogramElement;
		if (shape.getGraphicsAlgorithm() instanceof Text) {
			Text text = (Text) shape.getGraphicsAlgorithm();
			pictogramName = text.getValue();
		}

		// retrieve name from business model
		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Transition) {
			Transition transition = (Transition) bo;
			businessName = LayoutUtil
					.createStringForTransitionTriggers(transition);
		}

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		if (updateNameNeeded) {
			return Reason.createTrueReason("Triggers are out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Transition) {
			Transition transition = (Transition) bo;
			businessName = LayoutUtil
					.createStringForTransitionTriggers(transition);
		}

		// Set name in pictogram model
		if (pictogramElement instanceof Shape) {
			Shape shape = (Shape) pictogramElement;
			if (shape.getGraphicsAlgorithm() instanceof Text) {
				Text text = (Text) shape.getGraphicsAlgorithm();
				text.setValue(businessName);
				return true;
			}
		}

		return false;
	}

}
