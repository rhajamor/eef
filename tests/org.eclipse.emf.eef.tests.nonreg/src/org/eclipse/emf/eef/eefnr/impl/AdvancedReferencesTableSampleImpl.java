/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdvancedReferencesTableSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.eefnr.AdvancedReferencesTableSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advanced References Table Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.AdvancedReferencesTableSampleImpl#getAdvancedreferencestableRequiredProperty <em>Advancedreferencestable Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.AdvancedReferencesTableSampleImpl#getAdvancedreferencestableOptionalProperty <em>Advancedreferencestable Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvancedReferencesTableSampleImpl extends AbstractSampleImpl implements AdvancedReferencesTableSample {
	/**
	 * The cached value of the '{@link #getAdvancedreferencestableRequiredProperty() <em>Advancedreferencestable Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedreferencestableRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> advancedreferencestableRequiredProperty;

	/**
	 * The cached value of the '{@link #getAdvancedreferencestableOptionalProperty() <em>Advancedreferencestable Optional Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedreferencestableOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> advancedreferencestableOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvancedReferencesTableSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.ADVANCED_REFERENCES_TABLE_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getAdvancedreferencestableRequiredProperty() {
		if (advancedreferencestableRequiredProperty == null) {
			advancedreferencestableRequiredProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY);
		}
		return advancedreferencestableRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getAdvancedreferencestableOptionalProperty() {
		if (advancedreferencestableOptionalProperty == null) {
			advancedreferencestableOptionalProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY);
		}
		return advancedreferencestableOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				return getAdvancedreferencestableRequiredProperty();
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				return getAdvancedreferencestableOptionalProperty();
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
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				getAdvancedreferencestableRequiredProperty().clear();
				getAdvancedreferencestableRequiredProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				getAdvancedreferencestableOptionalProperty().clear();
				getAdvancedreferencestableOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
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
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				getAdvancedreferencestableRequiredProperty().clear();
				return;
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				getAdvancedreferencestableOptionalProperty().clear();
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
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY:
				return advancedreferencestableRequiredProperty != null && !advancedreferencestableRequiredProperty.isEmpty();
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY:
				return advancedreferencestableOptionalProperty != null && !advancedreferencestableOptionalProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdvancedReferencesTableSampleImpl
