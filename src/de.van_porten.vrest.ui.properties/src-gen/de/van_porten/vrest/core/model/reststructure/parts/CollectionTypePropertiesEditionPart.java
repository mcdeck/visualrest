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
public interface CollectionTypePropertiesEditionPart {

	/**
	 * @return the elementType
	 * 
	 */
	public EObject getElementType();

	/**
	 * Init the elementType
	 * @param settings the combo setting
	 */
	public void initElementType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new elementType
	 * @param newValue the new elementType to set
	 * 
	 */
	public void setElementType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setElementTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the elementType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToElementType(ViewerFilter filter);

	/**
	 * Adds the given filter to the elementType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToElementType(ViewerFilter filter);





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
