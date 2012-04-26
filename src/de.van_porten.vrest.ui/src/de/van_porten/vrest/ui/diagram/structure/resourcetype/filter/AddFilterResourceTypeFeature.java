package de.van_porten.vrest.ui.diagram.structure.resourcetype.filter;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractAddResourceTypeFeature;

public final class AddFilterResourceTypeFeature extends AbstractAddResourceTypeFeature {

	private static final IColorConstant SYMBOL_BACKGROUND = new ColorConstant(
			219, 219, 227);

	public AddFilterResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected void createIconShape(IPeCreateService peCreateService,
			IGaService gaService, ContainerShape containerShape, int width,
			int height) {
		Shape shape = peCreateService.createShape(containerShape, false);

		// create and set graphics algorithm
		Polygon polygon = gaService.createPolygon(shape,
				new int[] {
					0, 0,
					width, 0,
					width-20, height*4/5,
					width-20, height,
					20, height,
					20, height*4/5,
				});
		polygon.setFilled(true);
		polygon.setForeground(manageColor(CLASS_FOREGROUND));
		polygon.setBackground(manageColor(SYMBOL_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 5,
				5, width, height);

	}

	@Override
	protected String getTypeName() {
		return "<<Filter>>";
	}
}
