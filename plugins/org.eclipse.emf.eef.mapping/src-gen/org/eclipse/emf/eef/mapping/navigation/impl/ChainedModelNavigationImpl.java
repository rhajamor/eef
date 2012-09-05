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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chained Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.ChainedModelNavigationImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.ChainedModelNavigationImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainedModelNavigationImpl extends StructuredModelNavigationImpl
		implements ChainedModelNavigation {
	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected StructuredModelNavigation current;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected StructuredModelNavigation next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainedModelNavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.CHAINED_MODEL_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredModelNavigation getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrent(
			StructuredModelNavigation newCurrent, NotificationChain msgs) {
		StructuredModelNavigation oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT,
					oldCurrent, newCurrent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(StructuredModelNavigation newCurrent) {
		if (newCurrent != current) {
			NotificationChain msgs = null;
			if (current != null)
				msgs = ((InternalEObject) current)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT,
								null, msgs);
			if (newCurrent != null)
				msgs = ((InternalEObject) newCurrent)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT,
								null, msgs);
			msgs = basicSetCurrent(newCurrent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT,
					newCurrent, newCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredModelNavigation getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(StructuredModelNavigation newNext,
			NotificationChain msgs) {
		StructuredModelNavigation oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT, oldNext,
					newNext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(StructuredModelNavigation newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT,
								null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT,
								null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT, newNext,
					newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT:
			return basicSetCurrent(null, msgs);
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT:
			return basicSetNext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT:
			return getCurrent();
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT:
			return getNext();
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
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT:
			setCurrent((StructuredModelNavigation) newValue);
			return;
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT:
			setNext((StructuredModelNavigation) newValue);
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
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT:
			setCurrent((StructuredModelNavigation) null);
			return;
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT:
			setNext((StructuredModelNavigation) null);
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
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__CURRENT:
			return current != null;
		case NavigationPackage.CHAINED_MODEL_NAVIGATION__NEXT:
			return next != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.StructuredModelNavigationImpl#evaluate()
	 * @generated NOT
	 */
	@Override
	public EClass evaluate() {
		if (getNext() != null)
			return getNext().evaluate();
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#owningEClass()
	 * @generated NOT
	 */
	public EClass owningEClass() {
		if (this.eContainer() instanceof EMFPropertyBinding) {
			EMFPropertyBinding propertyBinding = (EMFPropertyBinding) this
					.eContainer();
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
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#currentEClass()
	 * @generated NOT
	 */
	public EClass currentEClass() {
		if (getCurrent() instanceof SimpleModelNavigation) {
			SimpleModelNavigation smn = (SimpleModelNavigation) getCurrent();
			return smn.targetEClass();
		}
		return null;
	}

} //ChainedModelNavigationImpl
