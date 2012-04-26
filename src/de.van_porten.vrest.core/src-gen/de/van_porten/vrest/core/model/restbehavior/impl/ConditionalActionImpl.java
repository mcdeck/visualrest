/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.Action;
import de.van_porten.vrest.core.model.restbehavior.Condition;
import de.van_porten.vrest.core.model.restbehavior.ConditionalAction;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl#getActionCondition <em>Action Condition</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl#getActionIfTrue <em>Action If True</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.ConditionalActionImpl#getActionIfFalse <em>Action If False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalActionImpl extends ActionImpl implements ConditionalAction {
	/**
	 * The cached value of the '{@link #getActionCondition() <em>Action Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition actionCondition;

	/**
	 * The cached value of the '{@link #getActionIfTrue() <em>Action If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIfTrue()
	 * @generated
	 * @ordered
	 */
	protected Action actionIfTrue;

	/**
	 * The cached value of the '{@link #getActionIfFalse() <em>Action If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIfFalse()
	 * @generated
	 * @ordered
	 */
	protected Action actionIfFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.CONDITIONAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getActionCondition() {
		return actionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionCondition(Condition newActionCondition, NotificationChain msgs) {
		Condition oldActionCondition = actionCondition;
		actionCondition = newActionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION, oldActionCondition, newActionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionCondition(Condition newActionCondition) {
		if (newActionCondition != actionCondition) {
			NotificationChain msgs = null;
			if (actionCondition != null)
				msgs = ((InternalEObject)actionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION, null, msgs);
			if (newActionCondition != null)
				msgs = ((InternalEObject)newActionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION, null, msgs);
			msgs = basicSetActionCondition(newActionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION, newActionCondition, newActionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionIfTrue() {
		return actionIfTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIfTrue(Action newActionIfTrue, NotificationChain msgs) {
		Action oldActionIfTrue = actionIfTrue;
		actionIfTrue = newActionIfTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE, oldActionIfTrue, newActionIfTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIfTrue(Action newActionIfTrue) {
		if (newActionIfTrue != actionIfTrue) {
			NotificationChain msgs = null;
			if (actionIfTrue != null)
				msgs = ((InternalEObject)actionIfTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE, null, msgs);
			if (newActionIfTrue != null)
				msgs = ((InternalEObject)newActionIfTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE, null, msgs);
			msgs = basicSetActionIfTrue(newActionIfTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE, newActionIfTrue, newActionIfTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionIfFalse() {
		return actionIfFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIfFalse(Action newActionIfFalse, NotificationChain msgs) {
		Action oldActionIfFalse = actionIfFalse;
		actionIfFalse = newActionIfFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE, oldActionIfFalse, newActionIfFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIfFalse(Action newActionIfFalse) {
		if (newActionIfFalse != actionIfFalse) {
			NotificationChain msgs = null;
			if (actionIfFalse != null)
				msgs = ((InternalEObject)actionIfFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE, null, msgs);
			if (newActionIfFalse != null)
				msgs = ((InternalEObject)newActionIfFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE, null, msgs);
			msgs = basicSetActionIfFalse(newActionIfFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE, newActionIfFalse, newActionIfFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION:
				return basicSetActionCondition(null, msgs);
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE:
				return basicSetActionIfTrue(null, msgs);
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE:
				return basicSetActionIfFalse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION:
				return getActionCondition();
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE:
				return getActionIfTrue();
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE:
				return getActionIfFalse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION:
				setActionCondition((Condition)newValue);
				return;
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE:
				setActionIfTrue((Action)newValue);
				return;
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE:
				setActionIfFalse((Action)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION:
				setActionCondition((Condition)null);
				return;
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE:
				setActionIfTrue((Action)null);
				return;
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE:
				setActionIfFalse((Action)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_CONDITION:
				return actionCondition != null;
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_TRUE:
				return actionIfTrue != null;
			case RestBehaviorPackage.CONDITIONAL_ACTION__ACTION_IF_FALSE:
				return actionIfFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalActionImpl
