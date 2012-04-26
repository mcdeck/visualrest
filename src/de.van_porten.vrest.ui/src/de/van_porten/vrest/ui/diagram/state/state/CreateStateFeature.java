package de.van_porten.vrest.ui.diagram.state.state;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.ui.diagram.RestImageProvider;
import de.van_porten.vrest.ui.util.ResourceUtil;

public class CreateStateFeature extends AbstractCreateFeature {

	public CreateStateFeature(IFeatureProvider fp) {
		super(fp, "State", "Create a new State for the underlying ResourceType");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public String getCreateImageId() {
		return RestImageProvider.IMG_STATES_STATE;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// create PrimaryResourceType
		State newClass = RestBehaviorFactory.eINSTANCE.createState();
		newClass.setName("NewState");

		try {
			ResourceUtil.saveToModelFile(newClass, getDiagram());
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ResourceType parent = (ResourceType)getBusinessObjectForPictogramElement(getDiagram());
		parent.getStates().add(newClass);

		// do the add
		addGraphicalRepresentation(context, newClass);

		// return newly created business object(s)
		return new Object[] { newClass };
	}
}
