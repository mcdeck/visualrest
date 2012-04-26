package de.van_porten.vrest.ui.diagram.structure.resourcetype.list;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractAddResourceTypeFeature;

public final class AddListResourceTypeFeature extends
		AbstractAddResourceTypeFeature {

	private static final IColorConstant SYMBOL_BACKGROUND = new ColorConstant(
			233, 175, 198);

	public AddListResourceTypeFeature(IFeatureProvider fp) {
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
		Polygon polygon = gaService.createPolygon(shape, new int[] { 0, 0,
				polyWidth - 10, 0, polyWidth - 10, polyHeight, 0, polyHeight });
		polygon.setFilled(true);
		polygon.setForeground(manageColor(CLASS_FOREGROUND));
		polygon.setBackground(manageColor(SYMBOL_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 5, 5, polyWidth, polyHeight);

		for( int i = 1; i < 10; i++ ) {
			shape = peCreateService.createShape(containerShape, false);
			polygon = gaService.createPolygon(shape, new int[] { 5, i*5,
					polyWidth - 15, i*5 });
			polygon.setLineWidth(1);
			gaService.setLocationAndSize(polygon, 5, 5, polyWidth, polyHeight);
		}
	}

	@Override
	protected String getTypeName() {
		return "<<List>>";
	}
}
