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
public interface RepresentationElementPropertiesEditionPart {

	/**
	 * @return the correspondingElement
	 * 
	 */
	public EObject getCorrespondingElement();

	/**
	 * Init the correspondingElement
	 * @param settings the combo setting
	 */
	public void initCorrespondingElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new correspondingElement
	 * @param newValue the new correspondingElement to set
	 * 
	 */
	public void setCorrespondingElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCorrespondingElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the correspondingElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCorrespondingElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the correspondingElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCorrespondingElement(ViewerFilter filter);


	/**
	 * @return the repElemType
	 * 
	 */
	public EObject getRepElemType();

	/**
	 * Init the repElemType
	 * @param settings the combo setting
	 */
	public void initRepElemType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new repElemType
	 * @param newValue the new repElemType to set
	 * 
	 */
	public void setRepElemType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRepElemTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the repElemType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRepElemType(ViewerFilter filter);

	/**
	 * Adds the given filter to the repElemType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRepElemType(ViewerFilter filter);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
