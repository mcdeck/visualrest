/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage
 * @generated
 */
public interface RestBehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestBehaviorFactory eINSTANCE = de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Creator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creator</em>'.
	 * @generated
	 */
	Creator createCreator();

	/**
	 * Returns a new object of class '<em>Behavior Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Specification</em>'.
	 * @generated
	 */
	BehaviorSpecification createBehaviorSpecification();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Internal Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Message</em>'.
	 * @generated
	 */
	InternalMessage createInternalMessage();

	/**
	 * Returns a new object of class '<em>Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Action</em>'.
	 * @generated
	 */
	MessageAction createMessageAction();

	/**
	 * Returns a new object of class '<em>Conditional Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Action</em>'.
	 * @generated
	 */
	ConditionalAction createConditionalAction();

	/**
	 * Returns a new object of class '<em>Create Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Action</em>'.
	 * @generated
	 */
	CreateAction createCreateAction();

	/**
	 * Returns a new object of class '<em>List Add Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Add Action</em>'.
	 * @generated
	 */
	ListAddAction createListAddAction();

	/**
	 * Returns a new object of class '<em>List Remove Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Remove Action</em>'.
	 * @generated
	 */
	ListRemoveAction createListRemoveAction();

	/**
	 * Returns a new object of class '<em>Action Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Sequence</em>'.
	 * @generated
	 */
	ActionSequence createActionSequence();

	/**
	 * Returns a new object of class '<em>Update Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Action</em>'.
	 * @generated
	 */
	UpdateAction createUpdateAction();

	/**
	 * Returns a new object of class '<em>Return Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Action</em>'.
	 * @generated
	 */
	ReturnAction createReturnAction();

	/**
	 * Returns a new object of class '<em>Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Code</em>'.
	 * @generated
	 */
	StatusCode createStatusCode();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operation</em>'.
	 * @generated
	 */
	BinaryOperation createBinaryOperation();

	/**
	 * Returns a new object of class '<em>Bin Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bin Op Type</em>'.
	 * @generated
	 */
	BinOpType createBinOpType();

	/**
	 * Returns a new object of class '<em>Attribute Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Reference</em>'.
	 * @generated
	 */
	AttributeReference createAttributeReference();

	/**
	 * Returns a new object of class '<em>Internal Link Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link Reference</em>'.
	 * @generated
	 */
	InternalLinkReference createInternalLinkReference();

	/**
	 * Returns a new object of class '<em>MT Link Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Link Reference</em>'.
	 * @generated
	 */
	MTLinkReference createMTLinkReference();

	/**
	 * Returns a new object of class '<em>Mt Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mt Element Reference</em>'.
	 * @generated
	 */
	MtElementReference createMtElementReference();

	/**
	 * Returns a new object of class '<em>Deleted State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleted State</em>'.
	 * @generated
	 */
	DeletedState createDeletedState();

	/**
	 * Returns a new object of class '<em>External Link Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Link Reference</em>'.
	 * @generated
	 */
	ExternalLinkReference createExternalLinkReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestBehaviorPackage getRestBehaviorPackage();

} //RestBehaviorFactory
