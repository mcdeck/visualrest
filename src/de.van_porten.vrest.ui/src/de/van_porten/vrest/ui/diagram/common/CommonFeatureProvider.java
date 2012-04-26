package de.van_porten.vrest.ui.diagram.common;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.DeleteResourceTypeIndicatorFeature;
import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.MoveResourceTypeIndicatorFeature;
import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.RemoveResourceTypeIndicatorFeature;
import de.van_porten.vrest.ui.diagram.common.resourcetypeindicator.ResizeResourceTypeIndicatorFeature;
import de.van_porten.vrest.ui.util.PropertyUtil;

public class CommonFeatureProvider extends DefaultFeatureProvider {

	public CommonFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		if (PropertyUtil.hasShapeId(context.getPictogramElement(),
				PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR)) {
			return new RemoveResourceTypeIndicatorFeature(this);
		}
		return super.getRemoveFeature(context);
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		if (PropertyUtil.hasShapeId(context.getPictogramElement(),
				PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR)) {
			return new DeleteResourceTypeIndicatorFeature(this);
		}
		return super.getDeleteFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		if (PropertyUtil.hasShapeId(context.getPictogramElement(),
				PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR)) {
			return new MoveResourceTypeIndicatorFeature(this);
		}
		return super.getMoveShapeFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		if (PropertyUtil.hasShapeId(context.getPictogramElement(),
				PropertyUtil.GenericShapeIds.RESOURCETYPE_INDICATOR)) {
			return new ResizeResourceTypeIndicatorFeature(this);
		}

		return super.getResizeShapeFeature(context);
	}
}
