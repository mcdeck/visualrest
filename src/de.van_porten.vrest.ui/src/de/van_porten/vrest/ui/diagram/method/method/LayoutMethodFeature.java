package de.van_porten.vrest.ui.diagram.method.method;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class LayoutMethodFeature extends AbstractLayoutFeature {

	public LayoutMethodFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1
				&& businessObjects.get(0) instanceof Method;
	}

	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

		IGaService gaService = Graphiti.getGaService();
/*
		if (containerGa.getHeight() < AddMethodFeature.minHeight) {
			containerGa.setHeight(AddMethodFeature.minHeight);
			anythingChanged = true;
		}

		if (containerGa.getWidth() < AddMethodFeature.minWidth) {
			containerGa.setWidth(AddMethodFeature.minWidth);
			anythingChanged = true;
		}
*/
		int containerWidth = containerGa.getWidth();
		int containerHeight = containerGa.getHeight();

		for (Shape shape : containerShape.getChildren()) {
			anythingChanged = anythingChanged
					| layoutContainerChildShape(gaService, shape,
							containerWidth, containerHeight);
		}
		return anythingChanged;
	}

	/**
	 * @param gaService
	 * @param shape
	 * @param containerWidth
	 * @param containerHeight
	 * @return
	 */
	protected boolean layoutContainerChildShape(IGaService gaService,
			Shape shape, int containerWidth, int containerHeight) {
		boolean anythingChanged = false;
		GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
		IDimension size = gaService.calculateSize(graphicsAlgorithm);
		if (size != null
				&& (containerWidth != size.getWidth() || containerHeight != size
						.getHeight())) {
			if (PropertyUtil.hasShapeId(shape,
					AddMethodFeature.shapeIdMethodHeader)) {
				layoutMethodHeader(gaService, shape, graphicsAlgorithm,
						containerWidth);
				anythingChanged = true;
			} else if (PropertyUtil.hasShapeId(shape,
					AddMethodFeature.shapeIdMethodBody)) {
				layoutMethodBody(gaService, graphicsAlgorithm, containerWidth,
						containerHeight);
				anythingChanged = true;
			} else if (PropertyUtil.hasShapeId(shape,
					AddMethodFeature.shapeIdConsumedTypes)) {
				layoutConsumedMethodTypes(gaService, shape, graphicsAlgorithm,
						containerWidth);
				anythingChanged = true;
			} else if (PropertyUtil.hasShapeId(shape,
					AddMethodFeature.shapeIdProducedTypes)) {
				layoutProducedMethodTypes(gaService, shape, graphicsAlgorithm,
						containerWidth);
				anythingChanged = true;
			} else if (!PropertyUtil.isActionContainerShape(shape)) {
				if (graphicsAlgorithm instanceof Polygon) {
					// Need to do nothing here - otherwise the contained
					// actions will get resized rather strangely
				} else if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(
							containerWidth, secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					anythingChanged = true;
				} else {
					gaService.setWidth(graphicsAlgorithm, containerWidth);
					anythingChanged = true;
				}
			}
		}
		return anythingChanged;
	}

	/**
	 * @param gaService
	 * @param shape
	 * @param graphicsAlgorithm
	 * @param containerWidth
	 */
	protected void layoutProducedMethodTypes(IGaService gaService, Shape shape,
			GraphicsAlgorithm graphicsAlgorithm, int containerWidth) {
		int width = AddMethodFeature.producedTypesWidth;
		int xposition = AddMethodFeature
				.calculateProducedTypesXPosition(containerWidth);
		gaService.setWidth(graphicsAlgorithm, AddMethodFeature.calculateProducedTypesWidth(width));
		gaService.setLocation(graphicsAlgorithm, xposition,
				AddMethodFeature.headerHeight);
	}

	/**
	 * @param gaService
	 * @param shape
	 * @param graphicsAlgorithm
	 * @param containerWidth
	 */
	protected void layoutConsumedMethodTypes(IGaService gaService, Shape shape,
			GraphicsAlgorithm graphicsAlgorithm, int containerWidth) {
		int width = AddMethodFeature.consumedTypesWidth;
		int xposition = AddMethodFeature
				.calculateConsumedTypesXPosition(containerWidth);
		gaService.setWidth(graphicsAlgorithm, AddMethodFeature.calculateConsumedTypesWidth(width));
		gaService.setLocation(graphicsAlgorithm, xposition,
				AddMethodFeature.headerHeight);
	}

	/**
	 * @param gaService
	 * @param graphicsAlgorithm
	 * @param containerWidth
	 * @param containerHeight
	 */
	protected void layoutMethodBody(IGaService gaService,
			GraphicsAlgorithm graphicsAlgorithm, int containerWidth,
			int containerHeight) {
		gaService.setWidth(graphicsAlgorithm,
				AddMethodFeature.calculateBodyWidth(containerWidth));
		gaService.setHeight(graphicsAlgorithm,
				AddMethodFeature.calculateBodyHeight(containerHeight));
		gaService.setLocation(graphicsAlgorithm,
				AddMethodFeature.consumedTypesWidth,
				AddMethodFeature.headerHeight);
	}

	/**
	 * @param gaService
	 * @param shape
	 * @param graphicsAlgorithm
	 * @param containerWidth
	 */
	protected void layoutMethodHeader(IGaService gaService, Shape shape,
			GraphicsAlgorithm graphicsAlgorithm, int containerWidth) {
		int headWidth = AddMethodFeature.calculateHeaderWidth(containerWidth);
		gaService.setWidth(graphicsAlgorithm, headWidth);
		gaService.setLocation(graphicsAlgorithm,
				AddMethodFeature.calculateHeaderXPosition(containerWidth), 0);
		// Should be a ContainerShape, but let's make sure
		if (shape instanceof ContainerShape) {
			for (Shape headChildShape : ((ContainerShape) shape).getChildren()) {
				GraphicsAlgorithm childGraphicsAlgorithm = headChildShape
						.getGraphicsAlgorithm();
				gaService.setWidth(childGraphicsAlgorithm, headWidth);
			}
		}
	}
}
