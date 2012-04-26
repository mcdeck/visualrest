/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.tests;

import de.van_porten.vrest.core.model.reststructure.CollectionType;
import de.van_porten.vrest.core.model.reststructure.RestStructureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionTypeTest extends DataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectionTypeTest.class);
	}

	/**
	 * Constructs a new Collection Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collection Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollectionType getFixture() {
		return (CollectionType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestStructureFactory.eINSTANCE.createCollectionType());
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
} //CollectionTypeTest
