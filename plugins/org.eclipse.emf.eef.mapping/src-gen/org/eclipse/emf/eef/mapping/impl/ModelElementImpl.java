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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.ModelElement;
import org.eclipse.emf.eef.mapping.ModelProperty;
import org.eclipse.emf.eef.mapping.StandardElementBinding;
import org.eclipse.emf.eef.views.impl.DocumentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.ModelElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.ModelElementImpl#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.ModelElementImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.ModelElementImpl#getSuperElement <em>Super Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementImpl extends DocumentedElementImpl implements
		ModelElement {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelProperty> properties;

	/**
	 * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> subElements;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected StandardElementBinding binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<ModelProperty>(
					ModelProperty.class, this,
					MappingPackage.MODEL_ELEMENT__PROPERTIES,
					MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getSubElements() {
		if (subElements == null) {
			subElements = new EObjectContainmentWithInverseEList<ModelElement>(
					ModelElement.class, this,
					MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS,
					MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT);
		}
		return subElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardElementBinding getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject) binding;
			binding = (StandardElementBinding) eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MappingPackage.MODEL_ELEMENT__BINDING, oldBinding,
							binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardElementBinding basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(StandardElementBinding newBinding,
			NotificationChain msgs) {
		StandardElementBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MappingPackage.MODEL_ELEMENT__BINDING,
					oldBinding, newBinding);
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
	public void setBinding(StandardElementBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this,
						MappingPackage.STANDARD_ELEMENT_BINDING__MODEL,
						StandardElementBinding.class, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject) newBinding).eInverseAdd(this,
						MappingPackage.STANDARD_ELEMENT_BINDING__MODEL,
						StandardElementBinding.class, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.MODEL_ELEMENT__BINDING, newBinding,
					newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getSuperElement() {
		if (eContainerFeatureID() != MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT)
			return null;
		return (ModelElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperElement(ModelElement newSuperElement,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperElement,
				MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperElement(ModelElement newSuperElement) {
		if (newSuperElement != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT && newSuperElement != null)) {
			if (EcoreUtil.isAncestor(this, newSuperElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperElement != null)
				msgs = ((InternalEObject) newSuperElement).eInverseAdd(this,
						MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS,
						ModelElement.class, msgs);
			msgs = basicSetSuperElement(newSuperElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT,
					newSuperElement, newSuperElement));
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
		case MappingPackage.MODEL_ELEMENT__PROPERTIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProperties())
					.basicAdd(otherEnd, msgs);
		case MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubElements())
					.basicAdd(otherEnd, msgs);
		case MappingPackage.MODEL_ELEMENT__BINDING:
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this,
						MappingPackage.STANDARD_ELEMENT_BINDING__MODEL,
						StandardElementBinding.class, msgs);
			return basicSetBinding((StandardElementBinding) otherEnd, msgs);
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperElement((ModelElement) otherEnd, msgs);
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
		case MappingPackage.MODEL_ELEMENT__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd,
					msgs);
		case MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS:
			return ((InternalEList<?>) getSubElements()).basicRemove(otherEnd,
					msgs);
		case MappingPackage.MODEL_ELEMENT__BINDING:
			return basicSetBinding(null, msgs);
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			return basicSetSuperElement(null, msgs);
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
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS,
					ModelElement.class, msgs);
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
		case MappingPackage.MODEL_ELEMENT__PROPERTIES:
			return getProperties();
		case MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS:
			return getSubElements();
		case MappingPackage.MODEL_ELEMENT__BINDING:
			if (resolve)
				return getBinding();
			return basicGetBinding();
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			return getSuperElement();
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
		case MappingPackage.MODEL_ELEMENT__PROPERTIES:
			getProperties().clear();
			getProperties().addAll(
					(Collection<? extends ModelProperty>) newValue);
			return;
		case MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS:
			getSubElements().clear();
			getSubElements().addAll(
					(Collection<? extends ModelElement>) newValue);
			return;
		case MappingPackage.MODEL_ELEMENT__BINDING:
			setBinding((StandardElementBinding) newValue);
			return;
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			setSuperElement((ModelElement) newValue);
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
		case MappingPackage.MODEL_ELEMENT__PROPERTIES:
			getProperties().clear();
			return;
		case MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS:
			getSubElements().clear();
			return;
		case MappingPackage.MODEL_ELEMENT__BINDING:
			setBinding((StandardElementBinding) null);
			return;
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			setSuperElement((ModelElement) null);
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
		case MappingPackage.MODEL_ELEMENT__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MappingPackage.MODEL_ELEMENT__SUB_ELEMENTS:
			return subElements != null && !subElements.isEmpty();
		case MappingPackage.MODEL_ELEMENT__BINDING:
			return binding != null;
		case MappingPackage.MODEL_ELEMENT__SUPER_ELEMENT:
			return getSuperElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
