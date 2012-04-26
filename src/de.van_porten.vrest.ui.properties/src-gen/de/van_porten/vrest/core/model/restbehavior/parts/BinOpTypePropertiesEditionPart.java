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
public interface BinOpTypePropertiesEditionPart {

	/**
	 * @return the resultType
	 * 
	 */
	public EObject getResultType();

	/**
	 * Init the resultType
	 * @param settings the combo setting
	 */
	public void initResultType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new resultType
	 * @param newValue the new resultType to set
	 * 
	 */
	public void setResultType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResultTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the resultType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResultType(ViewerFilter filter);

	/**
	 * Adds the given filter to the resultType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResultType(ViewerFilter filter);


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
	 * @return the firstOpType
	 * 
	 */
	public EObject getFirstOpType();

	/**
	 * Init the firstOpType
	 * @param settings the combo setting
	 */
	public void initFirstOpType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new firstOpType
	 * @param newValue the new firstOpType to set
	 * 
	 */
	public void setFirstOpType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFirstOpTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the firstOpType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFirstOpType(ViewerFilter filter);

	/**
	 * Adds the given filter to the firstOpType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFirstOpType(ViewerFilter filter);


	/**
	 * @return the secondOpType
	 * 
	 */
	public EObject getSecondOpType();

	/**
	 * Init the secondOpType
	 * @param settings the combo setting
	 */
	public void initSecondOpType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new secondOpType
	 * @param newValue the new secondOpType to set
	 * 
	 */
	public void setSecondOpType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSecondOpTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the secondOpType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSecondOpType(ViewerFilter filter);

	/**
	 * Adds the given filter to the secondOpType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSecondOpType(ViewerFilter filter);





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
