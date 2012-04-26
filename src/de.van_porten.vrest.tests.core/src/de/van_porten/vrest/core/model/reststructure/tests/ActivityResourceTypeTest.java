/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.tests;

import de.van_porten.vrest.core.model.reststructure.ActivityResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityResourceTypeTest extends ResourceTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityResourceTypeTest.class);
	}

	/**
	 * Constructs a new Activity Resource Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityResourceTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActivityResourceType getFixture() {
		return (ActivityResourceType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestStructureFactory.eINSTANCE.createActivityResourceType());
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
} //ActivityResourceTypeTest
