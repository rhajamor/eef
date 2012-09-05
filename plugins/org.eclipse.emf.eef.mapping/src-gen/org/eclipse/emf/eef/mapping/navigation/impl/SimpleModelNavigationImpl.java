/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl#getDiscriminatorType <em>Discriminator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleModelNavigationImpl extends StructuredModelNavigationImpl
		implements SimpleModelNavigation {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference feature;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier discriminatorType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleModelNavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.SIMPLE_MODEL_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject) feature;
			feature = (EReference) eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NavigationPackage.SIMPLE_MODEL_NAVIGATION__FEATURE,
							oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EReference newFeature) {
		EReference oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.SIMPLE_MODEL_NAVIGATION__FEATURE,
					oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.SIMPLE_MODEL_NAVIGATION__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getDiscriminatorType() {
		if (discriminatorType != null && discriminatorType.eIsProxy()) {
			InternalEObject oldDiscriminatorType = (InternalEObject) discriminatorType;
			discriminatorType = (EClassifier) eResolveProxy(oldDiscriminatorType);
			if (discriminatorType != oldDiscriminatorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							NavigationPackage.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE,
							oldDiscriminatorType, discriminatorType));
			}
		}
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetDiscriminatorType() {
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorType(EClassifier newDiscriminatorType) {
		EClassifier oldDiscriminatorType = discriminatorType;
		discriminatorType = newDiscriminatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					NavigationPackage.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE,
					oldDiscriminatorType, discriminatorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__FEATURE:
			if (resolve)
				return getFeature();
			return basicGetFeature();
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__INDEX:
			return getIndex();
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE:
			if (resolve)
				return getDiscriminatorType();
			return basicGetDiscriminatorType();
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
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__FEATURE:
			setFeature((EReference) newValue);
			return;
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__INDEX:
			setIndex((Integer) newValue);
			return;
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE:
			setDiscriminatorType((EClassifier) newValue);
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
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__FEATURE:
			setFeature((EReference) null);
			return;
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE:
			setDiscriminatorType((EClassifier) null);
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
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__FEATURE:
			return feature != null;
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__INDEX:
			return index != INDEX_EDEFAULT;
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE:
			return discriminatorType != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.StructuredModelNavigationImpl#evaluate()
	 * @generated NOT
	 */
	public EClass evaluate() {
		if (getFeature() != null && getFeature().getEType() instanceof EClass) {
			EClass featureType = (EClass) getFeature().getEType();
			EClassifier discriminatorType = getDiscriminatorType();
			if (discriminatorType != null
					&& discriminatorType instanceof EClass) {
				if (featureType.isSuperTypeOf((EClass) discriminatorType))
					return (EClass) discriminatorType;
			}
			return featureType;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#owningEClass()
	 * @generated NOT
	 */
	public EClass owningEClass() {
		if (eContainer() instanceof EMFPropertyBinding) {
			EMFPropertyBinding propertyBinding = (EMFPropertyBinding) eContainer();
			if (propertyBinding.eContainer() instanceof EMFElementBinding) {
				EMFElementBinding elementBinding = (EMFElementBinding) propertyBinding
						.eContainer();
				if (elementBinding.getModel() instanceof EClass)
					return (EClass) elementBinding.getModel();
			}
		} else if (eContainer() instanceof ChainedModelNavigation) {
			ChainedModelNavigation container = (ChainedModelNavigation) eContainer();
			if (NavigationPackage.eINSTANCE.getChainedModelNavigation_Current() == eContainingFeature())
				return container.owningEClass();
			else if (NavigationPackage.eINSTANCE
					.getChainedModelNavigation_Next() == eContainingFeature())
				return container.currentEClass();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#targetEClass()
	 * @generated NOT
	 */
	public EClass targetEClass() {
		if (getFeature().getEType() instanceof EClass) {
			EClass featureType = (EClass) getFeature().getEType();
			if (getDiscriminatorType() != null
					&& getDiscriminatorType() instanceof EClass) {
				EClass discriminatorType = (EClass) getDiscriminatorType();
				if (featureType.isSuperTypeOf(discriminatorType))
					return discriminatorType;
			}
			return (EClass) getFeature().getEType();
		}
		return null;
	}

} //SimpleModelNavigationImpl
