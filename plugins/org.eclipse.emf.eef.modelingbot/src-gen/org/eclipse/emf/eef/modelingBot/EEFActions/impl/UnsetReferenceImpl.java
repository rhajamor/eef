/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.modelingBot.EEFActions.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.extended.editor.ReferenceableObject;

import org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage;
import org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unset Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetReferenceImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetReferenceImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnsetReferenceImpl extends EditActionImpl implements UnsetReference {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableObject> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsetReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EEFActionsPackage.Literals.UNSET_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEFActionsPackage.UNSET_REFERENCE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFActionsPackage.UNSET_REFERENCE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableObject> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<ReferenceableObject>(ReferenceableObject.class, this, EEFActionsPackage.UNSET_REFERENCE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EEFActionsPackage.UNSET_REFERENCE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case EEFActionsPackage.UNSET_REFERENCE__VALUES:
				return getValues();
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
			case EEFActionsPackage.UNSET_REFERENCE__FEATURE:
				setFeature((EStructuralFeature)newValue);
				return;
			case EEFActionsPackage.UNSET_REFERENCE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends ReferenceableObject>)newValue);
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
			case EEFActionsPackage.UNSET_REFERENCE__FEATURE:
				setFeature((EStructuralFeature)null);
				return;
			case EEFActionsPackage.UNSET_REFERENCE__VALUES:
				getValues().clear();
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
			case EEFActionsPackage.UNSET_REFERENCE__FEATURE:
				return feature != null;
			case EEFActionsPackage.UNSET_REFERENCE__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnsetReferenceImpl
