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
public interface ReturnActionPropertiesEditionPart {



	/**
	 * Init the metadata
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMetadata(ReferencesTableSettings settings);

	/**
	 * Update the metadata
	 * @param newValue the metadata to update
	 * 
	 */
	public void updateMetadata();

	/**
	 * Adds the given filter to the metadata edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMetadata(ViewerFilter filter);

	/**
	 * Adds the given filter to the metadata edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMetadata(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the metadata table
	 * 
	 */
	public boolean isContainedInMetadataTable(EObject element);





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
