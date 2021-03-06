package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class LayoutResourceTypeFeature extends AbstractLayoutFeature {

	private static final int MIN_HEIGHT = 150;
	private static final int MIN_WIDTH = 150;

	private static final int MIN_HEIGHT_COLLAPSED = 100;
	private static final int MIN_WIDTH_COLLAPSED = 100;

	public LayoutResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an EClass
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1
				&& businessObjects.get(0) instanceof ResourceType;
	}

	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		IGaService gaService = Graphiti.getGaService();


		int min_height = MIN_HEIGHT;
		int min_width = MIN_WIDTH;
		if( PropertyUtil.isCollapsed( context.getPictogramElement() ) ) {
			min_height = MIN_HEIGHT_COLLAPSED;
			min_width = MIN_WIDTH_COLLAPSED;
		}

		// height
		if (containerGa.getHeight() < min_height) {
			containerGa.setHeight(min_height);
			anythingChanged = true;
		}

		// width
		if (containerGa.getWidth() < min_width) {
			containerGa.setWidth(min_width);
			anythingChanged = true;
		}

		int containerWidth = containerGa.getWidth();
		int containerHeight = containerGa.getHeight();

		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (containerWidth != size.getWidth()
					|| containerHeight != size.getHeight()) {
				if (graphicsAlgorithm instanceof Polygon) {
					// Do nothing
				} else if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(
							containerWidth, secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					anythingChanged = true;
				} else if (shape instanceof ContainerShape
						&& graphicsAlgorithm instanceof Rectangle) {
					// The attribute container
					gaService.setWidth(graphicsAlgorithm, containerWidth);
					gaService.setHeight(graphicsAlgorithm, containerHeight);
					anythingChanged = true;
				} else {
					gaService.setWidth(graphicsAlgorithm, containerWidth);
					// gaService.setHeight(graphicsAlgorithm, containerHeight);
					anythingChanged = true;
				}
			}
		}
		return anythingChanged;
	}
}
