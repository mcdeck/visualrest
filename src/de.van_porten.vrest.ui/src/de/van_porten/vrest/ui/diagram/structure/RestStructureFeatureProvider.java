package de.van_porten.vrest.ui.diagram.structure;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.van_porten.vrest.core.model.reststructure.ActivityResourceType;
import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.FilterResourceType;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.ListResourceType;
import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.PrimaryResourceType;
import de.van_porten.vrest.core.model.reststructure.ProjectionResourceType;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.SubresourceType;
import de.van_porten.vrest.ui.diagram.common.CommonFeatureProvider;
import de.van_porten.vrest.ui.diagram.common.DummyConnection;
import de.van_porten.vrest.ui.diagram.structure.attribute.AddAttributeFeature;
import de.van_porten.vrest.ui.diagram.structure.attribute.CreateAttributeFeature;
import de.van_porten.vrest.ui.diagram.structure.attribute.UpdateAttributeFeature;
import de.van_porten.vrest.ui.diagram.structure.containment.AddContainmentFeature;
import de.van_porten.vrest.ui.diagram.structure.containment.CreateContainmentFeature;
import de.van_porten.vrest.ui.diagram.structure.containment.DeleteContainmentFeature;
import de.van_porten.vrest.ui.diagram.structure.internallink.AddInternalLinkFeature;
import de.van_porten.vrest.ui.diagram.structure.internallink.CreateInternalLinkFeature;
import de.van_porten.vrest.ui.diagram.structure.internallink.DirectEditInternalLinkFeature;
import de.van_porten.vrest.ui.diagram.structure.internallink.ReconnectionInternalLinkFeature;
import de.van_porten.vrest.ui.diagram.structure.internallink.UpdateInternalLinkFeature;
import de.van_porten.vrest.ui.diagram.structure.resourceidentifierpattern.UpdateResourceIdentifierPatternFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.CollapseResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.CopyResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.DeleteResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.DirectEditResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.DrillDownResourceTypeMethodsFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.DrillDownResourceTypeStatesFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.ExpandResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.LayoutResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.PasteResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.activity.AddActivityResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.activity.CreateActivityResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.activity.UpdateActivityResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.aggregation.AddAggregationResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.aggregation.CreateAggregationResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.aggregation.UpdateAggregationResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.filter.AddFilterResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.filter.CreateFilterResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.filter.UpdateFilterResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.list.AddListResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.list.CreateListResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.list.UpdateListResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.paging.AddPagingResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.paging.CreatePagingResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.paging.UpdatePagingResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.primary.AddPrimaryResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.primary.CreatePrimaryResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.primary.UpdatePrimaryResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.projection.AddProjectionResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.projection.CreateProjectionResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.projection.UpdateProjectionResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.subresource.AddSubresourceResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.subresource.CreateSubresourceResourceTypeFeature;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.subresource.UpdateSubresourceResourceTypeFeature;
import de.van_porten.vrest.ui.navigator.nodes.IRestModelContainer;

public class RestStructureFeatureProvider extends CommonFeatureProvider {

	public RestStructureFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		Object addedClass = context.getNewObject();
		if (addedClass instanceof IRestModelContainer) {
			addedClass = ((IRestModelContainer) addedClass).getModel();
		}

