/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.rest.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author Oliver van Porten
 * 
 */
public interface RestApplicationModelPropertiesEditionPart {

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
	 * Init the methodTypes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMethodTypes(ReferencesTableSettings settings);

	/**
	 * Update the methodTypes
	 * @param newValue the methodTypes to update
	 * 
	 */
	public void updateMethodTypes();

	/**
	 * Adds the given filter to the methodTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMethodTypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the methodTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMethodTypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the methodTypes table
	 * 
	 */
	public boolean isContainedInMethodTypesTable(EObject element);




	/**
	 * Init the dataTypes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDataTypes(ReferencesTableSettings settings);

	/**
	 * Update the dataTypes
	 * @param newValue the dataTypes to update
	 * 
	 */
	public void updateDataTypes();

	/**
	 * Adds the given filter to the dataTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDataTypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the dataTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDataTypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the dataTypes table
	 * 
	 */
	public boolean isContainedInDataTypesTable(EObject element);




	/**
	 * Init the mediaTypes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMediaTypes(ReferencesTableSettings settings);

	/**
	 * Update the mediaTypes
	 * @param newValue the mediaTypes to update
	 * 
	 */
	public void updateMediaTypes();

	/**
	 * Adds the given filter to the mediaTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMediaTypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the mediaTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMediaTypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mediaTypes table
	 * 
	 */
	public boolean isContainedInMediaTypesTable(EObject element);




	/**
	 * Init the resourceTypes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResourceTypes(ReferencesTableSettings settings);

	/**
	 * Update the resourceTypes
	 * @param newValue the resourceTypes to update
	 * 
	 */
	public void updateResourceTypes();

	/**
	 * Adds the given filter to the resourceTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResourceTypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the resourceTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResourceTypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resourceTypes table
	 * 
	 */
	public boolean isContainedInResourceTypesTable(EObject element);




	/**
	 * Init the relTypes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRelTypes(ReferencesTableSettings settings);

	/**
	 * Update the relTypes
	 * @param newValue the relTypes to update
	 * 
	 */
	public void updateRelTypes();

	/**
	 * Adds the given filter to the relTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRelTypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the relTypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRelTypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the relTypes table
	 * 
	 */
	public boolean isContainedInRelTypesTable(EObject element);




	/**
	 * Init the optypes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOptypes(ReferencesTableSettings settings);

	/**
	 * Update the optypes
	 * @param newValue the optypes to update
	 * 
	 */
	public void updateOptypes();

	/**
	 * Adds the given filter to the optypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOptypes(ViewerFilter filter);

	/**
	 * Adds the given filter to the optypes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOptypes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the optypes table
	 * 
	 */
	public boolean isContainedInOptypesTable(EObject element);





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
