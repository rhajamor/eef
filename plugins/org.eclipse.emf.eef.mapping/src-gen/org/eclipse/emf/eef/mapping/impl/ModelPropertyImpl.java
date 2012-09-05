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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.ModelElement;
import org.eclipse.emf.eef.mapping.ModelProperty;
import org.eclipse.emf.eef.mapping.StandardPropertyBinding;
import org.eclipse.emf.eef.views.impl.DocumentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.ModelPropertyImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.impl.ModelPropertyImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelPropertyImpl extends DocumentedElementImpl implements
		ModelProperty {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected StandardPropertyBinding binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MODEL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPropertyBinding getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject) binding;
			binding = (StandardPropertyBinding) eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MappingPackage.MODEL_PROPERTY__BINDING, oldBinding,
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
	public StandardPropertyBinding basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(
			StandardPropertyBinding newBinding, NotificationChain msgs) {
		StandardPropertyBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MappingPackage.MODEL_PROPERTY__BINDING,
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
	public void setBinding(StandardPropertyBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this,
						MappingPackage.STANDARD_PROPERTY_BINDING__MODEL,
						StandardPropertyBinding.class, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject) newBinding).eInverseAdd(this,
						MappingPackage.STANDARD_PROPERTY_BINDING__MODEL,
						StandardPropertyBinding.class, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.MODEL_PROPERTY__BINDING, newBinding,
					newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getModelElement() {
		if (eContainerFeatureID() != MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT)
			return null;
		return (ModelElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElement(ModelElement newModelElement,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModelElement,
				MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(ModelElement newModelElement) {
		if (newModelElement != eInternalContainer()
				|| (eContainerFeatureID() != MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT && newModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newModelElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelElement != null)
				msgs = ((InternalEObject) newModelElement).eInverseAdd(this,
						MappingPackage.MODEL_ELEMENT__PROPERTIES,
						ModelElement.class, msgs);
			msgs = basicSetModelElement(newModelElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT,
					newModelElement, newModelElement));
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
		case MappingPackage.MODEL_PROPERTY__BINDING:
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this,
						MappingPackage.STANDARD_PROPERTY_BINDING__MODEL,
						StandardPropertyBinding.class, msgs);
			return basicSetBinding((StandardPropertyBinding) otherEnd, msgs);
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModelElement((ModelElement) otherEnd, msgs);
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
		case MappingPackage.MODEL_PROPERTY__BINDING:
			return basicSetBinding(null, msgs);
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			return basicSetModelElement(null, msgs);
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
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					MappingPackage.MODEL_ELEMENT__PROPERTIES,
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
		case MappingPackage.MODEL_PROPERTY__BINDING:
			if (resolve)
				return getBinding();
			return basicGetBinding();
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			return getModelElement();
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
		case MappingPackage.MODEL_PROPERTY__BINDING:
			setBinding((StandardPropertyBinding) newValue);
			return;
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			setModelElement((ModelElement) newValue);
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
		case MappingPackage.MODEL_PROPERTY__BINDING:
			setBinding((StandardPropertyBinding) null);
			return;
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			setModelElement((ModelElement) null);
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
		case MappingPackage.MODEL_PROPERTY__BINDING:
			return binding != null;
		case MappingPackage.MODEL_PROPERTY__MODEL_ELEMENT:
			return getModelElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelPropertyImpl
