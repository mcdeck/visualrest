/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>restbehavior</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestBehaviorTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RestBehaviorTests("restbehavior Tests");
		Class<?>[] testClasses = {
				ActionSequenceTest.class,
				// ActionTest.class,
				AttributeReferenceTest.class,
				BehaviorSpecificationTest.class,
				BinaryOperationTest.class,
				BinOpTypeTest.class,
				ConditionalActionTest.class,
				ConditionTest.class,
				ConstantTest.class,
				CreateActionTest.class,
				CreatorTest.class,
				DeletedStateTest.class,
				ExternalLinkReferenceTest.class,
				InternalLinkReferenceTest.class,
				InternalMessageTest.class,
				ListAddActionTest.class,
				ListRemoveActionTest.class,
			    MessageActionTest.class,
			    MetadataTest.class,
			    MtElementReferenceTest.class,
			    MTLinkReferenceTest.class,
			    // MTReferenceTest.class,
			    // OperationTest.class,
			    // OpTypeTest.class,
			    // ReferenceTest.class,
			    ReturnActionTest.class,
			    StateTest.class,
			    StatusCodeTest.class,
			    TransitionTest.class,
			    // TriggerTest.class,
			    UpdateActionTest.class,
			    // ValueTest.class,
			    // WritableReferenceTest.class
		};
		suite.addTest(new TestSuite(testClasses));
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBehaviorTests(String name) {
		super(name);
	}

} //RestBehaviorTests
