package de.van_porten.vrest.ui.diagram.common.resourcetypeindicator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;

public class RemoveResourceTypeIndicatorFeature extends DefaultRemoveFeature {

	public RemoveResourceTypeIndicatorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canRemove(IRemoveContext context) {
		return false;
	}

}
