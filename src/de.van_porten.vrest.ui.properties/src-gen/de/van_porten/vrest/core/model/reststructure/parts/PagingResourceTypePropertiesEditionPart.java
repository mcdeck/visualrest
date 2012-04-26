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
public interface PagingResourceTypePropertiesEditionPart {



	/**
	 * Init the identifer
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initIdentifer(ReferencesTableSettings settings);

	/**
	 * Update the identifer
	 * @param newValue the identifer to update
	 * 
	 */
	public void updateIdentifer();

	/**
	 * Adds the given filter to the identifer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIdentifer(ViewerFilter filter);

	/**
	 * Adds the given filter to the identifer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIdentifer(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the identifer table
	 * 
	 */
	public boolean isContainedInIdentiferTable(EObject element);




	/**
	 * Init the resourceelements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResourceelements(ReferencesTableSettings settings);

	/**
	 * Update the resourceelements
	 * @param newValue the resourceelements to update
	 * 
	 */
	public void updateResourceelements();

	/**
	 * Adds the given filter to the resourceelements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResourceelements(ViewerFilter filter);

	/**
	 * Adds the given filter to the resourceelements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResourceelements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resourceelements table
	 * 
	 */
	public boolean isContainedInResourceelementsTable(EObject element);




	/**
	 * Init the methods
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMethods(ReferencesTableSettings settings);

	/**
	 * Update the methods
	 * @param newValue the methods to update
	 * 
	 */
	public void updateMethods();

	/**
	 * Adds the given filter to the methods edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMethods(ViewerFilter filter);

	/**
	 * Adds the given filter to the methods edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMethods(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the methods table
	 * 
	 */
	public boolean isContainedInMethodsTable(EObject element);




	/**
	 * Init the creators
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCreators(ReferencesTableSettings settings);

	/**
	 * Update the creators
	 * @param newValue the creators to update
	 * 
	 */
	public void updateCreators();

	/**
	 * Adds the given filter to the creators edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCreators(ViewerFilter filter);

	/**
	 * Adds the given filter to the creators edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCreators(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the creators table
	 * 
	 */
	public boolean isContainedInCreatorsTable(EObject element);




	/**
	 * Init the states
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStates(ReferencesTableSettings settings);

	/**
	 * Update the states
	 * @param newValue the states to update
	 * 
	 */
	public void updateStates();

	/**
	 * Adds the given filter to the states edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStates(ViewerFilter filter);

	/**
	 * Adds the given filter to the states edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStates(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the states table
	 * 
	 */
	public boolean isContainedInStatesTable(EObject element);


	/**
	 * @return the initialState
	 * 
	 */
	public EObject getInitialState();

	/**
	 * Init the initialState
	 * @param settings the combo setting
	 */
	public void initInitialState(EObjectFlatComboSettings settings);

	/**
	 * Defines a new initialState
	 * @param newValue the new initialState to set
	 * 
	 */
	public void setInitialState(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInitialStateButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the initialState edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInitialState(ViewerFilter filter);

	/**
	 * Adds the given filter to the initialState edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInitialState(ViewerFilter filter);


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
	 * @return the isSingleton
	 * 
	 */
	public Boolean getIsSingleton();

	/**
	 * Defines a new isSingleton
	 * @param newValue the new isSingleton to set
	 * 
	 */
	public void setIsSingleton(Boolean newValue);


	/**
	 * @return the createOnStart
	 * 
	 */
	public Boolean getCreateOnStart();

	/**
	 * Defines a new createOnStart
	 * @param newValue the new createOnStart to set
	 * 
	 */
	public void setCreateOnStart(Boolean newValue);


	/**
	 * @return the pagedType
	 * 
	 */
	public EObject getPagedType();

	/**
	 * Init the pagedType
	 * @param settings the combo setting
	 */
	public void initPagedType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new pagedType
	 * @param newValue the new pagedType to set
	 * 
	 */
	public void setPagedType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPagedTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the pagedType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPagedType(ViewerFilter filter);

	/**
	 * Adds the given filter to the pagedType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPagedType(ViewerFilter filter);





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
