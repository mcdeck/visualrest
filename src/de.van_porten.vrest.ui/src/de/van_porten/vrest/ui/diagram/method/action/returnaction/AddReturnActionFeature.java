package de.van_porten.vrest.ui.diagram.method.action.returnaction;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.ui.diagram.method.action.AbstractAddActionFeature;
import de.van_porten.vrest.ui.util.AutoLayoutHint;
import de.van_porten.vrest.ui.util.LayoutUtil;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddReturnActionFeature extends AbstractAddActionFeature {

	static final String shapeIdRepresentationText = "internal-representation-shape";

	protected static final IColorConstant COLOR_METHOD_BACKGROUND = IColorConstant.GRAY;
	protected static final IColorConstant COLOR_METHOD_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_METHOD_TEXT_FOREGROUND = IColorConstant.BLACK;

	public AddReturnActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected Class<?> getRepresentedBusinessClass() {
		return ReturnAction.class;
	}

	@Override
	protected String getStereotypeName() {
		return "<<ReturnAction>>";
	}

	@Override
	protected void createIcon(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int width, int height) {
		int t = 13;
		int d = 25;
		int n = 10;
		int w = width;
		int h = height;

		Shape shape = peCreateService.createShape(containerShape, false);
		Polygon polygon = gaService.createPolygon(shape,
				new int[] { 0, 0, w, 0, w, h - n, d, h - n, d, h, 0,
						h - t / 2 - n, d, h - 2 * n - t, d, h - n - t, w - t,
						h - t - n, w - t, t, 0, t }, new int[] { 5, 5, 15, 15,
						15, 15, 0, 0, 5, 5, 5, 5, 5, 5, 0, 0, 10, 10, 15, 15,
						5, 5 });
		polygon.setFilled(true);
		polygon.setForeground(manageColor(COLOR_METHOD_FOREGROUND));
		polygon.setBackground(manageColor(COLOR_METHOD_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 0, 0, width, height);
	}

	@Override
	protected void createAdditionalText(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int width, int height) {
		ReturnAction returnAction = (ReturnAction) addedClass;

		Shape shape = peCreateService.createShape(containerShape, false);
		int statusCode = 0;
		if (returnAction.getStatus() != null) {
			statusCode = returnAction.getStatus().getNumber();
		}
		Text text = gaService.createDefaultText(getDiagram(), shape,
				String.valueOf(statusCode));
		text.setForeground(manageColor(COLOR_METHOD_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		gaService.setLocationAndSize(text, 0, 0, width, 15);
		PropertyUtil.setReturnActionStatusCodeShape(shape);

		/* create link and wire it */
		link(shape, addedClass);
		if (returnAction.getStatus() != null) {
			link(shape, returnAction.getStatus());
		}

		Shape representationShape = peCreateService.createShape(containerShape,
				false);
		Text representationText = gaService.createDefaultText(getDiagram(),
				representationShape, LayoutUtil
						.createStringFromRepresentation(returnAction
								.getRepresentation()));
		representationText
				.setForeground(manageColor(COLOR_METHOD_TEXT_FOREGROUND));
		representationText.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		representationText.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		gaService.setLocationAndSize(representationText, 0, 20, width, 15);

		PropertyUtil.setShapeId(representationShape, shapeIdRepresentationText);
		LayoutUtil.enableAutoLayout(representationShape, new AutoLayoutHint(
				AutoLayoutHint.STRETCH_HORIZONTAL));
	}
}
