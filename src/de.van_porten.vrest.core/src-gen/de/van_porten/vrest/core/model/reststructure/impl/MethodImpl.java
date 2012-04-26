/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.restbehavior.BehaviorSpecification;

import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.Parameter;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl#getConsumed <em>Consumed</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl#getProduced <em>Produced</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl#getMethodtype <em>Methodtype</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl#getMethodbehavior <em>Methodbehavior</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.MethodImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends EObjectImpl implements Method {
	/**
	 * The cached value of the '{@link #getConsumed() <em>Consumed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumed()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaType> consumed;

	/**
	 * The cached value of the '{@link #getProduced() <em>Produced</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduced()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaType> produced;

	/**
	 * The cached value of the '{@link #getMethodtype() <em>Methodtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodtype()
	 * @generated
	 * @ordered
	 */
	protected MethodType methodtype;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getMethodbehavior() <em>Methodbehavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodbehavior()
	 * @generated
	 * @ordered
	 */
	protected BehaviorSpecification methodbehavior;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaType> getConsumed() {
		if (consumed == null) {
			consumed = new EObjectResolvingEList<MediaType>(MediaType.class, this, RestStructurePackage.METHOD__CONSUMED);
		}
		return consumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaType> getProduced() {
		if (produced == null) {
			produced = new EObjectResolvingEList<MediaType>(MediaType.class, this, RestStructurePackage.METHOD__PRODUCED);
		}
		return produced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType getMethodtype() {
		if (methodtype != null && methodtype.eIsProxy()) {
			InternalEObject oldMethodtype = (InternalEObject)methodtype;
			methodtype = (MethodType)eResolveProxy(oldMethodtype);
			if (methodtype != oldMethodtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.METHOD__METHODTYPE, oldMethodtype, methodtype));
			}
		}
		return methodtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType basicGetMethodtype() {
		return methodtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodtype(MethodType newMethodtype) {
		MethodType oldMethodtype = methodtype;
		methodtype = newMethodtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.METHOD__METHODTYPE, oldMethodtype, methodtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RestStructurePackage.METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSpecification getMethodbehavior() {
		return methodbehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodbehavior(BehaviorSpecification newMethodbehavior, NotificationChain msgs) {
		BehaviorSpecification oldMethodbehavior = methodbehavior;
		methodbehavior = newMethodbehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestStructurePackage.METHOD__METHODBEHAVIOR, oldMethodbehavior, newMethodbehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodbehavior(BehaviorSpecification newMethodbehavior) {
		if (newMethodbehavior != methodbehavior) {
			NotificationChain msgs = null;
			if (methodbehavior != null)
				msgs = ((InternalEObject)methodbehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestStructurePackage.METHOD__METHODBEHAVIOR, null, msgs);
			if (newMethodbehavior != null)
				msgs = ((InternalEObject)newMethodbehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestStructurePackage.METHOD__METHODBEHAVIOR, null, msgs);
			msgs = basicSetMethodbehavior(newMethodbehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.METHOD__METHODBEHAVIOR, newMethodbehavior, newMethodbehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestStructurePackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.METHOD__METHODBEHAVIOR:
				return basicSetMethodbehavior(null, msgs);
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
			case RestStructurePackage.METHOD__CONSUMED:
				return getConsumed();
			case RestStructurePackage.METHOD__PRODUCED:
				return getProduced();
			case RestStructurePackage.METHOD__METHODTYPE:
				if (resolve) return getMethodtype();
				return basicGetMethodtype();
			case RestStructurePackage.METHOD__PARAMETERS:
				return getParameters();
			case RestStructurePackage.METHOD__METHODBEHAVIOR:
				return getMethodbehavior();
			case RestStructurePackage.METHOD__NAME:
				return getName();
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
			case RestStructurePackage.METHOD__CONSUMED:
				getConsumed().clear();
				getConsumed().addAll((Collection<? extends MediaType>)newValue);
				return;
			case RestStructurePackage.METHOD__PRODUCED:
				getProduced().clear();
				getProduced().addAll((Collection<? extends MediaType>)newValue);
				return;
			case RestStructurePackage.METHOD__METHODTYPE:
				setMethodtype((MethodType)newValue);
				return;
			case RestStructurePackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RestStructurePackage.METHOD__METHODBEHAVIOR:
				setMethodbehavior((BehaviorSpecification)newValue);
				return;
			case RestStructurePackage.METHOD__NAME:
				setName((String)newValue);
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
			case RestStructurePackage.METHOD__CONSUMED:
				getConsumed().clear();
				return;
			case RestStructurePackage.METHOD__PRODUCED:
				getProduced().clear();
				return;
			case RestStructurePackage.METHOD__METHODTYPE:
				setMethodtype((MethodType)null);
				return;
			case RestStructurePackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case RestStructurePackage.METHOD__METHODBEHAVIOR:
				setMethodbehavior((BehaviorSpecification)null);
				return;
			case RestStructurePackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
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
			case RestStructurePackage.METHOD__CONSUMED:
				return consumed != null && !consumed.isEmpty();
			case RestStructurePackage.METHOD__PRODUCED:
				return produced != null && !produced.isEmpty();
			case RestStructurePackage.METHOD__METHODTYPE:
				return methodtype != null;
			case RestStructurePackage.METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RestStructurePackage.METHOD__METHODBEHAVIOR:
				return methodbehavior != null;
			case RestStructurePackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //MethodImpl
