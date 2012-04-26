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
public interface ExternalLinkReferencePropertiesEditionPart {

	/**
	 * @return the referencedExternalLink
	 * 
	 */
	public EObject getReferencedExternalLink();

	/**
	 * Init the referencedExternalLink
	 * @param settings the combo setting
	 */
	public void initReferencedExternalLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedExternalLink
	 * @param newValue the new referencedExternalLink to set
	 * 
	 */
	public void setReferencedExternalLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedExternalLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedExternalLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedExternalLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedExternalLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedExternalLink(ViewerFilter filter);





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