		if (addedClass instanceof PrimaryResourceType) {
			return new AddPrimaryResourceTypeFeature(this);
		} else if (addedClass instanceof PagingResourceType) {
			return new AddPagingResourceTypeFeature(this);
		} else if (addedClass instanceof ProjectionResourceType) {
			return new AddProjectionResourceTypeFeature(this);
		} else if (addedClass instanceof ActivityResourceType) {
			return new AddActivityResourceTypeFeature(this);
		} else if (addedClass instanceof AggregationResourceType) {
			return new AddAggregationResourceTypeFeature(this);
		} else if (addedClass instanceof FilterResourceType) {
			return new AddFilterResourceTypeFeature(this);
		} else if (addedClass instanceof ListResourceType) {
			// Has to be after Filter because Filter derives from List
			return new AddListResourceTypeFeature(this);
		} else if (addedClass instanceof SubresourceType) {
			return new AddSubresourceResourceTypeFeature(this);
		} else if (addedClass instanceof InternalLink) {
			return new AddInternalLinkFeature(this);
		} else if (addedClass instanceof Attribute) {
			return new AddAttributeFeature(this);
		} else if (addedClass instanceof DummyConnection) {
			return new AddContainmentFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {
				new CreatePrimaryResourceTypeFeature(this),
				new CreatePagingResourceTypeFeature(this),
				new CreateProjectionResourceTypeFeature(this),
				new CreateActivityResourceTypeFeature(this),
				new CreateListResourceTypeFeature(this),
				new CreateAggregationResourceTypeFeature(this),
				new CreateFilterResourceTypeFeature(this),
				new CreateSubresourceResourceTypeFeature(this),
				new CreateAttributeFeature(this) };
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof PrimaryResourceType) {
			return new UpdatePrimaryResourceTypeFeature(this);
		} else if (bo instanceof PagingResourceType) {
			return new UpdatePagingResourceTypeFeature(this);
		} else if (bo instanceof ProjectionResourceType) {
			return new UpdateProjectionResourceTypeFeature(this);
		} else if (bo instanceof ActivityResourceType) {
			return new UpdateActivityResourceTypeFeature(this);
		} else if (bo instanceof AggregationResourceType) {
			return new UpdateAggregationResourceTypeFeature(this);
		} else if (bo instanceof FilterResourceType) {
			return new UpdateFilterResourceTypeFeature(this);
		} else if (bo instanceof ListResourceType) {
			// Has to be after Filter because Filter derives from List
			return new UpdateListResourceTypeFeature(this);
		} else if (bo instanceof SubresourceType) {
			return new UpdateSubresourceResourceTypeFeature(this);
		} else if (bo instanceof Attribute) {
			return new UpdateAttributeFeature(this);
		} else if (bo instanceof InternalLink) {
			return new UpdateInternalLinkFeature(this);
		} else if (bo instanceof ResourceIdentifierPattern) {
			return new UpdateResourceIdentifierPatternFeature(this);
		}
		return super.getUpdateFeature(context);
	}

	@Override
	public IReconnectionFeature getReconnectionFeature(
			IReconnectionContext context) {
		Object bo = getBusinessObjectForPictogramElement(context
				.getConnection());
		if (bo instanceof InternalLink) {
			return new ReconnectionInternalLinkFeature(this);
		}
		return super.getReconnectionFeature(context);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof ConnectionDecorator) {
//			IRemoveContext newRemoveContext = new RemoveContext(
//					((ConnectionDecorator) pe).getConnection());
//			return getRemoveFeature(newRemoveContext);
			return null;
		}
		return super.getRemoveFeature(context);
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof ConnectionDecorator) {
			IDeleteContext newDeleteContext = new DeleteContext(
					((ConnectionDecorator) pe).getConnection());
			return getDeleteFeature(newDeleteContext);
		} else {
			Object bo = getBusinessObjectForPictogramElement(pe);
			if (bo instanceof ResourceType) {
				return new DeleteResourceTypeFeature(this);
			} else if (bo instanceof DummyConnection) {
				return new DeleteContainmentFeature(this);
			}
		}
		return super.getDeleteFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		/* Default implementation is good enough */
		return super.getMoveShapeFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		/* Default implementation is good enough */
		return super.getResizeShapeFeature(context);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof ResourceType) {
			return new LayoutResourceTypeFeature(this);
		}
		return super.getLayoutFeature(context);
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] {
				new DrillDownResourceTypeStatesFeature(this),
				new DrillDownResourceTypeMethodsFeature(this),
				new CollapseResourceTypeFeature(this),
				new ExpandResourceTypeFeature(this) };
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {
				new CreateInternalLinkFeature(this),
				new CreateContainmentFeature(this) };
	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		return getCreateConnectionFeatures();
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(
			IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof ResourceType) {
			return new DirectEditResourceTypeFeature(this);
		} else if (bo instanceof InternalLink) {
			return new DirectEditInternalLinkFeature(this);
		}
		return super.getDirectEditingFeature(context);
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return new CopyResourceTypeFeature(this);
	}

	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new PasteResourceTypeFeature(this);
	}
}
