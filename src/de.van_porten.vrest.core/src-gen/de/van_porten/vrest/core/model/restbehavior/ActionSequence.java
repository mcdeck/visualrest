/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ActionSequence#getActionelements <em>Actionelements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getActionSequence()
 * @model
 * @generated
 */
public interface ActionSequence extends Action {
	/**
	 * Returns the value of the '<em><b>Actionelements</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.restbehavior.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionelements</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getActionSequence_Actionelements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActionelements();

} // ActionSequence
