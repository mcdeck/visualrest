package de.van_porten.vrest.ui.diagram.structure.resourcetype.paging;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractAddResourceTypeFeature;

public final class AddPagingResourceTypeFeature extends AbstractAddResourceTypeFeature {

	private static final IColorConstant SYMBOL_BACKGROUND = new ColorConstant(
			170, 238, 255);

	public AddPagingResourceTypeFeature(IFeatureProvider fp) {
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
		Polygon polygon = gaService.createPolygon(shape,
				new int[] {
					0, 0,
					polyWidth-10, 0,
					polyWidth-10, polyHeight,
					0, polyHeight
				});
		polygon.setFilled(true);
		polygon.setForeground(manageColor(CLASS_FOREGROUND));
		polygon.setBackground(manageColor(SYMBOL_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 2,
				2, polyWidth, polyHeight);

		int subdivison_height = 15;
		int subdivison_width = subdivison_height;

		shape = peCreateService.createShape(containerShape, false);
		polygon = gaService.createPolygon(shape,
				new int[] {
					0, 0,
					polyWidth-10, 0,
					polyWidth-10, polyHeight-subdivison_height,
					polyWidth-10 - subdivison_width, polyHeight,
					0, polyHeight
				});
		polygon.setFilled(true);
		polygon.setForeground(manageColor(CLASS_FOREGROUND));
		polygon.setBackground(manageColor(SYMBOL_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 5,
				5, polyWidth, polyHeight);

		shape = peCreateService.createShape(containerShape, false);
		polygon = gaService.createPolygon(shape,
				new int[] {
					polyWidth-10, polyHeight-subdivison_height,
					polyWidth-10 - subdivison_width, polyHeight-subdivison_height,
					polyWidth-10 - subdivison_width, polyHeight,
				});
		polygon.setFilled(true);
		polygon.setForeground(manageColor(CLASS_FOREGROUND));
		polygon.setBackground(manageColor(SYMBOL_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 5,
				5, polyWidth, polyHeight);

	}

	@Override
	protected String getTypeName() {
		return "<<Paging>>";
	}
}
