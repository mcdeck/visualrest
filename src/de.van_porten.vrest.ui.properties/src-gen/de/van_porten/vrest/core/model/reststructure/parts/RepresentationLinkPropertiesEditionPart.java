/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts;

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
public interface RepresentationLinkPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the correspondingLink
	 * 
	 */
	public EObject getCorrespondingLink();

	/**
	 * Init the correspondingLink
	 * @param settings the combo setting
	 */
	public void initCorrespondingLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new correspondingLink
	 * @param newValue the new correspondingLink to set
	 * 
	 */
	public void setCorrespondingLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCorrespondingLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the correspondingLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCorrespondingLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the correspondingLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCorrespondingLink(ViewerFilter filter);


	/**
	 * @return the linkValue
	 * 
	 */
	public EObject getLinkValue();

	/**
	 * Init the linkValue
	 * @param settings the combo setting
	 */
	public void initLinkValue(EObjectFlatComboSettings settings);

	/**
	 * Defines a new linkValue
	 * @param newValue the new linkValue to set
	 * 
	 */
	public void setLinkValue(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLinkValueButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the linkValue edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLinkValue(ViewerFilter filter);

	/**
	 * Adds the given filter to the linkValue edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLinkValue(ViewerFilter filter);





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
