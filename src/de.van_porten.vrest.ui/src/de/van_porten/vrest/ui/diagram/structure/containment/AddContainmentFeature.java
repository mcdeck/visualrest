package de.van_porten.vrest.ui.diagram.structure.containment;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.van_porten.vrest.core.model.reststructure.ActivityResourceType;
import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.FilterResourceType;
import de.van_porten.vrest.core.model.reststructure.ListResourceType;
import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.PrimaryResourceType;
import de.van_porten.vrest.core.model.reststructure.ProjectionResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.SubresourceType;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class AddContainmentFeature extends AbstractAddFeature {

	public AddContainmentFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConnectionContext = (IAddConnectionContext) context;
		ResourceType modifiedType = (ResourceType) getBusinessObjectForPictogramElement((ContainerShape) addConnectionContext
				.getSourceAnchor().eContainer());
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		FreeFormConnection connection = peCreateService
				.createFreeFormConnection(getDiagram());

		String description = null;

		connection.setStart(addConnectionContext.getSourceAnchor());
		connection.setEnd(addConnectionContext.getTargetAnchor());
		if (modifiedType instanceof SubresourceType) {
			description = "contains";
			/* turn the connection around in this case only*/
			connection.setStart(addConnectionContext.getTargetAnchor());
			connection.setEnd(addConnectionContext.getSourceAnchor());
		} else if (modifiedType instanceof FilterResourceType) {
			description = "filteredType";
		} else if (modifiedType instanceof ListResourceType) {
			description = "listType";
		} else if (modifiedType instanceof AggregationResourceType) {
			description = "aggregatedType";
		} else if (modifiedType instanceof PagingResourceType) {
			description = "pagedType";
		} else if (modifiedType instanceof ProjectionResourceType) {
			description = "projectedType";
		} else {
			description = "unknown";
		}

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setLineStyle(LineStyle.DASH);

		polyline.setLineWidth(2);
		polyline.setForeground(manageColor(IColorConstant.BLACK));

		if (addConnectionContext.getSourceAnchor() == addConnectionContext
				.getTargetAnchor()) {
			// Add Bend Points
			int x = ((Shape) addConnectionContext.getSourceAnchor()
					.eContainer()).getGraphicsAlgorithm().getX();
			int y = ((Shape) addConnectionContext.getSourceAnchor()
					.eContainer()).getGraphicsAlgorithm().getY();
			int w = ((Shape) addConnectionContext.getSourceAnchor()
					.eContainer()).getGraphicsAlgorithm().getWidth();
			connection.getBendpoints().add(
					gaService.createPoint(x + w / 4, y - 50));
			connection.getBendpoints().add(
					gaService.createPoint(x + w / 2, y - 50));
		}

		// add dynamic text decorator for the association name
		ConnectionDecorator textDecorator = peCreateService
				.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(getDiagram(), textDecorator);
		text.setForeground(manageColor(IColorConstant.BLACK));
		text.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		gaService.setLocation(text, 0, 0);
		text.setValue("<<containment>>\n" + description);

		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
				true);
		Polygon polygon = gaService.createPolygon(cd, new int[] { -15, 10, 0,
				0, -15, -10 });
		polygon.setForeground(manageColor(IColorConstant.BLACK));
		polygon.setBackground(manageColor(IColorConstant.WHITE));
		polygon.setLineWidth(1);

		cd = peCreateService.createConnectionDecorator(connection, false, 0.0,
				true);
		polygon = gaService.createPolygon(cd,
				new int[] { 0, 10, -15, 0, 0, -10 });
		polygon.setForeground(manageColor(IColorConstant.BLACK));
		polygon.setBackground(manageColor(IColorConstant.WHITE));
		polygon.setLineWidth(1);

		PropertyUtil.setContainmentReferenceConnection(connection);

		return connection;
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context instanceof IAddConnectionContext) {
			EObject source = ((IAddConnectionContext) context)
					.getSourceAnchor().eContainer();
			EObject target = ((IAddConnectionContext) context)
					.getTargetAnchor().eContainer();
			if (source instanceof ContainerShape
					&& target instanceof ContainerShape) {
				Object from = getBusinessObjectForPictogramElement((ContainerShape) source);
				Object to = getBusinessObjectForPictogramElement((ContainerShape) target);
				if (from instanceof ResourceType && to instanceof ResourceType) {
					return shouldAddContainmentConnection((ResourceType) from,
							(ResourceType) to);
				}
			}
		}
		return false;
	}

	private boolean shouldAddContainmentConnection(ResourceType from,
			ResourceType to) {
		if (from instanceof ActivityResourceType) {
			return false;
		} else if (from instanceof FilterResourceType) {
			return ((FilterResourceType) from).getListElementType() != null
					&& ((FilterResourceType) from).getListElementType().equals(
							to);
		} else if (from instanceof ListResourceType) {
			return ((ListResourceType) from).getListElementType() != null
					&& ((ListResourceType) from).getListElementType()
							.equals(to);
		} else if (from instanceof PrimaryResourceType) {
			return false;
		} else if (from instanceof PagingResourceType) {
			return ((PagingResourceType) from).getPagedType() != null
					&& ((PagingResourceType) from).getPagedType().equals(to);
		} else if (from instanceof AggregationResourceType) {
			for (ResourceType resourceType : ((AggregationResourceType) from)
					.getElementTypes()) {
				if (resourceType.equals(to)) {
					return true;
				}
			}
			return false;
		} else if (from instanceof SubresourceType) {
			return ((SubresourceType) from).getContainingType() != null
					&& ((SubresourceType) from).getContainingType().equals(to);
		} else if (from instanceof ProjectionResourceType) {
			return ((ProjectionResourceType) from).getProjectedType() != null
					&& ((ProjectionResourceType) from).getProjectedType()
							.equals(to);
		}
		return false;
	}

}
