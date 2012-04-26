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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.MediaTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MediaTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for containedMTElements ReferencesTable
	 */
	protected ReferencesTableSettings containedMTElementsSettings;
	
	/**
	 * Settings for containedMTLinks ReferencesTable
	 */
	protected ReferencesTableSettings containedMTLinksSettings;
	
	/**
	 * Settings for containedMTLinkCollections ReferencesTable
	 */
	protected ReferencesTableSettings containedMTLinkCollectionsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MediaTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject mediaType, String editing_mode) {
		super(editingContext, mediaType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.MediaType.class;
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
			final MediaType mediaType = (MediaType)elt;
			final MediaTypePropertiesEditionPart basePart = (MediaTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.MediaType.Properties.containedMTElements)) {
				containedMTElementsSettings = new ReferencesTableSettings(mediaType, RestStructurePackage.eINSTANCE.getMediaType_ContainedMTElements());
				basePart.initContainedMTElements(containedMTElementsSettings);
			}
			if (mediaType.getName() != null && isAccessible(ReststructureViewsRepository.MediaType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), mediaType.getName()));
			
			if (isAccessible(ReststructureViewsRepository.MediaType.Properties.containedMTLinks)) {
				containedMTLinksSettings = new ReferencesTableSettings(mediaType, RestStructurePackage.eINSTANCE.getMediaType_ContainedMTLinks());
				basePart.initContainedMTLinks(containedMTLinksSettings);
			}
			if (isAccessible(ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections)) {
				containedMTLinkCollectionsSettings = new ReferencesTableSettings(mediaType, RestStructurePackage.eINSTANCE.getMediaType_ContainedMTLinkCollections());
				basePart.initContainedMTLinkCollections(containedMTLinkCollectionsSettings);
			}
			// init filters
			basePart.addFilterToContainedMTElements(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MediaTypeElement); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for containedMTElements
			// End of user code
			
			
			basePart.addFilterToContainedMTLinks(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MediaTypeLink); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for containedMTLinks
			// End of user code
			
			basePart.addFilterToContainedMTLinkCollections(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MediaTypeLinkCollection); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for containedMTLinkCollections
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
		if (editorKey == ReststructureViewsRepository.MediaType.Properties.containedMTElements) {
			return RestStructurePackage.eINSTANCE.getMediaType_ContainedMTElements();
		}
		if (editorKey == ReststructureViewsRepository.MediaType.Properties.name) {
			return RestStructurePackage.eINSTANCE.getMediaType_Name();
		}
		if (editorKey == ReststructureViewsRepository.MediaType.Properties.containedMTLinks) {
			return RestStructurePackage.eINSTANCE.getMediaType_ContainedMTLinks();
		}
		if (editorKey == ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections) {
			return RestStructurePackage.eINSTANCE.getMediaType_ContainedMTLinkCollections();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MediaType mediaType = (MediaType)semanticObject;
		if (ReststructureViewsRepository.MediaType.Properties.containedMTElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, containedMTElementsSettings, editingContext.getAdapterFactory());
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
				containedMTElementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedMTElementsSettings.move(event.getNewIndex(), (MediaTypeElement) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.MediaType.Properties.name == event.getAffectedEditor()) {
			mediaType.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.MediaType.Properties.containedMTLinks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, containedMTLinksSettings, editingContext.getAdapterFactory());
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
				containedMTLinksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedMTLinksSettings.move(event.getNewIndex(), (MediaTypeLink) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, containedMTLinkCollectionsSettings, editingContext.getAdapterFactory());
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
				containedMTLinkCollectionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedMTLinkCollectionsSettings.move(event.getNewIndex(), (MediaTypeLinkCollection) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MediaTypePropertiesEditionPart basePart = (MediaTypePropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getMediaType_ContainedMTElements().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.MediaType.Properties.containedMTElements))
				basePart.updateContainedMTElements();
			if (RestStructurePackage.eINSTANCE.getMediaType_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.MediaType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getMediaType_ContainedMTLinks().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.MediaType.Properties.containedMTLinks))
				basePart.updateContainedMTLinks();
			if (RestStructurePackage.eINSTANCE.getMediaType_ContainedMTLinkCollections().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.MediaType.Properties.containedMTLinkCollections))
				basePart.updateContainedMTLinkCollections();
			
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
				if (ReststructureViewsRepository.MediaType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getMediaType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getMediaType_Name().getEAttributeType(), newValue);
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
