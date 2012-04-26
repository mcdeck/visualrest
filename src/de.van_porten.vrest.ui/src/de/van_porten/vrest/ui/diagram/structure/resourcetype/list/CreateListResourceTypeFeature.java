package de.van_porten.vrest.ui.diagram.structure.resourcetype.list;

import org.eclipse.graphiti.features.IFeatureProvider;

import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.diagram.structure.resourcetype.AbstractCreateResourceTypeFeature;

public class CreateListResourceTypeFeature extends AbstractCreateResourceTypeFeature {

	public CreateListResourceTypeFeature(IFeatureProvider fp) {
		super(fp, "List Resource", "Create List Resource");
	}

	@Override
	protected ResourceType createResourceTypeInstance() {
		return RestStructureFactory.eINSTANCE.createListResourceType();
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_LIST_RESOURCE_TYPE;
	}

	@Override
	protected void addRequiredFeatures(ResourceType newClass) {
		// TODO Auto-generated method stub
	}
}
