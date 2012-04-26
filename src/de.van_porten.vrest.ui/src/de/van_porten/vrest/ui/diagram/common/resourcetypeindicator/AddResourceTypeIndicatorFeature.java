package de.van_porten.vrest.ui.diagram.common.resourcetypeindicator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddResourceTypeIndicatorFeature extends AbstractAddShapeFeature {

	private String resourceTypePrefix;

	public AddResourceTypeIndicatorFeature(String prefixText, IFeatureProvider fp) {
		super(fp);
		resourceTypePrefix = prefixText;
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof ResourceType) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		ResourceType addedClass = (ResourceType) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);

		link(containerShape, addedClass);

		int width = 230;
		int height = 50;

		PropertyUtil.setShapeId(containerShape,
				PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR);

		Rectangle rect = gaService.createRectangle(containerShape);
		rect.setFilled(true);
		rect.setForeground(manageColor(IColorConstant.BLACK));
		rect.setBackground(manageColor(IColorConstant.WHITE));
		rect.setLineWidth(1);
		gaService.setLocationAndSize(rect, context.getX(), context.getY(),
				width, height);

		/*** BEGIN: Label ***/
		{
			Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService.createDefaultText(getDiagram(), shape,
					getResourceTypePrefix() + addedClass.getName());
			text.setForeground(manageColor(IColorConstant.BLACK));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageDefaultFont(getDiagram(), true, false));
			gaService.setLocationAndSize(text, 5, 0, width, height);
		}
		/*** END: Label ***/

		/* call the layout feature */
		//layoutPictogramElement(containerShape);

		return containerShape;
	}

	public String getResourceTypePrefix() {
		return resourceTypePrefix;
	}

}
