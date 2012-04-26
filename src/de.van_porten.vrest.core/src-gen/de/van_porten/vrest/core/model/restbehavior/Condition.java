/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.Condition#getConditionExpr <em>Condition Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expr</em>' containment reference.
	 * @see #setConditionExpr(Value)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCondition_ConditionExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getConditionExpr();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.Condition#getConditionExpr <em>Condition Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expr</em>' containment reference.
	 * @see #getConditionExpr()
	 * @generated
	 */
	void setConditionExpr(Value value);

} // Condition
