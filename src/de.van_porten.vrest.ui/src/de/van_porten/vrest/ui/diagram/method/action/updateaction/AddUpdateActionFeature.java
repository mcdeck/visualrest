package de.van_porten.vrest.ui.diagram.method.action.updateaction;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.UpdateAction;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractAddActionFeature;
import de.van_porten.vrest.ui.util.LayoutUtil;

public class AddUpdateActionFeature extends AbstractAddActionFeature {

	protected static final IColorConstant COLOR_BACKGROUND = new ColorConstant(
			215, 227, 244);
	protected static final IColorConstant COLOR_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_TEXT_FOREGROUND = IColorConstant.BLACK;

	public AddUpdateActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected Class<?> getRepresentedBusinessClass() {
		return UpdateAction.class;
	}

	@Override
	protected String getStereotypeName() {
		return "<<UpdateAction>>";
	}

	@Override
	protected void createIcon(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Image image = gaService.createImage(shape,
				RestImageProvider.IMG_METHODS_UPDATEACTION_SYMBOL);
		gaService.setLocationAndSize(image, 0, 0, width, height);
	}

	@Override
	protected void createAdditionalText(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape,
			Action addedClass, int width, int height) {
		UpdateAction updateAction = (UpdateAction) addedClass;

		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createDefaultText(getDiagram(), shape,
				LayoutUtil.createStringFromUpdateAction(updateAction));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		gaService.setLocationAndSize(text, 0, 0, width, 15);
	}
}
