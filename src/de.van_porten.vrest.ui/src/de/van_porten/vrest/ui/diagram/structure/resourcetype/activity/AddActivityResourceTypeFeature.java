package de.van_porten.vrest.ui.diagram.structure.resourcetype.activity;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractAddResourceTypeFeature;

public final class AddActivityResourceTypeFeature extends AbstractAddResourceTypeFeature {

	public AddActivityResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected void createIconShape(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, int width,
			int height) {
		Shape shape = peCreateService.createShape(containerShape, false);

		// create and set graphics algorithm
		int polyHeight = height;
		int polyWidth = width;

		Image image = gaService.createImage(shape, RestImageProvider.IMG_STRUCTURE_ACTIVITY_RESOURCE_TYPE_SYMBOL);
		gaService.setLocationAndSize(image, 2,
				5, polyWidth, polyHeight);

	}

	@Override
	protected String getTypeName() {
		return "<<Activity>>";
	}
}
