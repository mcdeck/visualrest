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
public interface ComplexIdentifierPatternPropertiesEditionPart {



	/**
	 * Init the idParams
	 * @param settings settings for the idParams ReferencesTable 
	 */
	public void initIdParams(ReferencesTableSettings settings);

	/**
	 * Update the idParams
	 * @param newValue the idParams to update
	 * 
	 */
	public void updateIdParams();

	/**
	 * Adds the given filter to the idParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIdParams(ViewerFilter filter);

	/**
	 * Adds the given filter to the idParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIdParams(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the idParams table
	 * 
	 */
	public boolean isContainedInIdParamsTable(EObject element);




	/**
	 * Init the idAttrs
	 * @param settings settings for the idAttrs ReferencesTable 
	 */
	public void initIdAttrs(ReferencesTableSettings settings);

	/**
	 * Update the idAttrs
	 * @param newValue the idAttrs to update
	 * 
	 */
	public void updateIdAttrs();

	/**
	 * Adds the given filter to the idAttrs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIdAttrs(ViewerFilter filter);

	/**
	 * Adds the given filter to the idAttrs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIdAttrs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the idAttrs table
	 * 
	 */
	public boolean isContainedInIdAttrsTable(EObject element);





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
