package de.van_porten.vrest.ui.diagram.method.action.returnaction;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class UpdateReturnActionFeature extends AbstractUpdateFeature {

	public UpdateReturnActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof ReturnAction);
	}

	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		PictogramElement pictogramElement = context.getPictogramElement();

		boolean updateStatusCodeNeeded = false;

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					if (PropertyUtil.isReturnActionStatusCodeShape(shape)) {
						UpdateContext updateContext = new UpdateContext(shape);
						IUpdateFeature updateFeature = getFeatureProvider()
								.getUpdateFeature(updateContext);
						updateStatusCodeNeeded = updateFeature.updateNeeded(
								updateContext).toBoolean();
					}
				}
			}
		}

		if (updateStatusCodeNeeded) {
			return Reason.createTrueReason("StatusCode is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		boolean retVal = false;
		PictogramElement pictogramElement = context.getPictogramElement();

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					if (PropertyUtil.isReturnActionStatusCodeShape(shape)) {
						UpdateContext updateContext = new UpdateContext(shape);
						IUpdateFeature updateFeature = getFeatureProvider()
								.getUpdateFeature(updateContext);
						retVal = updateFeature.update(updateContext);
					}
				}
			}
		}

		return retVal;
	}
}
