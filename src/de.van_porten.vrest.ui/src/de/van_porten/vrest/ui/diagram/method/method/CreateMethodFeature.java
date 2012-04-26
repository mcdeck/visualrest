package de.van_porten.vrest.ui.diagram.method.method;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.util.ResourceUtil;

public class CreateMethodFeature extends AbstractCreateFeature {

	public CreateMethodFeature(IFeatureProvider fp) {
		super(fp, "Method", "Create a new method");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_METHODS_METHOD;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// create PrimaryResourceType
		Method newClass = RestStructureFactory.eINSTANCE.createMethod();
		newClass.setName("NewMethod");
		/* Create a behavior specification for this method */
		BehaviorSpecification spec = RestBehaviorFactory.eINSTANCE.createBehaviorSpecification();
		newClass.setMethodbehavior(spec);

		try {
			ResourceUtil.saveToModelFile(newClass, getDiagram());
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ResourceType parent = (ResourceType)getBusinessObjectForPictogramElement(getDiagram());
		parent.getMethods().add(newClass);

		// do the add
		addGraphicalRepresentation(context, newClass);

		// return newly created business object(s)
		return new Object[] { newClass };
	}
}
