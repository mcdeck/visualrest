package de.van_porten.vrest.ui.diagram.method.actionsequence;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

public class AddSequenceConnectionFeature extends AbstractAddFeature {

    public AddSequenceConnectionFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        IPeCreateService peCreateService = Graphiti.getPeCreateService();

        // CONNECTION WITH POLYLINE
        FreeFormConnection connection = peCreateService
                .createFreeFormConnection(getDiagram());
        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());

        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(connection);
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

        // add static graphical decorator (composition and navigable)
        ConnectionDecorator cd;
        cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
                true);
        createArrow(cd);

        return connection;
    }

    @Override
    public boolean canAdd(IAddContext context) {
        if (context instanceof IAddConnectionContext) {
            return true;
        }
        return false;
    }

    private void createArrow(GraphicsAlgorithmContainer gaContainer) {
        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(gaContainer, new int[] {
                -10, 5, 0, 0, -10, -5 });
        polyline.setForeground(manageColor(IColorConstant.BLACK));
        polyline.setLineWidth(2);
    }
}
