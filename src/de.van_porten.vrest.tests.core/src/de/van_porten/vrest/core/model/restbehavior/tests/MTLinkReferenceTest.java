/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.tests;

import de.van_porten.vrest.core.model.restbehavior.MTLinkReference;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MT Link Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MTLinkReferenceTest extends MTReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MTLinkReferenceTest.class);
	}

	/**
	 * Constructs a new MT Link Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTLinkReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MT Link Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MTLinkReference getFixture() {
		return (MTLinkReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestBehaviorFactory.eINSTANCE.createMTLinkReference());
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
} //MTLinkReferenceTest
