/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.ui.properties.rest.components;

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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.rest.RestPackage;
import de.van_porten.vrest.core.model.rest.parts.RestApplicationModelPropertiesEditionPart;
import de.van_porten.vrest.core.model.rest.parts.RestViewsRepository;
import de.van_porten.vrest.core.model.restbehavior.OpType;
import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.RelationType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RestApplicationModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for methodTypes ReferencesTable
	 */
	protected ReferencesTableSettings methodTypesSettings;
	
	/**
	 * Settings for dataTypes ReferencesTable
	 */
	protected ReferencesTableSettings dataTypesSettings;
	
	/**
	 * Settings for mediaTypes ReferencesTable
	 */
	protected ReferencesTableSettings mediaTypesSettings;
	
	/**
	 * Settings for resourceTypes ReferencesTable
	 */
	protected ReferencesTableSettings resourceTypesSettings;
	
	/**
	 * Settings for relTypes ReferencesTable
	 */
	protected ReferencesTableSettings relTypesSettings;
	
	/**
	 * Settings for optypes ReferencesTable
	 */
	protected ReferencesTableSettings optypesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RestApplicationModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject restApplicationModel, String editing_mode) {
		super(editingContext, restApplicationModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RestViewsRepository.class;
		partKey = RestViewsRepository.RestApplicationModel.class;
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
			final RestApplicationModel restApplicationModel = (RestApplicationModel)elt;
			final RestApplicationModelPropertiesEditionPart basePart = (RestApplicationModelPropertiesEditionPart)editingPart;
			// init values
			if (restApplicationModel.getName() != null && isAccessible(RestViewsRepository.RestApplicationModel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), restApplicationModel.getName()));
			
			if (isAccessible(RestViewsRepository.RestApplicationModel.Properties.methodTypes)) {
				methodTypesSettings = new ReferencesTableSettings(restApplicationModel, RestPackage.eINSTANCE.getRestApplicationModel_MethodTypes());
				basePart.initMethodTypes(methodTypesSettings);
			}
			if (isAccessible(RestViewsRepository.RestApplicationModel.Properties.dataTypes)) {
				dataTypesSettings = new ReferencesTableSettings(restApplicationModel, RestPackage.eINSTANCE.getRestApplicationModel_DataTypes());
				basePart.initDataTypes(dataTypesSettings);
			}
			if (isAccessible(RestViewsRepository.RestApplicationModel.Properties.mediaTypes)) {
				mediaTypesSettings = new ReferencesTableSettings(restApplicationModel, RestPackage.eINSTANCE.getRestApplicationModel_MediaTypes());
				basePart.initMediaTypes(mediaTypesSettings);
			}
			if (isAccessible(RestViewsRepository.RestApplicationModel.Properties.resourceTypes)) {
				resourceTypesSettings = new ReferencesTableSettings(restApplicationModel, RestPackage.eINSTANCE.getRestApplicationModel_ResourceTypes());
				basePart.initResourceTypes(resourceTypesSettings);
			}
			if (isAccessible(RestViewsRepository.RestApplicationModel.Properties.relTypes)) {
				relTypesSettings = new ReferencesTableSettings(restApplicationModel, RestPackage.eINSTANCE.getRestApplicationModel_RelTypes());
				basePart.initRelTypes(relTypesSettings);
			}
			if (isAccessible(RestViewsRepository.RestApplicationModel.Properties.optypes)) {
				optypesSettings = new ReferencesTableSettings(restApplicationModel, RestPackage.eINSTANCE.getRestApplicationModel_Optypes());
				basePart.initOptypes(optypesSettings);
			}
			// init filters
			
			basePart.addFilterToMethodTypes(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MethodType); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for methodTypes
			// End of user code
			
			basePart.addFilterToDataTypes(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DataType); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for dataTypes
			// End of user code
			
			basePart.addFilterToMediaTypes(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MediaType); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for mediaTypes
			// End of user code
			
			basePart.addFilterToResourceTypes(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceType); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for resourceTypes
			// End of user code
			
			basePart.addFilterToRelTypes(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RelationType); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for relTypes
			// End of user code
			
			basePart.addFilterToOptypes(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof OpType); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for optypes
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
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.name) {
			return RestPackage.eINSTANCE.getRestApplicationModel_Name();
		}
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.methodTypes) {
			return RestPackage.eINSTANCE.getRestApplicationModel_MethodTypes();
		}
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.dataTypes) {
			return RestPackage.eINSTANCE.getRestApplicationModel_DataTypes();
		}
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.mediaTypes) {
			return RestPackage.eINSTANCE.getRestApplicationModel_MediaTypes();
		}
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.resourceTypes) {
			return RestPackage.eINSTANCE.getRestApplicationModel_ResourceTypes();
		}
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.relTypes) {
			return RestPackage.eINSTANCE.getRestApplicationModel_RelTypes();
		}
		if (editorKey == RestViewsRepository.RestApplicationModel.Properties.optypes) {
			return RestPackage.eINSTANCE.getRestApplicationModel_Optypes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RestApplicationModel restApplicationModel = (RestApplicationModel)semanticObject;
		if (RestViewsRepository.RestApplicationModel.Properties.name == event.getAffectedEditor()) {
			restApplicationModel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RestViewsRepository.RestApplicationModel.Properties.methodTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, methodTypesSettings, editingContext.getAdapterFactory());
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
				methodTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				methodTypesSettings.move(event.getNewIndex(), (MethodType) event.getNewValue());
			}
		}
		if (RestViewsRepository.RestApplicationModel.Properties.dataTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, dataTypesSettings, editingContext.getAdapterFactory());
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
				dataTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				dataTypesSettings.move(event.getNewIndex(), (DataType) event.getNewValue());
			}
		}
		if (RestViewsRepository.RestApplicationModel.Properties.mediaTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, mediaTypesSettings, editingContext.getAdapterFactory());
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
				mediaTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mediaTypesSettings.move(event.getNewIndex(), (MediaType) event.getNewValue());
			}
		}
		if (RestViewsRepository.RestApplicationModel.Properties.resourceTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourceTypesSettings, editingContext.getAdapterFactory());
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
				resourceTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourceTypesSettings.move(event.getNewIndex(), (ResourceType) event.getNewValue());
			}
		}
		if (RestViewsRepository.RestApplicationModel.Properties.relTypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, relTypesSettings, editingContext.getAdapterFactory());
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
				relTypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				relTypesSettings.move(event.getNewIndex(), (RelationType) event.getNewValue());
			}
		}
		if (RestViewsRepository.RestApplicationModel.Properties.optypes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, optypesSettings, editingContext.getAdapterFactory());
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
				optypesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				optypesSettings.move(event.getNewIndex(), (OpType) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RestApplicationModelPropertiesEditionPart basePart = (RestApplicationModelPropertiesEditionPart)editingPart;
			if (RestPackage.eINSTANCE.getRestApplicationModel_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RestViewsRepository.RestApplicationModel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestPackage.eINSTANCE.getRestApplicationModel_MethodTypes().equals(msg.getFeature()) && isAccessible(RestViewsRepository.RestApplicationModel.Properties.methodTypes))
				basePart.updateMethodTypes();
			if (RestPackage.eINSTANCE.getRestApplicationModel_DataTypes().equals(msg.getFeature()) && isAccessible(RestViewsRepository.RestApplicationModel.Properties.dataTypes))
				basePart.updateDataTypes();
			if (RestPackage.eINSTANCE.getRestApplicationModel_MediaTypes().equals(msg.getFeature()) && isAccessible(RestViewsRepository.RestApplicationModel.Properties.mediaTypes))
				basePart.updateMediaTypes();
			if (RestPackage.eINSTANCE.getRestApplicationModel_ResourceTypes().equals(msg.getFeature()) && isAccessible(RestViewsRepository.RestApplicationModel.Properties.resourceTypes))
				basePart.updateResourceTypes();
			if (RestPackage.eINSTANCE.getRestApplicationModel_RelTypes().equals(msg.getFeature()) && isAccessible(RestViewsRepository.RestApplicationModel.Properties.relTypes))
				basePart.updateRelTypes();
			if (RestPackage.eINSTANCE.getRestApplicationModel_Optypes().equals(msg.getFeature()) && isAccessible(RestViewsRepository.RestApplicationModel.Properties.optypes))
				basePart.updateOptypes();
			
		}
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
				if (RestViewsRepository.RestApplicationModel.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestPackage.eINSTANCE.getRestApplicationModel_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestPackage.eINSTANCE.getRestApplicationModel_Name().getEAttributeType(), newValue);
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
