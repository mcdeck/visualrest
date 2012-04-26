/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure;

import de.van_porten.vrest.core.model.restbehavior.Creator;
import de.van_porten.vrest.core.model.restbehavior.State;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getIdentifer <em>Identifer</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getResourceelements <em>Resourceelements</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getCreators <em>Creators</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getStates <em>States</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#isIsSingleton <em>Is Singleton</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.ResourceType#isCreateOnStart <em>Create On Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType()
 * @model abstract="true"
 * @generated
 */
public interface ResourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifer</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifer</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_Identifer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceIdentifierPattern> getIdentifer();

	/**
	 * Returns the value of the '<em><b>Resourceelements</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.ResourceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourceelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceelements</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_Resourceelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceElement> getResourceelements();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.reststructure.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Creators</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.restbehavior.Creator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creators</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_Creators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Creator> getCreators();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.van_porten.vrest.core.model.restbehavior.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

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
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Singleton</em>' attribute.
	 * @see #setIsSingleton(boolean)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_IsSingleton()
	 * @model
	 * @generated
	 */
	boolean isIsSingleton();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#isIsSingleton <em>Is Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Singleton</em>' attribute.
	 * @see #isIsSingleton()
	 * @generated
	 */
	void setIsSingleton(boolean value);

	/**
	 * Returns the value of the '<em><b>Create On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create On Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create On Start</em>' attribute.
	 * @see #setCreateOnStart(boolean)
	 * @see de.van_porten.vrest.core.model.reststructure.RestStructurePackage#getResourceType_CreateOnStart()
	 * @model
	 * @generated
	 */
	boolean isCreateOnStart();

	/**
	 * Sets the value of the '{@link de.van_porten.vrest.core.model.reststructure.ResourceType#isCreateOnStart <em>Create On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create On Start</em>' attribute.
	 * @see #isCreateOnStart()
	 * @generated
	 */
	void setCreateOnStart(boolean value);

} // ResourceType
