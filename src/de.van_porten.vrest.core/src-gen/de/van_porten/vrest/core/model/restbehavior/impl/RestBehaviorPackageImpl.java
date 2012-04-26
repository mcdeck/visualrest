/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.rest.RestPackage;

import de.van_porten.vrest.core.model.rest.impl.RestPackageImpl;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.ActionSequence;
import de.van_porten.vrest.core.model.restbehavior.AttributeReference;
import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.BinaryOperation;
import de.van_porten.vrest.core.model.restbehavior.Condition;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.Constant;
import de.van_porten.vrest.core.model.restbehavior.CreateAction;
import de.van_porten.vrest.core.model.restbehavior.Creator;
import de.van_porten.vrest.core.model.restbehavior.DeletedState;
import de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.InternalLinkReference;
import de.van_porten.vrest.core.model.restbehavior.InternalMessage;
import de.van_porten.vrest.core.model.restbehavior.ListAddAction;
import de.van_porten.vrest.core.model.restbehavior.ListRemoveAction;
import de.van_porten.vrest.core.model.restbehavior.MTLinkReference;
import de.van_porten.vrest.core.model.restbehavior.MTReference;
import de.van_porten.vrest.core.model.restbehavior.MessageAction;
import de.van_porten.vrest.core.model.restbehavior.Metadata;
import de.van_porten.vrest.core.model.restbehavior.MtElementReference;
import de.van_porten.vrest.core.model.restbehavior.OpType;
import de.van_porten.vrest.core.model.restbehavior.Operation;
import de.van_porten.vrest.core.model.restbehavior.Reference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.ReturnAction;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.restbehavior.StatusCode;
import de.van_porten.vrest.core.model.restbehavior.Transition;
import de.van_porten.vrest.core.model.restbehavior.Trigger;
import de.van_porten.vrest.core.model.restbehavior.UpdateAction;
import de.van_porten.vrest.core.model.restbehavior.Value;
import de.van_porten.vrest.core.model.restbehavior.WritableReference;

