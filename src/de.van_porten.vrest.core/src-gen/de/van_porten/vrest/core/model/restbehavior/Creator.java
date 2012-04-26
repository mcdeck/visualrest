/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Parameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.Creator#getConsumedMT <em>Consumed MT</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.Creator#getCreatorParams <em>Creator Params</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.Creator#getCreatebehavior <em>Createbehavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCreator()
 * @model
 * @generated
 */
public interface Creator extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumed MT</b></em>' reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed MT</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed MT</em>' reference list.
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCreator_ConsumedMT()
	 * @model required="true"
	 * @generated
	 */
	EList<MediaType> getConsumedMT();

	/**
	 * Returns the value of the '<em><b>Creator Params</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator Params</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCreator_CreatorParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getCreatorParams();

	/**
	 * Returns the value of the '<em><b>Createbehavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Createbehavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Createbehavior</em>' containment reference.
	 * @see #setCreatebehavior(BehaviorSpecification)
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#getCreator_Createbehavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorSpecification getCreatebehavior();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.restbehavior.Creator#getCreatebehavior <em>Createbehavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Createbehavior</em>' containment reference.
	 * @see #getCreatebehavior()
	 * @generated
	 */
	void setCreatebehavior(BehaviorSpecification value);

} // Creator
