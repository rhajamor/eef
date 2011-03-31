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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.mapping.AbstractElementBinding;
import org.eclipse.emf.eef.mapping.AbstractPropertyBinding;
import org.eclipse.emf.eef.mapping.Category;
import org.eclipse.emf.eef.mapping.Databinding;
import org.eclipse.emf.eef.mapping.ElementBindingReference;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.BindingFilter;
import org.eclipse.emf.eef.views.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getDatabinding <em>Databinding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getReferencedBinding <em>Referenced Binding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl#getBindingFilters <em>Binding Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractElementBindingImpl extends DocumentedElementImpl
		implements AbstractElementBinding {
	/**
	 * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElementBinding> subElements;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyBinding> properties;

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
	 * The cached value of the '{@link #getReferencedBinding() <em>Referenced Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementBindingReference> referencedBinding;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

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
	protected AbstractElementBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElementBinding> getSubElements() {
		if (subElements == null) {
			subElements = new EObjectContainmentWithInverseEList<AbstractElementBinding>(
					AbstractElementBinding.class, this,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT);
		}
		return subElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyBinding> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<AbstractPropertyBinding>(
					AbstractPropertyBinding.class, this,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES,
					MappingPackage.ABSTRACT_PROPERTY_BINDING__ELEMENT);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Databinding getDatabinding() {
		if (eContainerFeatureID() != MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING)
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
				MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabinding(Databinding newDatabinding) {
		if (newDatabinding != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING && newDatabinding != null)) {
			if (EcoreUtil.isAncestor(this, newDatabinding))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatabinding != null)
				msgs = ((InternalEObject) newDatabinding).eInverseAdd(this,
						MappingPackage.DATABINDING__BINDINGS,
						Databinding.class, msgs);
			msgs = basicSetDatabinding(newDatabinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING,
					newDatabinding, newDatabinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementBinding getSuperElement() {
		if (eContainerFeatureID() != MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT)
			return null;
		return (AbstractElementBinding) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperElement(
			AbstractElementBinding newSuperElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperElement,
				MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperElement(AbstractElementBinding newSuperElement) {
		if (newSuperElement != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT && newSuperElement != null)) {
			if (EcoreUtil.isAncestor(this, newSuperElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperElement != null)
				msgs = ((InternalEObject) newSuperElement).eInverseAdd(this,
						MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS,
						AbstractElementBinding.class, msgs);
			msgs = basicSetSuperElement(newSuperElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT,
					newSuperElement, newSuperElement));
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
					MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementBindingReference> getReferencedBinding() {
		if (referencedBinding == null) {
			referencedBinding = new EObjectContainmentEList<ElementBindingReference>(
					ElementBindingReference.class, this,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING);
		}
		return referencedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectResolvingEList<View>(View.class, this,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (eContainerFeatureID() != MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY)
			return null;
		return (Category) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCategory,
				MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject) newCategory)
						.eInverseAdd(this, MappingPackage.CATEGORY__BINDINGS,
								Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY,
					newCategory, newCategory));
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
					MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS);
		}
		return bindingFilters;
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubElements())
					.basicAdd(otherEnd, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProperties())
					.basicAdd(otherEnd, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDatabinding((Databinding) otherEnd, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperElement((AbstractElementBinding) otherEnd, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCategory((Category) otherEnd, msgs);
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
			return ((InternalEList<?>) getSubElements()).basicRemove(otherEnd,
					msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd,
					msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			return basicSetDatabinding(null, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			return basicSetSuperElement(null, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING:
			return ((InternalEList<?>) getReferencedBinding()).basicRemove(
					otherEnd, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			return basicSetCategory(null, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS:
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.DATABINDING__BINDINGS, Databinding.class,
					msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS,
					AbstractElementBinding.class, msgs);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.CATEGORY__BINDINGS, Category.class, msgs);
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
			return getSubElements();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
			return getProperties();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			return getDatabinding();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			return getSuperElement();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME:
			return getName();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING:
			return getReferencedBinding();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__VIEWS:
			return getViews();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			return getCategory();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS:
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
			getSubElements().clear();
			getSubElements().addAll(
					(Collection<? extends AbstractElementBinding>) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
			getProperties().clear();
			getProperties().addAll(
					(Collection<? extends AbstractPropertyBinding>) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			setDatabinding((Databinding) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			setSuperElement((AbstractElementBinding) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME:
			setName((String) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING:
			getReferencedBinding().clear();
			getReferencedBinding().addAll(
					(Collection<? extends ElementBindingReference>) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__VIEWS:
			getViews().clear();
			getViews().addAll((Collection<? extends View>) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			setCategory((Category) newValue);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS:
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
			getSubElements().clear();
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
			getProperties().clear();
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			setDatabinding((Databinding) null);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			setSuperElement((AbstractElementBinding) null);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING:
			getReferencedBinding().clear();
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__VIEWS:
			getViews().clear();
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			setCategory((Category) null);
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS:
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
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
			return subElements != null && !subElements.isEmpty();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING:
			return getDatabinding() != null;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT:
			return getSuperElement() != null;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING:
			return referencedBinding != null && !referencedBinding.isEmpty();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__VIEWS:
			return views != null && !views.isEmpty();
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY:
			return getCategory() != null;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS:
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

} //AbstractElementBindingImpl
