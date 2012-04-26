/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.restbehavior.Creator;
import de.van_porten.vrest.core.model.restbehavior.State;

import de.van_porten.vrest.core.model.reststructure.Method;
import de.van_porten.vrest.core.model.reststructure.ResourceElement;
import de.van_porten.vrest.core.model.reststructure.ResourceIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.ResourceType;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getIdentifer <em>Identifer</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getResourceelements <em>Resourceelements</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getCreators <em>Creators</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getStates <em>States</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#isIsSingleton <em>Is Singleton</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ResourceTypeImpl#isCreateOnStart <em>Create On Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceTypeImpl extends EObjectImpl implements ResourceType {
	/**
	 * The cached value of the '{@link #getIdentifer() <em>Identifer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifer()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceIdentifierPattern> identifer;

	/**
	 * The cached value of the '{@link #getResourceelements() <em>Resourceelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceElement> resourceelements;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getCreators() <em>Creators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreators()
	 * @generated
	 * @ordered
	 */
	protected EList<Creator> creators;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

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
	 * The default value of the '{@link #isIsSingleton() <em>Is Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleton() <em>Is Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleton = IS_SINGLETON_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreateOnStart() <em>Create On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateOnStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_ON_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateOnStart() <em>Create On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateOnStart()
	 * @generated
	 * @ordered
	 */
	protected boolean createOnStart = CREATE_ON_START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceIdentifierPattern> getIdentifer() {
		if (identifer == null) {
			identifer = new EObjectContainmentEList<ResourceIdentifierPattern>(ResourceIdentifierPattern.class, this, RestStructurePackage.RESOURCE_TYPE__IDENTIFER);
		}
		return identifer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceElement> getResourceelements() {
		if (resourceelements == null) {
			resourceelements = new EObjectContainmentEList<ResourceElement>(ResourceElement.class, this, RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS);
		}
		return resourceelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, RestStructurePackage.RESOURCE_TYPE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Creator> getCreators() {
		if (creators == null) {
			creators = new EObjectContainmentEList<Creator>(Creator.class, this, RestStructurePackage.RESOURCE_TYPE__CREATORS);
		}
		return creators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, RestStructurePackage.RESOURCE_TYPE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestStructurePackage.RESOURCE_TYPE__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.RESOURCE_TYPE__INITIAL_STATE, oldInitialState, initialState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.RESOURCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingleton() {
		return isSingleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleton(boolean newIsSingleton) {
		boolean oldIsSingleton = isSingleton;
		isSingleton = newIsSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.RESOURCE_TYPE__IS_SINGLETON, oldIsSingleton, isSingleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateOnStart() {
		return createOnStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateOnStart(boolean newCreateOnStart) {
		boolean oldCreateOnStart = createOnStart;
		createOnStart = newCreateOnStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestStructurePackage.RESOURCE_TYPE__CREATE_ON_START, oldCreateOnStart, createOnStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestStructurePackage.RESOURCE_TYPE__IDENTIFER:
				return ((InternalEList<?>)getIdentifer()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS:
				return ((InternalEList<?>)getResourceelements()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.RESOURCE_TYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.RESOURCE_TYPE__CREATORS:
				return ((InternalEList<?>)getCreators()).basicRemove(otherEnd, msgs);
			case RestStructurePackage.RESOURCE_TYPE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case RestStructurePackage.RESOURCE_TYPE__IDENTIFER:
				return getIdentifer();
			case RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS:
				return getResourceelements();
			case RestStructurePackage.RESOURCE_TYPE__METHODS:
				return getMethods();
			case RestStructurePackage.RESOURCE_TYPE__CREATORS:
				return getCreators();
			case RestStructurePackage.RESOURCE_TYPE__STATES:
				return getStates();
			case RestStructurePackage.RESOURCE_TYPE__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case RestStructurePackage.RESOURCE_TYPE__NAME:
				return getName();
			case RestStructurePackage.RESOURCE_TYPE__IS_SINGLETON:
				return isIsSingleton();
			case RestStructurePackage.RESOURCE_TYPE__CREATE_ON_START:
				return isCreateOnStart();
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
			case RestStructurePackage.RESOURCE_TYPE__IDENTIFER:
				getIdentifer().clear();
				getIdentifer().addAll((Collection<? extends ResourceIdentifierPattern>)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS:
				getResourceelements().clear();
				getResourceelements().addAll((Collection<? extends ResourceElement>)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__CREATORS:
				getCreators().clear();
				getCreators().addAll((Collection<? extends Creator>)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__IS_SINGLETON:
				setIsSingleton((Boolean)newValue);
				return;
			case RestStructurePackage.RESOURCE_TYPE__CREATE_ON_START:
				setCreateOnStart((Boolean)newValue);
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
			case RestStructurePackage.RESOURCE_TYPE__IDENTIFER:
				getIdentifer().clear();
				return;
			case RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS:
				getResourceelements().clear();
				return;
			case RestStructurePackage.RESOURCE_TYPE__METHODS:
				getMethods().clear();
				return;
			case RestStructurePackage.RESOURCE_TYPE__CREATORS:
				getCreators().clear();
				return;
			case RestStructurePackage.RESOURCE_TYPE__STATES:
				getStates().clear();
				return;
			case RestStructurePackage.RESOURCE_TYPE__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case RestStructurePackage.RESOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestStructurePackage.RESOURCE_TYPE__IS_SINGLETON:
				setIsSingleton(IS_SINGLETON_EDEFAULT);
				return;
			case RestStructurePackage.RESOURCE_TYPE__CREATE_ON_START:
				setCreateOnStart(CREATE_ON_START_EDEFAULT);
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
			case RestStructurePackage.RESOURCE_TYPE__IDENTIFER:
				return identifer != null && !identifer.isEmpty();
			case RestStructurePackage.RESOURCE_TYPE__RESOURCEELEMENTS:
				return resourceelements != null && !resourceelements.isEmpty();
			case RestStructurePackage.RESOURCE_TYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case RestStructurePackage.RESOURCE_TYPE__CREATORS:
				return creators != null && !creators.isEmpty();
			case RestStructurePackage.RESOURCE_TYPE__STATES:
				return states != null && !states.isEmpty();
			case RestStructurePackage.RESOURCE_TYPE__INITIAL_STATE:
				return initialState != null;
			case RestStructurePackage.RESOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestStructurePackage.RESOURCE_TYPE__IS_SINGLETON:
				return isSingleton != IS_SINGLETON_EDEFAULT;
			case RestStructurePackage.RESOURCE_TYPE__CREATE_ON_START:
				return createOnStart != CREATE_ON_START_EDEFAULT;
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
		result.append(", isSingleton: ");
		result.append(isSingleton);
		result.append(", createOnStart: ");
		result.append(createOnStart);
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
