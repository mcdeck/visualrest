package de.van_porten.vrest.ui.diagram.structure.resourcetype;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.SimpleIdentifier;
import de.van_porten.vrest.ui.util.ResourceUtil;

public abstract class AbstractCreateResourceTypeFeature extends AbstractCreateFeature {

	public AbstractCreateResourceTypeFeature(IFeatureProvider fp, String toolName, String toolDesc) {
		super(fp, toolName, toolDesc);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		// create PrimaryResourceType
		ResourceType newClass = createResourceTypeInstance();

		State initialState = RestBehaviorFactory.eINSTANCE.createState();
		initialState.setName("created");
		SimpleIdentifier identifier = RestStructureFactory.eINSTANCE.createSimpleIdentifier();
		identifier.setIdentifier("/myNewResource");
		newClass.getStates().add(initialState);
		newClass.setInitialState(initialState);
		newClass.getIdentifer().add(identifier);
		/* add any additionally required properties to the ResourceType instance */
		addRequiredFeatures( newClass );

		try {
			ResourceUtil.saveToModelFile(newClass, getDiagram());
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// do the add
		addGraphicalRepresentation(context, newClass);

		String resourceBaseName = "MyResource";
		int resourceWithTheSameName = 0;
		String resourceName = resourceBaseName + resourceWithTheSameName;
		EList<EObject> otherResources = newClass.eContainer().eContents();
		for( int i = 0; i < otherResources.size(); i++ ) {
			EObject eObject = otherResources.get(i);
			if( eObject instanceof ResourceType && !newClass.equals(eObject) ) {
				if( resourceName.equals(((ResourceType) eObject).getName()) ) {
					resourceWithTheSameName ++;
					resourceName = resourceBaseName + resourceWithTheSameName;
					i = 0;
				}
			}
		}
		newClass.setName(resourceName);

		// activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

		// return newly created business object(s)
		return new Object[] { newClass };
	}

	/**
	 * @return
	 */
	protected abstract ResourceType createResourceTypeInstance();

	/**
	 * @return
	 */
	protected abstract void addRequiredFeatures( ResourceType newClass );
}
