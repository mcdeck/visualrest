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
public interface RepresentationLinkCollectionPropertiesEditionPart {

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
	 * @return the correspondingLinkCollection
	 * 
	 */
	public EObject getCorrespondingLinkCollection();

	/**
	 * Init the correspondingLinkCollection
	 * @param settings the combo setting
	 */
	public void initCorrespondingLinkCollection(EObjectFlatComboSettings settings);

	/**
	 * Defines a new correspondingLinkCollection
	 * @param newValue the new correspondingLinkCollection to set
	 * 
	 */
	public void setCorrespondingLinkCollection(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCorrespondingLinkCollectionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the correspondingLinkCollection edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCorrespondingLinkCollection(ViewerFilter filter);

	/**
	 * Adds the given filter to the correspondingLinkCollection edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCorrespondingLinkCollection(ViewerFilter filter);





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
