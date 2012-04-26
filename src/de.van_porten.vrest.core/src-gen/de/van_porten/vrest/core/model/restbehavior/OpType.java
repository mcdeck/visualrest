/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.OpType#getResultType <em>Result Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.OpType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getOpType()
 * @model abstract="true"
 * @generated
 */
public interface OpType extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' reference.
	 * @see #setResultType(DataType)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getOpType_ResultType()
	 * @model required="true"
	 * @generated
	 */
	DataType getResultType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.OpType#getResultType <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' reference.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(DataType value);

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
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getOpType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.OpType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OpType
