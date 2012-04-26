/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface RestBehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restbehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://restbehavior/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restbehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestBehaviorPackage eINSTANCE = de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl <em>Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getCreator()
	 * @generated
	 */
	int CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Consumed MT</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__CONSUMED_MT = 0;

	/**
	 * The feature id for the '<em><b>Creator Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__CREATOR_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Createbehavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__CREATEBEHAVIOR = 2;

	/**
	 * The number of structural features of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.BehaviorSpecificationImpl <em>Behavior Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.BehaviorSpecificationImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getBehaviorSpecification()
	 * @generated
	 */
	int BEHAVIOR_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Behavior Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.StateImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Entering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTERING = 0;

	/**
	 * The feature id for the '<em><b>Leaving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LEAVING = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Supported Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUPPORTED_METHODS = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.TransitionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET_STATE = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.TriggerImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ConditionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Condition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_EXPR = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.InternalMessageImpl <em>Internal Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.InternalMessageImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getInternalMessage()
	 * @generated
	 */
	int INTERNAL_MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MESSAGE__NAME = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_MESSAGE_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MessageActionImpl <em>Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.MessageActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMessageAction()
	 * @generated
	 */
	int MESSAGE_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getConditionalAction()
	 * @generated
	 */
	int CONDITIONAL_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Action Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__ACTION_CONDITION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__ACTION_IF_TRUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__ACTION_IF_FALSE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.CreateActionImpl <em>Create Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.CreateActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getCreateAction()
	 * @generated
	 */
	int CREATE_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__CREATOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ListAddActionImpl <em>List Add Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ListAddActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getListAddAction()
	 * @generated
	 */
	int LIST_ADD_ACTION = 11;

	/**
	 * The number of structural features of the '<em>List Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ADD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ListRemoveActionImpl <em>List Remove Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ListRemoveActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getListRemoveAction()
	 * @generated
	 */
	int LIST_REMOVE_ACTION = 12;

	/**
	 * The number of structural features of the '<em>List Remove Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REMOVE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ActionSequenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getActionSequence()
	 * @generated
	 */
	int ACTION_SEQUENCE = 13;

	/**
	 * The feature id for the '<em><b>Actionelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE__ACTIONELEMENTS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEQUENCE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.UpdateActionImpl <em>Update Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.UpdateActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getUpdateAction()
	 * @generated
	 */
	int UPDATE_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Element For Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__ELEMENT_FOR_UPDATE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__NEW_VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl <em>Return Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getReturnAction()
	 * @generated
	 */
	int RETURN_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__STATUS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__METADATA = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__REPRESENTATION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.StatusCodeImpl <em>Status Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.StatusCodeImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getStatusCode()
	 * @generated
	 */
	int STATUS_CODE = 16;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CODE__NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.MetadataImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 17;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ValueImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 18;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ConstantImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__STRING_REPRESENTATION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 20;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.OperationImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 21;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 22;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__FIRST_OP = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__SECOND_OP = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__OPTYPE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.OpTypeImpl <em>Op Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.OpTypeImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getOpType()
	 * @generated
	 */
	int OP_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_TYPE__RESULT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.BinOpTypeImpl <em>Bin Op Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.BinOpTypeImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getBinOpType()
	 * @generated
	 */
	int BIN_OP_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_TYPE__RESULT_TYPE = OP_TYPE__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_TYPE__NAME = OP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>First Op Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_TYPE__FIRST_OP_TYPE = OP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_TYPE__SECOND_OP_TYPE = OP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bin Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_TYPE_FEATURE_COUNT = OP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.WritableReferenceImpl <em>Writable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.WritableReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getWritableReference()
	 * @generated
	 */
	int WRITABLE_REFERENCE = 27;

	/**
	 * The number of structural features of the '<em>Writable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.AttributeReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getAttributeReference()
	 * @generated
	 */
	int ATTRIBUTE_REFERENCE = 25;

	/**
	 * The feature id for the '<em><b>Referenced Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE = WRITABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_FEATURE_COUNT = WRITABLE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.InternalLinkReferenceImpl <em>Internal Link Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.InternalLinkReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getInternalLinkReference()
	 * @generated
	 */
	int INTERNAL_LINK_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Referenced Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_REFERENCE__REFERENCED_LINK = WRITABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE = WRITABLE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Link Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_REFERENCE_FEATURE_COUNT = WRITABLE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MTReferenceImpl <em>MT Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.MTReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMTReference()
	 * @generated
	 */
	int MT_REFERENCE = 28;

	/**
	 * The number of structural features of the '<em>MT Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MTLinkReferenceImpl <em>MT Link Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.MTLinkReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMTLinkReference()
	 * @generated
	 */
	int MT_LINK_REFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Referenced MT Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LINK_REFERENCE__REFERENCED_MT_LINK = MT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MT Link Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_LINK_REFERENCE_FEATURE_COUNT = MT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MtElementReferenceImpl <em>Mt Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.MtElementReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMtElementReference()
	 * @generated
	 */
	int MT_ELEMENT_REFERENCE = 30;

	/**
	 * The feature id for the '<em><b>Referenced MT Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT = MT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mt Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_ELEMENT_REFERENCE_FEATURE_COUNT = MT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.DeletedStateImpl <em>Deleted State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.DeletedStateImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getDeletedState()
	 * @generated
	 */
	int DELETED_STATE = 31;

	/**
	 * The feature id for the '<em><b>Entering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_STATE__ENTERING = STATE__ENTERING;

	/**
	 * The feature id for the '<em><b>Leaving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_STATE__LEAVING = STATE__LEAVING;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_STATE__TRANSITIONS = STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Supported Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_STATE__SUPPORTED_METHODS = STATE__SUPPORTED_METHODS;

	/**
	 * The number of structural features of the '<em>Deleted State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ExternalLinkReferenceImpl <em>External Link Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.ExternalLinkReferenceImpl
	 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getExternalLinkReference()
	 * @generated
	 */
	int EXTERNAL_LINK_REFERENCE = 32;

	/**
	 * The feature id for the '<em><b>Referenced External Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK = WRITABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Link Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_REFERENCE_FEATURE_COUNT = WRITABLE_REFERENCE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Creator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creator</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Creator
	 * @generated
	 */
	EClass getCreator();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.restbehavior.Creator#getConsumedMT <em>Consumed MT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumed MT</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Creator#getConsumedMT()
	 * @see #getCreator()
	 * @generated
	 */
	EReference getCreator_ConsumedMT();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.restbehavior.Creator#getCreatorParams <em>Creator Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creator Params</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Creator#getCreatorParams()
	 * @see #getCreator()
	 * @generated
	 */
	EReference getCreator_CreatorParams();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.Creator#getCreatebehavior <em>Createbehavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Createbehavior</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Creator#getCreatebehavior()
	 * @see #getCreator()
	 * @generated
	 */
	EReference getCreator_Createbehavior();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification <em>Behavior Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Specification</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification
	 * @generated
	 */
	EClass getBehaviorSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification#getAction()
	 * @see #getBehaviorSpecification()
	 * @generated
	 */
	EReference getBehaviorSpecification_Action();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.State#getEntering <em>Entering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entering</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.State#getEntering()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entering();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.State#getLeaving <em>Leaving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leaving</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.State#getLeaving()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Leaving();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.restbehavior.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.restbehavior.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.van_porten.vrest.core.model.restbehavior.State#getSupportedMethods <em>Supported Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Methods</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.State#getSupportedMethods()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SupportedMethods();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.restbehavior.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Transition#getTargetState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TargetState();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.Condition#getConditionExpr <em>Condition Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expr</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Condition#getConditionExpr()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ConditionExpr();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.InternalMessage <em>Internal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Message</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalMessage
	 * @generated
	 */
	EClass getInternalMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.restbehavior.InternalMessage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalMessage#getName()
	 * @see #getInternalMessage()
	 * @generated
	 */
	EAttribute getInternalMessage_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.MessageAction <em>Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MessageAction
	 * @generated
	 */
	EClass getMessageAction();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.MessageAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MessageAction#getMessage()
	 * @see #getMessageAction()
	 * @generated
	 */
	EReference getMessageAction_Message();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ConditionalAction
	 * @generated
	 */
	EClass getConditionalAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionCondition <em>Action Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Condition</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionCondition()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EReference getConditionalAction_ActionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfTrue <em>Action If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action If True</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfTrue()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EReference getConditionalAction_ActionIfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfFalse <em>Action If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action If False</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ConditionalAction#getActionIfFalse()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EReference getConditionalAction_ActionIfFalse();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.CreateAction <em>Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.CreateAction
	 * @generated
	 */
	EClass getCreateAction();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.CreateAction#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.CreateAction#getCreator()
	 * @see #getCreateAction()
	 * @generated
	 */
	EReference getCreateAction_Creator();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.ListAddAction <em>List Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Add Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ListAddAction
	 * @generated
	 */
	EClass getListAddAction();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.ListRemoveAction <em>List Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Remove Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ListRemoveAction
	 * @generated
	 */
	EClass getListRemoveAction();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.ActionSequence <em>Action Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Sequence</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ActionSequence
	 * @generated
	 */
	EClass getActionSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.restbehavior.ActionSequence#getActionelements <em>Actionelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionelements</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ActionSequence#getActionelements()
	 * @see #getActionSequence()
	 * @generated
	 */
	EReference getActionSequence_Actionelements();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction <em>Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.UpdateAction
	 * @generated
	 */
	EClass getUpdateAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction#getElementForUpdate <em>Element For Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element For Update</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.UpdateAction#getElementForUpdate()
	 * @see #getUpdateAction()
	 * @generated
	 */
	EReference getUpdateAction_ElementForUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.UpdateAction#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Value</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.UpdateAction#getNewValue()
	 * @see #getUpdateAction()
	 * @generated
	 */
	EReference getUpdateAction_NewValue();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction <em>Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Action</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ReturnAction
	 * @generated
	 */
	EClass getReturnAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ReturnAction#getStatus()
	 * @see #getReturnAction()
	 * @generated
	 */
	EReference getReturnAction_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ReturnAction#getMetadata()
	 * @see #getReturnAction()
	 * @generated
	 */
	EReference getReturnAction_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.ReturnAction#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ReturnAction#getRepresentation()
	 * @see #getReturnAction()
	 * @generated
	 */
	EReference getReturnAction_Representation();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Code</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.StatusCode
	 * @generated
	 */
	EClass getStatusCode();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.restbehavior.StatusCode#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.StatusCode#getNumber()
	 * @see #getStatusCode()
	 * @generated
	 */
	EAttribute getStatusCode_Number();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.restbehavior.Constant#getStringRepresentation <em>String Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Representation</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Constant#getStringRepresentation()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_StringRepresentation();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Op</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getFirstOp()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_FirstOp();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Op</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getSecondOp()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_SecondOp();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Optype</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinaryOperation#getOptype()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Optype();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.OpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Type</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.OpType
	 * @generated
	 */
	EClass getOpType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.OpType#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.OpType#getResultType()
	 * @see #getOpType()
	 * @generated
	 */
	EReference getOpType_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link de.van_porten.vrest.core.model.restbehavior.OpType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.OpType#getName()
	 * @see #getOpType()
	 * @generated
	 */
	EAttribute getOpType_Name();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.BinOpType <em>Bin Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Op Type</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinOpType
	 * @generated
	 */
	EClass getBinOpType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.BinOpType#getFirstOpType <em>First Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Op Type</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinOpType#getFirstOpType()
	 * @see #getBinOpType()
	 * @generated
	 */
	EReference getBinOpType_FirstOpType();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.BinOpType#getSecondOpType <em>Second Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Op Type</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.BinOpType#getSecondOpType()
	 * @see #getBinOpType()
	 * @generated
	 */
	EReference getBinOpType_SecondOpType();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.AttributeReference <em>Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.AttributeReference
	 * @generated
	 */
	EClass getAttributeReference();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.AttributeReference#getReferencedAttribute <em>Referenced Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Attribute</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.AttributeReference#getReferencedAttribute()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EReference getAttributeReference_ReferencedAttribute();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference <em>Internal Link Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalLinkReference
	 * @generated
	 */
	EClass getInternalLinkReference();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedLink <em>Referenced Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Link</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedLink()
	 * @see #getInternalLinkReference()
	 * @generated
	 */
	EReference getInternalLinkReference_ReferencedLink();

	/**
	 * Returns the meta object for the containment reference '{@link de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedReference <em>Referenced Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.InternalLinkReference#getReferencedReference()
	 * @see #getInternalLinkReference()
	 * @generated
	 */
	EReference getInternalLinkReference_ReferencedReference();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.WritableReference <em>Writable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writable Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.WritableReference
	 * @generated
	 */
	EClass getWritableReference();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.MTReference <em>MT Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MTReference
	 * @generated
	 */
	EClass getMTReference();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference <em>MT Link Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Link Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MTLinkReference
	 * @generated
	 */
	EClass getMTLinkReference();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.MTLinkReference#getReferencedMTLink <em>Referenced MT Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced MT Link</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MTLinkReference#getReferencedMTLink()
	 * @see #getMTLinkReference()
	 * @generated
	 */
	EReference getMTLinkReference_ReferencedMTLink();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.MtElementReference <em>Mt Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mt Element Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MtElementReference
	 * @generated
	 */
	EClass getMtElementReference();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.MtElementReference#getReferencedMTElement <em>Referenced MT Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced MT Element</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.MtElementReference#getReferencedMTElement()
	 * @see #getMtElementReference()
	 * @generated
	 */
	EReference getMtElementReference_ReferencedMTElement();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.DeletedState <em>Deleted State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted State</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.DeletedState
	 * @generated
	 */
	EClass getDeletedState();

	/**
	 * Returns the meta object for class '{@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference <em>External Link Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link Reference</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference
	 * @generated
	 */
	EClass getExternalLinkReference();

	/**
	 * Returns the meta object for the reference '{@link de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference#getReferencedExternalLink <em>Referenced External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced External Link</em>'.
	 * @see de.van_porten.vrest.core.model.restbehavior.ExternalLinkReference#getReferencedExternalLink()
	 * @see #getExternalLinkReference()
	 * @generated
	 */
	EReference getExternalLinkReference_ReferencedExternalLink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestBehaviorFactory getRestBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl <em>Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.CreatorImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getCreator()
		 * @generated
		 */
		EClass CREATOR = eINSTANCE.getCreator();

		/**
		 * The meta object literal for the '<em><b>Consumed MT</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATOR__CONSUMED_MT = eINSTANCE.getCreator_ConsumedMT();

		/**
		 * The meta object literal for the '<em><b>Creator Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATOR__CREATOR_PARAMS = eINSTANCE.getCreator_CreatorParams();

		/**
		 * The meta object literal for the '<em><b>Createbehavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATOR__CREATEBEHAVIOR = eINSTANCE.getCreator_Createbehavior();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.BehaviorSpecificationImpl <em>Behavior Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.BehaviorSpecificationImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getBehaviorSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_SPECIFICATION = eINSTANCE.getBehaviorSpecification();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SPECIFICATION__ACTION = eINSTANCE.getBehaviorSpecification_Action();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.StateImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Entering</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTERING = eINSTANCE.getState_Entering();

		/**
		 * The meta object literal for the '<em><b>Leaving</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LEAVING = eINSTANCE.getState_Leaving();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Supported Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUPPORTED_METHODS = eINSTANCE.getState_SupportedMethods();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.TransitionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.TriggerImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ConditionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION_EXPR = eINSTANCE.getCondition_ConditionExpr();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.InternalMessageImpl <em>Internal Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.InternalMessageImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getInternalMessage()
		 * @generated
		 */
		EClass INTERNAL_MESSAGE = eINSTANCE.getInternalMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_MESSAGE__NAME = eINSTANCE.getInternalMessage_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MessageActionImpl <em>Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.MessageActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMessageAction()
		 * @generated
		 */
		EClass MESSAGE_ACTION = eINSTANCE.getMessageAction();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_ACTION__MESSAGE = eINSTANCE.getMessageAction_Message();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getConditionalAction()
		 * @generated
		 */
		EClass CONDITIONAL_ACTION = eINSTANCE.getConditionalAction();

		/**
		 * The meta object literal for the '<em><b>Action Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ACTION__ACTION_CONDITION = eINSTANCE.getConditionalAction_ActionCondition();

		/**
		 * The meta object literal for the '<em><b>Action If True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ACTION__ACTION_IF_TRUE = eINSTANCE.getConditionalAction_ActionIfTrue();

		/**
		 * The meta object literal for the '<em><b>Action If False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ACTION__ACTION_IF_FALSE = eINSTANCE.getConditionalAction_ActionIfFalse();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.CreateActionImpl <em>Create Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.CreateActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getCreateAction()
		 * @generated
		 */
		EClass CREATE_ACTION = eINSTANCE.getCreateAction();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ACTION__CREATOR = eINSTANCE.getCreateAction_Creator();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ListAddActionImpl <em>List Add Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ListAddActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getListAddAction()
		 * @generated
		 */
		EClass LIST_ADD_ACTION = eINSTANCE.getListAddAction();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ListRemoveActionImpl <em>List Remove Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ListRemoveActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getListRemoveAction()
		 * @generated
		 */
		EClass LIST_REMOVE_ACTION = eINSTANCE.getListRemoveAction();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ActionSequenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getActionSequence()
		 * @generated
		 */
		EClass ACTION_SEQUENCE = eINSTANCE.getActionSequence();

		/**
		 * The meta object literal for the '<em><b>Actionelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SEQUENCE__ACTIONELEMENTS = eINSTANCE.getActionSequence_Actionelements();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.UpdateActionImpl <em>Update Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.UpdateActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getUpdateAction()
		 * @generated
		 */
		EClass UPDATE_ACTION = eINSTANCE.getUpdateAction();

		/**
		 * The meta object literal for the '<em><b>Element For Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ACTION__ELEMENT_FOR_UPDATE = eINSTANCE.getUpdateAction_ElementForUpdate();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ACTION__NEW_VALUE = eINSTANCE.getUpdateAction_NewValue();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl <em>Return Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ReturnActionImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getReturnAction()
		 * @generated
		 */
		EClass RETURN_ACTION = eINSTANCE.getReturnAction();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ACTION__STATUS = eINSTANCE.getReturnAction_Status();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ACTION__METADATA = eINSTANCE.getReturnAction_Metadata();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ACTION__REPRESENTATION = eINSTANCE.getReturnAction_Representation();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.StatusCodeImpl <em>Status Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.StatusCodeImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getStatusCode()
		 * @generated
		 */
		EClass STATUS_CODE = eINSTANCE.getStatusCode();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CODE__NUMBER = eINSTANCE.getStatusCode_Number();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.MetadataImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ValueImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ConstantImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>String Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__STRING_REPRESENTATION = eINSTANCE.getConstant_StringRepresentation();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.OperationImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>First Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__FIRST_OP = eINSTANCE.getBinaryOperation_FirstOp();

		/**
		 * The meta object literal for the '<em><b>Second Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__SECOND_OP = eINSTANCE.getBinaryOperation_SecondOp();

		/**
		 * The meta object literal for the '<em><b>Optype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__OPTYPE = eINSTANCE.getBinaryOperation_Optype();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.OpTypeImpl <em>Op Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.OpTypeImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getOpType()
		 * @generated
		 */
		EClass OP_TYPE = eINSTANCE.getOpType();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_TYPE__RESULT_TYPE = eINSTANCE.getOpType_ResultType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_TYPE__NAME = eINSTANCE.getOpType_Name();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.BinOpTypeImpl <em>Bin Op Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.BinOpTypeImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getBinOpType()
		 * @generated
		 */
		EClass BIN_OP_TYPE = eINSTANCE.getBinOpType();

		/**
		 * The meta object literal for the '<em><b>First Op Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP_TYPE__FIRST_OP_TYPE = eINSTANCE.getBinOpType_FirstOpType();

		/**
		 * The meta object literal for the '<em><b>Second Op Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP_TYPE__SECOND_OP_TYPE = eINSTANCE.getBinOpType_SecondOpType();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.AttributeReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getAttributeReference()
		 * @generated
		 */
		EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE = eINSTANCE.getAttributeReference_ReferencedAttribute();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.InternalLinkReferenceImpl <em>Internal Link Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.InternalLinkReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getInternalLinkReference()
		 * @generated
		 */
		EClass INTERNAL_LINK_REFERENCE = eINSTANCE.getInternalLinkReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK_REFERENCE__REFERENCED_LINK = eINSTANCE.getInternalLinkReference_ReferencedLink();

		/**
		 * The meta object literal for the '<em><b>Referenced Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK_REFERENCE__REFERENCED_REFERENCE = eINSTANCE.getInternalLinkReference_ReferencedReference();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.WritableReferenceImpl <em>Writable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.WritableReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getWritableReference()
		 * @generated
		 */
		EClass WRITABLE_REFERENCE = eINSTANCE.getWritableReference();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MTReferenceImpl <em>MT Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.MTReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMTReference()
		 * @generated
		 */
		EClass MT_REFERENCE = eINSTANCE.getMTReference();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MTLinkReferenceImpl <em>MT Link Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.MTLinkReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMTLinkReference()
		 * @generated
		 */
		EClass MT_LINK_REFERENCE = eINSTANCE.getMTLinkReference();

		/**
		 * The meta object literal for the '<em><b>Referenced MT Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_LINK_REFERENCE__REFERENCED_MT_LINK = eINSTANCE.getMTLinkReference_ReferencedMTLink();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.MtElementReferenceImpl <em>Mt Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.MtElementReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getMtElementReference()
		 * @generated
		 */
		EClass MT_ELEMENT_REFERENCE = eINSTANCE.getMtElementReference();

		/**
		 * The meta object literal for the '<em><b>Referenced MT Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_ELEMENT_REFERENCE__REFERENCED_MT_ELEMENT = eINSTANCE.getMtElementReference_ReferencedMTElement();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.DeletedStateImpl <em>Deleted State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.DeletedStateImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getDeletedState()
		 * @generated
		 */
		EClass DELETED_STATE = eINSTANCE.getDeletedState();

		/**
		 * The meta object literal for the '{@link de.van_porten.vrest.core.model.restbehavior.impl.ExternalLinkReferenceImpl <em>External Link Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.ExternalLinkReferenceImpl
		 * @see de.van_porten.vrest.core.model.restbehavior.impl.RestBehaviorPackageImpl#getExternalLinkReference()
		 * @generated
		 */
		EClass EXTERNAL_LINK_REFERENCE = eINSTANCE.getExternalLinkReference();

		/**
		 * The meta object literal for the '<em><b>Referenced External Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_LINK_REFERENCE__REFERENCED_EXTERNAL_LINK = eINSTANCE.getExternalLinkReference_ReferencedExternalLink();

	}

} //RestBehaviorPackage
