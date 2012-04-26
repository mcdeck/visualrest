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
public interface InternalLinkReferencePropertiesEditionPart {

	/**
	 * @return the referencedLink
	 * 
	 */
	public EObject getReferencedLink();

	/**
	 * Init the referencedLink
	 * @param settings the combo setting
	 */
	public void initReferencedLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedLink
	 * @param newValue the new referencedLink to set
	 * 
	 */
	public void setReferencedLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedLink(ViewerFilter filter);





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
