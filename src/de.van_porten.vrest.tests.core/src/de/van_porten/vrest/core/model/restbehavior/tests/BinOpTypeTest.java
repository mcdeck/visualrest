/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.tests;

import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bin Op Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinOpTypeTest extends OpTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinOpTypeTest.class);
	}

	/**
	 * Constructs a new Bin Op Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinOpTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bin Op Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinOpType getFixture() {
		return (BinOpType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestBehaviorFactory.eINSTANCE.createBinOpType());
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
} //BinOpTypeTest
