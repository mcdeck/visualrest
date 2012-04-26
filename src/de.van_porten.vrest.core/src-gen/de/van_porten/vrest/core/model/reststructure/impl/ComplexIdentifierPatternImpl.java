/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.van_porten.vrest.core.model.reststructure.impl;

import de.van_porten.vrest.core.model.reststructure.Attribute;
import de.van_porten.vrest.core.model.reststructure.ComplexIdentifierPattern;
import de.van_porten.vrest.core.model.reststructure.Parameter;
import de.van_porten.vrest.core.model.reststructure.RestStructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Identifier Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ComplexIdentifierPatternImpl#getIdParams <em>Id Params</em>}</li>
 *   <li>{@link de.van_porten.vrest.core.model.reststructure.impl.ComplexIdentifierPatternImpl#getIdAttrs <em>Id Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexIdentifierPatternImpl extends ResourceIdentifierPatternImpl implements ComplexIdentifierPattern {
	/**
	 * The cached value of the '{@link #getIdParams() <em>Id Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> idParams;

	/**
	 * The cached value of the '{@link #getIdAttrs() <em>Id Attrs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> idAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexIdentifierPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestStructurePackage.Literals.COMPLEX_IDENTIFIER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getIdParams() {
		if (idParams == null) {
			idParams = new EObjectResolvingEList<Parameter>(Parameter.class, this, RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS);
		}
		return idParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getIdAttrs() {
		if (idAttrs == null) {
			idAttrs = new EObjectResolvingEList<Attribute>(Attribute.class, this, RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS);
		}
		return idAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS:
				return getIdParams();
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS:
				return getIdAttrs();
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
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS:
				getIdParams().clear();
				getIdParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS:
				getIdAttrs().clear();
				getIdAttrs().addAll((Collection<? extends Attribute>)newValue);
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
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS:
				getIdParams().clear();
				return;
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS:
				getIdAttrs().clear();
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
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_PARAMS:
				return idParams != null && !idParams.isEmpty();
			case RestStructurePackage.COMPLEX_IDENTIFIER_PATTERN__ID_ATTRS:
				return idAttrs != null && !idAttrs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexIdentifierPatternImpl
