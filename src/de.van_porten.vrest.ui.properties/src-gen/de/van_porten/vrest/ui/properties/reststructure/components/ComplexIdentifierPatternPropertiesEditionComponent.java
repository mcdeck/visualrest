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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.Parameter;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;
import de.van_porten.vrest.core.model.reststructure.parts.ComplexIdentifierPatternPropertiesEditionPart;
import de.van_porten.vrest.core.model.reststructure.parts.ReststructureViewsRepository;


// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public class ComplexIdentifierPatternPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for idParams ReferencesTable
	 */
	private	ReferencesTableSettings idParamsSettings;
	
	/**
	 * Settings for idAttrs ReferencesTable
	 */
	private	ReferencesTableSettings idAttrsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ComplexIdentifierPatternPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject complexIdentifierPattern, String editing_mode) {
		super(editingContext, complexIdentifierPattern, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ReststructureViewsRepository.class;
		partKey = ReststructureViewsRepository.ComplexIdentifierPattern.class;
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
			final ComplexIdentifierPattern complexIdentifierPattern = (ComplexIdentifierPattern)elt;
			final ComplexIdentifierPatternPropertiesEditionPart basePart = (ComplexIdentifierPatternPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams)) {
				idParamsSettings = new ReferencesTableSettings(complexIdentifierPattern, RestStructurePackage.eINSTANCE.getComplexIdentifierPattern_IdParams());
				basePart.initIdParams(idParamsSettings);
			}
			if (isAccessible(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs)) {
				idAttrsSettings = new ReferencesTableSettings(complexIdentifierPattern, RestStructurePackage.eINSTANCE.getComplexIdentifierPattern_IdAttrs());
				basePart.initIdAttrs(idAttrsSettings);
			}
			// init filters
			basePart.addFilterToIdParams(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIdParamsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIdParams(new EObjectFilter(RestStructurePackage.eINSTANCE.getParameter()));
			// Start of user code for additional businessfilters for idParams
			// End of user code
			
			basePart.addFilterToIdAttrs(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIdAttrsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIdAttrs(new EObjectFilter(RestStructurePackage.eINSTANCE.getAttribute()));
			// Start of user code for additional businessfilters for idAttrs
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
		if (editorKey == ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams) {
			return RestStructurePackage.eINSTANCE.getComplexIdentifierPattern_IdParams();
		}
		if (editorKey == ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs) {
			return RestStructurePackage.eINSTANCE.getComplexIdentifierPattern_IdAttrs();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ComplexIdentifierPattern complexIdentifierPattern = (ComplexIdentifierPattern)semanticObject;
		if (ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Parameter) {
					idParamsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				idParamsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				idParamsSettings.move(event.getNewIndex(), (Parameter) event.getNewValue());
			}
		}
		if (ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Attribute) {
					idAttrsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				idAttrsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				idAttrsSettings.move(event.getNewIndex(), (Attribute) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ComplexIdentifierPatternPropertiesEditionPart basePart = (ComplexIdentifierPatternPropertiesEditionPart)editingPart;
			if (RestStructurePackage.eINSTANCE.getComplexIdentifierPattern_IdParams().equals(msg.getFeature())  && isAccessible(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idParams))
				basePart.updateIdParams();
			if (RestStructurePackage.eINSTANCE.getComplexIdentifierPattern_IdAttrs().equals(msg.getFeature())  && isAccessible(ReststructureViewsRepository.ComplexIdentifierPattern.Properties.idAttrs))
				basePart.updateIdAttrs();
			
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
