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

import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.RepresentationElement;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.RepresentationElementPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationElementPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for correspondingElement EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings correspondingElementSettings;
	
	/**
	 * Settings for repElemType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings repElemTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RepresentationElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject representationElement, String editing_mode) {
		super(editingContext, representationElement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.RepresentationElement.class;
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
			final RepresentationElement representationElement = (RepresentationElement)elt;
			final RepresentationElementPropertiesEditionPart basePart = (RepresentationElementPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement)) {
				// init part
				correspondingElementSettings = new EObjectFlatComboSettings(representationElement, RestStructurePackage.eINSTANCE.getRepresentationElement_CorrespondingElement());
				basePart.initCorrespondingElement(correspondingElementSettings);
				// set the button mode
				basePart.setCorrespondingElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ReststructureViewsRepository.RepresentationElement.Properties.repElemType)) {
				// init part
				repElemTypeSettings = new EObjectFlatComboSettings(representationElement, RestStructurePackage.eINSTANCE.getRepresentationElement_RepElemType());
				basePart.initRepElemType(repElemTypeSettings);
				// set the button mode
				basePart.setRepElemTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (representationElement.getName() != null && isAccessible(ReststructureViewsRepository.RepresentationElement.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), representationElement.getName()));
			
			// init filters
			basePart.addFilterToCorrespondingElement(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MediaTypeElement); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for correspondingElement
			// End of user code
			
			basePart.addFilterToRepElemType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof DataType); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for repElemType
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
		if (editorKey == ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement) {
			return RestStructurePackage.eINSTANCE.getRepresentationElement_CorrespondingElement();
		}
		if (editorKey == ReststructureViewsRepository.RepresentationElement.Properties.repElemType) {
			return RestStructurePackage.eINSTANCE.getRepresentationElement_RepElemType();
		}
		if (editorKey == ReststructureViewsRepository.RepresentationElement.Properties.name) {
			return RestStructurePackage.eINSTANCE.getRepresentationElement_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RepresentationElement representationElement = (RepresentationElement)semanticObject;
		if (ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				correspondingElementSettings.setToReference((MediaTypeElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MediaTypeElement eObject = RestStructureFactory.eINSTANCE.createMediaTypeElement();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				correspondingElementSettings.setToReference(eObject);
			}
		}
		if (ReststructureViewsRepository.RepresentationElement.Properties.repElemType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				repElemTypeSettings.setToReference((DataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, repElemTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ReststructureViewsRepository.RepresentationElement.Properties.name == event.getAffectedEditor()) {
			representationElement.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RepresentationElementPropertiesEditionPart basePart = (RepresentationElementPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getRepresentationElement_CorrespondingElement().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationElement.Properties.correspondingElement))
				basePart.setCorrespondingElement((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getRepresentationElement_RepElemType().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationElement.Properties.repElemType))
				basePart.setRepElemType((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getRepresentationElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationElement.Properties.name)) {
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
				if (ReststructureViewsRepository.RepresentationElement.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getRepresentationElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getRepresentationElement_Name().getEAttributeType(), newValue);
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
