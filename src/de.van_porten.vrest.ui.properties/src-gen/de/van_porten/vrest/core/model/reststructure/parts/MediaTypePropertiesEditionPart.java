/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.reststructure.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public interface MediaTypePropertiesEditionPart {



	/**
	 * Init the containedMTElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainedMTElements(ReferencesTableSettings settings);

	/**
	 * Update the containedMTElements
	 * @param newValue the containedMTElements to update
	 * 
	 */
	public void updateContainedMTElements();

	/**
	 * Adds the given filter to the containedMTElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedMTElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the containedMTElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedMTElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containedMTElements table
	 * 
	 */
	public boolean isContainedInContainedMTElementsTable(EObject element);


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
	 * Init the containedMTLinks
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainedMTLinks(ReferencesTableSettings settings);

	/**
	 * Update the containedMTLinks
	 * @param newValue the containedMTLinks to update
	 * 
	 */
	public void updateContainedMTLinks();

	/**
	 * Adds the given filter to the containedMTLinks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedMTLinks(ViewerFilter filter);

	/**
	 * Adds the given filter to the containedMTLinks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedMTLinks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containedMTLinks table
	 * 
	 */
	public boolean isContainedInContainedMTLinksTable(EObject element);




	/**
	 * Init the containedMTLinkCollections
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainedMTLinkCollections(ReferencesTableSettings settings);

	/**
	 * Update the containedMTLinkCollections
	 * @param newValue the containedMTLinkCollections to update
	 * 
	 */
	public void updateContainedMTLinkCollections();

	/**
	 * Adds the given filter to the containedMTLinkCollections edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedMTLinkCollections(ViewerFilter filter);

	/**
	 * Adds the given filter to the containedMTLinkCollections edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedMTLinkCollections(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containedMTLinkCollections table
	 * 
	 */
	public boolean isContainedInContainedMTLinkCollectionsTable(EObject element);





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
