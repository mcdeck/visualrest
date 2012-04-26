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
public interface MtElementReferencePropertiesEditionPart {

	/**
	 * @return the referencedMTElement
	 * 
	 */
	public EObject getReferencedMTElement();

	/**
	 * Init the referencedMTElement
	 * @param settings the combo setting
	 */
	public void initReferencedMTElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedMTElement
	 * @param newValue the new referencedMTElement to set
	 * 
	 */
	public void setReferencedMTElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedMTElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedMTElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedMTElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedMTElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedMTElement(ViewerFilter filter);





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
