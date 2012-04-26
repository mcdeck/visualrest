package de.van_porten.vrest.ui.diagram.structure.attribute;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.services.Graphiti;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.util.ResourceUtil;

public class CreateAttributeFeature extends AbstractCreateFeature {

	public CreateAttributeFeature(IFeatureProvider fp) {
		super(fp, "Attribute", "Create a new Attribute for a ResourceType");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		EObject bo =Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(context.getTargetContainer());
		return (bo instanceof ResourceType);
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STRUCTURE_ATTRIBUTE;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// create PrimaryResourceType
		Attribute newClass = RestStructureFactory.eINSTANCE.createAttribute();
		newClass.setName("attribute");

		try {
			ResourceUtil.saveToModelFile(newClass, getDiagram());
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ResourceType parent = (ResourceType)getBusinessObjectForPictogramElement(context.getTargetContainer());
		parent.getResourceelements().add(newClass);

		// do the add
		addGraphicalRepresentation(context, newClass);

		// return newly created business object(s)
		return new Object[] { newClass };
	}
}
