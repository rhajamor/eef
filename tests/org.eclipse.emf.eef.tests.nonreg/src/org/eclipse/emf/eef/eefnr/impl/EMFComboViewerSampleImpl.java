/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFComboViewerSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.EMFComboViewerSample;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Combo Viewer Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.EMFComboViewerSampleImpl#getEmfcomboviewerRequiredProperty <em>Emfcomboviewer Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.EMFComboViewerSampleImpl#getEmfcomboviewerOptionalProperty <em>Emfcomboviewer Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFComboViewerSampleImpl extends AbstractSampleImpl implements EMFComboViewerSample {
	/**
	 * The default value of the '{@link #getEmfcomboviewerRequiredProperty() <em>Emfcomboviewer Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getEmfcomboviewerRequiredProperty() <em>Emfcomboviewer Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE emfcomboviewerRequiredProperty = EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmfcomboviewerOptionalProperty() <em>Emfcomboviewer Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final ENUM_SAMPLE EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT = ENUM_SAMPLE.LITERAL1;

	/**
	 * The cached value of the '{@link #getEmfcomboviewerOptionalProperty() <em>Emfcomboviewer Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfcomboviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected ENUM_SAMPLE emfcomboviewerOptionalProperty = EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFComboViewerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.EMF_COMBO_VIEWER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getEmfcomboviewerRequiredProperty() {
		return emfcomboviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfcomboviewerRequiredProperty(ENUM_SAMPLE newEmfcomboviewerRequiredProperty) {
		ENUM_SAMPLE oldEmfcomboviewerRequiredProperty = emfcomboviewerRequiredProperty;
		emfcomboviewerRequiredProperty = newEmfcomboviewerRequiredProperty == null ? EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT : newEmfcomboviewerRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY, oldEmfcomboviewerRequiredProperty, emfcomboviewerRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE getEmfcomboviewerOptionalProperty() {
		return emfcomboviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfcomboviewerOptionalProperty(ENUM_SAMPLE newEmfcomboviewerOptionalProperty) {
		ENUM_SAMPLE oldEmfcomboviewerOptionalProperty = emfcomboviewerOptionalProperty;
		emfcomboviewerOptionalProperty = newEmfcomboviewerOptionalProperty == null ? EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT : newEmfcomboviewerOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY, oldEmfcomboviewerOptionalProperty, emfcomboviewerOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				return getEmfcomboviewerRequiredProperty();
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				return getEmfcomboviewerOptionalProperty();
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
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				setEmfcomboviewerRequiredProperty((ENUM_SAMPLE)newValue);
				return;
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				setEmfcomboviewerOptionalProperty((ENUM_SAMPLE)newValue);
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
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				setEmfcomboviewerRequiredProperty(EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				setEmfcomboviewerOptionalProperty(EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT);
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
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
				return emfcomboviewerRequiredProperty != EMFCOMBOVIEWER_REQUIRED_PROPERTY_EDEFAULT;
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
				return emfcomboviewerOptionalProperty != EMFCOMBOVIEWER_OPTIONAL_PROPERTY_EDEFAULT;
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
		result.append(" (emfcomboviewerRequiredProperty: ");
		result.append(emfcomboviewerRequiredProperty);
		result.append(", emfcomboviewerOptionalProperty: ");
		result.append(emfcomboviewerOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //EMFComboViewerSampleImpl
