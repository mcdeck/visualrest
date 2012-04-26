package de.van_porten.vrest.ui.diagram.structure.attribute;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddAttributeFeature extends AbstractAddShapeFeature {

	public AddAttributeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof Attribute) {
			if (context.getTargetContainer() instanceof Shape
					&& PropertyUtil.isAttributeContainerShape(context
							.getTargetContainer())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Attribute addedClass = (Attribute) context.getNewObject();
		ContainerShape containerShape = context.getTargetContainer();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		if (addedClass.eResource() == null) {
			System.out.println("No resource for addedClass " + addedClass.getClass().getSimpleName() + "!");
		}

		int pos_x = 5;
		int pos_y_inc = 15;
		int pos_y = 0 + (containerShape.getChildren().size() * pos_y_inc);

		/* Add the elements name and type as text */
		Shape shape = peCreateService.createShape(containerShape, false);
		// create and set text graphics algorithm
		Text text = gaService.createDefaultText(getDiagram(), shape,
				LayoutUtil.createStringFromAttribute(addedClass) );
		text.setForeground(manageColor(IColorConstant.BLACK));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		gaService.setLocationAndSize(text, pos_x, pos_y, containerShape
				.getGraphicsAlgorithm().getWidth(), 25);

		link(shape, addedClass);

		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}
}
