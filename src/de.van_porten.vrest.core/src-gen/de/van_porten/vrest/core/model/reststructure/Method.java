/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Method#getConsumed <em>Consumed</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Method#getProduced <em>Produced</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Method#getMethodtype <em>Methodtype</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Method#getMethodbehavior <em>Methodbehavior</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.Method#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumed</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod_Consumed()
	 * @model
	 * @generated
	 */
	EList<MediaType> getConsumed();

	/**
	 * Returns the value of the '<em><b>Produced</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced</em>' reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod_Produced()
	 * @model required="true"
	 * @generated
	 */
	EList<MediaType> getProduced();

	/**
	 * Returns the value of the '<em><b>Methodtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methodtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodtype</em>' reference.
	 * @see #setMethodtype(MethodType)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod_Methodtype()
	 * @model required="true"
	 * @generated
	 */
	MethodType getMethodtype();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Method#getMethodtype <em>Methodtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodtype</em>' reference.
	 * @see #getMethodtype()
	 * @generated
	 */
	void setMethodtype(MethodType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Methodbehavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methodbehavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodbehavior</em>' containment reference.
	 * @see #setMethodbehavior(BehaviorSpecification)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod_Methodbehavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorSpecification getMethodbehavior();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Method#getMethodbehavior <em>Methodbehavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodbehavior</em>' containment reference.
	 * @see #getMethodbehavior()
	 * @generated
	 */
	void setMethodbehavior(BehaviorSpecification value);

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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Method
