package de.van_porten.vrest.ui.diagram.common.resourcetypeindicator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

public class DeleteResourceTypeIndicatorFeature extends DefaultDeleteFeature {

	public DeleteResourceTypeIndicatorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canDelete(IDeleteContext context) {
		return false;
	}

}
