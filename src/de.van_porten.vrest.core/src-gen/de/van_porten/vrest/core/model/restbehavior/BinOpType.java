/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.BinOpType#getFirstOpType <em>First Op Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.BinOpType#getSecondOpType <em>Second Op Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinOpType()
 * @model
 * @generated
 */
public interface BinOpType extends OpType {
	/**
	 * Returns the value of the '<em><b>First Op Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Op Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Op Type</em>' reference.
	 * @see #setFirstOpType(DataType)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinOpType_FirstOpType()
	 * @model required="true"
	 * @generated
	 */
	DataType getFirstOpType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.BinOpType#getFirstOpType <em>First Op Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Op Type</em>' reference.
	 * @see #getFirstOpType()
	 * @generated
	 */
	void setFirstOpType(DataType value);

	/**
	 * Returns the value of the '<em><b>Second Op Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Op Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Op Type</em>' reference.
	 * @see #setSecondOpType(DataType)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinOpType_SecondOpType()
	 * @model required="true"
	 * @generated
	 */
	DataType getSecondOpType();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.BinOpType#getSecondOpType <em>Second Op Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Op Type</em>' reference.
	 * @see #getSecondOpType()
	 * @generated
	 */
	void setSecondOpType(DataType value);

} // BinOpType
