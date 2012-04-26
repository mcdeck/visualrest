/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.tests.core.model;

import de.van_porten.vrest.core.model.rest.tests.RestTests;
import de.van_porten.vrest.core.model.restbehavior.tests.RestBehaviorTests;
import de.van_porten.vrest.core.model.reststructure.tests.RestStructureTests;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Rest</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestAllTests extends TestSuite {

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
		TestSuite suite = new RestAllTests("Rest Tests");
		suite.addTest(RestTests.suite());
		suite.addTest(RestBehaviorTests.suite());
		suite.addTest(RestStructureTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAllTests(String name) {
		super(name);
	}

} //RestAllTests
