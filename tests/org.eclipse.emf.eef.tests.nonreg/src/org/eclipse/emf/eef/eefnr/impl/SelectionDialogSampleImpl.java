/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectionDialogSampleImpl.java,v 1.1 2011/02/22 08:54:40 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.SelectionDialogSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Dialog Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.SelectionDialogSampleImpl#getSelectionDialogRequiredProperty <em>Selection Dialog Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.SelectionDialogSampleImpl#getSelectionDialogOptionalProperty <em>Selection Dialog Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionDialogSampleImpl extends AbstractSampleImpl implements SelectionDialogSample {
	/**
	 * The default value of the '{@link #getSelectionDialogRequiredProperty() <em>Selection Dialog Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionDialogRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_DIALOG_REQUIRED_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectionDialogRequiredProperty() <em>Selection Dialog Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionDialogRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected String selectionDialogRequiredProperty = SELECTION_DIALOG_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectionDialogOptionalProperty() <em>Selection Dialog Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionDialogOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_DIALOG_OPTIONAL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectionDialogOptionalProperty() <em>Selection Dialog Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionDialogOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected String selectionDialogOptionalProperty = SELECTION_DIALOG_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionDialogSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.SELECTION_DIALOG_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectionDialogRequiredProperty() {
		return selectionDialogRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionDialogRequiredProperty(String newSelectionDialogRequiredProperty) {
		String oldSelectionDialogRequiredProperty = selectionDialogRequiredProperty;
		selectionDialogRequiredProperty = newSelectionDialogRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_REQUIRED_PROPERTY, oldSelectionDialogRequiredProperty, selectionDialogRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectionDialogOptionalProperty() {
		return selectionDialogOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionDialogOptionalProperty(String newSelectionDialogOptionalProperty) {
		String oldSelectionDialogOptionalProperty = selectionDialogOptionalProperty;
		selectionDialogOptionalProperty = newSelectionDialogOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_OPTIONAL_PROPERTY, oldSelectionDialogOptionalProperty, selectionDialogOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_REQUIRED_PROPERTY:
				return getSelectionDialogRequiredProperty();
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_OPTIONAL_PROPERTY:
				return getSelectionDialogOptionalProperty();
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
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_REQUIRED_PROPERTY:
				setSelectionDialogRequiredProperty((String)newValue);
				return;
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_OPTIONAL_PROPERTY:
				setSelectionDialogOptionalProperty((String)newValue);
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
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_REQUIRED_PROPERTY:
				setSelectionDialogRequiredProperty(SELECTION_DIALOG_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_OPTIONAL_PROPERTY:
				setSelectionDialogOptionalProperty(SELECTION_DIALOG_OPTIONAL_PROPERTY_EDEFAULT);
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
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_REQUIRED_PROPERTY:
				return SELECTION_DIALOG_REQUIRED_PROPERTY_EDEFAULT == null ? selectionDialogRequiredProperty != null : !SELECTION_DIALOG_REQUIRED_PROPERTY_EDEFAULT.equals(selectionDialogRequiredProperty);
			case EefnrPackage.SELECTION_DIALOG_SAMPLE__SELECTION_DIALOG_OPTIONAL_PROPERTY:
				return SELECTION_DIALOG_OPTIONAL_PROPERTY_EDEFAULT == null ? selectionDialogOptionalProperty != null : !SELECTION_DIALOG_OPTIONAL_PROPERTY_EDEFAULT.equals(selectionDialogOptionalProperty);
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
		result.append(" (selectionDialogRequiredProperty: ");
		result.append(selectionDialogRequiredProperty);
		result.append(", selectionDialogOptionalProperty: ");
		result.append(selectionDialogOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //SelectionDialogSampleImpl
