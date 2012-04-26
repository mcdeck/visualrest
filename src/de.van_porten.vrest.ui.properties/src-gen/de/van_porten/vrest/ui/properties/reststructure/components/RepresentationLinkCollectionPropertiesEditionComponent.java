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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.reststructure.MediaTypeLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RepresentationLinkCollection;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.RepresentationLinkCollectionPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class RepresentationLinkCollectionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for correspondingLinkCollection EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings correspondingLinkCollectionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RepresentationLinkCollectionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject representationLinkCollection, String editing_mode) {
		super(editingContext, representationLinkCollection, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.RepresentationLinkCollection.class;
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
			final RepresentationLinkCollection representationLinkCollection = (RepresentationLinkCollection)elt;
			final RepresentationLinkCollectionPropertiesEditionPart basePart = (RepresentationLinkCollectionPropertiesEditionPart)editingPart;
			// init values
			if (representationLinkCollection.getName() != null && isAccessible(ReststructureViewsRepository.RepresentationLinkCollection.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), representationLinkCollection.getName()));
			
			if (isAccessible(ReststructureViewsRepository.RepresentationLinkCollection.Properties.correspondingLinkCollection)) {
				// init part
				correspondingLinkCollectionSettings = new EObjectFlatComboSettings(representationLinkCollection, RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_CorrespondingLinkCollection());
				basePart.initCorrespondingLinkCollection(correspondingLinkCollectionSettings);
				// set the button mode
				basePart.setCorrespondingLinkCollectionButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToCorrespondingLinkCollection(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MediaTypeLinkCollection); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for correspondingLinkCollection
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
		if (editorKey == ReststructureViewsRepository.RepresentationLinkCollection.Properties.name) {
			return RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_Name();
		}
		if (editorKey == ReststructureViewsRepository.RepresentationLinkCollection.Properties.correspondingLinkCollection) {
			return RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_CorrespondingLinkCollection();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RepresentationLinkCollection representationLinkCollection = (RepresentationLinkCollection)semanticObject;
		if (ReststructureViewsRepository.RepresentationLinkCollection.Properties.name == event.getAffectedEditor()) {
			representationLinkCollection.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ReststructureViewsRepository.RepresentationLinkCollection.Properties.correspondingLinkCollection == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				correspondingLinkCollectionSettings.setToReference((MediaTypeLinkCollection)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MediaTypeLinkCollection eObject = RestStructureFactory.eINSTANCE.createMediaTypeLinkCollection();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				correspondingLinkCollectionSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RepresentationLinkCollectionPropertiesEditionPart basePart = (RepresentationLinkCollectionPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationLinkCollection.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_CorrespondingLinkCollection().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.RepresentationLinkCollection.Properties.correspondingLinkCollection))
				basePart.setCorrespondingLinkCollection((EObject)msg.getNewValue());
			
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
				if (ReststructureViewsRepository.RepresentationLinkCollection.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getRepresentationLinkCollection_Name().getEAttributeType(), newValue);
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
