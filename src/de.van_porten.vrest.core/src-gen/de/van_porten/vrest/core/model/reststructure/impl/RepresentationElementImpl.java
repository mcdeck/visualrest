/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.restbehavior.Value;

import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaTypeElement;
import de.van_porten.vrest.core.model.reststructure.RepresentationElement;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl#getCorrespondingElement <em>Corresponding Element</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl#getRepElemType <em>Rep Elem Type</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.RepresentationElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationElementImpl extends EObjectImpl implements RepresentationElement {
	/**
	 * The cached value of the '{@link #getCorrespondingElement() <em>Corresponding Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingElement()
	 * @generated
	 * @ordered
	 */
	protected MediaTypeElement correspondingElement;

	/**
	 * The cached value of the '{@link #getRepElemType() <em>Rep Elem Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepElemType()
	 * @generated
	 * @ordered
	 */
	protected DataType repElemType;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.REPRESENTATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeElement getCorrespondingElement() {
		if (correspondingElement != null && correspondingElement.eIsProxy()) {
			InternalEObject oldCorrespondingElement = (InternalEObject)correspondingElement;
			correspondingElement = (MediaTypeElement)eResolveProxy(oldCorrespondingElement);
			if (correspondingElement != oldCorrespondingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT, oldCorrespondingElement, correspondingElement));
			}
		}
		return correspondingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeElement basicGetCorrespondingElement() {
		return correspondingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingElement(MediaTypeElement newCorrespondingElement) {
		MediaTypeElement oldCorrespondingElement = correspondingElement;
		correspondingElement = newCorrespondingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT, oldCorrespondingElement, correspondingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRepElemType() {
		if (repElemType != null && repElemType.eIsProxy()) {
			InternalEObject oldRepElemType = (InternalEObject)repElemType;
			repElemType = (DataType)eResolveProxy(oldRepElemType);
			if (repElemType != oldRepElemType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.REPRESENTATION_ELEMENT__REP_ELEM_TYPE, oldRepElemType, repElemType));
			}
		}
		return repElemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetRepElemType() {
		return repElemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepElemType(DataType newRepElemType) {
		DataType oldRepElemType = repElemType;
		repElemType = newRepElemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_ELEMENT__REP_ELEM_TYPE, oldRepElemType, repElemType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_ELEMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestStructurePackage.REPRESENTATION_ELEMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestStructurePackage.REPRESENTATION_ELEMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.REPRESENTATION_ELEMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestStructurePackage.REPRESENTATION_ELEMENT__VALUE:
				return basicSetValue(null, msgs);
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
			case RestStructurePackage.REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT:
				if (resolve) return getCorrespondingElement();
				return basicGetCorrespondingElement();
			case RestStructurePackage.REPRESENTATION_ELEMENT__REP_ELEM_TYPE:
				if (resolve) return getRepElemType();
				return basicGetRepElemType();
			case RestStructurePackage.REPRESENTATION_ELEMENT__NAME:
				return getName();
			case RestStructurePackage.REPRESENTATION_ELEMENT__VALUE:
				return getValue();
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
			case RestStructurePackage.REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT:
				setCorrespondingElement((MediaTypeElement)newValue);
				return;
			case RestStructurePackage.REPRESENTATION_ELEMENT__REP_ELEM_TYPE:
				setRepElemType((DataType)newValue);
				return;
			case RestStructurePackage.REPRESENTATION_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case RestStructurePackage.REPRESENTATION_ELEMENT__VALUE:
				setValue((Value)newValue);
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
			case RestStructurePackage.REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT:
				setCorrespondingElement((MediaTypeElement)null);
				return;
			case RestStructurePackage.REPRESENTATION_ELEMENT__REP_ELEM_TYPE:
				setRepElemType((DataType)null);
				return;
			case RestStructurePackage.REPRESENTATION_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestStructurePackage.REPRESENTATION_ELEMENT__VALUE:
				setValue((Value)null);
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
			case RestStructurePackage.REPRESENTATION_ELEMENT__CORRESPONDING_ELEMENT:
				return correspondingElement != null;
			case RestStructurePackage.REPRESENTATION_ELEMENT__REP_ELEM_TYPE:
				return repElemType != null;
			case RestStructurePackage.REPRESENTATION_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestStructurePackage.REPRESENTATION_ELEMENT__VALUE:
				return value != null;
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

} //RepresentationElementImpl
