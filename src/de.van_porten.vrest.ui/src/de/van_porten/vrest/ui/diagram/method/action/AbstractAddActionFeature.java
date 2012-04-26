package de.van_porten.vrest.ui.diagram.method.action;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.ui.util.PropertyUtil;

public abstract class AbstractAddActionFeature extends AbstractAddShapeFeature {

	protected static final String shapeIdStereotypeLabel = "vrest.ui.diagram.method.action.internal-stereotype-label";
	protected static final String shapeIdIconContainer = "vrest.ui.diagram.method.action.internal-icon-container";
	protected static final String shapeIdAdditionalTextContainer = "vrest.ui.diagram.method.action.internal-additional-text-container";

	protected static final int stereotypeHeight = 15;

	protected static final IColorConstant COLOR_STEREOTYPE_TEXT = IColorConstant.BLACK;

	protected static final int iconWidth = 50;
	protected static final int iconHeight = 60;

	protected static final int minWidth = 180;
	protected static final int minHeight = iconHeight;

	protected static final int xOffsetIconToText = 5;
	protected static final int yOffsetStereotypToText = 5;
	protected static final int yOffsetTopToStereotype = 5;

	protected static int calculateStereotypeHeight(int containerHeight) {
		return stereotypeHeight;
	}

	protected static int calculateStereotypeWidth(int containerWidth) {
		return containerWidth - iconWidth - xOffsetIconToText;
	}

	protected static int calculateAdditionalTextHeight(int containerHeight) {
		return containerHeight - stereotypeHeight - yOffsetStereotypToText;
	}

	protected static int calculateAdditionalTextWidth(int containerWidth) {
		return containerWidth - iconWidth - xOffsetIconToText;
	}

	public AbstractAddActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	protected abstract Class<?> getRepresentedBusinessClass();

	protected abstract String getStereotypeName();

	protected abstract void createIcon(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int width, int height);

	protected abstract void createAdditionalText(
			IPeCreateService peCreateService, IGaService gaService,
			ContainerShape containerShape, Action addedClass, int width,
			int height);

	@Override
	public boolean canAdd(IAddContext context) {
		return getRepresentedBusinessClass().isInstance(context.getNewObject())
				&& context.getTargetContainer() instanceof ContainerShape
				&& (ActionUtil.targetIsMethod(context) || ActionUtil
						.targetIsConditionalAction(context));
	}

	private final ContainerShape createContainerShape(
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

		PropertyUtil.setActionContainerShape(containerShape);

		return containerShape;
	}

	private final void createStereotypeLabel(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, int x, int y,
			int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createDefaultText(getDiagram(), shape,
				getStereotypeName());
		text.setForeground(manageColor(COLOR_STEREOTYPE_TEXT));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text.setFont(gaService.manageDefaultFont(getDiagram(), true, false));
		gaService.setLocationAndSize(text, x, y, width, height);

		PropertyUtil.setShapeId(shape, shapeIdStereotypeLabel);
	}

	private final void createIconInternal(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int x, int y, int width, int height) {
		ContainerShape internalContainerIcon = peCreateService
				.createContainerShape(containerShape, false);
		Rectangle containerRect = gaService
				.createInvisibleRectangle(internalContainerIcon);
		gaService.setLocationAndSize(containerRect, x, y, width, height);

		PropertyUtil.setShapeId(internalContainerIcon, shapeIdIconContainer);

		createIcon(peCreateService, gaService, containerShape, addedClass,
				iconWidth, iconHeight);
	}

	private final void createAdditionalTextInternal(
			IPeCreateService peCreateService, IGaService gaService,
			ContainerShape containerShape, Action addedClass, int x, int y,
			int width, int height) {
		ContainerShape internalContainerText = peCreateService
				.createContainerShape(containerShape, false);
		Rectangle containerRect = gaService
				.createInvisibleRectangle(internalContainerText);
		gaService.setLocationAndSize(containerRect, x, y, width, height);

		PropertyUtil.setShapeId(internalContainerText,
				shapeIdAdditionalTextContainer);

		createAdditionalText(peCreateService, gaService, internalContainerText,
				addedClass, iconWidth, iconHeight);
	}

	@Override
	public final PictogramElement add(IAddContext context) {
		Action addedClass = (Action) context.getNewObject();
		ContainerShape target = (ContainerShape) context.getTargetContainer();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();

		int width = context.getWidth();
		if (width < minWidth) {
			width = minWidth;
		}
		int height = context.getHeight();
		if (height < minHeight) {
			height = minHeight;
		}

		ContainerShape containerShape = createContainerShape(peCreateService,
				gaService, target, addedClass, context.getX(), context.getY(),
				width, height);

		/*** BEGIN: Add icon ***/
		createIconInternal(peCreateService, gaService, containerShape,
				addedClass, 0, 0, iconWidth, iconHeight);
		/*** END: Add icon ***/

		/*** BEGIN: Stereotype Label ***/
		createStereotypeLabel(peCreateService, gaService, containerShape,
				iconWidth + xOffsetIconToText, yOffsetTopToStereotype,
				calculateStereotypeWidth(width),
				calculateStereotypeHeight(height));
		/*** END: Stereotype Label ***/

		/*** BEGIN: Add additional text ***/
		createAdditionalTextInternal(peCreateService, gaService,
				containerShape, addedClass, iconWidth + xOffsetIconToText,
				yOffsetTopToStereotype + stereotypeHeight
						+ yOffsetStereotypToText,
				calculateAdditionalTextWidth(width),
				calculateAdditionalTextHeight(height));
		/*** END: Add additional text ***/

		/* add a chopbox anchor to the shape */
		peCreateService.createChopboxAnchor(containerShape);

		/* call the layout feature */
		layoutPictogramElement(containerShape);

		return containerShape;
	}
}