import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import de.van_porten.vrest.core.model.reststructure.impl.RestStructurePackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestBehaviorPackageImpl extends EPackageImpl implements RestBehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listAddActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRemoveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binOpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLinkReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtLinkReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalLinkReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestBehaviorPackageImpl() {
		super(eNS_URI, RestBehaviorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RestBehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestBehaviorPackage init() {
		if (isInited) return (RestBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(RestBehaviorPackage.eNS_URI);

		// Obtain or create and register package
		RestBehaviorPackageImpl theRestBehaviorPackage = (RestBehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestBehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestBehaviorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RestPackageImpl theRestPackage = (RestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI) instanceof RestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI) : RestPackage.eINSTANCE);
		RestStructurePackageImpl theRestStructurePackage = (RestStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI) instanceof RestStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI) : RestStructurePackage.eINSTANCE);

		// Create package meta-data objects
		theRestBehaviorPackage.createPackageContents();
		theRestPackage.createPackageContents();
		theRestStructurePackage.createPackageContents();

		// Initialize created meta-data
		theRestBehaviorPackage.initializePackageContents();
		theRestPackage.initializePackageContents();
		theRestStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestBehaviorPackage.eNS_URI, theRestBehaviorPackage);
		return theRestBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreator() {
		return creatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreator_ConsumedMT() {
		return (EReference)creatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreator_CreatorParams() {
		return (EReference)creatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreator_Createbehavior() {
		return (EReference)creatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorSpecification() {
		return behaviorSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorSpecification_Action() {
		return (EReference)behaviorSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entering() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Leaving() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_SupportedMethods() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TargetState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Condition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionExpr() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalMessage() {
		return internalMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalMessage_Name() {
		return (EAttribute)internalMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageAction() {
		return messageActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageAction_Message() {
		return (EReference)messageActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAction() {
		return conditionalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAction_ActionCondition() {
		return (EReference)conditionalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAction_ActionIfTrue() {
		return (EReference)conditionalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAction_ActionIfFalse() {
		return (EReference)conditionalActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAction() {
		return createActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateAction_Creator() {
		return (EReference)createActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListAddAction() {
		return listAddActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRemoveAction() {
		return listRemoveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSequence() {
		return actionSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSequence_Actionelements() {
		return (EReference)actionSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAction() {
		return updateActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAction_ElementForUpdate() {
		return (EReference)updateActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAction_NewValue() {
		return (EReference)updateActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnAction() {
		return returnActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnAction_Status() {
		return (EReference)returnActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnAction_Metadata() {
		return (EReference)returnActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnAction_Representation() {
		return (EReference)returnActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusCode() {
		return statusCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusCode_Number() {
		return (EAttribute)statusCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Type() {
		return (EReference)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_StringRepresentation() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperation() {
		return binaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_FirstOp() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_SecondOp() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_Optype() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpType() {
		return opTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpType_ResultType() {
		return (EReference)opTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpType_Name() {
		return (EAttribute)opTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinOpType() {
		return binOpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinOpType_FirstOpType() {
		return (EReference)binOpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinOpType_SecondOpType() {
		return (EReference)binOpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeReference() {
		return attributeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeReference_ReferencedAttribute() {
		return (EReference)attributeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLinkReference() {
		return internalLinkReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLinkReference_ReferencedLink() {
		return (EReference)internalLinkReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLinkReference_ReferencedReference() {
		return (EReference)internalLinkReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritableReference() {
		return writableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTReference() {
		return mtReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTLinkReference() {
		return mtLinkReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTLinkReference_ReferencedMTLink() {
		return (EReference)mtLinkReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMtElementReference() {
		return mtElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMtElementReference_ReferencedMTElement() {
		return (EReference)mtElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletedState() {
		return deletedStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalLinkReference() {
		return externalLinkReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalLinkReference_ReferencedExternalLink() {
		return (EReference)externalLinkReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorFactory getRestBehaviorFactory() {
		return (RestBehaviorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		creatorEClass = createEClass(CREATOR);
		createEReference(creatorEClass, CREATOR__CONSUMED_MT);
		createEReference(creatorEClass, CREATOR__CREATOR_PARAMS);
		createEReference(creatorEClass, CREATOR__CREATEBEHAVIOR);

		behaviorSpecificationEClass = createEClass(BEHAVIOR_SPECIFICATION);
		createEReference(behaviorSpecificationEClass, BEHAVIOR_SPECIFICATION__ACTION);

		actionEClass = createEClass(ACTION);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ENTERING);
		createEReference(stateEClass, STATE__LEAVING);
		createEReference(stateEClass, STATE__TRANSITIONS);
		createEAttribute(stateEClass, STATE__NAME);
		createEReference(stateEClass, STATE__SUPPORTED_METHODS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__TARGET_STATE);
		createEReference(transitionEClass, TRANSITION__CONDITION);
		createEReference(transitionEClass, TRANSITION__EFFECT);

		triggerEClass = createEClass(TRIGGER);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__CONDITION_EXPR);

		internalMessageEClass = createEClass(INTERNAL_MESSAGE);
		createEAttribute(internalMessageEClass, INTERNAL_MESSAGE__NAME);

		messageActionEClass = createEClass(MESSAGE_ACTION);
		createEReference(messageActionEClass, MESSAGE_ACTION__MESSAGE);

		conditionalActionEClass = createEClass(CONDITIONAL_ACTION);
		createEReference(conditionalActionEClass, CONDITIONAL_ACTION__ACTION_CONDITION);
		createEReference(conditionalActionEClass, CONDITIONAL_ACTION__ACTION_IF_TRUE);
		createEReference(conditionalActionEClass, CONDITIONAL_ACTION__ACTION_IF_FALSE);

		createActionEClass = createEClass(CREATE_ACTION);
		createEReference(createActionEClass, CREATE_ACTION__CREATOR);

		listAddActionEClass = createEClass(LIST_ADD_ACTION);

		listRemoveActionEClass = createEClass(LIST_REMOVE_ACTION);

		actionSequenceEClass = createEClass(ACTION_SEQUENCE);
		createEReference(actionSequenceEClass, ACTION_SEQUENCE__ACTIONELEMENTS);

		updateActionEClass = createEClass(UPDATE_ACTION);
		createEReference(updateActionEClass, UPDATE_ACTION__ELEMENT_FOR_UPDATE);
		createEReference(updateActionEClass, UPDATE_ACTION__NEW_VALUE);

		returnActionEClass = createEClass(RETURN_ACTION);
		createEReference(returnActionEClass, RETURN_ACTION__STATUS);
		createEReference(returnActionEClass, RETURN_ACTION__METADATA);
		createEReference(returnActionEClass, RETURN_ACTION__REPRESENTATION);

		statusCodeEClass = createEClass(STATUS_CODE);
		createEAttribute(statusCodeEClass, STATUS_CODE__NUMBER);

		metadataEClass = createEClass(METADATA);

		valueEClass = createEClass(VALUE);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__TYPE);
		createEAttribute(constantEClass, CONSTANT__STRING_REPRESENTATION);

		referenceEClass = createEClass(REFERENCE);

		operationEClass = createEClass(OPERATION);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__FIRST_OP);
		createEReference(binaryOperationEClass, BINARY_OPERATION__SECOND_OP);
		createEReference(binaryOperationEClass, BINARY_OPERATION__OPTYPE);

		opTypeEClass = createEClass(OP_TYPE);
		createEReference(opTypeEClass, OP_TYPE__RESULT_TYPE);
		createEAttribute(opTypeEClass, OP_TYPE__NAME);

		binOpTypeEClass = createEClass(BIN_OP_TYPE);
		createEReference(binOpTypeEClass, BIN_OP_TYPE__FIRST_OP_TYPE);
		createEReference(binOpTypeEClass, BIN_OP_TYPE__SECOND_OP_TYPE);

		attributeReferenceEClass = createEClass(ATTRIBUTE_REFERENCE);
		createEReference(attributeReferenceEClass, ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE);

		internalLinkReferenceEClass = createEClass(INTERNAL_LINK_REFERENCE);
		createEReference(internalLinkReferenceEClass, INTERNAL_LINK_REFERENCE__REFERENCED_LINK);
		createEReference(internalLinkReferenceEClass, INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE);

		writableReferenceEClass = createEClass(WRITABLE_REFERENCE);

		mtReferenceEClass = createEClass(MT_REFERENCE);

		mtLinkReferenceEClass = createEClass(MT_LINK_REFERENCE);
		createEReference(mtLinkReferenceEClass, MT_LINK_REFERENCE__REFERENCED_MT_LINK);

		mtElementReferenceEClass = createEClass(MT_ELEMENT_REFERENCE);
		createEReference(mtElementReferenceEClass, MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT);

		deletedStateEClass = createEClass(DELETED_STATE);

		externalLinkReferenceEClass = createEClass(EXTERNAL_LINK_REFERENCE);
		createEReference(externalLinkReferenceEClass, EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RestStructurePackage theRestStructurePackage = (RestStructurePackage)EPackage.Registry.INSTANCE.getEPackage(RestStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalMessageEClass.getESuperTypes().add(this.getTrigger());
		messageActionEClass.getESuperTypes().add(this.getAction());
		conditionalActionEClass.getESuperTypes().add(this.getAction());
		createActionEClass.getESuperTypes().add(this.getAction());
		listAddActionEClass.getESuperTypes().add(this.getAction());
		listRemoveActionEClass.getESuperTypes().add(this.getAction());
		actionSequenceEClass.getESuperTypes().add(this.getAction());
		updateActionEClass.getESuperTypes().add(this.getAction());
		returnActionEClass.getESuperTypes().add(this.getAction());
		constantEClass.getESuperTypes().add(this.getValue());
		referenceEClass.getESuperTypes().add(this.getValue());
		operationEClass.getESuperTypes().add(this.getValue());
		binaryOperationEClass.getESuperTypes().add(this.getOperation());
		binOpTypeEClass.getESuperTypes().add(this.getOpType());
		attributeReferenceEClass.getESuperTypes().add(this.getWritableReference());
		internalLinkReferenceEClass.getESuperTypes().add(this.getWritableReference());
		writableReferenceEClass.getESuperTypes().add(this.getReference());
		mtReferenceEClass.getESuperTypes().add(this.getReference());
		mtLinkReferenceEClass.getESuperTypes().add(this.getMTReference());
		mtElementReferenceEClass.getESuperTypes().add(this.getMTReference());
		deletedStateEClass.getESuperTypes().add(this.getState());
		externalLinkReferenceEClass.getESuperTypes().add(this.getWritableReference());

		// Initialize classes and features; add operations and parameters
		initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreator_ConsumedMT(), theRestStructurePackage.getMediaType(), null, "consumedMT", null, 1, -1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreator_CreatorParams(), theRestStructurePackage.getParameter(), null, "creatorParams", null, 0, -1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreator_Createbehavior(), this.getBehaviorSpecification(), null, "createbehavior", null, 1, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorSpecificationEClass, BehaviorSpecification.class, "BehaviorSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorSpecification_Action(), this.getAction(), null, "action", null, 0, 1, BehaviorSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Entering(), this.getBehaviorSpecification(), null, "entering", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Leaving(), this.getBehaviorSpecification(), null, "leaving", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_SupportedMethods(), theRestStructurePackage.getMethod(), null, "supportedMethods", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TargetState(), this.getState(), null, "targetState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Condition(), this.getCondition(), null, "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Effect(), this.getBehaviorSpecification(), null, "effect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_ConditionExpr(), this.getValue(), null, "conditionExpr", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalMessageEClass, InternalMessage.class, "InternalMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalMessage_Name(), ecorePackage.getEString(), "name", null, 1, 1, InternalMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageActionEClass, MessageAction.class, "MessageAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageAction_Message(), this.getInternalMessage(), null, "message", null, 1, 1, MessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalActionEClass, ConditionalAction.class, "ConditionalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalAction_ActionCondition(), this.getCondition(), null, "actionCondition", null, 1, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalAction_ActionIfTrue(), this.getAction(), null, "actionIfTrue", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalAction_ActionIfFalse(), this.getAction(), null, "actionIfFalse", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createActionEClass, CreateAction.class, "CreateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateAction_Creator(), this.getCreator(), null, "creator", null, 0, 1, CreateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listAddActionEClass, ListAddAction.class, "ListAddAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listRemoveActionEClass, ListRemoveAction.class, "ListRemoveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionSequenceEClass, ActionSequence.class, "ActionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSequence_Actionelements(), this.getAction(), null, "actionelements", null, 1, -1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateActionEClass, UpdateAction.class, "UpdateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateAction_ElementForUpdate(), this.getWritableReference(), null, "elementForUpdate", null, 1, 1, UpdateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateAction_NewValue(), this.getValue(), null, "newValue", null, 1, 1, UpdateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnActionEClass, ReturnAction.class, "ReturnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnAction_Status(), this.getStatusCode(), null, "status", null, 1, 1, ReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAction_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, ReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAction_Representation(), theRestStructurePackage.getRepresentation(), null, "representation", null, 0, 1, ReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusCodeEClass, StatusCode.class, "StatusCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusCode_Number(), ecorePackage.getEInt(), "number", null, 1, 1, StatusCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_Type(), theRestStructurePackage.getDataType(), null, "type", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_StringRepresentation(), ecorePackage.getEString(), "stringRepresentation", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_FirstOp(), this.getValue(), null, "firstOp", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperation_SecondOp(), this.getValue(), null, "secondOp", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperation_Optype(), this.getBinOpType(), null, "optype", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opTypeEClass, OpType.class, "OpType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpType_ResultType(), theRestStructurePackage.getDataType(), null, "resultType", null, 1, 1, OpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpType_Name(), ecorePackage.getEString(), "name", null, 1, 1, OpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binOpTypeEClass, BinOpType.class, "BinOpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinOpType_FirstOpType(), theRestStructurePackage.getDataType(), null, "firstOpType", null, 1, 1, BinOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinOpType_SecondOpType(), theRestStructurePackage.getDataType(), null, "secondOpType", null, 1, 1, BinOpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeReferenceEClass, AttributeReference.class, "AttributeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeReference_ReferencedAttribute(), theRestStructurePackage.getAttribute(), null, "referencedAttribute", null, 1, 1, AttributeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalLinkReferenceEClass, InternalLinkReference.class, "InternalLinkReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalLinkReference_ReferencedLink(), theRestStructurePackage.getInternalLink(), null, "referencedLink", null, 1, 1, InternalLinkReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalLinkReference_ReferencedReference(), this.getWritableReference(), null, "referencedReference", null, 0, 1, InternalLinkReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writableReferenceEClass, WritableReference.class, "WritableReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mtReferenceEClass, MTReference.class, "MTReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mtLinkReferenceEClass, MTLinkReference.class, "MTLinkReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMTLinkReference_ReferencedMTLink(), theRestStructurePackage.getMediaTypeLink(), null, "referencedMTLink", null, 1, 1, MTLinkReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mtElementReferenceEClass, MtElementReference.class, "MtElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMtElementReference_ReferencedMTElement(), theRestStructurePackage.getMediaTypeElement(), null, "referencedMTElement", null, 1, 1, MtElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletedStateEClass, DeletedState.class, "DeletedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalLinkReferenceEClass, ExternalLinkReference.class, "ExternalLinkReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalLinkReference_ReferencedExternalLink(), theRestStructurePackage.getExternalLink(), null, "referencedExternalLink", null, 0, 1, ExternalLinkReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines the behavior of the creation of new resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Creator")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the media types which can be consumed by the creator"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Creator/consumedMT")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "parameters of the creator"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Creator/creatorParams")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the behavior definition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Creator/createbehavior")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines behavior in terms of actions"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BehaviorSpecification")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the root action of the behavior"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BehaviorSpecification/action")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a simple or composite action"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a state of a resource type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//State")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the state"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//State/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the behavior which shall be executed when the state is entered"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//State/entering")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the behavior which shall be executed when the state is left"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//State/leaving")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the outgoing transitions of this state"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//State/transitions")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the methods which are supported in this state"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//State/supportedMethods")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the transition between two states"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Transition")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the trigger of this transition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Transition/trigger")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the target state"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Transition/targetState")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the condition which must be fulfilled for performing the transition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Transition/condition")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the behavior which shall be executed if the transition is performed"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Transition/effect")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a trigger for transitions"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Trigger")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a condition which can be evaluated during runtime to true or false"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Condition")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the expresseion which defines the condition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Condition/conditionExpr")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a message type in this system which e.g. can be used for triggering state transition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalMessage")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name of the message type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalMessage/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "sending an message"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MessageAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the message type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MessageAction/message")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "allows to define conditional actions"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConditionalAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the condition"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConditionalAction/actionCondition")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the action which should be exectued if the condition evaluated to true"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConditionalAction/actionIfTrue")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the optional action which should be exectued if the condition evaluated to false"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConditionalAction/actionIfFalse")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "allows to create a new resource"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CreateAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the creator which shall be used"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CreateAction/creator")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "allows to add an element to a list"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ListAddAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "allows to remove an element from a list"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ListRemoveAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a sequence of actions which defines the execution order"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionSequence")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the ordered actions"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionSequence/actionelements")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "updates the value of an element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UpdateAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UpdateAction/elementForUpdate")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the new value"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UpdateAction/newValue")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines the response of a method"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ReturnAction")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the status code of the response"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ReturnAction/status")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the metadata of the response"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ReturnAction/metadata")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the optional representation contained in the response"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ReturnAction/representation")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a status code"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StatusCode")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the number of the status code"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StatusCode/number")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "metadata of a request or response"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Metadata")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a value which can be used in expressions and actions"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Value")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a constant value"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Constant")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a string representation of the constant value"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Constant/stringRepresentation")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the datatype of the constant"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Constant/type")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to an element; can be used in expressions"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Reference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "an operation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Operation")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "an operation with two operands"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinaryOperation")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the first operand"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinaryOperation/firstOp")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the second operand"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinaryOperation/secondOp")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of the operation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinaryOperation/optype")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "defines the type of an operation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OpType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the name this OpType"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OpType/name")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the result type of the operation"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OpType/resultType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type definition for an operation with two operands"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinOpType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of the first operand"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinOpType/firstOpType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the type of the second operand"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BinOpType/secondOpType")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to an attribute"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AttributeReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the referenced attribute"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AttributeReference/referencedAttribute")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to an internal link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLinkReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the referenced internal link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLinkReference/referencedLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "an reference to an element of the resource found when following the link;can be used to build reference chains"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InternalLinkReference/referencedReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to a writable element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//WritableReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to a media type element"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MTReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to a link defined by a media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MTLinkReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the referenced link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MTLinkReference/referencedMTLink")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to an attribute defined by a media type"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MtElementReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the referenced attribute"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MtElementReference/referencedMTElement")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a special state which is reached when a resource was deleted"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DeletedState")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "a reference to an external link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ExternalLinkReference")
		   });		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "the referenced external link"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ExternalLinkReference/referencedExternalLink")
		   });
	}

} //RestBehaviorPackageImpl
