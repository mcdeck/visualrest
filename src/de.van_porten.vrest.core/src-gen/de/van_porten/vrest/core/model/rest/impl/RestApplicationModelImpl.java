/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.rest.impl;

import de.van_porten.vrest.core.model.rest.RestApplicationModel;
import de.van_porten.vrest.core.model.rest.RestPackage;

import de.van_porten.vrest.core.model.restbehavior.OpType;

import de.van_porten.vrest.core.model.reststructure.DataType;
import de.van_porten.vrest.core.model.reststructure.MediaType;
import de.van_porten.vrest.core.model.reststructure.MethodType;
import de.van_porten.vrest.core.model.reststructure.RelationType;
import de.van_porten.vrest.core.model.reststructure.ResourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getMethodTypes <em>Method Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getMediaTypes <em>Media Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getRelTypes <em>Rel Types</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.rest.impl.RestApplicationModelImpl#getOptypes <em>Optypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestApplicationModelImpl extends EObjectImpl implements RestApplicationModel {
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
	 * The cached value of the '{@link #getMethodTypes() <em>Method Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodType> methodTypes;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getMediaTypes() <em>Media Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaType> mediaTypes;

	/**
	 * The cached value of the '{@link #getResourceTypes() <em>Resource Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resourceTypes;

	/**
	 * The cached value of the '{@link #getRelTypes() <em>Rel Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationType> relTypes;

	/**
	 * The cached value of the '{@link #getOptypes() <em>Optypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OpType> optypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestApplicationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.REST_APPLICATION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_APPLICATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodType> getMethodTypes() {
		if (methodTypes == null) {
			methodTypes = new EObjectContainmentEList<MethodType>(MethodType.class, this, RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES);
		}
		return methodTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, RestPackage.REST_APPLICATION_MODEL__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaType> getMediaTypes() {
		if (mediaTypes == null) {
			mediaTypes = new EObjectContainmentEList<MediaType>(MediaType.class, this, RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES);
		}
		return mediaTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getResourceTypes() {
		if (resourceTypes == null) {
			resourceTypes = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES);
		}
		return resourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationType> getRelTypes() {
		if (relTypes == null) {
			relTypes = new EObjectContainmentEList<RelationType>(RelationType.class, this, RestPackage.REST_APPLICATION_MODEL__REL_TYPES);
		}
		return relTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpType> getOptypes() {
		if (optypes == null) {
			optypes = new EObjectContainmentEList<OpType>(OpType.class, this, RestPackage.REST_APPLICATION_MODEL__OPTYPES);
		}
		return optypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES:
				return ((InternalEList<?>)getMethodTypes()).basicRemove(otherEnd, msgs);
			case RestPackage.REST_APPLICATION_MODEL__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES:
				return ((InternalEList<?>)getMediaTypes()).basicRemove(otherEnd, msgs);
			case RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES:
				return ((InternalEList<?>)getResourceTypes()).basicRemove(otherEnd, msgs);
			case RestPackage.REST_APPLICATION_MODEL__REL_TYPES:
				return ((InternalEList<?>)getRelTypes()).basicRemove(otherEnd, msgs);
			case RestPackage.REST_APPLICATION_MODEL__OPTYPES:
				return ((InternalEList<?>)getOptypes()).basicRemove(otherEnd, msgs);
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
			case RestPackage.REST_APPLICATION_MODEL__NAME:
				return getName();
			case RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES:
				return getMethodTypes();
			case RestPackage.REST_APPLICATION_MODEL__DATA_TYPES:
				return getDataTypes();
			case RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES:
				return getMediaTypes();
			case RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES:
				return getResourceTypes();
			case RestPackage.REST_APPLICATION_MODEL__REL_TYPES:
				return getRelTypes();
			case RestPackage.REST_APPLICATION_MODEL__OPTYPES:
				return getOptypes();
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
			case RestPackage.REST_APPLICATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES:
				getMethodTypes().clear();
				getMethodTypes().addAll((Collection<? extends MethodType>)newValue);
				return;
			case RestPackage.REST_APPLICATION_MODEL__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES:
				getMediaTypes().clear();
				getMediaTypes().addAll((Collection<? extends MediaType>)newValue);
				return;
			case RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES:
				getResourceTypes().clear();
				getResourceTypes().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case RestPackage.REST_APPLICATION_MODEL__REL_TYPES:
				getRelTypes().clear();
				getRelTypes().addAll((Collection<? extends RelationType>)newValue);
				return;
			case RestPackage.REST_APPLICATION_MODEL__OPTYPES:
				getOptypes().clear();
				getOptypes().addAll((Collection<? extends OpType>)newValue);
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
			case RestPackage.REST_APPLICATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES:
				getMethodTypes().clear();
				return;
			case RestPackage.REST_APPLICATION_MODEL__DATA_TYPES:
				getDataTypes().clear();
				return;
			case RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES:
				getMediaTypes().clear();
				return;
			case RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES:
				getResourceTypes().clear();
				return;
			case RestPackage.REST_APPLICATION_MODEL__REL_TYPES:
				getRelTypes().clear();
				return;
			case RestPackage.REST_APPLICATION_MODEL__OPTYPES:
				getOptypes().clear();
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
			case RestPackage.REST_APPLICATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestPackage.REST_APPLICATION_MODEL__METHOD_TYPES:
				return methodTypes != null && !methodTypes.isEmpty();
			case RestPackage.REST_APPLICATION_MODEL__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case RestPackage.REST_APPLICATION_MODEL__MEDIA_TYPES:
				return mediaTypes != null && !mediaTypes.isEmpty();
			case RestPackage.REST_APPLICATION_MODEL__RESOURCE_TYPES:
				return resourceTypes != null && !resourceTypes.isEmpty();
			case RestPackage.REST_APPLICATION_MODEL__REL_TYPES:
				return relTypes != null && !relTypes.isEmpty();
			case RestPackage.REST_APPLICATION_MODEL__OPTYPES:
				return optypes != null && !optypes.isEmpty();
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

} //RestApplicationModelImpl
