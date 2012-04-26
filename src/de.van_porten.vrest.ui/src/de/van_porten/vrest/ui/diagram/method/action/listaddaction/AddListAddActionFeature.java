package de.van_porten.vrest.ui.diagram.method.action.listaddaction;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ListAddAction;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractAddActionFeature;

public class AddListAddActionFeature extends AbstractAddActionFeature {

	protected static final IColorConstant COLOR_METHOD_BACKGROUND = IColorConstant.GRAY;
	protected static final IColorConstant COLOR_METHOD_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_METHOD_TEXT_FOREGROUND = IColorConstant.BLACK;

	public AddListAddActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected Class<?> getRepresentedBusinessClass() {
		return ListAddAction.class;
	}

	@Override
	protected String getStereotypeName() {
		return "<<ListAddAction>>";
	}

	@Override
	protected void createIcon(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, Action addedClass,
			int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Image image = gaService.createImage(shape,
				RestImageProvider.IMG_METHODS_LISTADDACTION_SYMBOL);
		gaService.setLocationAndSize(image, 0, 0, width, height);
	}

	@Override
	protected void createAdditionalText(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape internalContainerIcon,
			Action addedClass, int iconWidth2, int iconHeight2) {
	}
}
