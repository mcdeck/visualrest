/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.util;

import de.van_porten.vrest.core.model.restbehavior.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage
 * @generated
 */
public class RestBehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestBehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestBehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestBehaviorSwitch<Adapter> modelSwitch =
		new RestBehaviorSwitch<Adapter>() {
			@Override
			public Adapter caseCreator(Creator object) {
				return createCreatorAdapter();
			}
			@Override
			public Adapter caseBehaviorSpecification(BehaviorSpecification object) {
				return createBehaviorSpecificationAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseInternalMessage(InternalMessage object) {
				return createInternalMessageAdapter();
			}
			@Override
			public Adapter caseMessageAction(MessageAction object) {
				return createMessageActionAdapter();
			}
			@Override
			public Adapter caseConditionalAction(ConditionalAction object) {
				return createConditionalActionAdapter();
			}
			@Override
			public Adapter caseCreateAction(CreateAction object) {
				return createCreateActionAdapter();
			}
			@Override
			public Adapter caseListAddAction(ListAddAction object) {
				return createListAddActionAdapter();
			}
			@Override
			public Adapter caseListRemoveAction(ListRemoveAction object) {
				return createListRemoveActionAdapter();
			}
			@Override
			public Adapter caseActionSequence(ActionSequence object) {
				return createActionSequenceAdapter();
			}
			@Override
			public Adapter caseUpdateAction(UpdateAction object) {
				return createUpdateActionAdapter();
			}
			@Override
			public Adapter caseReturnAction(ReturnAction object) {
				return createReturnActionAdapter();
			}
			@Override
			public Adapter caseStatusCode(StatusCode object) {
				return createStatusCodeAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseBinaryOperation(BinaryOperation object) {
				return createBinaryOperationAdapter();
			}
			@Override
			public Adapter caseOpType(OpType object) {
				return createOpTypeAdapter();
			}
			@Override
			public Adapter caseBinOpType(BinOpType object) {
				return createBinOpTypeAdapter();
			}
			@Override
			public Adapter caseAttributeReference(AttributeReference object) {
				return createAttributeReferenceAdapter();
			}
			@Override
			public Adapter caseInternalLinkReference(InternalLinkReference object) {
				return createInternalLinkReferenceAdapter();
			}
			@Override
			public Adapter caseWritableReference(WritableReference object) {
				return createWritableReferenceAdapter();
			}
			@Override
			public Adapter caseMTReference(MTReference object) {
				return createMTReferenceAdapter();
			}
			@Override
			public Adapter caseMTLinkReference(MTLinkReference object) {
				return createMTLinkReferenceAdapter();
			}
			@Override
			public Adapter caseMtElementReference(MtElementReference object) {
				return createMtElementReferenceAdapter();
			}
			@Override
			public Adapter caseDeletedState(DeletedState object) {
				return createDeletedStateAdapter();
			}
			@Override
			public Adapter caseExternalLinkReference(ExternalLinkReference object) {
				return createExternalLinkReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Creator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Creator
	 * @generated
	 */
	public Adapter createCreatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification <em>Behavior Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification
	 * @generated
	 */
	public Adapter createBehaviorSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.InternalMessage <em>Internal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalMessage
	 * @generated
	 */
	public Adapter createInternalMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.MessageAction <em>Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.MessageAction
	 * @generated
	 */
	public Adapter createMessageActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.ConditionalAction
	 * @generated
	 */
	public Adapter createConditionalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.CreateAction <em>Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.CreateAction
	 * @generated
	 */
	public Adapter createCreateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.ListAddAction <em>List Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.ListAddAction
	 * @generated
	 */
	public Adapter createListAddActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.ListRemoveAction <em>List Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.ListRemoveAction
	 * @generated
	 */
	public Adapter createListRemoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.ActionSequence <em>Action Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.ActionSequence
	 * @generated
	 */
	public Adapter createActionSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction <em>Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.UpdateAction
	 * @generated
	 */
	public Adapter createUpdateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction <em>Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.ReturnAction
	 * @generated
	 */
	public Adapter createReturnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.StatusCode
	 * @generated
	 */
	public Adapter createStatusCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinaryOperation
	 * @generated
	 */
	public Adapter createBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.OpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.OpType
	 * @generated
	 */
	public Adapter createOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.BinOpType <em>Bin Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinOpType
	 * @generated
	 */
	public Adapter createBinOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.AttributeReference <em>Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.AttributeReference
	 * @generated
	 */
	public Adapter createAttributeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference <em>Internal Link Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalLinkReference
	 * @generated
	 */
	public Adapter createInternalLinkReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.WritableReference <em>Writable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.WritableReference
	 * @generated
	 */
	public Adapter createWritableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.MTReference <em>MT Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.MTReference
	 * @generated
	 */
	public Adapter createMTReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference <em>MT Link Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.MTLinkReference
	 * @generated
	 */
	public Adapter createMTLinkReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.MtElementReference <em>Mt Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.MtElementReference
	 * @generated
	 */
	public Adapter createMtElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.DeletedState <em>Deleted State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.DeletedState
	 * @generated
	 */
	public Adapter createDeletedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference <em>External Link Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference
	 * @generated
	 */
	public Adapter createExternalLinkReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestBehaviorAdapterFactory
