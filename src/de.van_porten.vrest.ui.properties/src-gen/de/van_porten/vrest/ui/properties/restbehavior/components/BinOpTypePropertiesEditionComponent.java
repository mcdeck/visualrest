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

import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.parts.BinOpTypePropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;
import de.van_porten.vrest.core.model.reststructure.DataType;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class BinOpTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for resultType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings resultTypeSettings;
	
	/**
	 * Settings for firstOpType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings firstOpTypeSettings;
	
	/**
	 * Settings for secondOpType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings secondOpTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BinOpTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject binOpType, String editing_mode) {
		super(editingContext, binOpType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RestbehaviorViewsRepository.class;
		partKey = RestbehaviorViewsRepository.BinOpType.class;
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
			final BinOpType binOpType = (BinOpType)elt;
			final BinOpTypePropertiesEditionPart basePart = (BinOpTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.resultType)) {
				// init part
				resultTypeSettings = new EObjectFlatComboSettings(binOpType, RestBehaviorPackage.eINSTANCE.getOpType_ResultType());
				basePart.initResultType(resultTypeSettings);
				// set the button mode
				basePart.setResultTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (binOpType.getName() != null && isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), binOpType.getName()));
			
			if (isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType)) {
				// init part
				firstOpTypeSettings = new EObjectFlatComboSettings(binOpType, RestBehaviorPackage.eINSTANCE.getBinOpType_FirstOpType());
				basePart.initFirstOpType(firstOpTypeSettings);
				// set the button mode
				basePart.setFirstOpTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType)) {
				// init part
				secondOpTypeSettings = new EObjectFlatComboSettings(binOpType, RestBehaviorPackage.eINSTANCE.getBinOpType_SecondOpType());
				basePart.initSecondOpType(secondOpTypeSettings);
				// set the button mode
				basePart.setSecondOpTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToResultType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof DataType);
				}
			
			});
			// Start of user code for additional businessfilters for resultType
			// End of user code
			
			
			basePart.addFilterToFirstOpType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof DataType);
				}
			
			});
			// Start of user code for additional businessfilters for firstOpType
			// End of user code
			
			basePart.addFilterToSecondOpType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof DataType);
				}
			
			});
			// Start of user code for additional businessfilters for secondOpType
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
		if (editorKey == RestbehaviorViewsRepository.BinOpType.Properties.resultType) {
			return RestBehaviorPackage.eINSTANCE.getOpType_ResultType();
		}
		if (editorKey == RestbehaviorViewsRepository.BinOpType.Properties.name) {
			return RestBehaviorPackage.eINSTANCE.getOpType_Name();
		}
		if (editorKey == RestbehaviorViewsRepository.BinOpType.Properties.firstOpType) {
			return RestBehaviorPackage.eINSTANCE.getBinOpType_FirstOpType();
		}
		if (editorKey == RestbehaviorViewsRepository.BinOpType.Properties.secondOpType) {
			return RestBehaviorPackage.eINSTANCE.getBinOpType_SecondOpType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BinOpType binOpType = (BinOpType)semanticObject;
		if (RestbehaviorViewsRepository.BinOpType.Properties.resultType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resultTypeSettings.setToReference((DataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resultTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (RestbehaviorViewsRepository.BinOpType.Properties.name == event.getAffectedEditor()) {
			binOpType.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RestbehaviorViewsRepository.BinOpType.Properties.firstOpType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				firstOpTypeSettings.setToReference((DataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, firstOpTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (RestbehaviorViewsRepository.BinOpType.Properties.secondOpType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				secondOpTypeSettings.setToReference((DataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, secondOpTypeSettings, editingContext.getAdapterFactory());
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
			BinOpTypePropertiesEditionPart basePart = (BinOpTypePropertiesEditionPart)editingPart;
			if (RestBehaviorPackage.eINSTANCE.getOpType_ResultType().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.resultType))
				basePart.setResultType((EObject)msg.getNewValue());
			if (RestBehaviorPackage.eINSTANCE.getOpType_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RestBehaviorPackage.eINSTANCE.getBinOpType_FirstOpType().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.firstOpType))
				basePart.setFirstOpType((EObject)msg.getNewValue());
			if (RestBehaviorPackage.eINSTANCE.getBinOpType_SecondOpType().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.BinOpType.Properties.secondOpType))
				basePart.setSecondOpType((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RestbehaviorViewsRepository.BinOpType.Properties.resultType || key == RestbehaviorViewsRepository.BinOpType.Properties.name || key == RestbehaviorViewsRepository.BinOpType.Properties.firstOpType || key == RestbehaviorViewsRepository.BinOpType.Properties.secondOpType;
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
				if (RestbehaviorViewsRepository.BinOpType.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RestBehaviorPackage.eINSTANCE.getOpType_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RestBehaviorPackage.eINSTANCE.getOpType_Name().getEAttributeType(), newValue);
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
