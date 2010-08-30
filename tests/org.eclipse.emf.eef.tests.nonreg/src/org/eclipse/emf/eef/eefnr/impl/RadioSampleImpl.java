/**
 * <copyright>
 * </copyright>
 *
 * $Id: RadioSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.RadioSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.RadioSampleImpl#getRadioRequiredProperty <em>Radio Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.RadioSampleImpl#getRadioOptionalProperty <em>Radio Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioSampleImpl extends AbstractSampleImpl implements RadioSample {
	/**
	 * The default value of the '{@link #getRadioRequiredProperty() <em>Radio Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE RADIO_REQUIRED_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getRadioRequiredProperty() <em>Radio Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE radioRequiredProperty = RADIO_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioOptionalProperty() <em>Radio Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE RADIO_OPTIONAL_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getRadioOptionalProperty() <em>Radio Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE radioOptionalProperty = RADIO_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.RADIO_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getRadioRequiredProperty() {
		return radioRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioRequiredProperty(ENUM_SAMPLE newRadioRequiredProperty) {
		ENUM_SAMPLE oldRadioRequiredProperty = radioRequiredProperty;
		radioRequiredProperty = newRadioRequiredProperty == null ? RADIO_REQUIRED_PROPERTY_EDEFAULT : newRadioRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.RADIO_SAMPLE__RADIO_REQUIRED_PROPERTY, oldRadioRequiredProperty, radioRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getRadioOptionalProperty() {
		return radioOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioOptionalProperty(ENUM_SAMPLE newRadioOptionalProperty) {
		ENUM_SAMPLE oldRadioOptionalProperty = radioOptionalProperty;
		radioOptionalProperty = newRadioOptionalProperty == null ? RADIO_OPTIONAL_PROPERTY_EDEFAULT : newRadioOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.RADIO_SAMPLE__RADIO_OPTIONAL_PROPERTY, oldRadioOptionalProperty, radioOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.RADIO_SAMPLE__RADIO_REQUIRED_PROPERTY:
				return getRadioRequiredProperty();
			case EefnrPackage.RADIO_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				return getRadioOptionalProperty();
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
			case EefnrPackage.RADIO_SAMPLE__RADIO_REQUIRED_PROPERTY:
				setRadioRequiredProperty((ENUM_SAMPLE)newValue);
				return;
			case EefnrPackage.RADIO_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				setRadioOptionalProperty((ENUM_SAMPLE)newValue);
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
			case EefnrPackage.RADIO_SAMPLE__RADIO_REQUIRED_PROPERTY:
				setRadioRequiredProperty(RADIO_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.RADIO_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				setRadioOptionalProperty(RADIO_OPTIONAL_PROPERTY_EDEFAULT);
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
			case EefnrPackage.RADIO_SAMPLE__RADIO_REQUIRED_PROPERTY:
				return radioRequiredProperty != RADIO_REQUIRED_PROPERTY_EDEFAULT;
			case EefnrPackage.RADIO_SAMPLE__RADIO_OPTIONAL_PROPERTY:
				return radioOptionalProperty != RADIO_OPTIONAL_PROPERTY_EDEFAULT;
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
		result.append(" (radioRequiredProperty: ");
		result.append(radioRequiredProperty);
		result.append(", radioOptionalProperty: ");
		result.append(radioOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //RadioSampleImpl
