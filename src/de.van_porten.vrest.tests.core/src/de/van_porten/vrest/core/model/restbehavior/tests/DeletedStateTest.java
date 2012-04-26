/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.tests;

import de.van_porten.vrest.core.model.restbehavior.DeletedState;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deleted State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeletedStateTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeletedStateTest.class);
	}

	/**
	 * Constructs a new Deleted State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletedStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deleted State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeletedState getFixture() {
		return (DeletedState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestBehaviorFactory.eINSTANCE.createDeletedState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	public void testDummy() {

	}
} //DeletedStateTest
