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
package org.eclipse.emf.eef.views.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.views.Container;
import org.eclipse.emf.eef.views.IdentifiedElement;
import org.eclipse.emf.eef.views.ViewElement;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclispe.emf.eef.views.helpers.NamingHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ContainerImpl#getQualifiedIdentifier <em>Qualified Identifier</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ContainerImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends ViewElementImpl implements Container {
	/**
	 * The default value of the '{@link #getQualifiedIdentifier() <em>Qualified Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedIdentifier() {
		StringBuilder result = new StringBuilder(name);
		result.append(NamingHelper.nameDiscriminator(this));
		EObject container = this.eContainer();
		while (container != null) {
			if (container instanceof IdentifiedElement) {
				result.insert(0, "::"); //$NON-NLS-1$
				result.insert(0, ((IdentifiedElement) container).getQualifiedIdentifier());
				return result.toString();
			}
			container = container.eContainer();
		}
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<ViewElement>(ViewElement.class, this, ViewsPackage.CONTAINER__ELEMENTS, ViewsPackage.VIEW_ELEMENT__CONTAINER);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewsPackage.CONTAINER__ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewsPackage.CONTAINER__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case ViewsPackage.CONTAINER__QUALIFIED_IDENTIFIER:
			return getQualifiedIdentifier();
		case ViewsPackage.CONTAINER__ELEMENTS:
			return getElements();
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
		case ViewsPackage.CONTAINER__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ViewElement>) newValue);
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
		case ViewsPackage.CONTAINER__ELEMENTS:
			getElements().clear();
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
		case ViewsPackage.CONTAINER__QUALIFIED_IDENTIFIER:
			return QUALIFIED_IDENTIFIER_EDEFAULT == null ? getQualifiedIdentifier() != null : !QUALIFIED_IDENTIFIER_EDEFAULT.equals(getQualifiedIdentifier());
		case ViewsPackage.CONTAINER__ELEMENTS:
			return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
			case ViewsPackage.CONTAINER__QUALIFIED_IDENTIFIER:
				return ViewsPackage.IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
			case ViewsPackage.IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER:
				return ViewsPackage.CONTAINER__QUALIFIED_IDENTIFIER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ContainerImpl
