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

import de.van_porten.vrest.core.model.restbehavior.InternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.parts.InternalLinkReferencePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.reststructure.InternalLink;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class InternalLinkReferencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for referencedLink EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings referencedLinkSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InternalLinkReferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject internalLinkReference, String editing_mode) {
		super(editingContext, internalLinkReference, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RestbehaviorViewsRepository.class;
		partKey = RestbehaviorViewsRepository.InternalLinkReference.class;
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
			final InternalLinkReference internalLinkReference = (InternalLinkReference)elt;
			final InternalLinkReferencePropertiesEditionPart basePart = (InternalLinkReferencePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RestbehaviorViewsRepository.InternalLinkReference.Properties.referencedLink)) {
				// init part
				referencedLinkSettings = new EObjectFlatComboSettings(internalLinkReference, RestBehaviorPackage.eINSTANCE.getInternalLinkReference_ReferencedLink());
				basePart.initReferencedLink(referencedLinkSettings);
				// set the button mode
				basePart.setReferencedLinkButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToReferencedLink(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof InternalLink);
				}
			
			});
			// Start of user code for additional businessfilters for referencedLink
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
		if (editorKey == RestbehaviorViewsRepository.InternalLinkReference.Properties.referencedLink) {
			return RestBehaviorPackage.eINSTANCE.getInternalLinkReference_ReferencedLink();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InternalLinkReference internalLinkReference = (InternalLinkReference)semanticObject;
		if (RestbehaviorViewsRepository.InternalLinkReference.Properties.referencedLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				referencedLinkSettings.setToReference((InternalLink)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				InternalLink eObject = RestStructureFactory.eINSTANCE.createInternalLink();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				referencedLinkSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			InternalLinkReferencePropertiesEditionPart basePart = (InternalLinkReferencePropertiesEditionPart)editingPart;
			if (RestBehaviorPackage.eINSTANCE.getInternalLinkReference_ReferencedLink().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.InternalLinkReference.Properties.referencedLink))
				basePart.setReferencedLink((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RestbehaviorViewsRepository.InternalLinkReference.Properties.referencedLink;
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
