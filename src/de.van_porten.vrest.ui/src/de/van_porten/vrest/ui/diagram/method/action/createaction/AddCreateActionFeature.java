package de.van_porten.vrest.ui.diagram.method.action.createaction;

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
import de.van_porten.vrest.core.model.restbehavior.CreateAction;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.method.action.AbstractAddActionFeature;

public class AddCreateActionFeature extends AbstractAddActionFeature {

	protected static final IColorConstant COLOR_BACKGROUND = new ColorConstant(255, 230, 213);
	protected static final IColorConstant COLOR_FOREGROUND = IColorConstant.BLACK;
	protected static final IColorConstant COLOR_TEXT_FOREGROUND = IColorConstant.BLACK;

	public AddCreateActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected Class<?> getRepresentedBusinessClass() {
		return CreateAction.class;
	}

	@Override
	protected String getStereotypeName() {
		return "<<CreateAction>>";
	}

	@Override
	protected void createIcon(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, Action addedClass,
			int width, int height) {
		Shape shape = peCreateService.createShape(containerShape, false);
		Image image = gaService.createImage(shape,
				RestImageProvider.IMG_METHODS_CREATEACTION_SYMBOL);
		gaService.setLocationAndSize(image, 0, 0, width, height);
	}

	@Override
	protected void createAdditionalText(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, Action addedClass,
			int width, int height) {
		String textValue = "";
//		if( addedClass instanceof CreateAction ) {
//			//((CreateAction) addedClass).getCreator().g
//		}
		Shape shape = peCreateService.createShape(containerShape, false);
		Text text = gaService.createDefaultText(getDiagram(), shape, textValue);
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		gaService.setLocationAndSize(text, 0, 0, width, 20);
	}
}
