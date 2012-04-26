/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.util;

import de.van_porten.vrest.core.model.restbehavior.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage
 * @generated
 */
public class RestBehaviorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestBehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = RestBehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RestBehaviorPackage.CREATOR: {
				Creator creator = (Creator)theEObject;
				T result = caseCreator(creator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.BEHAVIOR_SPECIFICATION: {
				BehaviorSpecification behaviorSpecification = (BehaviorSpecification)theEObject;
				T result = caseBehaviorSpecification(behaviorSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.INTERNAL_MESSAGE: {
				InternalMessage internalMessage = (InternalMessage)theEObject;
				T result = caseInternalMessage(internalMessage);
				if (result == null) result = caseTrigger(internalMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.MESSAGE_ACTION: {
				MessageAction messageAction = (MessageAction)theEObject;
				T result = caseMessageAction(messageAction);
				if (result == null) result = caseAction(messageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.CONDITIONAL_ACTION: {
				ConditionalAction conditionalAction = (ConditionalAction)theEObject;
				T result = caseConditionalAction(conditionalAction);
				if (result == null) result = caseAction(conditionalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.CREATE_ACTION: {
				CreateAction createAction = (CreateAction)theEObject;
				T result = caseCreateAction(createAction);
				if (result == null) result = caseAction(createAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.LIST_ADD_ACTION: {
				ListAddAction listAddAction = (ListAddAction)theEObject;
				T result = caseListAddAction(listAddAction);
				if (result == null) result = caseAction(listAddAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.LIST_REMOVE_ACTION: {
				ListRemoveAction listRemoveAction = (ListRemoveAction)theEObject;
				T result = caseListRemoveAction(listRemoveAction);
				if (result == null) result = caseAction(listRemoveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.ACTION_SEQUENCE: {
				ActionSequence actionSequence = (ActionSequence)theEObject;
				T result = caseActionSequence(actionSequence);
				if (result == null) result = caseAction(actionSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.UPDATE_ACTION: {
				UpdateAction updateAction = (UpdateAction)theEObject;
				T result = caseUpdateAction(updateAction);
				if (result == null) result = caseAction(updateAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.RETURN_ACTION: {
				ReturnAction returnAction = (ReturnAction)theEObject;
				T result = caseReturnAction(returnAction);
				if (result == null) result = caseAction(returnAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.STATUS_CODE: {
				StatusCode statusCode = (StatusCode)theEObject;
				T result = caseStatusCode(statusCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseValue(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseValue(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseValue(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.BINARY_OPERATION: {
				BinaryOperation binaryOperation = (BinaryOperation)theEObject;
				T result = caseBinaryOperation(binaryOperation);
				if (result == null) result = caseOperation(binaryOperation);
				if (result == null) result = caseValue(binaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.OP_TYPE: {
				OpType opType = (OpType)theEObject;
				T result = caseOpType(opType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.BIN_OP_TYPE: {
				BinOpType binOpType = (BinOpType)theEObject;
				T result = caseBinOpType(binOpType);
				if (result == null) result = caseOpType(binOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.ATTRIBUTE_REFERENCE: {
				AttributeReference attributeReference = (AttributeReference)theEObject;
				T result = caseAttributeReference(attributeReference);
				if (result == null) result = caseWritableReference(attributeReference);
				if (result == null) result = caseReference(attributeReference);
				if (result == null) result = caseValue(attributeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE: {
				InternalLinkReference internalLinkReference = (InternalLinkReference)theEObject;
				T result = caseInternalLinkReference(internalLinkReference);
				if (result == null) result = caseWritableReference(internalLinkReference);
				if (result == null) result = caseReference(internalLinkReference);
				if (result == null) result = caseValue(internalLinkReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.WRITABLE_REFERENCE: {
				WritableReference writableReference = (WritableReference)theEObject;
				T result = caseWritableReference(writableReference);
				if (result == null) result = caseReference(writableReference);
				if (result == null) result = caseValue(writableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.MT_REFERENCE: {
				MTReference mtReference = (MTReference)theEObject;
				T result = caseMTReference(mtReference);
				if (result == null) result = caseReference(mtReference);
				if (result == null) result = caseValue(mtReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.MT_LINK_REFERENCE: {
				MTLinkReference mtLinkReference = (MTLinkReference)theEObject;
				T result = caseMTLinkReference(mtLinkReference);
				if (result == null) result = caseMTReference(mtLinkReference);
				if (result == null) result = caseReference(mtLinkReference);
				if (result == null) result = caseValue(mtLinkReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.MT_ELEMENT_REFERENCE: {
				MtElementReference mtElementReference = (MtElementReference)theEObject;
				T result = caseMtElementReference(mtElementReference);
				if (result == null) result = caseMTReference(mtElementReference);
				if (result == null) result = caseReference(mtElementReference);
				if (result == null) result = caseValue(mtElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.DELETED_STATE: {
				DeletedState deletedState = (DeletedState)theEObject;
				T result = caseDeletedState(deletedState);
				if (result == null) result = caseState(deletedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestBehaviorPackage.EXTERNAL_LINK_REFERENCE: {
				ExternalLinkReference externalLinkReference = (ExternalLinkReference)theEObject;
				T result = caseExternalLinkReference(externalLinkReference);
				if (result == null) result = caseWritableReference(externalLinkReference);
				if (result == null) result = caseReference(externalLinkReference);
				if (result == null) result = caseValue(externalLinkReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreator(Creator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorSpecification(BehaviorSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalMessage(InternalMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageAction(MessageAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAction(ConditionalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAction(CreateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Add Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Add Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListAddAction(ListAddAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Remove Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Remove Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRemoveAction(ListRemoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSequence(ActionSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAction(UpdateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnAction(ReturnAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusCode(StatusCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperation(BinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpType(OpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinOpType(BinOpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeReference(AttributeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLinkReference(InternalLinkReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritableReference(WritableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTReference(MTReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Link Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Link Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTLinkReference(MTLinkReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mt Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mt Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMtElementReference(MtElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleted State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleted State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletedState(DeletedState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Link Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Link Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalLinkReference(ExternalLinkReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RestBehaviorSwitch
