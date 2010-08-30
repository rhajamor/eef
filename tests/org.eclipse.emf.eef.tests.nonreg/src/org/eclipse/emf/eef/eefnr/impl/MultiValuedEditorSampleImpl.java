/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiValuedEditorSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.MultiValuedEditorSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Valued Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.MultiValuedEditorSampleImpl#getMultivaluededitorRequiredProperty <em>Multivaluededitor Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.MultiValuedEditorSampleImpl#getMultivaluededitorOptionalProperty <em>Multivaluededitor Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiValuedEditorSampleImpl extends AbstractSampleImpl implements MultiValuedEditorSample {
	/**
	 * The cached value of the '{@link #getMultivaluededitorRequiredProperty() <em>Multivaluededitor Required Property</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultivaluededitorRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multivaluededitorRequiredProperty;

	/**
	 * The cached value of the '{@link #getMultivaluededitorOptionalProperty() <em>Multivaluededitor Optional Property</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultivaluededitorOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multivaluededitorOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiValuedEditorSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.MULTI_VALUED_EDITOR_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMultivaluededitorRequiredProperty() {
		if (multivaluededitorRequiredProperty == null) {
			multivaluededitorRequiredProperty = new EDataTypeUniqueEList<String>(String.class, this, EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY);
		}
		return multivaluededitorRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMultivaluededitorOptionalProperty() {
		if (multivaluededitorOptionalProperty == null) {
			multivaluededitorOptionalProperty = new EDataTypeUniqueEList<String>(String.class, this, EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY);
		}
		return multivaluededitorOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				return getMultivaluededitorRequiredProperty();
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				return getMultivaluededitorOptionalProperty();
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
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				getMultivaluededitorRequiredProperty().clear();
				getMultivaluededitorRequiredProperty().addAll((Collection<? extends String>)newValue);
				return;
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				getMultivaluededitorOptionalProperty().clear();
				getMultivaluededitorOptionalProperty().addAll((Collection<? extends String>)newValue);
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
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				getMultivaluededitorRequiredProperty().clear();
				return;
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				getMultivaluededitorOptionalProperty().clear();
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
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
				return multivaluededitorRequiredProperty != null && !multivaluededitorRequiredProperty.isEmpty();
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				return multivaluededitorOptionalProperty != null && !multivaluededitorOptionalProperty.isEmpty();
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
		result.append(" (multivaluededitorRequiredProperty: ");
		result.append(multivaluededitorRequiredProperty);
		result.append(", multivaluededitorOptionalProperty: ");
		result.append(multivaluededitorOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //MultiValuedEditorSampleImpl
