/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.CreateAction#getCreator <em>Creator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCreateAction()
 * @model
 * @generated
 */
public interface CreateAction extends Action {
	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(Creator)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCreateAction_Creator()
	 * @model
	 * @generated
	 */
	Creator getCreator();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.CreateAction#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Creator value);

} // CreateAction
