/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencesTableSampleImpl.java,v 1.1 2010/02/01 13:00:44 nlepine Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.ReferencesTableSample;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References Table Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.ReferencesTableSampleImpl#getReferencestableRequiredProperty <em>Referencestable Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.ReferencesTableSampleImpl#getReferencestableOptionalProperty <em>Referencestable Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencesTableSampleImpl extends AbstractSampleImpl implements ReferencesTableSample {
	/**
	 * The cached value of the '{@link #getReferencestableRequiredProperty() <em>Referencestable Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencestableRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> referencestableRequiredProperty;

	/**
	 * The cached value of the '{@link #getReferencestableOptionalProperty() <em>Referencestable Optional Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencestableOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TotalSample> referencestableOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesTableSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.REFERENCES_TABLE_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getReferencestableRequiredProperty() {
		if (referencestableRequiredProperty == null) {
			referencestableRequiredProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY);
		}
		return referencestableRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TotalSample> getReferencestableOptionalProperty() {
		if (referencestableOptionalProperty == null) {
			referencestableOptionalProperty = new EObjectResolvingEList<TotalSample>(TotalSample.class, this, EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY);
		}
		return referencestableOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				return getReferencestableRequiredProperty();
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				return getReferencestableOptionalProperty();
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
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				getReferencestableRequiredProperty().clear();
				getReferencestableRequiredProperty().addAll((Collection<? extends TotalSample>)newValue);
				return;
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				getReferencestableOptionalProperty().clear();
				getReferencestableOptionalProperty().addAll((Collection<? extends TotalSample>)newValue);
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
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				getReferencestableRequiredProperty().clear();
				return;
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				getReferencestableOptionalProperty().clear();
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
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY:
				return referencestableRequiredProperty != null && !referencestableRequiredProperty.isEmpty();
			case EefnrPackage.REFERENCES_TABLE_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY:
				return referencestableOptionalProperty != null && !referencestableOptionalProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferencesTableSampleImpl
