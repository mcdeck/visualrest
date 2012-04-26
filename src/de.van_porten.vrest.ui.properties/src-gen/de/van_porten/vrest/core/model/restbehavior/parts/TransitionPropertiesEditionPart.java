/**
 * Generated with Acceleo
 */
package de.van_porten.vrest.core.model.restbehavior.parts;

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
public interface TransitionPropertiesEditionPart {



	/**
	 * Init the trigger
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTrigger(ReferencesTableSettings settings);

	/**
	 * Update the trigger
	 * @param newValue the trigger to update
	 * 
	 */
	public void updateTrigger();

	/**
	 * Adds the given filter to the trigger edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTrigger(ViewerFilter filter);

	/**
	 * Adds the given filter to the trigger edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTrigger(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the trigger table
	 * 
	 */
	public boolean isContainedInTriggerTable(EObject element);


	/**
	 * @return the targetState
	 * 
	 */
	public EObject getTargetState();

	/**
	 * Init the targetState
	 * @param settings the combo setting
	 */
	public void initTargetState(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetState
	 * @param newValue the new targetState to set
	 * 
	 */
	public void setTargetState(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetStateButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetState edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetState(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetState edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetState(ViewerFilter filter);





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
