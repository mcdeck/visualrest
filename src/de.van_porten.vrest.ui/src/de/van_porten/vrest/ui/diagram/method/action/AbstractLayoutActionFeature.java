package de.van_porten.vrest.ui.diagram.method.action;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public abstract class AbstractLayoutActionFeature extends AbstractLayoutFeature {

	public AbstractLayoutActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		Object businessObject = getBusinessObjectForPictogramElement(pe);
		return businessObject instanceof Action;
	}

	private final int getMinWidth() {
		return AbstractAddActionFeature.minWidth;
	}

	private final int getMinHeight() {
		return AbstractAddActionFeature.minHeight;
	}

	protected boolean layoutChildShape(final IGaService gaService,
			final Shape shape, int containerWidth, int containerHeight) {
		boolean anythingChanged = false;
		if (LayoutUtil.isAutoLayoutEnabled(shape)) {
			anythingChanged = LayoutUtil.doAutoLayout(gaService,
					containerWidth, containerHeight, shape);
		}
		return anythingChanged;
	}

	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		IGaService gaService = Graphiti.getGaService();

		// height
		if (containerGa.getHeight() < getMinHeight()) {
			containerGa.setHeight(getMinHeight());
			anythingChanged = true;
		}

		// width
		if (containerGa.getWidth() < getMinWidth()) {
			containerGa.setWidth(getMinWidth());
			anythingChanged = true;
		}

		int containerWidth = containerGa.getWidth();
		int containerHeight = containerGa.getHeight();

		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();

			if (PropertyUtil.hasShapeId(shape,
					AbstractAddActionFeature.shapeIdStereotypeLabel)) {
				ga.setWidth(containerWidth);
				gaService.setSize(ga, AbstractAddActionFeature
						.calculateStereotypeWidth(containerWidth),
						AbstractAddActionFeature
								.calculateStereotypeHeight(containerHeight));
				anythingChanged = true;
			} else if (PropertyUtil.hasShapeId(shape,
					AbstractAddActionFeature.shapeIdIconContainer)) {
				gaService.setLocationAndSize(ga, 0, 0,
						AbstractAddActionFeature.iconWidth,
						AbstractAddActionFeature.iconHeight);
				anythingChanged = true;
			} else if (PropertyUtil.hasShapeId(shape,
					AbstractAddActionFeature.shapeIdAdditionalTextContainer)) {
				// ga.setWidth(containerWidth);
				gaService
						.setSize(
								ga,
								AbstractAddActionFeature
										.calculateAdditionalTextWidth(containerWidth),
								AbstractAddActionFeature
										.calculateAdditionalTextHeight(containerHeight));
				anythingChanged = true;

				if (shape instanceof ContainerShape) {
					for (Shape childShape : ((ContainerShape) shape)
							.getChildren()) {
						layoutChildShape(gaService, childShape, containerWidth,
								containerHeight);
					}
				}
			} else if (LayoutUtil.isAutoLayoutEnabled(shape)) {
				anythingChanged = anythingChanged
						| LayoutUtil.doAutoLayout(gaService, containerWidth,
								containerHeight, shape);
			}
		}

		return anythingChanged;
	}

}
