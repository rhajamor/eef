/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectFlatComboViewerSampleImpl.java,v 1.1 2010/02/01 13:00:44 nlepine Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Flat Combo Viewer Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.EObjectFlatComboViewerSampleImpl#getEobjectflatcomboviewerRequiredPropery <em>Eobjectflatcomboviewer Required Propery</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.EObjectFlatComboViewerSampleImpl#getEobjectflatcomboviewerOptionalPropery <em>Eobjectflatcomboviewer Optional Propery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectFlatComboViewerSampleImpl extends AbstractSampleImpl implements EObjectFlatComboViewerSample {
	/**
	 * The cached value of the '{@link #getEobjectflatcomboviewerRequiredPropery() <em>Eobjectflatcomboviewer Required Propery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEobjectflatcomboviewerRequiredPropery()
	 * @generated
	 * @ordered
	 */
	protected TotalSample eobjectflatcomboviewerRequiredPropery;

	/**
	 * The cached value of the '{@link #getEobjectflatcomboviewerOptionalPropery() <em>Eobjectflatcomboviewer Optional Propery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEobjectflatcomboviewerOptionalPropery()
	 * @generated
	 * @ordered
	 */
	protected TotalSample eobjectflatcomboviewerOptionalPropery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectFlatComboViewerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getEobjectflatcomboviewerRequiredPropery() {
		if (eobjectflatcomboviewerRequiredPropery != null && eobjectflatcomboviewerRequiredPropery.eIsProxy()) {
			InternalEObject oldEobjectflatcomboviewerRequiredPropery = (InternalEObject)eobjectflatcomboviewerRequiredPropery;
			eobjectflatcomboviewerRequiredPropery = (TotalSample)eResolveProxy(oldEobjectflatcomboviewerRequiredPropery);
			if (eobjectflatcomboviewerRequiredPropery != oldEobjectflatcomboviewerRequiredPropery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY, oldEobjectflatcomboviewerRequiredPropery, eobjectflatcomboviewerRequiredPropery));
			}
		}
		return eobjectflatcomboviewerRequiredPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetEobjectflatcomboviewerRequiredPropery() {
		return eobjectflatcomboviewerRequiredPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEobjectflatcomboviewerRequiredPropery(TotalSample newEobjectflatcomboviewerRequiredPropery) {
		TotalSample oldEobjectflatcomboviewerRequiredPropery = eobjectflatcomboviewerRequiredPropery;
		eobjectflatcomboviewerRequiredPropery = newEobjectflatcomboviewerRequiredPropery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY, oldEobjectflatcomboviewerRequiredPropery, eobjectflatcomboviewerRequiredPropery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getEobjectflatcomboviewerOptionalPropery() {
		if (eobjectflatcomboviewerOptionalPropery != null && eobjectflatcomboviewerOptionalPropery.eIsProxy()) {
			InternalEObject oldEobjectflatcomboviewerOptionalPropery = (InternalEObject)eobjectflatcomboviewerOptionalPropery;
			eobjectflatcomboviewerOptionalPropery = (TotalSample)eResolveProxy(oldEobjectflatcomboviewerOptionalPropery);
			if (eobjectflatcomboviewerOptionalPropery != oldEobjectflatcomboviewerOptionalPropery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY, oldEobjectflatcomboviewerOptionalPropery, eobjectflatcomboviewerOptionalPropery));
			}
		}
		return eobjectflatcomboviewerOptionalPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetEobjectflatcomboviewerOptionalPropery() {
		return eobjectflatcomboviewerOptionalPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEobjectflatcomboviewerOptionalPropery(TotalSample newEobjectflatcomboviewerOptionalPropery) {
		TotalSample oldEobjectflatcomboviewerOptionalPropery = eobjectflatcomboviewerOptionalPropery;
		eobjectflatcomboviewerOptionalPropery = newEobjectflatcomboviewerOptionalPropery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY, oldEobjectflatcomboviewerOptionalPropery, eobjectflatcomboviewerOptionalPropery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				if (resolve) return getEobjectflatcomboviewerRequiredPropery();
				return basicGetEobjectflatcomboviewerRequiredPropery();
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				if (resolve) return getEobjectflatcomboviewerOptionalPropery();
				return basicGetEobjectflatcomboviewerOptionalPropery();
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
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				setEobjectflatcomboviewerRequiredPropery((TotalSample)newValue);
				return;
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				setEobjectflatcomboviewerOptionalPropery((TotalSample)newValue);
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
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				setEobjectflatcomboviewerRequiredPropery((TotalSample)null);
				return;
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				setEobjectflatcomboviewerOptionalPropery((TotalSample)null);
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
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY:
				return eobjectflatcomboviewerRequiredPropery != null;
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY:
				return eobjectflatcomboviewerOptionalPropery != null;
		}
		return super.eIsSet(featureID);
	}

} //EObjectFlatComboViewerSampleImpl
