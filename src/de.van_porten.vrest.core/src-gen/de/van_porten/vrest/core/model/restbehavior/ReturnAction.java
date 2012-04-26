/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.Representation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getStatus <em>Status</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getReturnAction()
 * @model
 * @generated
 */
public interface ReturnAction extends Action {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusCode)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getReturnAction_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatusCode getStatus();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.restbehavior.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getReturnAction_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(Representation)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getReturnAction_Representation()
	 * @model containment="true"
	 * @generated
	 */
	Representation getRepresentation();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Representation value);

} // ReturnAction
