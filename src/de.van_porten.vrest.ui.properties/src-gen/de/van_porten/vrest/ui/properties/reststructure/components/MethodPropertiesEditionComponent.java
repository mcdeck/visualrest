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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.Parameter;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.MethodPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class MethodPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for consumed ReferencesTable
	 */
	private	ReferencesTableSettings consumedSettings;
	
	/**
	 * Settings for produced ReferencesTable
	 */
	private	ReferencesTableSettings producedSettings;
	
	/**
	 * Settings for methodtype EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings methodtypeSettings;
	
	/**
	 * Settings for parameters ReferencesTable
	 */
	protected ReferencesTableSettings parametersSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MethodPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject method, String editing_mode) {
		super(editingContext, method, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.Method.class;
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
			final Method method = (Method)elt;
			final MethodPropertiesEditionPart basePart = (MethodPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.Method.Properties.consumed)) {
				consumedSettings = new ReferencesTableSettings(method, RestStructurePackage.eINSTANCE.getMethod_Consumed());
				basePart.initConsumed(consumedSettings);
			}
			if (isAccessible(ReststructureViewsRepository.Method.Properties.produced)) {
				producedSettings = new ReferencesTableSettings(method, RestStructurePackage.eINSTANCE.getMethod_Produced());
				basePart.initProduced(producedSettings);
			}
			if (isAccessible(ReststructureViewsRepository.Method.Properties.methodtype)) {
				// init part
				methodtypeSettings = new EObjectFlatComboSettings(method, RestStructurePackage.eINSTANCE.getMethod_Methodtype());
				basePart.initMethodtype(methodtypeSettings);
				// set the button mode
				basePart.setMethodtypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ReststructureViewsRepository.Method.Properties.parameters)) {
				parametersSettings = new ReferencesTableSettings(method, RestStructurePackage.eINSTANCE.getMethod_Parameters());
				basePart.initParameters(parametersSettings);
			}
			if (method.getName() != null && isAccessible(ReststructureViewsRepository.Method.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), method.getName()));
			
			// init filters
			basePart.addFilterToConsumed(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInConsumedTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToConsumed(new EObjectFilter(RestStructurePackage.eINSTANCE.getMediaType()));
			// Start of user code for additional businessfilters for consumed
			// End of user code
			
			basePart.addFilterToProduced(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProducedTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProduced(new EObjectFilter(RestStructurePackage.eINSTANCE.getMediaType()));
			// Start of user code for additional businessfilters for produced
			// End of user code
			
			basePart.addFilterToMethodtype(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof MethodType);
				}
			
			});
			// Start of user code for additional businessfilters for methodtype
			// End of user code
			
			basePart.addFilterToParameters(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Parameter); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for parameters
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
		if (editorKey == ReststructureViewsRepository.Method.Properties.consumed) {
			return RestStructurePackage.eINSTANCE.getMethod_Consumed();
		}
		if (editorKey == ReststructureViewsRepository.Method.Properties.produced) {
			return RestStructurePackage.eINSTANCE.getMethod_Produced();
		}
		if (editorKey == ReststructureViewsRepository.Method.Properties.methodtype) {
			return RestStructurePackage.eINSTANCE.getMethod_Methodtype();
		}
		if (editorKey == ReststructureViewsRepository.Method.Properties.parameters) {
			return RestStructurePackage.eINSTANCE.getMethod_Parameters();
		}
		if (editorKey == ReststructureViewsRepository.Method.Properties.name) {
			return RestStructurePackage.eINSTANCE.getMethod_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Method method = (Method)semanticObject;
		if (ReststructureViewsRepository.Method.Properties.consumed == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MediaType) {
					consumedSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				consumedSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				consumedSettings.move(event.getNewIndex(), (MediaType) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.Method.Properties.produced == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MediaType) {
					producedSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				producedSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				producedSettings.move(event.getNewIndex(), (MediaType) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.Method.Properties.methodtype == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				methodtypeSettings.setToReference((MethodType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MethodType eObject = RestStructureFactory.eINSTANCE.createMethodType();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				methodtypeSettings.setToReference(eObject);
			}
		}
		if (ReststructureViewsRepository.Method.Properties.parameters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, parametersSettings, editingContext.getAdapterFactory());
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
				parametersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				parametersSettings.move(event.getNewIndex(), (Parameter) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.Method.Properties.name == event.getAffectedEditor()) {
			method.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			MethodPropertiesEditionPart basePart = (MethodPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getMethod_Consumed().equals(msg.getFeature())  && isAccessible(ReststructureViewsRepository.Method.Properties.consumed))
				basePart.updateConsumed();
			if (RestStructurePackage.eINSTANCE.getMethod_Produced().equals(msg.getFeature())  && isAccessible(ReststructureViewsRepository.Method.Properties.produced))
				basePart.updateProduced();
			if (RestStructurePackage.eINSTANCE.getMethod_Methodtype().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.Method.Properties.methodtype))
				basePart.setMethodtype((EObject)msg.getNewValue());
			if (RestStructurePackage.eINSTANCE.getMethod_Parameters().equals(msg.getFeature()) && isAccessible(ReststructureViewsRepository.Method.Properties.parameters))
				basePart.updateParameters();
			if (RestStructurePackage.eINSTANCE.getMethod_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ReststructureViewsRepository.Method.Properties.name)) {
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ReststructureViewsRepository.Method.Properties.produced || key == ReststructureViewsRepository.Method.Properties.methodtype;
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
				if (ReststructureViewsRepository.Method.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestStructurePackage.eINSTANCE.getMethod_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestStructurePackage.eINSTANCE.getMethod_Name().getEAttributeType(), newValue);
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
