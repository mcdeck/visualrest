/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.tests;

import junit.textui.TestRunner;
import mockit.Cascading;
import mockit.Mocked;
import mockit.Verifications;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.InternalEObject;

import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorFactory;
import de.van_porten.vrest.core.model.restbehavior.impl.ActionImpl;
import de.van_porten.vrest.core.model.restbehavior.impl.ConditionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalActionTest extends ActionTest {

	@Mocked
	@Cascading
	private ConditionImpl conditionImpl;

	@Mocked
	@Cascading
	private ActionImpl actionIfTrue;

	@Mocked
	@Cascading
	private ActionImpl actionIfFalse;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionalActionTest.class);
	}

	/**
	 * Constructs a new Conditional Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conditional Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConditionalAction getFixture() {
		return (ConditionalAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestBehaviorFactory.eINSTANCE.createConditionalAction());
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


	/* not working at the moment ... */
	public void NO_testMocked() {
		final ConditionalAction conditionalAction = getFixture();

		conditionalAction.setActionCondition(conditionImpl);
		conditionalAction.setActionIfFalse(actionIfTrue);
		conditionalAction.setActionIfFalse(actionIfFalse);

		new Verifications() {
			{
				conditionImpl.eInverseAdd((InternalEObject) conditionalAction, anyInt, (Class<?>)any, (NotificationChain)any);
				times = 1;
				actionIfTrue.eInverseAdd((InternalEObject) conditionalAction, anyInt, (Class<?>)any, (NotificationChain)any);
				times = 1;
				actionIfFalse.eInverseAdd((InternalEObject) conditionalAction, anyInt, (Class<?>)any, (NotificationChain)any);
				times = 1;
			}
		};
	}
} //ConditionalActionTest
