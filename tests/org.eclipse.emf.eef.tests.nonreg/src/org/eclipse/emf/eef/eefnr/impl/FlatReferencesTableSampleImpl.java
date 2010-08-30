/**
 * <copyright>
 * </copyright>
 *
 * $Id: FlatReferencesTableSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.FlatReferencesTableSample;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flat References Table Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.FlatReferencesTableSampleImpl#getFlatreferencestableRequiredProperty <em>Flatreferencestable Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.FlatReferencesTableSampleImpl#getFlatreferencestableOptionalProperty <em>Flatreferencestable Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlatReferencesTableSampleImpl extends AbstractSampleImpl implements FlatReferencesTableSample {
	/**
	 * The cached value of the '{@link #getFlatreferencestableRequiredProperty() <em>Flatreferencestable Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatreferencestableRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> flatreferencestableRequiredProperty;

	/**
	 * The cached value of the '{@link #getFlatreferencestableOptionalProperty() <em>Flatreferencestable Optional Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatreferencestableOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> flatreferencestableOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatReferencesTableSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.FLAT_REFERENCES_TABLE_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getFlatreferencestableRequiredProperty() {
		if (flatreferencestableRequiredProperty == null) {
			flatreferencestableRequiredProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_REQUIRED_PROPERTY);
		}
		return flatreferencestableRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getFlatreferencestableOptionalProperty() {
		if (flatreferencestableOptionalProperty == null) {
			flatreferencestableOptionalProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_OPTIONAL_PROPERTY);
		}
		return flatreferencestableOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_REQUIRED_PROPERTY:
				return getFlatreferencestableRequiredProperty();
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_OPTIONAL_PROPERTY:
				return getFlatreferencestableOptionalProperty();
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
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_REQUIRED_PROPERTY:
				getFlatreferencestableRequiredProperty().clear();
				getFlatreferencestableRequiredProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_OPTIONAL_PROPERTY:
				getFlatreferencestableOptionalProperty().clear();
				getFlatreferencestableOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
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
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_REQUIRED_PROPERTY:
				getFlatreferencestableRequiredProperty().clear();
				return;
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_OPTIONAL_PROPERTY:
				getFlatreferencestableOptionalProperty().clear();
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
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_REQUIRED_PROPERTY:
				return flatreferencestableRequiredProperty != null && !flatreferencestableRequiredProperty.isEmpty();
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE__FLATREFERENCESTABLE_OPTIONAL_PROPERTY:
				return flatreferencestableOptionalProperty != null && !flatreferencestableOptionalProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlatReferencesTableSampleImpl
