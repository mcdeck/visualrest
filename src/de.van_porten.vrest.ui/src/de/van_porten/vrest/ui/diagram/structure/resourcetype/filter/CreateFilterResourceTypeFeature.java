package de.van_porten.vrest.ui.diagram.structure.resourcetype.filter;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractCreateResourceTypeFeature;

public class CreateFilterResourceTypeFeature extends AbstractCreateResourceTypeFeature {

	public CreateFilterResourceTypeFeature(IFeatureProvider fp) {
		super(fp, "Filter Resource", "Create Filter Resource");
	}

	@Override
	protected ResourceType createResourceTypeInstance() {
		return RestStructureFactory.eINSTANCE.createFilterResourceType();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_FILTER_RESOURCE_TYPE;
	}

	@Override
	protected void addRequiredFeatures(ResourceType newClass) {
		// TODO Auto-generated method stub
	}
}
