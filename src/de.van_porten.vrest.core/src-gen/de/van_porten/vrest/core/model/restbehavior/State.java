/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.Method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.State#getEntering <em>Entering</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.State#getLeaving <em>Leaving</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.State#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.State#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Entering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entering</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entering</em>' containment reference.
	 * @see #setEntering(BehaviorSpecification)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getState_Entering()
	 * @model containment="true"
	 * @generated
	 */
	BehaviorSpecification getEntering();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.State#getEntering <em>Entering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entering</em>' containment reference.
	 * @see #getEntering()
	 * @generated
	 */
	void setEntering(BehaviorSpecification value);

	/**
	 * Returns the value of the '<em><b>Leaving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaving</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaving</em>' containment reference.
	 * @see #setLeaving(BehaviorSpecification)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getState_Leaving()
	 * @model containment="true"
	 * @generated
	 */
	BehaviorSpecification getLeaving();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.State#getLeaving <em>Leaving</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaving</em>' containment reference.
	 * @see #getLeaving()
	 * @generated
	 */
	void setLeaving(BehaviorSpecification value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.restbehavior.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Supported Methods</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Methods</em>' reference list.
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getState_SupportedMethods()
	 * @model
	 * @generated
	 */
	EList<Method> getSupportedMethods();

} // State
