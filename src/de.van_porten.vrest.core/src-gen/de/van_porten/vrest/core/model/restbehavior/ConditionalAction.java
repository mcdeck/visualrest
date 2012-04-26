/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionCondition <em>Action Condition</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfTrue <em>Action If True</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfFalse <em>Action If False</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConditionalAction()
 * @model
 * @generated
 */
public interface ConditionalAction extends Action {
	/**
	 * Returns the value of the '<em><b>Action Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Condition</em>' containment reference.
	 * @see #setActionCondition(Condition)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConditionalAction_ActionCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getActionCondition();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionCondition <em>Action Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Condition</em>' containment reference.
	 * @see #getActionCondition()
	 * @generated
	 */
	void setActionCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Action If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action If True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action If True</em>' containment reference.
	 * @see #setActionIfTrue(Action)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConditionalAction_ActionIfTrue()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionIfTrue();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfTrue <em>Action If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action If True</em>' containment reference.
	 * @see #getActionIfTrue()
	 * @generated
	 */
	void setActionIfTrue(Action value);

	/**
	 * Returns the value of the '<em><b>Action If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action If False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action If False</em>' containment reference.
	 * @see #setActionIfFalse(Action)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getConditionalAction_ActionIfFalse()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionIfFalse();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfFalse <em>Action If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action If False</em>' containment reference.
	 * @see #getActionIfFalse()
	 * @generated
	 */
	void setActionIfFalse(Action value);

} // ConditionalAction
