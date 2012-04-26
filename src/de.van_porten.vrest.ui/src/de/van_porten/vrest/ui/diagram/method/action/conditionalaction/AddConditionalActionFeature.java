package de.van_porten.vrest.ui.diagram.method.action.conditionalaction;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.ui.diagram.common.styles.StyleUtil;
import de.van_porten.vrest.ui.diagram.method.action.ActionUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddConditionalActionFeature extends AbstractAddShapeFeature {

	protected static final IColorConstant COLOR_BACKGROUND = IColorConstant.WHITE;
	protected static final IColorConstant COLOR_DIAMOND_BACKGROUND = new ColorConstant(
			255, 170, 204);
	protected static final IColorConstant COLOR_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_TEXT_FOREGROUND = IColorConstant.BLACK;

	protected String getStereotypeName() {
		return "<<ConditionalAction>>";
	}

	protected static final int minWidth = 400;

	protected int getPrefferedWidth() {
		return minWidth;
	}

	protected static final int minHeight = 200;

	protected int getPrefferedHeight() {
		return minHeight;
	}

	protected static final String shapeIdStereotypeLabel = "vrest.ui.diagram.method.action.internal-stereotype-label";
	protected static final String shapeIdFormContainer = "vrest.ui.diagram.method.action.internal-formcontainer";

	protected static final int stereotypeHeight = 25;

	protected static final int calculateInternalContainerHeight(int height) {
		return height;
	}

	protected static final IColorConstant COLOR_STEREOTYPE_TEXT = IColorConstant.BLACK;

	public AddConditionalActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	protected void addAdditionalElements(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int x, int y, int width, int height) {

		ConditionalAction conditionalAction = (ConditionalAction) addedClass;

		ContainerShape conditionalActionContainer = peCreateService
				.createContainerShape(containerShape, false);
		Rectangle containerRect = gaService
				.createInvisibleRectangle(conditionalActionContainer);
		gaService.setLocationAndSize(containerRect, x, y, width, height);
		PropertyUtil.setShapeId(conditionalActionContainer,
				ConditionalActionUtil.shapeIdContainerShape);

		Shape parentRectShape = peCreateService.createShape(
				conditionalActionContainer, false);
		Rectangle parentRect = gaService.createRectangle(parentRectShape);
		parentRect.setFilled(true);
		parentRect.setBackground(manageColor(COLOR_BACKGROUND));
		parentRect.setForeground(manageColor(COLOR_FOREGROUND));
		parentRect.setLineWidth(1);
		gaService.setLocationAndSize(parentRect,
				ConditionalActionUtil.calculateParentRectXPosition(width),
				ConditionalActionUtil.calculateParentRectYPosition(height),
				ConditionalActionUtil.calculateParentRectWidth(width),
				ConditionalActionUtil.calculateParentRectHeight(height));
		PropertyUtil.setShapeId(parentRectShape,
				ConditionalActionUtil.shapeIdParentRectangle);
		PropertyUtil.setNewSelectionBorder(parentRectShape);

		{
			Shape dividerShape = peCreateService.createShape(
					conditionalActionContainer, false);
			Polyline divider = gaService.createPolyline(dividerShape,
					new int[] { 0, 0, 0,
							height - ConditionalActionUtil.diamond_size_half });
			divider.setForeground(manageColor(COLOR_FOREGROUND));
			divider.setLineWidth(1);
			gaService.setLocation(divider,
					ConditionalActionUtil.calculateDividerXPosition(width),
					ConditionalActionUtil.calculateDividerYPosition(height));
			PropertyUtil.setShapeId(dividerShape,
					ConditionalActionUtil.shapeIdDivider);
		}

		{
			Shape textShape = peCreateService.createShape(
					conditionalActionContainer, false);
			Text text = gaService.createDefaultText(getDiagram(), textShape,
					"TRUE");
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setForeground(manageColor(COLOR_TEXT_FOREGROUND));
			gaService.setLocationAndSize(text,
					ConditionalActionUtil.calculateIfTrueTextXPosition(width),
					ConditionalActionUtil.calculateIfTrueTextYPosition(height),
					ConditionalActionUtil.calculateTextWidth(width),
					ConditionalActionUtil.textHeight);
			PropertyUtil.setShapeId(textShape,
					ConditionalActionUtil.shapeIdIfTrueText);

			ContainerShape ifTrueContainer = peCreateService
					.createContainerShape(conditionalActionContainer, false);
			Rectangle rect = gaService.createRectangle(ifTrueContainer);
			rect.setLineVisible(false);
			// rect.setBackground(manageColor(IColorConstant.RED));
			rect.setStyle(StyleUtil.getStyleForConditionalAction(getDiagram()));
			gaService.setLocationAndSize(rect, ConditionalActionUtil
					.calculateIfTrueContainerXPosition(width),
					ConditionalActionUtil
							.calculateIfTrueContainerYPosition(height),
					ConditionalActionUtil
							.calculateConditionContainerWidth(width),
					ConditionalActionUtil
							.calculateConditionContainerHeight(height));
			PropertyUtil.setShapeId(ifTrueContainer,
					PropertyUtil.MethodShapeIds.CONDITONALACTION_IFTRUE);

			addExistingAction(conditionalAction.getActionIfTrue(),
					ifTrueContainer);
		}

		{
			Shape textShape = peCreateService.createShape(
					conditionalActionContainer, false);
			Text text = gaService.createDefaultText(getDiagram(), textShape,
					"FALSE");
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setForeground(manageColor(COLOR_TEXT_FOREGROUND));
			gaService
					.setLocationAndSize(text, ConditionalActionUtil
							.calculateIfFalseTextXPosition(width),
							ConditionalActionUtil
									.calculateIfFalseTextYPosition(height),
							ConditionalActionUtil.calculateTextWidth(width),
							ConditionalActionUtil.textHeight);
			PropertyUtil.setShapeId(textShape,
					ConditionalActionUtil.shapeIdIfFalseText);

			ContainerShape ifFalseContainer = peCreateService
					.createContainerShape(conditionalActionContainer, false);
			Rectangle rect = gaService.createRectangle(ifFalseContainer);
			rect.setLineVisible(false);
			// rect.setBackground(manageColor(IColorConstant.BLUE));
			rect.setStyle(StyleUtil.getStyleForConditionalAction(getDiagram()));
			gaService.setLocationAndSize(rect, ConditionalActionUtil
					.calculateIfFalseContainerXPosition(width),
					ConditionalActionUtil
							.calculateIfFalseContainerYPosition(height),
					ConditionalActionUtil
							.calculateConditionContainerWidth(width),
					ConditionalActionUtil
							.calculateConditionContainerHeight(height));
			PropertyUtil.setShapeId(ifFalseContainer,
					PropertyUtil.MethodShapeIds.CONDITONALACTION_IFFALSE);

			addExistingAction(conditionalAction.getActionIfFalse(),
					ifFalseContainer);
		}

		{
			Shape polygonShape = peCreateService.createShape(
					conditionalActionContainer, false);
			Polygon polygon = gaService.createPolygon(polygonShape, new int[] {
					x + ConditionalActionUtil.diamond_size_half, y,
					x + ConditionalActionUtil.diamond_size,
					y + ConditionalActionUtil.diamond_size_half,
					x + ConditionalActionUtil.diamond_size_half,
					y + ConditionalActionUtil.diamond_size, x,
					y + ConditionalActionUtil.diamond_size_half });
			polygon.setFilled(true);
			polygon.setBackground(manageColor(COLOR_DIAMOND_BACKGROUND));
			polygon.setForeground(manageColor(COLOR_FOREGROUND));
			polygon.setLineWidth(1);
			gaService.setLocationAndSize(polygon, x, y,
					ConditionalActionUtil.diamond_size,
					ConditionalActionUtil.diamond_size);
			PropertyUtil.setShapeId(polygonShape,
					ConditionalActionUtil.shapeIdDiamond);
		}
	}

	private void addExistingAction(Action action, ContainerShape container) {
		if (action != null) {
			AddContext addContext = new AddContext();
			addContext.setNewObject(action);
			// add needs to happen on the parent container, but for coordinates
			// we need the ifTrue/ifFalse container
			addContext.setTargetContainer(getParentContainerShape());
			addContext
					.setHeight(container.getGraphicsAlgorithm().getHeight() - 1);
			addContext
					.setWidth(container.getGraphicsAlgorithm().getWidth() - 1);
			addContext.setX(container.getGraphicsAlgorithm().getX() + 1);
			addContext.setY(container.getGraphicsAlgorithm().getY() + 1);
			IAddFeature addFeature = getFeatureProvider().getAddFeature(
					addContext);
			if (addFeature != null && addFeature.canAdd(addContext)) {
				addFeature.add(addContext);
			}
		}
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof ConditionalAction
				&& context.getTargetContainer() instanceof ContainerShape
				&& (ActionUtil.targetIsMethod(context) || ActionUtil
						.targetIsConditionalAction(context));
	}

	protected final ContainerShape createContainerShape(
			IPeCreateService peCreateService, IGaService gaService,
			ContainerShape target, Action addedClass, int x, int y, int width,
			int height) {
		if (addedClass.eResource() == null) {
			System.out.println("addedClass not contained in resource");
		}

		ContainerShape containerShape = peCreateService.createContainerShape(
				target, true);
		Rectangle containerRect = gaService
				.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(containerRect, x, y, width, height);
		link(containerShape, addedClass);

		return containerShape;

	}

	protected final Shape createStereotypeLabel(
			IPeCreateService peCreateService, IGaService gaService,
			ContainerShape containerShape, int x, int y, int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createDefaultText(getDiagram(), shape,
				getStereotypeName());
		text.setForeground(manageColor(COLOR_STEREOTYPE_TEXT));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		gaService.setLocationAndSize(text, x, y, width, height);

		PropertyUtil.setShapeId(shape, shapeIdStereotypeLabel);

		return shape;
	}

	private ContainerShape containerShape = null;

	protected ContainerShape getParentContainerShape() {
		return containerShape;
	}

	protected void setParentContainerShape(ContainerShape containerShape) {
		this.containerShape = containerShape;
	}

	@Override
	public final PictogramElement add(IAddContext context) {
		Action addedClass = (Action) context.getNewObject();
		ContainerShape target = (ContainerShape) context.getTargetContainer();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		int width = getPrefferedWidth();
		int height = getPrefferedHeight();

		containerShape = createContainerShape(peCreateService, gaService,
				target, addedClass, context.getX(), context.getY(), width,
				height);
		PropertyUtil.setActionContainerShape(containerShape);

		/*** BEGIN: Add container and actual representation ***/
		ContainerShape internalContainer = peCreateService
				.createContainerShape(containerShape, false);
		Rectangle containerRect = gaService
				.createInvisibleRectangle(internalContainer);

		gaService.setLocationAndSize(containerRect, 0, 0, width, height);
		PropertyUtil.setShapeId(internalContainer, shapeIdFormContainer);
		addAdditionalElements(peCreateService, gaService, internalContainer,
				addedClass, 0, 0, width, height);
		/*** END: Add container and actual representation ***/

		/*** BEGIN: Stereotype Label ***/
		createStereotypeLabel(peCreateService, gaService, containerShape,
				0 + ConditionalActionUtil.diamond_size_half, 0, width-ConditionalActionUtil.diamond_size_half,
				stereotypeHeight);
		/*** END: Stereotype Label ***/

		/* add a chopbox anchor to the shape */
		peCreateService.createChopboxAnchor(containerShape);

		/* call the layout feature */
		// layoutPictogramElement(containerShape);

		return containerShape;
	}
}
