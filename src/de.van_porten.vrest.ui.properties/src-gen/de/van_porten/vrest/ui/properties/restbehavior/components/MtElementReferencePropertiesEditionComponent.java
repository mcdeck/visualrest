/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.ui.properties.restbehavior.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.restbehavior.MtElementReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.parts.MtElementReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MtElementReferencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for referencedMTElement EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings referencedMTElementSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MtElementReferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject mtElementReference, String editing_mode) {
		super(editingContext, mtElementReference, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RestbehaviorViewsRepository.class;
		partKey = RestbehaviorViewsRepository.MtElementReference.class;
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
			final MtElementReference mtElementReference = (MtElementReference)elt;
			final MtElementReferencePropertiesEditionPart basePart = (MtElementReferencePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement)) {
				// init part
				referencedMTElementSettings = new EObjectFlatComboSettings(mtElementReference, RestBehaviorPackage.eINSTANCE.getMtElementReference_ReferencedMTElement());
				basePart.initReferencedMTElement(referencedMTElementSettings);
				// set the button mode
				basePart.setReferencedMTElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToReferencedMTElement(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof MediaTypeElement);
				}
			
			});
			// Start of user code for additional businessfilters for referencedMTElement
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
		if (editorKey == RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement) {
			return RestBehaviorPackage.eINSTANCE.getMtElementReference_ReferencedMTElement();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MtElementReference mtElementReference = (MtElementReference)semanticObject;
		if (RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				referencedMTElementSettings.setToReference((MediaTypeElement)event.getNewValue());
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
				referencedMTElementSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MtElementReferencePropertiesEditionPart basePart = (MtElementReferencePropertiesEditionPart)editingPart;
			if (RestBehaviorPackage.eINSTANCE.getMtElementReference_ReferencedMTElement().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement))
				basePart.setReferencedMTElement((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RestbehaviorViewsRepository.MtElementReference.Properties.referencedMTElement;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
