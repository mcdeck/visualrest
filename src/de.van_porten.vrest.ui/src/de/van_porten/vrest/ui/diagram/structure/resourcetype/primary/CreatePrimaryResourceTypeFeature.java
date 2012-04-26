package de.van_porten.vrest.ui.diagram.structure.resourcetype.primary;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractCreateResourceTypeFeature;

public class CreatePrimaryResourceTypeFeature extends AbstractCreateResourceTypeFeature {

	public CreatePrimaryResourceTypeFeature(IFeatureProvider fp) {
		super(fp, "Primary Resource", "Create Primary Resource");
	}

	@Override
	protected ResourceType createResourceTypeInstance() {
		return RestStructureFactory.eINSTANCE.createPrimaryResourceType();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_PRIMARY_RESOURCE_TYPE;
	}

	@Override
	protected void addRequiredFeatures(ResourceType newClass) {
		// TODO Auto-generated method stub
	}
}
