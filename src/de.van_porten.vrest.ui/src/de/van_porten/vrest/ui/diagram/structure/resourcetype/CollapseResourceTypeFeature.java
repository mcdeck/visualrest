package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;

import de.van_porten.vrest.ui.util.PropertyUtil;

public class CollapseResourceTypeFeature extends AbstractFoldResourceTypeFeature {

	public CollapseResourceTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Collapse";
	}

	@Override
	public String getDescription() {
		return "Collapse figure";
	}

	@Override
	public String getImageId() {
		return IPlatformImageConstants.IMG_EDIT_COLLAPSE;
	}

	@Override
	protected boolean isFoldingFeatureExecuteable(PictogramElement pe) {
		return !PropertyUtil.isCollapsed(pe);
	}
}
