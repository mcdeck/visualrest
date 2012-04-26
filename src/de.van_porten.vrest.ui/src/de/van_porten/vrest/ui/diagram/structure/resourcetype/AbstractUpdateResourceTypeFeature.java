package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AbstractUpdateResourceTypeFeature extends AbstractUpdateFeature {

	public AbstractUpdateResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (bo instanceof ResourceType);
	}

	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();

		boolean updateIdentifierNeeded = false;
		boolean updateNameNeeded = false;
		boolean updateAttributesNeeded = false;

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text
						&& PropertyUtil.isResourceTypeNameShape(shape)) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					pictogramName = text.getValue();

					String businessName = null;
					Object bo = getBusinessObjectForPictogramElement(pictogramElement);
					if (bo instanceof ResourceType) {
						ResourceType rt = (ResourceType) bo;
						businessName = rt.getName();
					}

					updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
							.equals(businessName)));

				} else if (shape.getGraphicsAlgorithm() instanceof Text
						&& PropertyUtil.isResourceTypeIdentifierShape(shape)) {
					UpdateContext updateIdentifier = new UpdateContext(shape);
					IUpdateFeature feature = getFeatureProvider()
							.getUpdateFeature(updateIdentifier);
					updateIdentifierNeeded = feature.updateNeeded(
							updateIdentifier).toBoolean();

				} else if (shape instanceof ContainerShape) {
					Object bo = getBusinessObjectForPictogramElement(shape);
					updateAttributesNeeded = false;
					if (bo instanceof ResourceType) {
						ResourceType rt = (ResourceType) bo;
						int numberOFAttributes = 0;
						for (ResourceElement resourceElement : rt
								.getResourceelements()) {
							if (resourceElement instanceof Attribute) {
								numberOFAttributes++;
							}
						}
						if (numberOFAttributes != ((ContainerShape) shape)
								.getChildren().size()) {
							updateAttributesNeeded = true;
						} else {
							for (Shape resourceShape : ((ContainerShape) shape)
									.getChildren()) {
								UpdateContext updateChildren = new UpdateContext(
										resourceShape);
								IUpdateFeature feature = getFeatureProvider()
										.getUpdateFeature(updateChildren);
								updateAttributesNeeded = feature.updateNeeded(
										updateChildren).toBoolean();
								if (updateAttributesNeeded) {
									break;
								}
							}
						}
					}
				}
			}
		}

		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date");
		} else if (updateIdentifierNeeded) {
			return Reason.createTrueReason("Idenfitier is out of date");
		} else if (updateAttributesNeeded) {
			return Reason
					.createTrueReason("Some or all attributes are out of date");
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
				if (shape.getGraphicsAlgorithm() instanceof Text
						&& PropertyUtil.isResourceTypeNameShape(shape)) {
					String businessName = null;
					Object bo = getBusinessObjectForPictogramElement(pictogramElement);
					if (bo instanceof ResourceType) {
						ResourceType rt = (ResourceType) bo;
						businessName = rt.getName();

						Text text = (Text) shape.getGraphicsAlgorithm();
						text.setValue(businessName);
						retVal = true;
					}

				} else if (shape.getGraphicsAlgorithm() instanceof Text
						&& PropertyUtil.isResourceTypeIdentifierShape(shape)) {
					UpdateContext updateIdentifier = new UpdateContext(shape);
					IUpdateFeature feature = getFeatureProvider()
							.getUpdateFeature(updateIdentifier);
					retVal = feature.update(updateIdentifier);

				} else if (shape instanceof ContainerShape) {
					if (PropertyUtil.isAttributeContainerShape(shape)) {
						Object bo = getBusinessObjectForPictogramElement(shape);
						if (bo instanceof ResourceType) {
							ResourceType rt = (ResourceType) bo;

							EList<Shape> childShapes = ((ContainerShape) shape)
									.getChildren();
							int size = childShapes.size();
							int removeCounter = 0;
							for (int childCount = 0; childCount < size; childCount++) {
								Shape childShape = childShapes
										.get(removeCounter);
								IRemoveContext removeContext = new RemoveContext(
										childShape);
								IRemoveFeature removeFeature = getFeatureProvider()
										.getRemoveFeature(removeContext);
								if (removeFeature.canRemove(removeContext)) {
									removeFeature.execute(removeContext);
								} else {
									// The current child cannot be removed, so
									// from here on we need
									// to delete the next item in the list
									// always
									removeCounter += 1;
								}
							}

							for (ResourceElement resourceElement : rt
									.getResourceelements()) {
								if (resourceElement instanceof Attribute) {
									AddContext addContext = new AddContext();
									addContext
											.setTargetContainer((ContainerShape) shape);
									addContext.setNewObject(resourceElement);
									addGraphicalRepresentation(addContext,
											resourceElement);
								}
							}
						}
					}
				}
			}
		}
		return retVal;
	}
}
