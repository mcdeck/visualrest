package de.van_porten.vrest.ui.diagram.structure.resourcetype.paging;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractCreateResourceTypeFeature;

public class CreatePagingResourceTypeFeature extends AbstractCreateResourceTypeFeature {

	public CreatePagingResourceTypeFeature(IFeatureProvider fp) {
		super(fp, "Paging Resource", "Create Paging Resource");
	}

	@Override
	protected ResourceType createResourceTypeInstance() {
		return RestStructureFactory.eINSTANCE.createPagingResourceType();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_PAGING_RESOURCE_TYPE;
	}

	@Override
	protected void addRequiredFeatures(ResourceType newClass) {
		// TODO Auto-generated method stub
	}
}
