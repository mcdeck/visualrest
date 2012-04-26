/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.restbehavior.impl;

import de.van_porten.vrest.core.model.restbehavior.BinOpType;
import de.van_porten.vrest.core.model.restbehavior.BinaryOperation;
import de.van_porten.vrest.core.model.restbehavior.RestBehaviorPackage;
import de.van_porten.vrest.core.model.restbehavior.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl#getFirstOp <em>First Op</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl#getSecondOp <em>Second Op</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.restbehavior.impl.BinaryOperationImpl#getOptype <em>Optype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryOperationImpl extends OperationImpl implements BinaryOperation {
	/**
	 * The cached value of the '{@link #getFirstOp() <em>First Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOp()
	 * @generated
	 * @ordered
	 */
	protected Value firstOp;

	/**
	 * The cached value of the '{@link #getSecondOp() <em>Second Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOp()
	 * @generated
	 * @ordered
	 */
	protected Value secondOp;

	/**
	 * The cached value of the '{@link #getOptype() <em>Optype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptype()
	 * @generated
	 * @ordered
	 */
	protected BinOpType optype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestBehaviorPackage.Literals.BINARY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getFirstOp() {
		return firstOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstOp(Value newFirstOp, NotificationChain msgs) {
		Value oldFirstOp = firstOp;
		firstOp = newFirstOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BINARY_OPERATION__FIRST_OP, oldFirstOp, newFirstOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOp(Value newFirstOp) {
		if (newFirstOp != firstOp) {
			NotificationChain msgs = null;
			if (firstOp != null)
				msgs = ((InternalEObject)firstOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.BINARY_OPERATION__FIRST_OP, null, msgs);
			if (newFirstOp != null)
				msgs = ((InternalEObject)newFirstOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.BINARY_OPERATION__FIRST_OP, null, msgs);
			msgs = basicSetFirstOp(newFirstOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BINARY_OPERATION__FIRST_OP, newFirstOp, newFirstOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getSecondOp() {
		return secondOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondOp(Value newSecondOp, NotificationChain msgs) {
		Value oldSecondOp = secondOp;
		secondOp = newSecondOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BINARY_OPERATION__SECOND_OP, oldSecondOp, newSecondOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOp(Value newSecondOp) {
		if (newSecondOp != secondOp) {
			NotificationChain msgs = null;
			if (secondOp != null)
				msgs = ((InternalEObject)secondOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.BINARY_OPERATION__SECOND_OP, null, msgs);
			if (newSecondOp != null)
				msgs = ((InternalEObject)newSecondOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestBehaviorPackage.BINARY_OPERATION__SECOND_OP, null, msgs);
			msgs = basicSetSecondOp(newSecondOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BINARY_OPERATION__SECOND_OP, newSecondOp, newSecondOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinOpType getOptype() {
		if (optype != null && optype.eIsProxy()) {
			InternalEObject oldOptype = (InternalEObject)optype;
			optype = (BinOpType)eResolveProxy(oldOptype);
			if (optype != oldOptype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestBehaviorPackage.BINARY_OPERATION__OPTYPE, oldOptype, optype));
			}
		}
		return optype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinOpType basicGetOptype() {
		return optype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptype(BinOpType newOptype) {
		BinOpType oldOptype = optype;
		optype = newOptype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestBehaviorPackage.BINARY_OPERATION__OPTYPE, oldOptype, optype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestBehaviorPackage.BINARY_OPERATION__FIRST_OP:
				return basicSetFirstOp(null, msgs);
			case RestBehaviorPackage.BINARY_OPERATION__SECOND_OP:
				return basicSetSecondOp(null, msgs);
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
			case RestBehaviorPackage.BINARY_OPERATION__FIRST_OP:
				return getFirstOp();
			case RestBehaviorPackage.BINARY_OPERATION__SECOND_OP:
				return getSecondOp();
			case RestBehaviorPackage.BINARY_OPERATION__OPTYPE:
				if (resolve) return getOptype();
				return basicGetOptype();
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
			case RestBehaviorPackage.BINARY_OPERATION__FIRST_OP:
				setFirstOp((Value)newValue);
				return;
			case RestBehaviorPackage.BINARY_OPERATION__SECOND_OP:
				setSecondOp((Value)newValue);
				return;
			case RestBehaviorPackage.BINARY_OPERATION__OPTYPE:
				setOptype((BinOpType)newValue);
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
			case RestBehaviorPackage.BINARY_OPERATION__FIRST_OP:
				setFirstOp((Value)null);
				return;
			case RestBehaviorPackage.BINARY_OPERATION__SECOND_OP:
				setSecondOp((Value)null);
				return;
			case RestBehaviorPackage.BINARY_OPERATION__OPTYPE:
				setOptype((BinOpType)null);
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
			case RestBehaviorPackage.BINARY_OPERATION__FIRST_OP:
				return firstOp != null;
			case RestBehaviorPackage.BINARY_OPERATION__SECOND_OP:
				return secondOp != null;
			case RestBehaviorPackage.BINARY_OPERATION__OPTYPE:
				return optype != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryOperationImpl
