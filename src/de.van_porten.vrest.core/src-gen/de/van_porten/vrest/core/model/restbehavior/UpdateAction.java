/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction#getElementForUpdate <em>Element For Update</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getUpdateAction()
 * @model
 * @generated
 */
public interface UpdateAction extends Action {
	/**
	 * Returns the value of the '<em><b>Element For Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element For Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element For Update</em>' containment reference.
	 * @see #setElementForUpdate(WritableReference)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getUpdateAction_ElementForUpdate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WritableReference getElementForUpdate();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction#getElementForUpdate <em>Element For Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element For Update</em>' containment reference.
	 * @see #getElementForUpdate()
	 * @generated
	 */
	void setElementForUpdate(WritableReference value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' containment reference.
	 * @see #setNewValue(Value)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getUpdateAction_NewValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getNewValue();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction#getNewValue <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' containment reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Value value);

} // UpdateAction
