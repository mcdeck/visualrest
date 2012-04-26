package de.van_porten.vrest.ui.diagram.method.method;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class UpdateMethodFeature extends AbstractUpdateFeature {

	public UpdateMethodFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof Method);
	}

	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();

		// this cast should be safe - canUpdate already checked for this
		Method method = (Method) getBusinessObjectForPictogramElement(context
				.getPictogramElement());

		boolean updateNameNeeded = false;
		boolean updateConsumedNeeded = false;
		boolean updateProducedNeeded = false;

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (PropertyUtil.hasShapeId(shape,
						AddMethodFeature.shapeIdMethodHeader)) {
    				// Should be true, but let's make sure
					if (shape instanceof ContainerShape) {
						for (Shape headChildShape : ((ContainerShape) shape)
								.getChildren()) {
							if (headChildShape.getGraphicsAlgorithm() instanceof Text
									&& PropertyUtil
											.isStateNameShape(headChildShape)) {
								Text text = (Text) headChildShape
										.getGraphicsAlgorithm();
								pictogramName = text.getValue();

								String businessName = null;
								businessName = LayoutUtil.createStringFromMethod(method);
								updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
										.equals(businessName)));
							}
						}
					}
				} else if(PropertyUtil.hasShapeId(shape,
						AddMethodFeature.shapeIdConsumedTypes)) {
					if (shape instanceof ContainerShape) {
						if( ((ContainerShape) shape).getChildren().size() !=  method.getConsumed().size() ) {
							updateConsumedNeeded = true;
						} else {
							// compare individual objects
							int numChildren = method.getConsumed().size();
							for (int i = 0; i < numChildren; i++) {
								// TODO
							}
						}
					}
				} else if(PropertyUtil.hasShapeId(shape,
						AddMethodFeature.shapeIdProducedTypes)) {
					if (shape instanceof ContainerShape) {
						if( ((ContainerShape) shape).getChildren().size() !=  method.getProduced().size() ) {
							updateProducedNeeded = true;
						} else {
							// compare individual objects
							int numChildren = method.getProduced().size();
							for (int i = 0; i < numChildren; i++) {
								// TODO
							}
						}
					}
				}
			}
		}

		if (updateNameNeeded) {
			return Reason.createTrueReason("Name and/or type is out of date");
		} else if (updateConsumedNeeded) {
			return Reason.createTrueReason("Consumed Media Types are out of date");
		} else if (updateProducedNeeded) {
			return Reason.createTrueReason("Produced Media Types are out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		boolean retVal = false;
		PictogramElement pictogramElement = context.getPictogramElement();

		// Set name in pictogram model
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (PropertyUtil.hasShapeId(shape,
						AddMethodFeature.shapeIdMethodHeader)) {
					if (shape instanceof ContainerShape) { // Should be true,
															// but let's make
															// sure
						for (Shape headChildShape : ((ContainerShape) shape)
								.getChildren()) {
							if (headChildShape.getGraphicsAlgorithm() instanceof Text
									&& PropertyUtil
											.isStateNameShape(headChildShape)) {
								String businessName = null;
								Object bo = getBusinessObjectForPictogramElement(pictogramElement);
								if (bo instanceof Method) {
									Method method = (Method) bo;
									businessName = LayoutUtil
											.createStringFromMethod(method);
								}

								Text text = (Text) headChildShape
										.getGraphicsAlgorithm();
								text.setValue(businessName);
								retVal = true;
							}
						}
					}
				}
			}
		}

		return retVal;
	}
}
