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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
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
import de.van_porten.vrest.core.model.reststructure.AggregationResourceType;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.AggregationResourceTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class AggregationResourceTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for elementTypes ReferencesTable
	 */
	private	ReferencesTableSettings elementTypesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AggregationResourceTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject aggregationResourceType, String editing_mode) {
		super(editingContext, aggregationResourceType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.AggregationResourceType.class;
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
			final AggregationResourceType aggregationResourceType = (AggregationResourceType)elt;
			final AggregationResourceTypePropertiesEditionPart basePart = (AggregationResourceTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.identifer)) {
				identiferSettings = new ReferencesTableSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getResourceType_Identifer());
				basePart.initIdentifer(identiferSettings);
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.resourceelements)) {
				resourceelementsSettings = new ReferencesTableSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getResourceType_Resourceelements());
				basePart.initResourceelements(resourceelementsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.methods)) {
				methodsSettings = new ReferencesTableSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getResourceType_Methods());
				basePart.initMethods(methodsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.creators)) {
				creatorsSettings = new ReferencesTableSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getResourceType_Creators());
				basePart.initCreators(creatorsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.states)) {
				statesSettings = new ReferencesTableSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getResourceType_States());
				basePart.initStates(statesSettings);
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.initialState)) {
				// init part
				initialStateSettings = new EObjectFlatComboSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getResourceType_InitialState());
				basePart.initInitialState(initialStateSettings);
				// set the button mode
				basePart.setInitialStateButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (aggregationResourceType.getName() != null && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), aggregationResourceType.getName()));
			
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.isSingleton)) {
				basePart.setIsSingleton(aggregationResourceType.isIsSingleton());
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.createOnStart)) {
				basePart.setCreateOnStart(aggregationResourceType.isCreateOnStart());
			}
			if (isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.elementTypes)) {
				elementTypesSettings = new ReferencesTableSettings(aggregationResourceType, RestStructurePackage.eINSTANCE.getAggregationResourceType_ElementTypes());
				basePart.initElementTypes(elementTypesSettings);
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
			
			
			
			
			basePart.addFilterToElementTypes(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInElementTypesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToElementTypes(new EObjectFilter(RestStructurePackage.eINSTANCE.getResourceType()));
			// Start of user code for additional businessfilters for elementTypes
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
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.identifer) {
			return RestStructurePackage.eINSTANCE.getResourceType_Identifer();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.resourceelements) {
			return RestStructurePackage.eINSTANCE.getResourceType_Resourceelements();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.methods) {
			return RestStructurePackage.eINSTANCE.getResourceType_Methods();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.creators) {
			return RestStructurePackage.eINSTANCE.getResourceType_Creators();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.states) {
			return RestStructurePackage.eINSTANCE.getResourceType_States();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.initialState) {
			return RestStructurePackage.eINSTANCE.getResourceType_InitialState();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.name) {
			return RestStructurePackage.eINSTANCE.getResourceType_Name();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.isSingleton) {
			return RestStructurePackage.eINSTANCE.getResourceType_IsSingleton();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.createOnStart) {
			return RestStructurePackage.eINSTANCE.getResourceType_CreateOnStart();
		}
		if (editorKey == ReststructureViewsRepository.AggregationResourceType.Properties.elementTypes) {
			return RestStructurePackage.eINSTANCE.getAggregationResourceType_ElementTypes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AggregationResourceType aggregationResourceType = (AggregationResourceType)semanticObject;
		if (ReststructureViewsRepository.AggregationResourceType.Properties.identifer == event.getAffectedEditor()) {
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
		if (ReststructureViewsRepository.AggregationResourceType.Properties.resourceelements == event.getAffectedEditor()) {
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
		if (ReststructureViewsRepository.AggregationResourceType.Properties.methods == event.getAffectedEditor()) {
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
		if (ReststructureViewsRepository.AggregationResourceType.Properties.creators == event.getAffectedEditor()) {
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
		if (ReststructureViewsRepository.AggregationResourceType.Properties.states == event.getAffectedEditor()) {
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
		if (ReststructureViewsRepository.AggregationResourceType.Properties.initialState == event.getAffectedEditor()) {
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
		if (ReststructureViewsRepository.AggregationResourceType.Properties.name == event.getAffectedEditor()) {
			aggregationResourceType.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.AggregationResourceType.Properties.isSingleton == event.getAffectedEditor()) {
			aggregationResourceType.setIsSingleton((Boolean)event.getNewValue());
		}
		if (ReststructureViewsRepository.AggregationResourceType.Properties.createOnStart == event.getAffectedEditor()) {
			aggregationResourceType.setCreateOnStart((Boolean)event.getNewValue());
		}
		if (ReststructureViewsRepository.AggregationResourceType.Properties.elementTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceType) {
					elementTypesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				elementTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				elementTypesSettings.move(event.getNewIndex(), (ResourceType) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AggregationResourceTypePropertiesEditionPart basePart = (AggregationResourceTypePropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getResourceType_Identifer().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.identifer))
				basePart.updateIdentifer();
			if (RestStructurePackage.eINSTANCE.getResourceType_Resourceelements().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.resourceelements))
				basePart.updateResourceelements();
			if (RestStructurePackage.eINSTANCE.getResourceType_Methods().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.methods))
				basePart.updateMethods();
			if (RestStructurePackage.eINSTANCE.getResourceType_Creators().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.creators))
				basePart.updateCreators();
			if (RestStructurePackage.eINSTANCE.getResourceType_States().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.states))
				basePart.updateStates();
			if (RestStructurePackage.eINSTANCE.getResourceType_InitialState().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.initialState))
				basePart.setInitialState((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getResourceType_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getResourceType_IsSingleton().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.isSingleton))
				basePart.setIsSingleton((Boolean)msg.getNewValue());
			
			if (RestStructurePackage.eINSTANCE.getResourceType_CreateOnStart().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.createOnStart))
				basePart.setCreateOnStart((Boolean)msg.getNewValue());
			
			if (RestStructurePackage.eINSTANCE.getAggregationResourceType_ElementTypes().equals(msg.getFeature())  && isAccessible(ReststructureViewsRepository.AggregationResourceType.Properties.elementTypes))
				basePart.updateElementTypes();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ReststructureViewsRepository.AggregationResourceType.Properties.identifer || key == ReststructureViewsRepository.AggregationResourceType.Properties.states || key == ReststructureViewsRepository.AggregationResourceType.Properties.initialState || key == ReststructureViewsRepository.AggregationResourceType.Properties.elementTypes;
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
				if (ReststructureViewsRepository.AggregationResourceType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getResourceType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getResourceType_Name().getEAttributeType(), newValue);
				}
				if (ReststructureViewsRepository.AggregationResourceType.Properties.isSingleton == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getResourceType_IsSingleton().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getResourceType_IsSingleton().getEAttributeType(), newValue);
				}
				if (ReststructureViewsRepository.AggregationResourceType.Properties.createOnStart == event.getAffectedEditor()) {
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
