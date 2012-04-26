/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>reststructure</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestStructureTests extends TestSuite {

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
		TestSuite suite = new RestStructureTests("reststructure Tests");
		Class<?>[] testClasses = {
				ActivityResourceTypeTest.class,
				AggregationResourceTypeTest.class,
				AttributeTest.class,
				CollectionTypeTest.class,
				ComplexIdentifierPatternTest.class,
				// DataTypeTest.class,
				ExternalLinkCollectionTest.class,
				ExternalLinkTest.class,
				FilterResourceTypeTest.class,
				InternalLinkCollectionTest.class,
				InternalLinkTest.class,
				LinkCollectionTest.class,
				//LinkTest.class,
				ListResourceTypeTest.class,
				MediaTypeElementTest.class,
				MediaTypeLinkCollectionTest.class,
				MediaTypeLinkTest.class,
				MediaTypeTest.class,
				MethodTest.class,
				MethodTypeTest.class,
				PagingResourceTypeTest.class,
				ParameterTest.class,
				PrimaryResourceTypeTest.class,
				PrimitiveDataTypeTest.class,
				ProjectionResourceTypeTest.class,
				RelationTypeTest.class,
				RepresentationElementTest.class,
				RepresentationLinkCollectionTest.class,
				RepresentationLinkTest.class,
				RepresentationTest.class,
				// ResourceElementTest.class,
				// ResourceIdentifierPatternTest.class,
				// ResourceTypeTest.class,
				SimpleIdentifierTest.class,
				SubresourceTypeTest.class
		};
		suite.addTest(new TestSuite(testClasses));
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestStructureTests(String name) {
		super(name);
	}

} //RestStructureTests
