package de.van_porten.vrest.ui.diagram.structure.internallink;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.ui.util.LayoutUtil;

public class AddInternalLinkFeature extends AbstractAddFeature {

	public AddInternalLinkFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		InternalLink addedInternalLInk = (InternalLink) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		FreeFormConnection connection = peCreateService
				.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		// create link and wire it
		link(connection, addedInternalLInk);

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);;
		polyline.setLineWidth(2);
		polyline.setForeground(manageColor(IColorConstant.BLACK));

		if( addConContext.getSourceAnchor() == addConContext.getTargetAnchor() ) {
			// Add Bend Points
			int x = ((Shape)addConContext.getSourceAnchor().eContainer()).getGraphicsAlgorithm().getX();
			int y = ((Shape)addConContext.getSourceAnchor().eContainer()).getGraphicsAlgorithm().getY();
			int w = ((Shape)addConContext.getSourceAnchor().eContainer()).getGraphicsAlgorithm().getWidth();
			connection.getBendpoints().add(gaService.createPoint(x+w/4,y-50));
			connection.getBendpoints().add(gaService.createPoint(x+w/2,y-50));
		}

		// add dynamic text decorator for the association name
		ConnectionDecorator textDecorator = peCreateService
				.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(getDiagram(), textDecorator);
		text.setForeground(manageColor(IColorConstant.BLACK));
		gaService.setLocation(text, 20, 0);

		// set reference name in the text decorator
		text.setValue(LayoutUtil.createStringFromInternalLink(addedInternalLInk));
		text.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		link(textDecorator, addedInternalLInk);

		// add static graphical decorator (composition and navigable)
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
				true);
		createArrow(cd);

		return connection;
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// return true if given business object is an EReference
		// note, that the context must be an instance of IAddConnectionContext
		if (context instanceof IAddConnectionContext
				&& context.getNewObject() instanceof InternalLink) {
			return true;
		}
		return false;
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		Polygon polygon = gaService.createPolygon(gaContainer, new int[] {
				-10, 5, 0, 0, -10, -5 });
		polygon.setForeground(manageColor(IColorConstant.BLACK));
		polygon.setLineWidth(2);
		return polygon;
	}
}
