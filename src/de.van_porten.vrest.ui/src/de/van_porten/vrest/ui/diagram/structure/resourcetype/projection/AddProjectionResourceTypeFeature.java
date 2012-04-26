package de.van_porten.vrest.ui.diagram.structure.resourcetype.projection;

import java.util.Vector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractAddResourceTypeFeature;

public final class AddProjectionResourceTypeFeature extends
		AbstractAddResourceTypeFeature {

	private static final IColorConstant SYMBOL_BACKGROUND = new ColorConstant(
			255, 204, 0);

	public AddProjectionResourceTypeFeature(IFeatureProvider fp) {
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
		Vector<Point> points = ellipsis(polyWidth-10,polyHeight/2,10,polyHeight/2, gaService);

		/* "push_front" */
		points.add(0, gaService.createPoint(polyWidth-10, 0) );
		/* "push_front" */
		points.add(0, gaService.createPoint(0, polyHeight/2) );
		/* add the final points at the end */
		points.add( gaService.createPoint(polyWidth-10, polyHeight) );

		Polygon polygon = gaService.createPolygon(shape,points);
		polygon.setFilled(true);
		polygon.setForeground(manageColor(CLASS_FOREGROUND));
		polygon.setBackground(manageColor(SYMBOL_BACKGROUND));
		polygon.setLineWidth(1);
		gaService.setLocationAndSize(polygon, 2,
				5, polyWidth, polyHeight);
	}

	private Vector<Point> ellipsis(int xm, int ym, int a, int b, IGaService gaService) {
		Vector<Point> points = new Vector<Point>();

		int dx = 0, dy = b; /* im I. Quadranten von links oben nach rechts unten */
		long a2 = a * a, b2 = b * b;
		long err = b2 - (2 * b - 1) * a2, e2; /* Fehler im 1. Schritt */

		int next_point_index = 0;
		do {
			/* add to front */
			points.add(next_point_index, gaService.createPoint(xm + dx, ym - dy) );
			/* add from the back */
			next_point_index++;
			points.add(next_point_index, gaService.createPoint(xm + dx, ym + dy) );

			e2 = 2 * err;
			if (e2 < (2 * dx + 1) * b2) {
				dx++;
				err += (2 * dx + 1) * b2;
			}
			if (e2 > -(2 * dy - 1) * a2) {
				dy--;
				err -= (2 * dy - 1) * a2;
			}
		} while (dy >= 0);

		return points;
	}

	@Override
	protected String getTypeName() {
		return "<<Projection>>";
	}
}
