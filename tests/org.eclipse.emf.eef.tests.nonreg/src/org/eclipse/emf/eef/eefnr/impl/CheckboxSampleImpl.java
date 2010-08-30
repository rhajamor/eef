/**
 * <copyright>
 * </copyright>
 *
 * $Id: CheckboxSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.CheckboxSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkbox Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.CheckboxSampleImpl#isCheckboxRequiredProperty <em>Checkbox Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.CheckboxSampleImpl#isCheckboxOptionalProperty <em>Checkbox Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckboxSampleImpl extends AbstractSampleImpl implements CheckboxSample {
	/**
	 * The default value of the '{@link #isCheckboxRequiredProperty() <em>Checkbox Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKBOX_REQUIRED_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckboxRequiredProperty() <em>Checkbox Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean checkboxRequiredProperty = CHECKBOX_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckboxOptionalProperty() <em>Checkbox Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckboxOptionalProperty() <em>Checkbox Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean checkboxOptionalProperty = CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckboxSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.CHECKBOX_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckboxRequiredProperty() {
		return checkboxRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckboxRequiredProperty(boolean newCheckboxRequiredProperty) {
		boolean oldCheckboxRequiredProperty = checkboxRequiredProperty;
		checkboxRequiredProperty = newCheckboxRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_REQUIRED_PROPERTY, oldCheckboxRequiredProperty, checkboxRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckboxOptionalProperty() {
		return checkboxOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckboxOptionalProperty(boolean newCheckboxOptionalProperty) {
		boolean oldCheckboxOptionalProperty = checkboxOptionalProperty;
		checkboxOptionalProperty = newCheckboxOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY, oldCheckboxOptionalProperty, checkboxOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				return isCheckboxRequiredProperty();
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				return isCheckboxOptionalProperty();
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
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				setCheckboxRequiredProperty((Boolean)newValue);
				return;
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				setCheckboxOptionalProperty((Boolean)newValue);
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
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				setCheckboxRequiredProperty(CHECKBOX_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				setCheckboxOptionalProperty(CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT);
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
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
				return checkboxRequiredProperty != CHECKBOX_REQUIRED_PROPERTY_EDEFAULT;
			case EefnrPackage.CHECKBOX_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
				return checkboxOptionalProperty != CHECKBOX_OPTIONAL_PROPERTY_EDEFAULT;
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
		result.append(" (checkboxRequiredProperty: ");
		result.append(checkboxRequiredProperty);
		result.append(", checkboxOptionalProperty: ");
		result.append(checkboxOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //CheckboxSampleImpl
