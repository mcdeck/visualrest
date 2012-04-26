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

import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.RelationType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.InternalLinkPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class InternalLinkPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for relType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings relTypeSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InternalLinkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject internalLink, String editing_mode) {
		super(editingContext, internalLink, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.InternalLink.class;
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
			final InternalLink internalLink = (InternalLink)elt;
			final InternalLinkPropertiesEditionPart basePart = (InternalLinkPropertiesEditionPart)editingPart;
			// init values
			if (internalLink.getName() != null && isAccessible(ReststructureViewsRepository.InternalLink.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), internalLink.getName()));
			
			if (isAccessible(ReststructureViewsRepository.InternalLink.Properties.relType)) {
				// init part
				relTypeSettings = new EObjectFlatComboSettings(internalLink, RestStructurePackage.eINSTANCE.getLink_RelType());
				basePart.initRelType(relTypeSettings);
				// set the button mode
				basePart.setRelTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ReststructureViewsRepository.InternalLink.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(internalLink, RestStructurePackage.eINSTANCE.getInternalLink_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToRelType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof RelationType); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for relType
			// End of user code
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ResourceType);
				}
			
			});
			// Start of user code for additional businessfilters for target
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
		if (editorKey == ReststructureViewsRepository.InternalLink.Properties.name) {
			return RestStructurePackage.eINSTANCE.getResourceElement_Name();
		}
		if (editorKey == ReststructureViewsRepository.InternalLink.Properties.relType) {
			return RestStructurePackage.eINSTANCE.getLink_RelType();
		}
		if (editorKey == ReststructureViewsRepository.InternalLink.Properties.target) {
			return RestStructurePackage.eINSTANCE.getInternalLink_Target();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InternalLink internalLink = (InternalLink)semanticObject;
		if (ReststructureViewsRepository.InternalLink.Properties.name == event.getAffectedEditor()) {
			internalLink.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.InternalLink.Properties.relType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				relTypeSettings.setToReference((RelationType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RelationType eObject = RestStructureFactory.eINSTANCE.createRelationType();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				relTypeSettings.setToReference(eObject);
			}
		}
		if (ReststructureViewsRepository.InternalLink.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((ResourceType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, targetSettings, editingContext.getAdapterFactory());
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
			InternalLinkPropertiesEditionPart basePart = (InternalLinkPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getResourceElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.InternalLink.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getLink_RelType().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.InternalLink.Properties.relType))
				basePart.setRelType((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getInternalLink_Target().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.InternalLink.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ReststructureViewsRepository.InternalLink.Properties.target;
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
				if (ReststructureViewsRepository.InternalLink.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getResourceElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getResourceElement_Name().getEAttributeType(), newValue);
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
