/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public interface MethodPropertiesEditionPart {



	/**
	 * Init the consumed
	 * @param settings settings for the consumed ReferencesTable 
	 */
	public void initConsumed(ReferencesTableSettings settings);

	/**
	 * Update the consumed
	 * @param newValue the consumed to update
	 * 
	 */
	public void updateConsumed();

	/**
	 * Adds the given filter to the consumed edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConsumed(ViewerFilter filter);

	/**
	 * Adds the given filter to the consumed edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConsumed(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the consumed table
	 * 
	 */
	public boolean isContainedInConsumedTable(EObject element);




	/**
	 * Init the produced
	 * @param settings settings for the produced ReferencesTable 
	 */
	public void initProduced(ReferencesTableSettings settings);

	/**
	 * Update the produced
	 * @param newValue the produced to update
	 * 
	 */
	public void updateProduced();

	/**
	 * Adds the given filter to the produced edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProduced(ViewerFilter filter);

	/**
	 * Adds the given filter to the produced edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProduced(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the produced table
	 * 
	 */
	public boolean isContainedInProducedTable(EObject element);


	/**
	 * @return the methodtype
	 * 
	 */
	public EObject getMethodtype();

	/**
	 * Init the methodtype
	 * @param settings the combo setting
	 */
	public void initMethodtype(EObjectFlatComboSettings settings);

	/**
	 * Defines a new methodtype
	 * @param newValue the new methodtype to set
	 * 
	 */
	public void setMethodtype(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMethodtypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the methodtype edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMethodtype(ViewerFilter filter);

	/**
	 * Adds the given filter to the methodtype edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMethodtype(ViewerFilter filter);




	/**
	 * Init the parameters
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParameters(ReferencesTableSettings settings);

	/**
	 * Update the parameters
	 * @param newValue the parameters to update
	 * 
	 */
	public void updateParameters();

	/**
	 * Adds the given filter to the parameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameters(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the parameters table
	 * 
	 */
	public boolean isContainedInParametersTable(EObject element);


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
