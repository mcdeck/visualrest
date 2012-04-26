package de.van_porten.vrest.ui.diagram.structure.containment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.FilterResourceType;
import de.van_porten.vrest.core.model.reststructure.ListResourceType;
import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.ProjectionResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.SubresourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.common.DummyConnection;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class CreateContainmentFeature extends AbstractCreateConnectionFeature {

	public CreateContainmentFeature(IFeatureProvider fp) {
		super(fp, "Containment", "Create containment relation");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		ResourceType source = getResourceType(context.getSourceAnchor());
		ResourceType target = getResourceType(context.getTargetAnchor());
		if (source != null && target != null) {
			boolean canCreate = source instanceof SubresourceType
					// connection has to start at subresource and will be
					// inverted later
					|| source instanceof FilterResourceType
					|| source instanceof ListResourceType
					|| source instanceof PagingResourceType
					|| source instanceof ProjectionResourceType
					|| source instanceof AggregationResourceType;
			if( canCreate && source instanceof AggregationResourceType ) {
				canCreate = !((AggregationResourceType)source).getElementTypes().contains(target);
			}
			return canCreate;
		}
		return false;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		ResourceType source = getResourceType(context.getSourceAnchor());
		if (source != null) {
			return source instanceof SubresourceType
					|| source instanceof FilterResourceType
					|| source instanceof ListResourceType
					|| source instanceof PagingResourceType
					|| source instanceof ProjectionResourceType
					|| source instanceof AggregationResourceType;
		}
		return false;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_CONTAINMENT;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		ResourceType source = getResourceType(context.getSourceAnchor());
		ResourceType target = getResourceType(context.getTargetAnchor());

		ResourceType current = null;
		if (source != null && target != null) {
			if (source instanceof SubresourceType) {
				current = ((SubresourceType) source).getContainingType();

				if (current != null) {
					current = source;
				}

				((SubresourceType) source).setContainingType(target);
			} else if (source instanceof ListResourceType) {
				// Also covers Filterresourcetype
				current = ((ListResourceType) source).getListElementType();
				((ListResourceType) source).setListElementType(target);
			} else if (source instanceof PagingResourceType) {
				current = ((PagingResourceType) source).getPagedType();
				((PagingResourceType) source).setPagedType(target);
			} else if (source instanceof ProjectionResourceType) {
				current = ((ProjectionResourceType) source).getProjectedType();
				((ProjectionResourceType) source).setProjectedType(target);
			} else if (source instanceof AggregationResourceType) {
				/* do not remove any old elements in this case */
				((AggregationResourceType) source).getElementTypes()
						.add(target);
			}

			if (current != null) {
				EList<Connection> connections = getDiagram().getConnections();
				for (Connection connection : connections) {
					if (PropertyUtil
							.isContainmentReferenceConnection(connection)) {
						if (getResourceType(connection.getEnd())
								.equals(current)) {
							RemoveContext removeContext = new RemoveContext(
									connection);
							getFeatureProvider()
									.getRemoveFeature(removeContext).remove(
											removeContext);
							// Break here because continuing with iteration
							// will cause an exception - we are removing
							// from the list we're iterating over after all
							break;
						}
					}
				}
			}

			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());

			// Create a marker class to be able to select the correct feature later
			DummyConnection containmentConnector = new DummyConnection();
			addContext.setNewObject(containmentConnector);

			AddContainmentFeature feature = new AddContainmentFeature(
					getFeatureProvider());
			newConnection = (Connection) feature.add(addContext);
		}

		return newConnection;
	}

	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private ResourceType getResourceType(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof ResourceType) {
				return (ResourceType) object;
			}
		}
		return null;
	}

}
