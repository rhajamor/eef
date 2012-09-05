/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarative Navigation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl#getDiscriminatorType <em>Discriminator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarativeNavigationStepImpl extends NavigationStepImpl implements
		DeclarativeNavigationStep {
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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EReference feature;

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
	protected DeclarativeNavigationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DECLARATIVE_NAVIGATION_STEP;
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
					NavigationPackage.DECLARATIVE_NAVIGATION_STEP__INDEX,
					oldIndex, index));
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
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							NavigationPackage.DECLARATIVE_NAVIGATION_STEP__FEATURE,
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
					NavigationPackage.DECLARATIVE_NAVIGATION_STEP__FEATURE,
					oldFeature, feature));
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
							NavigationPackage.DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE,
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
					NavigationPackage.DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE,
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
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__INDEX:
			return getIndex();
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__FEATURE:
			if (resolve)
				return getFeature();
			return basicGetFeature();
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE:
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
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__INDEX:
			setIndex((Integer) newValue);
			return;
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__FEATURE:
			setFeature((EReference) newValue);
			return;
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE:
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
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__FEATURE:
			setFeature((EReference) null);
			return;
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE:
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
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__INDEX:
			return index != INDEX_EDEFAULT;
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__FEATURE:
			return feature != null;
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE:
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
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#owningEClass()
	 * @generated NOT
	 */
	public EClass owningEClass() {
		if (eContainer() instanceof SmartModelNavigation) {
			SmartModelNavigation modelNavigation = (SmartModelNavigation) eContainer();
			if (modelNavigation.eContainer() instanceof EMFPropertyBinding) {
				EMFPropertyBinding propertyBinding = (EMFPropertyBinding) modelNavigation.eContainer();
				if (propertyBinding.eContainer() instanceof EMFElementBinding) {
					EMFElementBinding elementBinding = (EMFElementBinding) propertyBinding
							.eContainer();
					if (elementBinding.getModel() instanceof EClass)
						return (EClass) elementBinding.getModel();
				}
			}
		}
		
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#currentEClass()
	 * @generated NOT
	 */
	public EClass currentEClass() {
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
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStep#evaluate()
	 * @generated NOT
	 */
	public EClass evaluate() {
		if (getSubStep() != null) {
			return getSubStep().evaluate();
		} else if (getFeature() != null && getFeature().getEType() instanceof EClass) {
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

} //DeclarativeNavigationStepImpl
