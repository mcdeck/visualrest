package de.van_porten.vrest.ui.diagram.method.method;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
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

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddMethodFeature extends AbstractAddShapeFeature {

	public static final String shapeIdMethodHeader = "internal-method-header-shape";
	public static final String shapeIdMethodBody = "internal-method-body-shape";
	public static final String shapeIdConsumedTypes = "internal-consumed-types-container-shape";
	public static final String shapeIdProducedTypes = "internal-produced-types-container-shape";
	public static final String shapeIdMediaType = "internal-mediatype-shape";
	public static final double headerToBodyRatio = 0.8;
	public static final int headerHeight = 50;
	public static final int consumedTypesWidth = 150;
	public static final int producedTypesWidth = 150;
	public static final int minWidth = 600;
	public static final int minHeight = 300;
	public static final int typeConnectorLength = 50;
	public static final int circleRadius = 5;
	public static final int textHeight = 30;

	public static final int calculateHeaderXPosition(int width) {
		return calculateConsumedTypesXPosition(width) + consumedTypesWidth;
	}

	public static final int calculateHeaderWidth(int width) {
		return (int) ((width - consumedTypesWidth - producedTypesWidth) * headerToBodyRatio);
	}

	public static final int calculateBodyWidth(int width) {
		return (width - consumedTypesWidth - producedTypesWidth);
	}

	public static final int calculateBodyHeight(int height) {
		return height - headerHeight;
	}

	public static final int calculateConsumedTypesXPosition(int width) {
		return 0;
	}

	public static final int calculateConsumedTypesWidth(int width) {
		return consumedTypesWidth + circleRadius;
	}

	public static final int calculateProducedTypesXPosition(int width) {
		return calculateConsumedTypesXPosition(width) + producedTypesWidth
				+ calculateBodyWidth(width) - circleRadius;
	}

	public static final int calculateProducedTypesWidth(int width) {
		return producedTypesWidth + circleRadius;
	}

	protected static final IColorConstant COLOR_METHOD_BACKGROUND = IColorConstant.WHITE;
	protected static final IColorConstant COLOR_METHOD_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_METHOD_TEXT_FOREGROUND = IColorConstant.BLACK;

	public AddMethodFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof Method) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Method addedClass = (Method) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		int width = context.getWidth() <= 0 ? minWidth : context.getWidth();
		int height = context.getHeight() <= 0 ? minHeight : context.getHeight();
		int headerWidth = calculateHeaderWidth(width);

		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);
		Rectangle invRect = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(invRect, context.getX(), context.getY(),
				width, height);
		PropertyUtil.setMethodShape(containerShape);
		link(containerShape, addedClass);

		createHeadShape(peCreateService, gaService, containerShape, addedClass,
				consumedTypesWidth, 0, headerWidth, headerHeight + 1);

		ContainerShape bodyShape = createBodyShape(peCreateService, gaService,
				containerShape, addedClass, consumedTypesWidth, headerHeight,
				calculateBodyWidth(width), calculateBodyHeight(height));

		createConsumedTypesShape(peCreateService, gaService, containerShape,
				addedClass, calculateConsumedTypesXPosition(width),
				headerHeight, calculateConsumedTypesWidth(width),
				calculateBodyHeight(height));

		createProducedTypesShape(peCreateService, gaService, containerShape,
				addedClass, calculateProducedTypesXPosition(width),
				headerHeight, calculateProducedTypesWidth(width),
				calculateBodyHeight(height));

		/* add a chopbox anchor to the shape */
		peCreateService.createChopboxAnchor(containerShape);

		/* generic selection border switch */
		PropertyUtil.setChangeSelectionBorder(containerShape);
		PropertyUtil.setNewSelectionBorder(bodyShape);

		/* add the behavior of the method if any is available */
		addExistingBehaviourSpec(addedClass, containerShape);

		/* call the layout feature */
		layoutPictogramElement(containerShape);

		return containerShape;
	}

	private void addExistingBehaviourSpec(Method addedClass,
			ContainerShape container) {
		AddContext addContext = new AddContext();
		BehaviorSpecification behaviour = addedClass.getMethodbehavior();

		if (behaviour != null) {
			Action action = behaviour.getAction();
			addContext.setNewObject(action);
			addContext.setTargetContainer(container);
			IAddFeature addFeature = getFeatureProvider().getAddFeature(
					addContext);
			if (addFeature != null && addFeature.canAdd(addContext)) {
				addFeature.add(addContext);
			}
		}
	}

	private ContainerShape createProducedTypesShape(
			IPeCreateService peCreateService, IGaService gaService,
			ContainerShape containerShape, Method addedClass, int x, int y,
			int width, int height) {
		ContainerShape producedTypesShape = peCreateService
				.createContainerShape(containerShape, false);

		PropertyUtil.setShapeId(producedTypesShape, shapeIdProducedTypes);

		Rectangle rect = gaService.createInvisibleRectangle(producedTypesShape);
		gaService.setLocationAndSize(rect, x, y, width, height);

		int increment = textHeight + 5;
		int y_new = 5;
		for (MediaType producedType : addedClass.getProduced()) {
			ContainerShape mediaTypeContainer = peCreateService
			// .createContainerShape(producedTypesShape, true);
					.createContainerShape(producedTypesShape, false);
			Rectangle invRect = gaService
					.createInvisibleRectangle(mediaTypeContainer);
			gaService.setLocationAndSize(invRect, 0, y_new, width, textHeight);
			// gaService.setLocationAndSize(invRect, x, y, width, textHeight);
			PropertyUtil.setShapeId(mediaTypeContainer, shapeIdMediaType);
			link(mediaTypeContainer, producedType);

			Shape circleShape = peCreateService.createShape(mediaTypeContainer,
					false);
			Ellipse circle = gaService.createEllipse(circleShape);
			circle.setBackground(manageColor(IColorConstant.BLACK));
			circle.setForeground(manageColor(IColorConstant.BLACK));
			circle.setLineWidth(2);
			circle.setFilled(true);
			gaService.setLocationAndSize(circle, 0, textHeight / 2
					- circleRadius, circleRadius * 2, circleRadius * 2);

			Shape connectorShape = peCreateService.createShape(
					mediaTypeContainer, false);
			Polyline connector = gaService.createPolyline(connectorShape,
					new int[] { typeConnectorLength, textHeight / 2,
							circleRadius, textHeight / 2 });
			connector.setFilled(true);
			connector.setBackground(manageColor(IColorConstant.BLACK));
			connector.setForeground(manageColor(IColorConstant.BLACK));
			connector.setLineWidth(2);

			Shape arrowShape = peCreateService.createShape(mediaTypeContainer,
					false);
			Polygon polyline = gaService.createPolygon(arrowShape, new int[] {
					-5, 5, 0, 0, -5, -5 });
			polyline.setLineWidth(2);
			gaService
					.setLocation(polyline, typeConnectorLength, textHeight / 2);

			Shape textShape = peCreateService.createShape(mediaTypeContainer,
					false);
			Text text = gaService.createDefaultText(getDiagram(), textShape,
					producedType.getName());
			text.setForeground(manageColor(COLOR_METHOD_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageDefaultFont(getDiagram(), true, false));
			gaService.setLocationAndSize(text, typeConnectorLength + 5, 0,
					width - typeConnectorLength - circleRadius * 2, textHeight);

			y_new = y_new + increment;
		}

		return producedTypesShape;
	}

	private ContainerShape createConsumedTypesShape(
			IPeCreateService peCreateService, IGaService gaService,
			ContainerShape containerShape, Method addedClass, int x, int y,
			int width, int height) {
		ContainerShape consumedTypesShape = peCreateService
				.createContainerShape(containerShape, false);

		PropertyUtil.setShapeId(consumedTypesShape, shapeIdConsumedTypes);

		Rectangle rect = gaService.createInvisibleRectangle(consumedTypesShape);
		gaService.setLocationAndSize(rect, x, y, width, height);

		int increment = textHeight + 5;
		int y_new = 5;
		for (MediaType consumedType : addedClass.getConsumed()) {
			ContainerShape mediaTypeContainer = peCreateService
					.createContainerShape(consumedTypesShape, false);
			Rectangle invRect = gaService
					.createInvisibleRectangle(mediaTypeContainer);
			gaService.setLocationAndSize(invRect, 0, y_new, width, textHeight);
			PropertyUtil.setShapeId(mediaTypeContainer, shapeIdMediaType);
			link(mediaTypeContainer, consumedType);

			Shape textShape = peCreateService.createShape(mediaTypeContainer,
					false);
			Text text = gaService.createDefaultText(getDiagram(), textShape,
					consumedType.getName());
			text.setForeground(manageColor(COLOR_METHOD_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageDefaultFont(getDiagram(), true, false));
			gaService.setLocationAndSize(text, 0, 0, width
					- typeConnectorLength - circleRadius * 2, textHeight);

			Shape connectorShape = peCreateService.createShape(
					mediaTypeContainer, false);
			Polyline connector = gaService.createPolyline(connectorShape,
					new int[] { text.getWidth() + 10, textHeight / 2,
							width - circleRadius, textHeight / 2 });
			connector.setForeground(manageColor(IColorConstant.BLACK));
			connector.setLineWidth(2);

			Shape circleShape = peCreateService.createShape(mediaTypeContainer,
					false);
			Ellipse circle = gaService.createEllipse(circleShape);
			circle.setBackground(manageColor(IColorConstant.BLACK));
			circle.setForeground(manageColor(IColorConstant.BLACK));
			circle.setLineWidth(2);
			circle.setFilled(true);
			gaService.setLocationAndSize(circle, width - 2 * circleRadius,
					textHeight / 2 - circleRadius, circleRadius * 2,
					circleRadius * 2);

			Shape arrowShape = peCreateService.createShape(mediaTypeContainer,
					false);
			Polyline polyline = gaService.createPolyline(arrowShape, new int[] {
					-5, 5, 0, 0, -5, -5 });
			polyline.setLineWidth(2);
			gaService.setLocation(polyline, text.getWidth() + 11,
					textHeight / 2);

			y_new = y_new + increment;
		}

		return consumedTypesShape;
	}

	private ContainerShape createHeadShape(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Method addedClass, int x, int y, int width, int height) {
		ContainerShape headShape = peCreateService.createContainerShape(
				containerShape, false);

		PropertyUtil.setShapeId(headShape, shapeIdMethodHeader);

		Rectangle headRect = gaService.createRectangle(headShape);
		headRect.setFilled(true);
		headRect.setForeground(manageColor(COLOR_METHOD_FOREGROUND));
		headRect.setBackground(manageColor(COLOR_METHOD_BACKGROUND));
		headRect.setLineWidth(1);
		gaService.setLocationAndSize(headRect, x, y, width, height);

		/*** BEGIN: Stereotype Label ***/
		Shape stereoTypeShape = peCreateService.createShape(headShape, false);
		Text text = gaService.createDefaultText(getDiagram(), stereoTypeShape,
				"<<Method>>");

		text.setForeground(manageColor(COLOR_METHOD_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setFont(gaService.manageDefaultFont(getDiagram(), true, false));
		gaService.setLocationAndSize(text, 0, 5, width, 20);
		/*** END: Stereotype Label ***/

		/*** BEGIN: Type and Name Label ***/
		Shape nameShape = peCreateService.createShape(headShape, false);
		text = gaService.createDefaultText(getDiagram(), nameShape,
				LayoutUtil.createStringFromMethod(addedClass));
		text.setForeground(manageColor(COLOR_METHOD_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
		gaService.setLocationAndSize(text, 0, 25, width, 20);
		PropertyUtil.setStateNameShape(nameShape);

		/* create link and wire it */
		link(nameShape, addedClass);
		/*** END: Name Label ***/

		return headShape;
	}

	private ContainerShape createBodyShape(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Method addedClass, int x, int y, int width, int height) {
		ContainerShape bodyShape = peCreateService.createContainerShape(
				containerShape, false);

		PropertyUtil.setShapeId(bodyShape, shapeIdMethodBody);

		Rectangle bodyRect = gaService.createRectangle(bodyShape);
		bodyRect.setFilled(true);
		bodyRect.setForeground(manageColor(COLOR_METHOD_FOREGROUND));
		bodyRect.setBackground(manageColor(COLOR_METHOD_BACKGROUND));
		bodyRect.setLineWidth(1);
		gaService.setLocationAndSize(bodyRect, x, y, width, height);

		return bodyShape;
	}
}
