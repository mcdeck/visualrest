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
public interface RepresentationPropertiesEditionPart {



	/**
	 * Init the containedRepElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainedRepElements(ReferencesTableSettings settings);

	/**
	 * Update the containedRepElements
	 * @param newValue the containedRepElements to update
	 * 
	 */
	public void updateContainedRepElements();

	/**
	 * Adds the given filter to the containedRepElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedRepElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the containedRepElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedRepElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containedRepElements table
	 * 
	 */
	public boolean isContainedInContainedRepElementsTable(EObject element);


	/**
	 * @return the mediatype
	 * 
	 */
	public EObject getMediatype();

	/**
	 * Init the mediatype
	 * @param settings the combo setting
	 */
	public void initMediatype(EObjectFlatComboSettings settings);

	/**
	 * Defines a new mediatype
	 * @param newValue the new mediatype to set
	 * 
	 */
	public void setMediatype(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMediatypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the mediatype edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMediatype(ViewerFilter filter);

	/**
	 * Adds the given filter to the mediatype edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMediatype(ViewerFilter filter);


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
	 * Init the containedRepLinks
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainedRepLinks(ReferencesTableSettings settings);

	/**
	 * Update the containedRepLinks
	 * @param newValue the containedRepLinks to update
	 * 
	 */
	public void updateContainedRepLinks();

	/**
	 * Adds the given filter to the containedRepLinks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedRepLinks(ViewerFilter filter);

	/**
	 * Adds the given filter to the containedRepLinks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedRepLinks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containedRepLinks table
	 * 
	 */
	public boolean isContainedInContainedRepLinksTable(EObject element);




	/**
	 * Init the containedRepLinkCollections
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainedRepLinkCollections(ReferencesTableSettings settings);

	/**
	 * Update the containedRepLinkCollections
	 * @param newValue the containedRepLinkCollections to update
	 * 
	 */
	public void updateContainedRepLinkCollections();

	/**
	 * Adds the given filter to the containedRepLinkCollections edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedRepLinkCollections(ViewerFilter filter);

	/**
	 * Adds the given filter to the containedRepLinkCollections edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedRepLinkCollections(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containedRepLinkCollections table
	 * 
	 */
	public boolean isContainedInContainedRepLinkCollectionsTable(EObject element);





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
