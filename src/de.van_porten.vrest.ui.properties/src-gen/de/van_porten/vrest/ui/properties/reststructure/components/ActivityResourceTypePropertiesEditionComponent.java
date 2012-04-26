/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.ui.properties.reststructure.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.restbehavior.Creator;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.ActivityResourceType;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.ActivityResourceTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class ActivityResourceTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for identifer ReferencesTable
	 */
	protected ReferencesTableSettings identiferSettings;
	
	/**
	 * Settings for resourceelements ReferencesTable
	 */
	protected ReferencesTableSettings resourceelementsSettings;
	
	/**
	 * Settings for methods ReferencesTable
	 */
	protected ReferencesTableSettings methodsSettings;
	
	/**
	 * Settings for creators ReferencesTable
	 */
	protected ReferencesTableSettings creatorsSettings;
	
	/**
	 * Settings for states ReferencesTable
	 */
	protected ReferencesTableSettings statesSettings;
	
	/**
	 * Settings for initialState EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings initialStateSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ActivityResourceTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject activityResourceType, String editing_mode) {
		super(editingContext, activityResourceType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.ActivityResourceType.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final ActivityResourceType activityResourceType = (ActivityResourceType)elt;
			final ActivityResourceTypePropertiesEditionPart basePart = (ActivityResourceTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.identifer)) {
				identiferSettings = new ReferencesTableSettings(activityResourceType, RestStructurePackage.eINSTANCE.getResourceType_Identifer());
				basePart.initIdentifer(identiferSettings);
			}
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.resourceelements)) {
				resourceelementsSettings = new ReferencesTableSettings(activityResourceType, RestStructurePackage.eINSTANCE.getResourceType_Resourceelements());
				basePart.initResourceelements(resourceelementsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.methods)) {
				methodsSettings = new ReferencesTableSettings(activityResourceType, RestStructurePackage.eINSTANCE.getResourceType_Methods());
				basePart.initMethods(methodsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.creators)) {
				creatorsSettings = new ReferencesTableSettings(activityResourceType, RestStructurePackage.eINSTANCE.getResourceType_Creators());
				basePart.initCreators(creatorsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.states)) {
				statesSettings = new ReferencesTableSettings(activityResourceType, RestStructurePackage.eINSTANCE.getResourceType_States());
				basePart.initStates(statesSettings);
			}
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.initialState)) {
				// init part
				initialStateSettings = new EObjectFlatComboSettings(activityResourceType, RestStructurePackage.eINSTANCE.getResourceType_InitialState());
				basePart.initInitialState(initialStateSettings);
				// set the button mode
				basePart.setInitialStateButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (activityResourceType.getName() != null && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), activityResourceType.getName()));
			
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.isSingleton)) {
				basePart.setIsSingleton(activityResourceType.isIsSingleton());
			}
			if (isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.createOnStart)) {
				basePart.setCreateOnStart(activityResourceType.isCreateOnStart());
			}
			// init filters
			basePart.addFilterToIdentifer(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceIdentifierPattern);
					}
			
			});
			// Start of user code for additional businessfilters for identifer
			// End of user code
			
			basePart.addFilterToResourceelements(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceElement); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for resourceelements
			// End of user code
			
			basePart.addFilterToMethods(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Method); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for methods
			// End of user code
			
			basePart.addFilterToCreators(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Creator); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for creators
			// End of user code
			
			basePart.addFilterToStates(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof State);
					}
			
			});
			// Start of user code for additional businessfilters for states
			// End of user code
			
			basePart.addFilterToInitialState(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof State);
				}
			
			});
			// Start of user code for additional businessfilters for initialState
			// End of user code
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}












	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.identifer) {
			return RestStructurePackage.eINSTANCE.getResourceType_Identifer();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.resourceelements) {
			return RestStructurePackage.eINSTANCE.getResourceType_Resourceelements();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.methods) {
			return RestStructurePackage.eINSTANCE.getResourceType_Methods();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.creators) {
			return RestStructurePackage.eINSTANCE.getResourceType_Creators();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.states) {
			return RestStructurePackage.eINSTANCE.getResourceType_States();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.initialState) {
			return RestStructurePackage.eINSTANCE.getResourceType_InitialState();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.name) {
			return RestStructurePackage.eINSTANCE.getResourceType_Name();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.isSingleton) {
			return RestStructurePackage.eINSTANCE.getResourceType_IsSingleton();
		}
		if (editorKey == ReststructureViewsRepository.ActivityResourceType.Properties.createOnStart) {
			return RestStructurePackage.eINSTANCE.getResourceType_CreateOnStart();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ActivityResourceType activityResourceType = (ActivityResourceType)semanticObject;
		if (ReststructureViewsRepository.ActivityResourceType.Properties.identifer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, identiferSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				identiferSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				identiferSettings.move(event.getNewIndex(), (ResourceIdentifierPattern) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.resourceelements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourceelementsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resourceelementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourceelementsSettings.move(event.getNewIndex(), (ResourceElement) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.methods == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, methodsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				methodsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				methodsSettings.move(event.getNewIndex(), (Method) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.creators == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, creatorsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				creatorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				creatorsSettings.move(event.getNewIndex(), (Creator) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.states == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, statesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				statesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				statesSettings.move(event.getNewIndex(), (State) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.initialState == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				initialStateSettings.setToReference((State)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				State eObject = RestBehaviorFactory.eINSTANCE.createState();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				initialStateSettings.setToReference(eObject);
			}
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.name == event.getAffectedEditor()) {
			activityResourceType.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.isSingleton == event.getAffectedEditor()) {
			activityResourceType.setIsSingleton((Boolean)event.getNewValue());
		}
		if (ReststructureViewsRepository.ActivityResourceType.Properties.createOnStart == event.getAffectedEditor()) {
			activityResourceType.setCreateOnStart((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ActivityResourceTypePropertiesEditionPart basePart = (ActivityResourceTypePropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getResourceType_Identifer().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.identifer))
				basePart.updateIdentifer();
			if (RestStructurePackage.eINSTANCE.getResourceType_Resourceelements().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.resourceelements))
				basePart.updateResourceelements();
			if (RestStructurePackage.eINSTANCE.getResourceType_Methods().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.methods))
				basePart.updateMethods();
			if (RestStructurePackage.eINSTANCE.getResourceType_Creators().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.creators))
				basePart.updateCreators();
			if (RestStructurePackage.eINSTANCE.getResourceType_States().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.states))
				basePart.updateStates();
			if (RestStructurePackage.eINSTANCE.getResourceType_InitialState().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.initialState))
				basePart.setInitialState((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getResourceType_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getResourceType_IsSingleton().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.isSingleton))
				basePart.setIsSingleton((Boolean)msg.getNewValue());
			
			if (RestStructurePackage.eINSTANCE.getResourceType_CreateOnStart().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.ActivityResourceType.Properties.createOnStart))
				basePart.setCreateOnStart((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ReststructureViewsRepository.ActivityResourceType.Properties.identifer || key == ReststructureViewsRepository.ActivityResourceType.Properties.states || key == ReststructureViewsRepository.ActivityResourceType.Properties.initialState;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ReststructureViewsRepository.ActivityResourceType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getResourceType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getResourceType_Name().getEAttributeType(), newValue);
				}
				if (ReststructureViewsRepository.ActivityResourceType.Properties.isSingleton == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getResourceType_IsSingleton().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getResourceType_IsSingleton().getEAttributeType(), newValue);
				}
				if (ReststructureViewsRepository.ActivityResourceType.Properties.createOnStart == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getResourceType_CreateOnStart().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getResourceType_CreateOnStart().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
