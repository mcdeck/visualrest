package de.van_porten.vrest.ui.diagram.state.state;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.common.styles.StyleUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddStateFeature extends AbstractAddShapeFeature {

	protected static final IColorConstant COLOR_INITIAL_STATE_BACKGROUND = new ColorConstant(
			191, 255, 149);
	protected static final IColorConstant COLOR_INITIAL_STATE_FOREGROUND = new ColorConstant(
			0, 0, 0);
	protected static final IColorConstant COLOR_INITIAL_STATE_TEXT_FOREGROUND = new ColorConstant(
			0, 0, 0);

	protected static final IColorConstant COLOR_STATE_BACKGROUND = new ColorConstant(
			255, 230, 128);
	protected static final IColorConstant COLOR_STATE_FOREGROUND = new ColorConstant(
			0, 0, 0);
	protected static final IColorConstant COLOR_STATE_TEXT_FOREGROUND = new ColorConstant(
			0, 0, 0);

	public AddStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof State) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		State addedClass = (State) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		boolean isInitialState = false;
		ResourceType rt = (ResourceType) addedClass.eContainer();
		if (rt.getInitialState() == addedClass) {
			isInitialState = true;
		}

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);

		if (addedClass.eResource() == null) {
			getDiagram().eResource().getContents().add(addedClass);
		}
		link(containerShape, addedClass);

		int width = context.getWidth() <= 0 ? 150 : context.getWidth();
		int height = context.getHeight() <= 0 ? 150 : context.getHeight();

		PropertyUtil.setStateShape(containerShape);

		IColorConstant foregroundColor = null;
		IColorConstant backgroundColor = null;
		IColorConstant textColor = null;

		if (isInitialState) {
			// the initial state looks different
			foregroundColor = COLOR_INITIAL_STATE_FOREGROUND;
			backgroundColor = COLOR_INITIAL_STATE_BACKGROUND;
			textColor = COLOR_INITIAL_STATE_TEXT_FOREGROUND;

			RoundedRectangle rect = gaService.createRoundedRectangle(
					containerShape, 100, 100);
			rect.setFilled(true);
			rect.setForeground(manageColor(foregroundColor));
			rect.setBackground(manageColor(backgroundColor));
			rect.setLineWidth(1);
			// Rendering Style to have only the header colored
			rect.setStyle(StyleUtil.getStyleForInitialState(getDiagram()));
			gaService.setLocationAndSize(rect, context.getX(), context.getY(),
					width, height);

		} else {
			foregroundColor = COLOR_STATE_FOREGROUND;
			backgroundColor = COLOR_STATE_BACKGROUND;
			textColor = COLOR_STATE_TEXT_FOREGROUND;

			Rectangle rect = gaService.createRectangle(containerShape);
			rect.setFilled(true);
			rect.setForeground(manageColor(foregroundColor));
			rect.setBackground(manageColor(backgroundColor));
			rect.setLineWidth(1);
			// Rendering Style to have only the header colored
			rect.setStyle(StyleUtil.getStyleForState(getDiagram()));
			gaService.setLocationAndSize(rect, context.getX(), context.getY(),
					width, height);
		}

		/*** BEGIN: Separator Line ***/
		{
			Shape shape = peCreateService.createShape(containerShape, false);
			Polyline polyline = gaService.createPolyline(shape, new int[] { 0,
					60, width, 60 });
			polyline.setForeground(manageColor(foregroundColor));
			polyline.setLineWidth(1);
		}
		/*** END: Separator Line ***/

		/*** BEGIN: Stereotype Label ***/
		{
			Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService.createDefaultText(getDiagram(), shape,
					"<<stereotype>>");
			if (isInitialState) {
				text.setValue("<<InitialState>>");
			} else {
				text.setValue("<<State>>");
			}
			text.setForeground(manageColor(textColor));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageDefaultFont(getDiagram(), true, false));
			gaService.setLocationAndSize(text, 0, 10, width, 25);
		}
		/*** END: Stereotype Label ***/

		/*** BEGIN: Name Label ***/
		{
			Shape shape = peCreateService.createShape(containerShape, false);
			Text text = gaService.createDefaultText(getDiagram(), shape,
					addedClass.getName());
			text.setForeground(manageColor(textColor));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
			gaService.setLocationAndSize(text, 0, 30, width, 25);

			PropertyUtil.setStateNameShape(shape);

			/* create link and wire it */
			link(shape, addedClass);
		}
		/*** END: Name Label ***/

		/* the containers container is the application model */
		if (addedClass.eContainer().eContainer() instanceof RestApplicationModel) {
			RestApplicationModel model = (RestApplicationModel) addedClass
					.eContainer().eContainer();
			//EList<MethodType> methodTypes = model.getMethodTypes();

			int pos_x = 10;
			int pos_y = 60;
			int pos_y_inc = 15;

			for (String stateLabel: StateUtil.createMethodLabelValuesForState(addedClass, model)) {
				Shape shape = peCreateService
						.createShape(containerShape, false);
				PropertyUtil.setStateMethodShape(shape);

				Text text = gaService.createDefaultText(getDiagram(), shape,stateLabel);
				text.setForeground(manageColor(IColorConstant.BLACK));
				text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
				text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
				gaService.setLocationAndSize(text, pos_x, pos_y, containerShape
						.getGraphicsAlgorithm().getWidth(), 25);
				pos_y += pos_y_inc;

				link(shape, addedClass);
			}
		}

		/* add a chopbox anchor to the shape */
		peCreateService.createChopboxAnchor(containerShape);

		/* call the layout feature */
		layoutPictogramElement(containerShape);

		return containerShape;
	}
}
