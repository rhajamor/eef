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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.mapping.AbstractElementBinding;
import org.eclipse.emf.eef.mapping.Category;
import org.eclipse.emf.eef.mapping.Databinding;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.views.impl.DocumentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.CategoryImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.CategoryImpl#getDatabinding <em>Databinding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.CategoryImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends DocumentedElementImpl implements Category {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.CATEGORY__NAME, oldName, name));
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
					MappingPackage.CATEGORY__BINDINGS,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Databinding getDatabinding() {
		if (eContainerFeatureID() != MappingPackage.CATEGORY__DATABINDING)
			return null;
		return (Databinding) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabinding(Databinding newDatabinding,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDatabinding,
				MappingPackage.CATEGORY__DATABINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabinding(Databinding newDatabinding) {
		if (newDatabinding != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.CATEGORY__DATABINDING && newDatabinding != null)) {
			if (EcoreUtil.isAncestor(this, newDatabinding))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatabinding != null)
				msgs = ((InternalEObject) newDatabinding).eInverseAdd(this,
						MappingPackage.DATABINDING__CATEGORIES,
						Databinding.class, msgs);
			msgs = basicSetDatabinding(newDatabinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.CATEGORY__DATABINDING, newDatabinding,
					newDatabinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class,
					this, MappingPackage.CATEGORY__CATEGORIES);
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
		case MappingPackage.CATEGORY__BINDINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBindings())
					.basicAdd(otherEnd, msgs);
		case MappingPackage.CATEGORY__DATABINDING:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDatabinding((Databinding) otherEnd, msgs);
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
		case MappingPackage.CATEGORY__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd,
					msgs);
		case MappingPackage.CATEGORY__DATABINDING:
			return basicSetDatabinding(null, msgs);
		case MappingPackage.CATEGORY__CATEGORIES:
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MappingPackage.CATEGORY__DATABINDING:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.DATABINDING__CATEGORIES, Databinding.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MappingPackage.CATEGORY__NAME:
			return getName();
		case MappingPackage.CATEGORY__BINDINGS:
			return getBindings();
		case MappingPackage.CATEGORY__DATABINDING:
			return getDatabinding();
		case MappingPackage.CATEGORY__CATEGORIES:
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
		case MappingPackage.CATEGORY__NAME:
			setName((String) newValue);
			return;
		case MappingPackage.CATEGORY__BINDINGS:
			getBindings().clear();
			getBindings().addAll(
					(Collection<? extends AbstractElementBinding>) newValue);
			return;
		case MappingPackage.CATEGORY__DATABINDING:
			setDatabinding((Databinding) newValue);
			return;
		case MappingPackage.CATEGORY__CATEGORIES:
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
		case MappingPackage.CATEGORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MappingPackage.CATEGORY__BINDINGS:
			getBindings().clear();
			return;
		case MappingPackage.CATEGORY__DATABINDING:
			setDatabinding((Databinding) null);
			return;
		case MappingPackage.CATEGORY__CATEGORIES:
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
		case MappingPackage.CATEGORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case MappingPackage.CATEGORY__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case MappingPackage.CATEGORY__DATABINDING:
			return getDatabinding() != null;
		case MappingPackage.CATEGORY__CATEGORIES:
			return categories != null && !categories.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
