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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.mapping.AbstractElementBinding;
import org.eclipse.emf.eef.mapping.AbstractPropertyBinding;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.BindingFilter;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.impl.DocumentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Property Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl#getBindingFilters <em>Binding Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPropertyBindingImpl extends DocumentedElementImpl
		implements AbstractPropertyBinding {
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
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementEditor> views;

	/**
	 * The cached value of the '{@link #getBindingFilters() <em>Binding Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingFilter> bindingFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPropertyBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.ABSTRACT_PROPERTY_BINDING;
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
					MappingPackage.ABSTRACT_PROPERTY_BINDING__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementEditor> getViews() {
		if (views == null) {
			views = new EObjectResolvingEList<ElementEditor>(
					ElementEditor.class, this,
					MappingPackage.ABSTRACT_PROPERTY_BINDING__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementBinding getElement() {
		if (eContainerFeatureID() != MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT)
			return null;
		return (AbstractElementBinding) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(AbstractElementBinding newElement,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newElement,
				MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(AbstractElementBinding newElement) {
		if (newElement != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject) newElement).eInverseAdd(this,
						MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES,
						AbstractElementBinding.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT,
					newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingFilter> getBindingFilters() {
		if (bindingFilters == null) {
			bindingFilters = new EObjectContainmentEList<BindingFilter>(
					BindingFilter.class, this,
					MappingPackage.ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS);
		}
		return bindingFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetElement((AbstractElementBinding) otherEnd, msgs);
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
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			return basicSetElement(null, msgs);
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS:
			return ((InternalEList<?>) getBindingFilters()).basicRemove(
					otherEnd, msgs);
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
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES,
					AbstractElementBinding.class, msgs);
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
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__NAME:
			return getName();
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__VIEWS:
			return getViews();
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			return getElement();
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS:
			return getBindingFilters();
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
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__NAME:
			setName((String) newValue);
			return;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__VIEWS:
			getViews().clear();
			getViews().addAll((Collection<? extends ElementEditor>) newValue);
			return;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			setElement((AbstractElementBinding) newValue);
			return;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS:
			getBindingFilters().clear();
			getBindingFilters().addAll(
					(Collection<? extends BindingFilter>) newValue);
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
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__VIEWS:
			getViews().clear();
			return;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			setElement((AbstractElementBinding) null);
			return;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS:
			getBindingFilters().clear();
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
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__VIEWS:
			return views != null && !views.isEmpty();
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT:
			return getElement() != null;
		case MappingPackage.ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS:
			return bindingFilters != null && !bindingFilters.isEmpty();
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

} //AbstractPropertyBindingImpl
