/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public interface CreatorPropertiesEditionPart {



	/**
	 * Init the consumedMT
	 * @param settings settings for the consumedMT ReferencesTable 
	 */
	public void initConsumedMT(ReferencesTableSettings settings);

	/**
	 * Update the consumedMT
	 * @param newValue the consumedMT to update
	 * 
	 */
	public void updateConsumedMT();

	/**
	 * Adds the given filter to the consumedMT edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConsumedMT(ViewerFilter filter);

	/**
	 * Adds the given filter to the consumedMT edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConsumedMT(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the consumedMT table
	 * 
	 */
	public boolean isContainedInConsumedMTTable(EObject element);




	/**
	 * Init the creatorParams
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCreatorParams(ReferencesTableSettings settings);

	/**
	 * Update the creatorParams
	 * @param newValue the creatorParams to update
	 * 
	 */
	public void updateCreatorParams();

	/**
	 * Adds the given filter to the creatorParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCreatorParams(ViewerFilter filter);

	/**
	 * Adds the given filter to the creatorParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCreatorParams(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the creatorParams table
	 * 
	 */
	public boolean isContainedInCreatorParamsTable(EObject element);





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
