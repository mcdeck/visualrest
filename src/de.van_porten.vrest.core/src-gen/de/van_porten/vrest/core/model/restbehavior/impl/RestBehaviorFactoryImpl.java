/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestBehaviorFactoryImpl extends EFactoryImpl implements RestBehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestBehaviorFactory init() {
		try {
			RestBehaviorFactory theRestBehaviorFactory = (RestBehaviorFactory)EPackage.Registry.INSTANCE.getEFactory("http://restbehavior/1.0"); 
			if (theRestBehaviorFactory != null) {
				return theRestBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestBehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RestBehaviorPackage.CREATOR: return createCreator();
			case RestBehaviorPackage.BEHAVIOR_SPECIFICATION: return createBehaviorSpecification();
			case RestBehaviorPackage.STATE: return createState();
			case RestBehaviorPackage.TRANSITION: return createTransition();
			case RestBehaviorPackage.CONDITION: return createCondition();
			case RestBehaviorPackage.INTERNAL_MESSAGE: return createInternalMessage();
			case RestBehaviorPackage.MESSAGE_ACTION: return createMessageAction();
			case RestBehaviorPackage.CONDITIONAL_ACTION: return createConditionalAction();
			case RestBehaviorPackage.CREATE_ACTION: return createCreateAction();
			case RestBehaviorPackage.LIST_ADD_ACTION: return createListAddAction();
			case RestBehaviorPackage.LIST_REMOVE_ACTION: return createListRemoveAction();
			case RestBehaviorPackage.ACTION_SEQUENCE: return createActionSequence();
			case RestBehaviorPackage.UPDATE_ACTION: return createUpdateAction();
			case RestBehaviorPackage.RETURN_ACTION: return createReturnAction();
			case RestBehaviorPackage.STATUS_CODE: return createStatusCode();
			case RestBehaviorPackage.METADATA: return createMetadata();
			case RestBehaviorPackage.CONSTANT: return createConstant();
			case RestBehaviorPackage.BINARY_OPERATION: return createBinaryOperation();
			case RestBehaviorPackage.BIN_OP_TYPE: return createBinOpType();
			case RestBehaviorPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
			case RestBehaviorPackage.INTERNAL_LINK_REFERENCE: return createInternalLinkReference();
			case RestBehaviorPackage.MT_LINK_REFERENCE: return createMTLinkReference();
			case RestBehaviorPackage.MT_ELEMENT_REFERENCE: return createMtElementReference();
			case RestBehaviorPackage.DELETED_STATE: return createDeletedState();
			case RestBehaviorPackage.EXTERNAL_LINK_REFERENCE: return createExternalLinkReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator createCreator() {
		CreatorImpl creator = new CreatorImpl();
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSpecification createBehaviorSpecification() {
		BehaviorSpecificationImpl behaviorSpecification = new BehaviorSpecificationImpl();
		return behaviorSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalMessage createInternalMessage() {
		InternalMessageImpl internalMessage = new InternalMessageImpl();
		return internalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageAction createMessageAction() {
		MessageActionImpl messageAction = new MessageActionImpl();
		return messageAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAction createConditionalAction() {
		ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
		return conditionalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAction createCreateAction() {
		CreateActionImpl createAction = new CreateActionImpl();
		return createAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListAddAction createListAddAction() {
		ListAddActionImpl listAddAction = new ListAddActionImpl();
		return listAddAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRemoveAction createListRemoveAction() {
		ListRemoveActionImpl listRemoveAction = new ListRemoveActionImpl();
		return listRemoveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSequence createActionSequence() {
		ActionSequenceImpl actionSequence = new ActionSequenceImpl();
		return actionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAction createUpdateAction() {
		UpdateActionImpl updateAction = new UpdateActionImpl();
		return updateAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnAction createReturnAction() {
		ReturnActionImpl returnAction = new ReturnActionImpl();
		return returnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode createStatusCode() {
		StatusCodeImpl statusCode = new StatusCodeImpl();
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperation createBinaryOperation() {
		BinaryOperationImpl binaryOperation = new BinaryOperationImpl();
		return binaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinOpType createBinOpType() {
		BinOpTypeImpl binOpType = new BinOpTypeImpl();
		return binOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeReference createAttributeReference() {
		AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
		return attributeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLinkReference createInternalLinkReference() {
		InternalLinkReferenceImpl internalLinkReference = new InternalLinkReferenceImpl();
		return internalLinkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTLinkReference createMTLinkReference() {
		MTLinkReferenceImpl mtLinkReference = new MTLinkReferenceImpl();
		return mtLinkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtElementReference createMtElementReference() {
		MtElementReferenceImpl mtElementReference = new MtElementReferenceImpl();
		return mtElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletedState createDeletedState() {
		DeletedStateImpl deletedState = new DeletedStateImpl();
		return deletedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLinkReference createExternalLinkReference() {
		ExternalLinkReferenceImpl externalLinkReference = new ExternalLinkReferenceImpl();
		return externalLinkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorPackage getRestBehaviorPackage() {
		return (RestBehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestBehaviorPackage getPackage() {
		return RestBehaviorPackage.eINSTANCE;
	}

} //RestBehaviorFactoryImpl
