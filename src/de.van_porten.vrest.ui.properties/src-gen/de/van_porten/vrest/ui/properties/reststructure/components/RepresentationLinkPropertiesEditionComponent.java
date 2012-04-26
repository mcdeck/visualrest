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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.reststructure.Link;
import de.van_porten.vrest.core.model.reststructure.MediaTypeLink;
import de.van_porten.vrest.core.model.reststructure.RepresentationLink;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.RepresentationLinkPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationLinkPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for correspondingLink EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings correspondingLinkSettings;
	
	/**
	 * Settings for linkValue EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings linkValueSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RepresentationLinkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject representationLink, String editing_mode) {
		super(editingContext, representationLink, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.RepresentationLink.class;
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
			final RepresentationLink representationLink = (RepresentationLink)elt;
			final RepresentationLinkPropertiesEditionPart basePart = (RepresentationLinkPropertiesEditionPart)editingPart;
			// init values
			if (representationLink.getName() != null && isAccessible(ReststructureViewsRepository.RepresentationLink.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), representationLink.getName()));
			
			if (isAccessible(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink)) {
				// init part
				correspondingLinkSettings = new EObjectFlatComboSettings(representationLink, RestStructurePackage.eINSTANCE.getRepresentationLink_CorrespondingLink());
				basePart.initCorrespondingLink(correspondingLinkSettings);
				// set the button mode
				basePart.setCorrespondingLinkButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ReststructureViewsRepository.RepresentationLink.Properties.linkValue)) {
				// init part
				linkValueSettings = new EObjectFlatComboSettings(representationLink, RestStructurePackage.eINSTANCE.getRepresentationLink_LinkValue());
				basePart.initLinkValue(linkValueSettings);
				// set the button mode
				basePart.setLinkValueButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToCorrespondingLink(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MediaTypeLink); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for correspondingLink
			// End of user code
			
			basePart.addFilterToLinkValue(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Link);
				}
			
			});
			// Start of user code for additional businessfilters for linkValue
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
		if (editorKey == ReststructureViewsRepository.RepresentationLink.Properties.name) {
			return RestStructurePackage.eINSTANCE.getRepresentationLink_Name();
		}
		if (editorKey == ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink) {
			return RestStructurePackage.eINSTANCE.getRepresentationLink_CorrespondingLink();
		}
		if (editorKey == ReststructureViewsRepository.RepresentationLink.Properties.linkValue) {
			return RestStructurePackage.eINSTANCE.getRepresentationLink_LinkValue();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RepresentationLink representationLink = (RepresentationLink)semanticObject;
		if (ReststructureViewsRepository.RepresentationLink.Properties.name == event.getAffectedEditor()) {
			representationLink.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				correspondingLinkSettings.setToReference((MediaTypeLink)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MediaTypeLink eObject = RestStructureFactory.eINSTANCE.createMediaTypeLink();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				correspondingLinkSettings.setToReference(eObject);
			}
		}
		if (ReststructureViewsRepository.RepresentationLink.Properties.linkValue == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				linkValueSettings.setToReference((Link)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, linkValueSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RepresentationLinkPropertiesEditionPart basePart = (RepresentationLinkPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getRepresentationLink_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationLink.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getRepresentationLink_CorrespondingLink().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationLink.Properties.correspondingLink))
				basePart.setCorrespondingLink((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getRepresentationLink_LinkValue().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationLink.Properties.linkValue))
				basePart.setLinkValue((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ReststructureViewsRepository.RepresentationLink.Properties.name || key == ReststructureViewsRepository.RepresentationLink.Properties.linkValue;
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
				if (ReststructureViewsRepository.RepresentationLink.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getRepresentationLink_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getRepresentationLink_Name().getEAttributeType(), newValue);
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
