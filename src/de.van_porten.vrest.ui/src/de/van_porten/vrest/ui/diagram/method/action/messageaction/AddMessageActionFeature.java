package de.van_porten.vrest.ui.diagram.method.action.messageaction;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.MessageAction;
import de.van_porten.vrest.ui.diagram.method.action.AbstractAddActionFeature;

public class AddMessageActionFeature extends AbstractAddActionFeature {

	protected static final IColorConstant COLOR_BACKGROUND = new ColorConstant(255, 230, 128);
	protected static final IColorConstant COLOR_DOT = new ColorConstant(170, 68, 0);
	protected static final IColorConstant COLOR_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_TEXT_FOREGROUND = IColorConstant.BLACK;

	public AddMessageActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected Class<?> getRepresentedBusinessClass() {
		return MessageAction.class;
	}

	@Override
	protected String getStereotypeName() {
		return "<<MessageAction>>";
	}

	@Override
	protected void createIcon(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, Action addedClass,
			int width, int height) {
		int iconWidth = width;
		int iconHeight = height/2;
		int iconX = 0;
		int iconY = height/2 - iconHeight/2;

		Shape shape = peCreateService.createShape(containerShape, false);
		Rectangle rect = gaService.createRectangle(shape);
		rect.setFilled(true);
		rect.setBackground(manageColor(COLOR_BACKGROUND));
		rect.setForeground(manageColor(COLOR_FOREGROUND));
		rect.setLineWidth(1);
		gaService.setLocationAndSize(rect, iconX, iconY, iconWidth, iconHeight);

		shape = peCreateService.createShape(containerShape, false);
		Polyline polyline = gaService.createPolyline(shape, new int[] { 0, 0, iconWidth/2, iconHeight/2, iconWidth, 0 } );
		polyline.setBackground(manageColor(COLOR_BACKGROUND));
		polyline.setForeground(manageColor(COLOR_FOREGROUND));
		rect.setLineWidth(1);
		gaService.setLocationAndSize(polyline, iconX, iconY, iconWidth/2, iconHeight);

		shape = peCreateService.createShape(containerShape, false);
		Ellipse ellipse = gaService.createEllipse(shape);
		ellipse.setFilled(true);
		ellipse.setBackground(manageColor(COLOR_DOT));
		ellipse.setForeground(manageColor(COLOR_DOT));
		ellipse.setLineWidth(0);
		gaService.setLocationAndSize(ellipse, iconX
				+ iconWidth/2-4, iconY + iconHeight/2-4, 8, 8);
	}

	@Override
	protected void createAdditionalText(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, Action addedClass,
			int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createDefaultText(getDiagram(), shape, "Trigger");
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
		gaService.setLocationAndSize(text, 0, 0, width, 15);
	}
}
