/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.ComboSample;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.ComboSampleImpl#getComboRequiredReferenceProperty <em>Combo Required Reference Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.ComboSampleImpl#getComboOptionalReferenceProperty <em>Combo Optional Reference Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComboSampleImpl extends AbstractSampleImpl implements ComboSample {
	/**
	 * The cached value of the '{@link #getComboRequiredReferenceProperty() <em>Combo Required Reference Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboRequiredReferenceProperty()
	 * @generated
	 * @ordered
	 */
	protected TotalSample comboRequiredReferenceProperty;

	/**
	 * The cached value of the '{@link #getComboOptionalReferenceProperty() <em>Combo Optional Reference Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboOptionalReferenceProperty()
	 * @generated
	 * @ordered
	 */
	protected TotalSample comboOptionalReferenceProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.COMBO_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getComboRequiredReferenceProperty() {
		if (comboRequiredReferenceProperty != null && comboRequiredReferenceProperty.eIsProxy()) {
			InternalEObject oldComboRequiredReferenceProperty = (InternalEObject)comboRequiredReferenceProperty;
			comboRequiredReferenceProperty = (TotalSample)eResolveProxy(oldComboRequiredReferenceProperty);
			if (comboRequiredReferenceProperty != oldComboRequiredReferenceProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.COMBO_SAMPLE__COMBO_REQUIRED_REFERENCE_PROPERTY, oldComboRequiredReferenceProperty, comboRequiredReferenceProperty));
			}
		}
		return comboRequiredReferenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetComboRequiredReferenceProperty() {
		return comboRequiredReferenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComboRequiredReferenceProperty(TotalSample newComboRequiredReferenceProperty) {
		TotalSample oldComboRequiredReferenceProperty = comboRequiredReferenceProperty;
		comboRequiredReferenceProperty = newComboRequiredReferenceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.COMBO_SAMPLE__COMBO_REQUIRED_REFERENCE_PROPERTY, oldComboRequiredReferenceProperty, comboRequiredReferenceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getComboOptionalReferenceProperty() {
		if (comboOptionalReferenceProperty != null && comboOptionalReferenceProperty.eIsProxy()) {
			InternalEObject oldComboOptionalReferenceProperty = (InternalEObject)comboOptionalReferenceProperty;
			comboOptionalReferenceProperty = (TotalSample)eResolveProxy(oldComboOptionalReferenceProperty);
			if (comboOptionalReferenceProperty != oldComboOptionalReferenceProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.COMBO_SAMPLE__COMBO_OPTIONAL_REFERENCE_PROPERTY, oldComboOptionalReferenceProperty, comboOptionalReferenceProperty));
			}
		}
		return comboOptionalReferenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetComboOptionalReferenceProperty() {
		return comboOptionalReferenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComboOptionalReferenceProperty(TotalSample newComboOptionalReferenceProperty) {
		TotalSample oldComboOptionalReferenceProperty = comboOptionalReferenceProperty;
		comboOptionalReferenceProperty = newComboOptionalReferenceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.COMBO_SAMPLE__COMBO_OPTIONAL_REFERENCE_PROPERTY, oldComboOptionalReferenceProperty, comboOptionalReferenceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.COMBO_SAMPLE__COMBO_REQUIRED_REFERENCE_PROPERTY:
				if (resolve) return getComboRequiredReferenceProperty();
				return basicGetComboRequiredReferenceProperty();
			case EefnrPackage.COMBO_SAMPLE__COMBO_OPTIONAL_REFERENCE_PROPERTY:
				if (resolve) return getComboOptionalReferenceProperty();
				return basicGetComboOptionalReferenceProperty();
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
			case EefnrPackage.COMBO_SAMPLE__COMBO_REQUIRED_REFERENCE_PROPERTY:
				setComboRequiredReferenceProperty((TotalSample)newValue);
				return;
			case EefnrPackage.COMBO_SAMPLE__COMBO_OPTIONAL_REFERENCE_PROPERTY:
				setComboOptionalReferenceProperty((TotalSample)newValue);
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
			case EefnrPackage.COMBO_SAMPLE__COMBO_REQUIRED_REFERENCE_PROPERTY:
				setComboRequiredReferenceProperty((TotalSample)null);
				return;
			case EefnrPackage.COMBO_SAMPLE__COMBO_OPTIONAL_REFERENCE_PROPERTY:
				setComboOptionalReferenceProperty((TotalSample)null);
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
			case EefnrPackage.COMBO_SAMPLE__COMBO_REQUIRED_REFERENCE_PROPERTY:
				return comboRequiredReferenceProperty != null;
			case EefnrPackage.COMBO_SAMPLE__COMBO_OPTIONAL_REFERENCE_PROPERTY:
				return comboOptionalReferenceProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ComboSampleImpl
