package de.van_porten.vrest.ui.diagram.structure.resourcetype.projection;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractCreateResourceTypeFeature;

public class CreateProjectionResourceTypeFeature extends AbstractCreateResourceTypeFeature {

	public CreateProjectionResourceTypeFeature(IFeatureProvider fp) {
		super(fp, "Projection Resource", "Create Projection Resource");
	}

	@Override
	protected ResourceType createResourceTypeInstance() {
		return RestStructureFactory.eINSTANCE.createProjectionResourceType();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_PROJECTION_RESOURCE_TYPE;
	}

	@Override
	protected void addRequiredFeatures(ResourceType newClass) {
		// TODO Auto-generated method stub
	}
}
