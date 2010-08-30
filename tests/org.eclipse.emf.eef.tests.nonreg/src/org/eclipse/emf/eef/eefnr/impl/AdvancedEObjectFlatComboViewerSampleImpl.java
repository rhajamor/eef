/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdvancedEObjectFlatComboViewerSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advanced EObject Flat Combo Viewer Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.AdvancedEObjectFlatComboViewerSampleImpl#getAdvancedeobjectflatcomboviewerRequiredProperty <em>Advancedeobjectflatcomboviewer Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.AdvancedEObjectFlatComboViewerSampleImpl#getAdvancedeobjectflatcomboviewerOptionalProperty <em>Advancedeobjectflatcomboviewer Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvancedEObjectFlatComboViewerSampleImpl extends AbstractSampleImpl implements AdvancedEObjectFlatComboViewerSample {
	/**
	 * The cached value of the '{@link #getAdvancedeobjectflatcomboviewerRequiredProperty() <em>Advancedeobjectflatcomboviewer Required Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedeobjectflatcomboviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected TotalSample advancedeobjectflatcomboviewerRequiredProperty;

	/**
	 * The cached value of the '{@link #getAdvancedeobjectflatcomboviewerOptionalProperty() <em>Advancedeobjectflatcomboviewer Optional Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvancedeobjectflatcomboviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected TotalSample advancedeobjectflatcomboviewerOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvancedEObjectFlatComboViewerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getAdvancedeobjectflatcomboviewerRequiredProperty() {
		if (advancedeobjectflatcomboviewerRequiredProperty != null && advancedeobjectflatcomboviewerRequiredProperty.eIsProxy()) {
			InternalEObject oldAdvancedeobjectflatcomboviewerRequiredProperty = (InternalEObject)advancedeobjectflatcomboviewerRequiredProperty;
			advancedeobjectflatcomboviewerRequiredProperty = (TotalSample)eResolveProxy(oldAdvancedeobjectflatcomboviewerRequiredProperty);
			if (advancedeobjectflatcomboviewerRequiredProperty != oldAdvancedeobjectflatcomboviewerRequiredProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY, oldAdvancedeobjectflatcomboviewerRequiredProperty, advancedeobjectflatcomboviewerRequiredProperty));
			}
		}
		return advancedeobjectflatcomboviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetAdvancedeobjectflatcomboviewerRequiredProperty() {
		return advancedeobjectflatcomboviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvancedeobjectflatcomboviewerRequiredProperty(TotalSample newAdvancedeobjectflatcomboviewerRequiredProperty) {
		TotalSample oldAdvancedeobjectflatcomboviewerRequiredProperty = advancedeobjectflatcomboviewerRequiredProperty;
		advancedeobjectflatcomboviewerRequiredProperty = newAdvancedeobjectflatcomboviewerRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY, oldAdvancedeobjectflatcomboviewerRequiredProperty, advancedeobjectflatcomboviewerRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getAdvancedeobjectflatcomboviewerOptionalProperty() {
		if (advancedeobjectflatcomboviewerOptionalProperty != null && advancedeobjectflatcomboviewerOptionalProperty.eIsProxy()) {
			InternalEObject oldAdvancedeobjectflatcomboviewerOptionalProperty = (InternalEObject)advancedeobjectflatcomboviewerOptionalProperty;
			advancedeobjectflatcomboviewerOptionalProperty = (TotalSample)eResolveProxy(oldAdvancedeobjectflatcomboviewerOptionalProperty);
			if (advancedeobjectflatcomboviewerOptionalProperty != oldAdvancedeobjectflatcomboviewerOptionalProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY, oldAdvancedeobjectflatcomboviewerOptionalProperty, advancedeobjectflatcomboviewerOptionalProperty));
			}
		}
		return advancedeobjectflatcomboviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetAdvancedeobjectflatcomboviewerOptionalProperty() {
		return advancedeobjectflatcomboviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvancedeobjectflatcomboviewerOptionalProperty(TotalSample newAdvancedeobjectflatcomboviewerOptionalProperty) {
		TotalSample oldAdvancedeobjectflatcomboviewerOptionalProperty = advancedeobjectflatcomboviewerOptionalProperty;
		advancedeobjectflatcomboviewerOptionalProperty = newAdvancedeobjectflatcomboviewerOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY, oldAdvancedeobjectflatcomboviewerOptionalProperty, advancedeobjectflatcomboviewerOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				if (resolve) return getAdvancedeobjectflatcomboviewerRequiredProperty();
				return basicGetAdvancedeobjectflatcomboviewerRequiredProperty();
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				if (resolve) return getAdvancedeobjectflatcomboviewerOptionalProperty();
				return basicGetAdvancedeobjectflatcomboviewerOptionalProperty();
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
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				setAdvancedeobjectflatcomboviewerRequiredProperty((TotalSample)newValue);
				return;
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				setAdvancedeobjectflatcomboviewerOptionalProperty((TotalSample)newValue);
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
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				setAdvancedeobjectflatcomboviewerRequiredProperty((TotalSample)null);
				return;
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				setAdvancedeobjectflatcomboviewerOptionalProperty((TotalSample)null);
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
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY:
				return advancedeobjectflatcomboviewerRequiredProperty != null;
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY:
				return advancedeobjectflatcomboviewerOptionalProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //AdvancedEObjectFlatComboViewerSampleImpl
