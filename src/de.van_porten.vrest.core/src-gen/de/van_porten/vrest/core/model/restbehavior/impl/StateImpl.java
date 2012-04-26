/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.State;
import de.van_porten.vrest.core.model.restbehavior.Transition;

import de.van_porten.vrest.core.model.reststructure.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl#getEntering <em>Entering</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl#getLeaving <em>Leaving</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.StateImpl#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The cached value of the '{@link #getEntering() <em>Entering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntering()
	 * @generated
	 * @ordered
	 */
	protected BehaviorSpecification entering;

	/**
	 * The cached value of the '{@link #getLeaving() <em>Leaving</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaving()
	 * @generated
	 * @ordered
	 */
	protected BehaviorSpecification leaving;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedMethods() <em>Supported Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> supportedMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSpecification getEntering() {
		return entering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntering(BehaviorSpecification newEntering, NotificationChain msgs) {
		BehaviorSpecification oldEntering = entering;
		entering = newEntering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.STATE__ENTERING, oldEntering, newEntering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntering(BehaviorSpecification newEntering) {
		if (newEntering != entering) {
			NotificationChain msgs = null;
			if (entering != null)
				msgs = ((InternalEObject)entering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.STATE__ENTERING, null, msgs);
			if (newEntering != null)
				msgs = ((InternalEObject)newEntering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.STATE__ENTERING, null, msgs);
			msgs = basicSetEntering(newEntering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.STATE__ENTERING, newEntering, newEntering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSpecification getLeaving() {
		return leaving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaving(BehaviorSpecification newLeaving, NotificationChain msgs) {
		BehaviorSpecification oldLeaving = leaving;
		leaving = newLeaving;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.STATE__LEAVING, oldLeaving, newLeaving);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaving(BehaviorSpecification newLeaving) {
		if (newLeaving != leaving) {
			NotificationChain msgs = null;
			if (leaving != null)
				msgs = ((InternalEObject)leaving).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.STATE__LEAVING, null, msgs);
			if (newLeaving != null)
				msgs = ((InternalEObject)newLeaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.STATE__LEAVING, null, msgs);
			msgs = basicSetLeaving(newLeaving, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.STATE__LEAVING, newLeaving, newLeaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, RestBehaviorPackage.STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getSupportedMethods() {
		if (supportedMethods == null) {
			supportedMethods = new EObjectResolvingEList<Method>(Method.class, this, RestBehaviorPackage.STATE__SUPPORTED_METHODS);
		}
		return supportedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.STATE__ENTERING:
				return basicSetEntering(null, msgs);
			case RestBehaviorPackage.STATE__LEAVING:
				return basicSetLeaving(null, msgs);
			case RestBehaviorPackage.STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case RestBehaviorPackage.STATE__ENTERING:
				return getEntering();
			case RestBehaviorPackage.STATE__LEAVING:
				return getLeaving();
			case RestBehaviorPackage.STATE__TRANSITIONS:
				return getTransitions();
			case RestBehaviorPackage.STATE__NAME:
				return getName();
			case RestBehaviorPackage.STATE__SUPPORTED_METHODS:
				return getSupportedMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestBehaviorPackage.STATE__ENTERING:
				setEntering((BehaviorSpecification)newValue);
				return;
			case RestBehaviorPackage.STATE__LEAVING:
				setLeaving((BehaviorSpecification)newValue);
				return;
			case RestBehaviorPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RestBehaviorPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case RestBehaviorPackage.STATE__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				getSupportedMethods().addAll((Collection<? extends Method>)newValue);
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
			case RestBehaviorPackage.STATE__ENTERING:
				setEntering((BehaviorSpecification)null);
				return;
			case RestBehaviorPackage.STATE__LEAVING:
				setLeaving((BehaviorSpecification)null);
				return;
			case RestBehaviorPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				return;
			case RestBehaviorPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestBehaviorPackage.STATE__SUPPORTED_METHODS:
				getSupportedMethods().clear();
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
			case RestBehaviorPackage.STATE__ENTERING:
				return entering != null;
			case RestBehaviorPackage.STATE__LEAVING:
				return leaving != null;
			case RestBehaviorPackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RestBehaviorPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestBehaviorPackage.STATE__SUPPORTED_METHODS:
				return supportedMethods != null && !supportedMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
