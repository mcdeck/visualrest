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

import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.MediaTypeElementPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MediaTypeElementPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for mtelemType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings mtelemTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MediaTypeElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject mediaTypeElement, String editing_mode) {
		super(editingContext, mediaTypeElement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.MediaTypeElement.class;
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
			final MediaTypeElement mediaTypeElement = (MediaTypeElement)elt;
			final MediaTypeElementPropertiesEditionPart basePart = (MediaTypeElementPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.MediaTypeElement.Properties.mtelemType)) {
				// init part
				mtelemTypeSettings = new EObjectFlatComboSettings(mediaTypeElement, RestStructurePackage.eINSTANCE.getMediaTypeElement_MtelemType());
				basePart.initMtelemType(mtelemTypeSettings);
				// set the button mode
				basePart.setMtelemTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (mediaTypeElement.getName() != null && isAccessible(ReststructureViewsRepository.MediaTypeElement.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), mediaTypeElement.getName()));
			
			// init filters
			basePart.addFilterToMtelemType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof DataType); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for mtelemType
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
		if (editorKey == ReststructureViewsRepository.MediaTypeElement.Properties.mtelemType) {
			return RestStructurePackage.eINSTANCE.getMediaTypeElement_MtelemType();
		}
		if (editorKey == ReststructureViewsRepository.MediaTypeElement.Properties.name) {
			return RestStructurePackage.eINSTANCE.getMediaTypeElement_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MediaTypeElement mediaTypeElement = (MediaTypeElement)semanticObject;
		if (ReststructureViewsRepository.MediaTypeElement.Properties.mtelemType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mtelemTypeSettings.setToReference((DataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, mtelemTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ReststructureViewsRepository.MediaTypeElement.Properties.name == event.getAffectedEditor()) {
			mediaTypeElement.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MediaTypeElementPropertiesEditionPart basePart = (MediaTypeElementPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getMediaTypeElement_MtelemType().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.MediaTypeElement.Properties.mtelemType))
				basePart.setMtelemType((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getMediaTypeElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.MediaTypeElement.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			
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
				if (ReststructureViewsRepository.MediaTypeElement.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getMediaTypeElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getMediaTypeElement_Name().getEAttributeType(), newValue);
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
