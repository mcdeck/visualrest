/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.reststructure.ResourceType;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class ResourceTypeTest extends TestCase {

	/**
	 * The fixture for this Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceType fixture = null;

	/**
	 * Constructs a new Resource Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceType getFixture() {
		return fixture;
	}

	public void testGenericAddRemoveState() {
		State state = RestBehaviorFactory.eINSTANCE.createState();
		assertThat(getFixture().getStates().size(), is(0));

		getFixture().getStates().add(state);
		assertThat(getFixture().getStates().size(), is(1));

		getFixture().getStates().remove(state);
		assertThat(getFixture().getStates().size(), is(0));
	}

	public void testGenericAddContainsStates() {
		State state1 = RestBehaviorFactory.eINSTANCE.createState();
		State state2 = RestBehaviorFactory.eINSTANCE.createState();
		assertThat(getFixture().getStates().size(), is(0));

		getFixture().getStates().add(state1);
		getFixture().getStates().add(state2);
		assertThat(getFixture().getStates().size(), is(2));

		assertThat(getFixture().getStates().contains(state1), is(true));
		assertThat(getFixture().getStates().contains(state2), is(true));
	}

	public void testGenericSetInitialState() {
		State state = RestBehaviorFactory.eINSTANCE.createState();
		assertThat(getFixture().getInitialState(), is(nullValue()));

		getFixture().setInitialState(state);

		assertThat(getFixture().getInitialState(), is(state));
	}
} //ResourceTypeTest
