/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getFirstOp <em>First Op</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getSecondOp <em>Second Op</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getOptype <em>Optype</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinaryOperation()
 * @model
 * @generated
 */
public interface BinaryOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>First Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Op</em>' containment reference.
	 * @see #setFirstOp(Value)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinaryOperation_FirstOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getFirstOp();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getFirstOp <em>First Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Op</em>' containment reference.
	 * @see #getFirstOp()
	 * @generated
	 */
	void setFirstOp(Value value);

	/**
	 * Returns the value of the '<em><b>Second Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Op</em>' containment reference.
	 * @see #setSecondOp(Value)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinaryOperation_SecondOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getSecondOp();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getSecondOp <em>Second Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Op</em>' containment reference.
	 * @see #getSecondOp()
	 * @generated
	 */
	void setSecondOp(Value value);

	/**
	 * Returns the value of the '<em><b>Optype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optype</em>' reference.
	 * @see #setOptype(BinOpType)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getBinaryOperation_Optype()
	 * @model required="true"
	 * @generated
	 */
	BinOpType getOptype();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getOptype <em>Optype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optype</em>' reference.
	 * @see #getOptype()
	 * @generated
	 */
	void setOptype(BinOpType value);

} // BinaryOperation
