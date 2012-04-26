package de.van_porten.vrest.ui.diagram.method.action.conditionalaction;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class LayoutConditionalActionFeature extends AbstractLayoutFeature {

	public LayoutConditionalActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	protected int getMinWidth() {
		return AddConditionalActionFeature.minWidth;
	}

	protected int getMinHeight() {
		return AddConditionalActionFeature.minHeight;
	}

	protected boolean layoutChildShape(IGaService gaService,
			int containerWidth, int containerHeight, Shape child) {
		boolean anythingChanged = false;

		GraphicsAlgorithm graphicsAlgorithm = child.getGraphicsAlgorithm();
		IDimension size = gaService.calculateSize(graphicsAlgorithm);
		if (containerWidth != size.getWidth()
				|| containerHeight != size.getHeight()) {
			doLayoutInternalChildShape(gaService, containerWidth,
					containerHeight, child);
			anythingChanged = true;
		}

		return anythingChanged;
	}

	private void doLayoutInternalChildShape(IGaService gaService, int width,
			int height, Shape shape) {
		GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();

		if (PropertyUtil.hasShapeId(shape,
				ConditionalActionUtil.shapeIdContainerShape)) {
			gaService.setWidth(graphicsAlgorithm, width);
			gaService.setHeight(graphicsAlgorithm, height);

			for (Shape childShape : ((ContainerShape) shape).getChildren()) {
				doLayoutInternalChildShape(gaService, width, height, childShape);
			}

		} else if (PropertyUtil.hasShapeId(shape,
				ConditionalActionUtil.shapeIdParentRectangle)) {
			gaService.setWidth(graphicsAlgorithm,
					ConditionalActionUtil.calculateParentRectWidth(width));
			gaService.setHeight(graphicsAlgorithm,
					ConditionalActionUtil.calculateParentRectHeight(height));

		} else if (PropertyUtil.hasShapeId(shape,
				ConditionalActionUtil.shapeIdDiamond)) {
			// Do nothing

		} else if (PropertyUtil.hasShapeId(shape,
				ConditionalActionUtil.shapeIdDivider)) {
			// Move to new position an elongate / shorten if necessary
			gaService.setLocation(graphicsAlgorithm,
					ConditionalActionUtil.calculateDividerXPosition(width),
					ConditionalActionUtil.calculateDividerYPosition(height));
			if (graphicsAlgorithm instanceof Polyline) {
				((Polyline) graphicsAlgorithm)
						.getPoints()
						.get(1)
						.setY(ConditionalActionUtil
								.calculateDividerYPosition(height)
								+ ConditionalActionUtil
										.calculateDividerHeight(height));
			}

		} else if (PropertyUtil.hasShapeId(shape,
				ConditionalActionUtil.shapeIdIfFalseText)) {
			gaService
					.setLocationAndSize(graphicsAlgorithm,
							ConditionalActionUtil
									.calculateIfFalseTextXPosition(width),
							ConditionalActionUtil
									.calculateIfFalseTextYPosition(height),
							ConditionalActionUtil.calculateTextWidth(width),
							ConditionalActionUtil.textHeight);

		} else if (PropertyUtil.hasShapeId(shape,
				ConditionalActionUtil.shapeIdIfTrueText)) {
			gaService.setLocationAndSize(graphicsAlgorithm,
					ConditionalActionUtil.calculateIfTrueTextXPosition(width),
					ConditionalActionUtil.calculateIfTrueTextYPosition(height),
					ConditionalActionUtil.calculateTextWidth(width),
					ConditionalActionUtil.textHeight);

		} else if (PropertyUtil.hasShapeId(shape,
				PropertyUtil.MethodShapeIds.CONDITONALACTION_IFFALSE)) {
			gaService.setLocationAndSize(graphicsAlgorithm,
					ConditionalActionUtil
							.calculateIfFalseContainerXPosition(width),
					ConditionalActionUtil
							.calculateIfFalseContainerYPosition(height),
					ConditionalActionUtil
							.calculateConditionContainerWidth(width),
					ConditionalActionUtil
							.calculateConditionContainerHeight(height));

		} else if (PropertyUtil.hasShapeId(shape,
				PropertyUtil.MethodShapeIds.CONDITONALACTION_IFTRUE)) {
			gaService.setLocationAndSize(graphicsAlgorithm,
					ConditionalActionUtil
							.calculateIfTrueContainerXPosition(width),
					ConditionalActionUtil
							.calculateIfTrueContainerYPosition(height),
					ConditionalActionUtil
							.calculateConditionContainerWidth(width),
					ConditionalActionUtil
							.calculateConditionContainerHeight(height));

		}

	}

	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		Object businessObject = getBusinessObjectForPictogramElement(pe);
		return businessObject instanceof Action;
	}

	protected int getMaxWidth() {
		return Integer.MAX_VALUE;
	}

	protected int getMaxHeight() {
		return Integer.MAX_VALUE - AddConditionalActionFeature.stereotypeHeight;
	}

	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		IGaService gaService = Graphiti.getGaService();

		// height
		if (containerGa.getHeight() < getMinHeight()
				+ AddConditionalActionFeature.stereotypeHeight) {
			containerGa.setHeight(getMinHeight()
					+ AddConditionalActionFeature.stereotypeHeight);
			anythingChanged = true;
		}

		if (containerGa.getHeight() > getMaxHeight()
				+ AddConditionalActionFeature.stereotypeHeight) {
			containerGa.setHeight(getMaxHeight()
					+ AddConditionalActionFeature.stereotypeHeight);
			anythingChanged = true;
		}

		// width
		if (containerGa.getWidth() < getMinWidth()) {
			containerGa.setWidth(getMinWidth());
			anythingChanged = true;
		}

		if (containerGa.getWidth() > getMaxWidth()) {
			containerGa.setWidth(getMaxWidth());
			anythingChanged = true;
		}

		int containerWidth = containerGa.getWidth();
		int containerHeight = containerGa.getHeight();

		for (Shape shape : containerShape.getChildren()) {
			if (PropertyUtil.hasShapeId(shape,
					AddConditionalActionFeature.shapeIdStereotypeLabel)) {
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
				ga.setWidth(containerWidth
						- ConditionalActionUtil.diamond_size_half);
				gaService.setLocation(ga,
						0 + ConditionalActionUtil.diamond_size_half, 0);
				anythingChanged = true;
			} else if (PropertyUtil.hasShapeId(shape,
					AddConditionalActionFeature.shapeIdFormContainer)) {
				GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();

				int internalNewWidth = containerWidth;
				int internalNewHeight = AddConditionalActionFeature
						.calculateInternalContainerHeight(containerHeight);

				gaService.setLocationAndSize(ga, 0, 0, internalNewWidth,
						internalNewHeight);
				anythingChanged = true;
				if (shape instanceof ContainerShape) {
					for (Shape internalContainerChild : ((ContainerShape) shape)
							.getChildren()) {
						if (LayoutUtil
								.isAutoLayoutEnabled(internalContainerChild)) {
							anythingChanged = anythingChanged
									| LayoutUtil.doAutoLayout(gaService,
											containerWidth, containerHeight,
											internalContainerChild);
						} else {
							anythingChanged = anythingChanged
									| layoutChildShape(gaService,
											internalNewWidth,
											internalNewHeight,
											internalContainerChild);
						}
					}
				}
			} else if (LayoutUtil.isAutoLayoutEnabled(shape)) {
				anythingChanged = anythingChanged
						| LayoutUtil.doAutoLayout(gaService, containerWidth,
								containerHeight, shape);
			} else {
				anythingChanged = anythingChanged
						| layoutChildShape(
								gaService,
								containerWidth,
								AddConditionalActionFeature
										.calculateInternalContainerHeight(containerHeight),
								shape);
			}
		}

		return anythingChanged;
	}
}
