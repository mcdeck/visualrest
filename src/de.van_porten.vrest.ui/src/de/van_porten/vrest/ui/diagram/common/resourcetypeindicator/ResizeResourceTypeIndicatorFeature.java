package de.van_porten.vrest.ui.diagram.common.resourcetypeindicator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

public class ResizeResourceTypeIndicatorFeature extends DefaultResizeShapeFeature {

	public ResizeResourceTypeIndicatorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		return false;
	}

}
