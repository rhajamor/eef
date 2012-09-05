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
package org.eclipse.emf.eef.mapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.mapping.AbstractElementBinding;
import org.eclipse.emf.eef.mapping.Category;
import org.eclipse.emf.eef.mapping.Databinding;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.views.impl.DocumentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databinding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.DatabindingImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.DatabindingImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabindingImpl extends DocumentedElementImpl implements
		Databinding {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElementBinding> bindings;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.DATABINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElementBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<AbstractElementBinding>(
					AbstractElementBinding.class, this,
					MappingPackage.DATABINDING__BINDINGS,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentWithInverseEList<Category>(
					Category.class, this,
					MappingPackage.DATABINDING__CATEGORIES,
					MappingPackage.CATEGORY__DATABINDING);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MappingPackage.DATABINDING__BINDINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBindings())
					.basicAdd(otherEnd, msgs);
		case MappingPackage.DATABINDING__CATEGORIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCategories())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case MappingPackage.DATABINDING__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd,
					msgs);
		case MappingPackage.DATABINDING__CATEGORIES:
			return ((InternalEList<?>) getCategories()).basicRemove(otherEnd,
					msgs);
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
		case MappingPackage.DATABINDING__BINDINGS:
			return getBindings();
		case MappingPackage.DATABINDING__CATEGORIES:
			return getCategories();
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
		case MappingPackage.DATABINDING__BINDINGS:
			getBindings().clear();
			getBindings().addAll(
					(Collection<? extends AbstractElementBinding>) newValue);
			return;
		case MappingPackage.DATABINDING__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends Category>) newValue);
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
		case MappingPackage.DATABINDING__BINDINGS:
			getBindings().clear();
			return;
		case MappingPackage.DATABINDING__CATEGORIES:
			getCategories().clear();
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
		case MappingPackage.DATABINDING__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case MappingPackage.DATABINDING__CATEGORIES:
			return categories != null && !categories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabindingImpl
