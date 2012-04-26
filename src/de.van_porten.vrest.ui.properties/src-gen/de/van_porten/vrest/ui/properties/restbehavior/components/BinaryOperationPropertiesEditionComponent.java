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

import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.BinaryOperation;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.parts.BinaryOperationPropertiesEditionPart;
import de.van_porten.vrest.core.model.restbehavior.parts.RestbehaviorViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class BinaryOperationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for optype EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings optypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BinaryOperationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject binaryOperation, String editing_mode) {
		super(editingContext, binaryOperation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RestbehaviorViewsRepository.class;
		partKey = RestbehaviorViewsRepository.BinaryOperation.class;
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
			final BinaryOperation binaryOperation = (BinaryOperation)elt;
			final BinaryOperationPropertiesEditionPart basePart = (BinaryOperationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RestbehaviorViewsRepository.BinaryOperation.Properties.optype)) {
				// init part
				optypeSettings = new EObjectFlatComboSettings(binaryOperation, RestBehaviorPackage.eINSTANCE.getBinaryOperation_Optype());
				basePart.initOptype(optypeSettings);
				// set the button mode
				basePart.setOptypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToOptype(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof BinOpType);
				}
			
			});
			// Start of user code for additional businessfilters for optype
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
		if (editorKey == RestbehaviorViewsRepository.BinaryOperation.Properties.optype) {
			return RestBehaviorPackage.eINSTANCE.getBinaryOperation_Optype();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BinaryOperation binaryOperation = (BinaryOperation)semanticObject;
		if (RestbehaviorViewsRepository.BinaryOperation.Properties.optype == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				optypeSettings.setToReference((BinOpType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BinOpType eObject = RestBehaviorFactory.eINSTANCE.createBinOpType();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				optypeSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			BinaryOperationPropertiesEditionPart basePart = (BinaryOperationPropertiesEditionPart)editingPart;
			if (RestBehaviorPackage.eINSTANCE.getBinaryOperation_Optype().equals(msg.getFeature()) && basePart != null && isAccessible(RestbehaviorViewsRepository.BinaryOperation.Properties.optype))
				basePart.setOptype((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RestbehaviorViewsRepository.BinaryOperation.Properties.optype;
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
