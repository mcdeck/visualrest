/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public interface AttributeReferencePropertiesEditionPart {

	/**
	 * @return the referencedAttribute
	 * 
	 */
	public EObject getReferencedAttribute();

	/**
	 * Init the referencedAttribute
	 * @param settings the combo setting
	 */
	public void initReferencedAttribute(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedAttribute
	 * @param newValue the new referencedAttribute to set
	 * 
	 */
	public void setReferencedAttribute(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedAttributeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedAttribute edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedAttribute(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedAttribute edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedAttribute(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
