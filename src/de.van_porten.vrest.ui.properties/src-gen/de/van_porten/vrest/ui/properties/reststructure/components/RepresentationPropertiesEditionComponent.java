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

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Representation;
import de.van_porten.vrest.core.model.reststructure.RepresentationElement;
import de.van_porten.vrest.core.model.reststructure.RepresentationLink;
import de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.RepresentationPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for containedRepElements ReferencesTable
	 */
	protected ReferencesTableSettings containedRepElementsSettings;
	
	/**
	 * Settings for mediatype EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings mediatypeSettings;
	
	/**
	 * Settings for containedRepLinks ReferencesTable
	 */
	protected ReferencesTableSettings containedRepLinksSettings;
	
	/**
	 * Settings for containedRepLinkCollections ReferencesTable
	 */
	protected ReferencesTableSettings containedRepLinkCollectionsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RepresentationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject representation, String editing_mode) {
		super(editingContext, representation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.Representation.class;
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
			final Representation representation = (Representation)elt;
			final RepresentationPropertiesEditionPart basePart = (RepresentationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.Representation.Properties.containedRepElements)) {
				containedRepElementsSettings = new ReferencesTableSettings(representation, RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepElements());
				basePart.initContainedRepElements(containedRepElementsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.Representation.Properties.mediatype)) {
				// init part
				mediatypeSettings = new EObjectFlatComboSettings(representation, RestStructurePackage.eINSTANCE.getRepresentation_Mediatype());
				basePart.initMediatype(mediatypeSettings);
				// set the button mode
				basePart.setMediatypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (representation.getName() != null && isAccessible(ReststructureViewsRepository.Representation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), representation.getName()));
			
			if (isAccessible(ReststructureViewsRepository.Representation.Properties.containedRepLinks)) {
				containedRepLinksSettings = new ReferencesTableSettings(representation, RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepLinks());
				basePart.initContainedRepLinks(containedRepLinksSettings);
			}
			if (isAccessible(ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections)) {
				containedRepLinkCollectionsSettings = new ReferencesTableSettings(representation, RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepLinkCollections());
				basePart.initContainedRepLinkCollections(containedRepLinkCollectionsSettings);
			}
			// init filters
			basePart.addFilterToContainedRepElements(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RepresentationElement); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for containedRepElements
			// End of user code
			
			basePart.addFilterToMediatype(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MediaType); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for mediatype
			// End of user code
			
			
			basePart.addFilterToContainedRepLinks(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RepresentationLink); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for containedRepLinks
			// End of user code
			
			basePart.addFilterToContainedRepLinkCollections(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RepresentationLinkCollection); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for containedRepLinkCollections
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
		if (editorKey == ReststructureViewsRepository.Representation.Properties.containedRepElements) {
			return RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepElements();
		}
		if (editorKey == ReststructureViewsRepository.Representation.Properties.mediatype) {
			return RestStructurePackage.eINSTANCE.getRepresentation_Mediatype();
		}
		if (editorKey == ReststructureViewsRepository.Representation.Properties.name) {
			return RestStructurePackage.eINSTANCE.getRepresentation_Name();
		}
		if (editorKey == ReststructureViewsRepository.Representation.Properties.containedRepLinks) {
			return RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepLinks();
		}
		if (editorKey == ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections) {
			return RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepLinkCollections();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Representation representation = (Representation)semanticObject;
		if (ReststructureViewsRepository.Representation.Properties.containedRepElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, containedRepElementsSettings, editingContext.getAdapterFactory());
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
				containedRepElementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedRepElementsSettings.move(event.getNewIndex(), (RepresentationElement) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.Representation.Properties.mediatype == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mediatypeSettings.setToReference((MediaType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MediaType eObject = RestStructureFactory.eINSTANCE.createMediaType();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				mediatypeSettings.setToReference(eObject);
			}
		}
		if (ReststructureViewsRepository.Representation.Properties.name == event.getAffectedEditor()) {
			representation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.Representation.Properties.containedRepLinks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, containedRepLinksSettings, editingContext.getAdapterFactory());
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
				containedRepLinksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedRepLinksSettings.move(event.getNewIndex(), (RepresentationLink) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, containedRepLinkCollectionsSettings, editingContext.getAdapterFactory());
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
				containedRepLinkCollectionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedRepLinkCollectionsSettings.move(event.getNewIndex(), (RepresentationLinkCollection) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RepresentationPropertiesEditionPart basePart = (RepresentationPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepElements().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.Representation.Properties.containedRepElements))
				basePart.updateContainedRepElements();
			if (RestStructurePackage.eINSTANCE.getRepresentation_Mediatype().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.Representation.Properties.mediatype))
				basePart.setMediatype((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getRepresentation_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.Representation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepLinks().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.Representation.Properties.containedRepLinks))
				basePart.updateContainedRepLinks();
			if (RestStructurePackage.eINSTANCE.getRepresentation_ContainedRepLinkCollections().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.Representation.Properties.containedRepLinkCollections))
				basePart.updateContainedRepLinkCollections();
			
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
				if (ReststructureViewsRepository.Representation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getRepresentation_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getRepresentation_Name().getEAttributeType(), newValue);
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
