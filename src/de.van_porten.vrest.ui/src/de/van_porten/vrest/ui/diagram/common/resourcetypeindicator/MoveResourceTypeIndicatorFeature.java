package de.van_porten.vrest.ui.diagram.common.resourcetypeindicator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

public class MoveResourceTypeIndicatorFeature extends DefaultMoveShapeFeature {

	public MoveResourceTypeIndicatorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		return false;
	}
}
