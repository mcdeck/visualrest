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
public interface MTLinkReferencePropertiesEditionPart {

	/**
	 * @return the referencedMTLink
	 * 
	 */
	public EObject getReferencedMTLink();

	/**
	 * Init the referencedMTLink
	 * @param settings the combo setting
	 */
	public void initReferencedMTLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedMTLink
	 * @param newValue the new referencedMTLink to set
	 * 
	 */
	public void setReferencedMTLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedMTLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedMTLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedMTLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedMTLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedMTLink(ViewerFilter filter);





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
