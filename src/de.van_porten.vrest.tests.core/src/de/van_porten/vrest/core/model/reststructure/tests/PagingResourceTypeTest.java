/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.tests;

import de.van_porten.vrest.core.model.reststructure.PagingResourceType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paging Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagingResourceTypeTest extends ResourceTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagingResourceTypeTest.class);
	}

	/**
	 * Constructs a new Paging Resource Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagingResourceTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Paging Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PagingResourceType getFixture() {
		return (PagingResourceType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestStructureFactory.eINSTANCE.createPagingResourceType());
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
} //PagingResourceTypeTest
