package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;

import de.van_porten.vrest.ui.util.PropertyUtil;

public class ExpandResourceTypeFeature extends AbstractFoldResourceTypeFeature {

	public ExpandResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Expand";
	}

	@Override
	public String getDescription() {
		return "Expand figure";
	}

	@Override
	public String getImageId() {
		return IPlatformImageConstants.IMG_EDIT_EXPAND;
	}

	@Override
	protected boolean isFoldingFeatureExecuteable(PictogramElement pe) {
		return PropertyUtil.isCollapsed(pe);
	}
}
