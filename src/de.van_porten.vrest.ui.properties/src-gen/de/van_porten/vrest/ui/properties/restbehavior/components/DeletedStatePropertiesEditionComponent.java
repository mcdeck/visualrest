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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.restbehavior.DeletedState;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.core.model.restbehavior.parts.DeletedStatePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class DeletedStatePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for transitions ReferencesTable
	 */
	protected ReferencesTableSettings transitionsSettings;
	
	/**
	 * Settings for supportedMethods ReferencesTable
	 */
	private	ReferencesTableSettings supportedMethodsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DeletedStatePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deletedState, String editing_mode) {
		super(editingContext, deletedState, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RestbehaviorViewsRepository.class;
		partKey = RestbehaviorViewsRepository.DeletedState.class;
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
			final DeletedState deletedState = (DeletedState)elt;
			final DeletedStatePropertiesEditionPart basePart = (DeletedStatePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RestbehaviorViewsRepository.DeletedState.Properties.transitions)) {
				transitionsSettings = new ReferencesTableSettings(deletedState, RestBehaviorPackage.eINSTANCE.getState_Transitions());
				basePart.initTransitions(transitionsSettings);
			}
			if (deletedState.getName() != null && isAccessible(RestbehaviorViewsRepository.DeletedState.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), deletedState.getName()));
			
			if (isAccessible(RestbehaviorViewsRepository.DeletedState.Properties.supportedMethods)) {
				supportedMethodsSettings = new ReferencesTableSettings(deletedState, RestBehaviorPackage.eINSTANCE.getState_SupportedMethods());
				basePart.initSupportedMethods(supportedMethodsSettings);
			}
			// init filters
			basePart.addFilterToTransitions(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Transition); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for transitions
			// End of user code
			
			
			basePart.addFilterToSupportedMethods(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSupportedMethodsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSupportedMethods(new EObjectFilter(RestStructurePackage.eINSTANCE.getMethod()));
			// Start of user code for additional businessfilters for supportedMethods
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
		if (editorKey == RestbehaviorViewsRepository.DeletedState.Properties.transitions) {
			return RestBehaviorPackage.eINSTANCE.getState_Transitions();
		}
		if (editorKey == RestbehaviorViewsRepository.DeletedState.Properties.name) {
			return RestBehaviorPackage.eINSTANCE.getState_Name();
		}
		if (editorKey == RestbehaviorViewsRepository.DeletedState.Properties.supportedMethods) {
			return RestBehaviorPackage.eINSTANCE.getState_SupportedMethods();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DeletedState deletedState = (DeletedState)semanticObject;
		if (RestbehaviorViewsRepository.DeletedState.Properties.transitions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, transitionsSettings, editingContext.getAdapterFactory());
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
				transitionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				transitionsSettings.move(event.getNewIndex(), (Transition) event.getNewValue());
			}
		}
		if (RestbehaviorViewsRepository.DeletedState.Properties.name == event.getAffectedEditor()) {
			deletedState.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RestbehaviorViewsRepository.DeletedState.Properties.supportedMethods == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Method) {
					supportedMethodsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				supportedMethodsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				supportedMethodsSettings.move(event.getNewIndex(), (Method) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DeletedStatePropertiesEditionPart basePart = (DeletedStatePropertiesEditionPart)editingPart;
			if (RestBehaviorPackage.eINSTANCE.getState_Transitions().equals(msg.getFeature()) && isAccessible(RestbehaviorViewsRepository.DeletedState.Properties.transitions))
				basePart.updateTransitions();
			if (RestBehaviorPackage.eINSTANCE.getState_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.DeletedState.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestBehaviorPackage.eINSTANCE.getState_SupportedMethods().equals(msg.getFeature())  && isAccessible(RestbehaviorViewsRepository.DeletedState.Properties.supportedMethods))
				basePart.updateSupportedMethods();
			
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
				if (RestbehaviorViewsRepository.DeletedState.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestBehaviorPackage.eINSTANCE.getState_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestBehaviorPackage.eINSTANCE.getState_Name().getEAttributeType(), newValue);
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
