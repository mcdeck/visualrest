package de.van_porten.vrest.ui.diagram.structure.resourcetype.primary;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractAddResourceTypeFeature;

public final class AddPrimaryResourceTypeFeature extends AbstractAddResourceTypeFeature {

	private static final IColorConstant SYMBOL_BACKGROUND = new ColorConstant(
			255, 255, 0);

	public AddPrimaryResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createIconShape(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, int width,
			int height) {
		Shape shape = peCreateService.createShape(containerShape, false);

		// create and set graphics algorithm
		int polyHeight = height;
		int polyWidth = width;

		Image image = gaService.createImage(shape, RestImageProvider.IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE_SYMBOL);
		gaService.setLocationAndSize(image, 2,
				5, polyWidth, polyHeight);

	}

	@Override
	protected String getTypeName() {
		return "<<Primary>>";
	}
}
