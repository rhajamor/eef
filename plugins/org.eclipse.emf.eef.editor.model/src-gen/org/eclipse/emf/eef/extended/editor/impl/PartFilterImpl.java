/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.eef.extended.editor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.PartFilter;
import org.eclipse.emf.eef.mapping.filters.impl.BindingFilterImpl;
import org.eclipse.emf.eef.views.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.impl.PartFilterImpl#getFilteredPart <em>Filtered Part</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.impl.PartFilterImpl#getContextualComponent <em>Contextual Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartFilterImpl extends BindingFilterImpl implements PartFilter {
	/**
	 * The cached value of the '{@link #getFilteredPart() <em>Filtered Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredPart()
	 * @generated
	 * @ordered
	 */
	protected View filteredPart;

	/**
	 * The cached value of the '{@link #getContextualComponent() <em>Contextual Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualComponent()
	 * @generated
	 * @ordered
	 */
	protected PropertiesEditionComponent contextualComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditorPackage.Literals.PART_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getFilteredPart() {
		if (filteredPart != null && filteredPart.eIsProxy()) {
			InternalEObject oldFilteredPart = (InternalEObject)filteredPart;
			filteredPart = (View)eResolveProxy(oldFilteredPart);
			if (filteredPart != oldFilteredPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditorPackage.PART_FILTER__FILTERED_PART, oldFilteredPart, filteredPart));
			}
		}
		return filteredPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetFilteredPart() {
		return filteredPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteredPart(View newFilteredPart) {
		View oldFilteredPart = filteredPart;
		filteredPart = newFilteredPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PART_FILTER__FILTERED_PART, oldFilteredPart, filteredPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionComponent getContextualComponent() {
		if (contextualComponent != null && contextualComponent.eIsProxy()) {
			InternalEObject oldContextualComponent = (InternalEObject)contextualComponent;
			contextualComponent = (PropertiesEditionComponent)eResolveProxy(oldContextualComponent);
			if (contextualComponent != oldContextualComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditorPackage.PART_FILTER__CONTEXTUAL_COMPONENT, oldContextualComponent, contextualComponent));
			}
		}
		return contextualComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionComponent basicGetContextualComponent() {
		return contextualComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualComponent(PropertiesEditionComponent newContextualComponent) {
		PropertiesEditionComponent oldContextualComponent = contextualComponent;
		contextualComponent = newContextualComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PART_FILTER__CONTEXTUAL_COMPONENT, oldContextualComponent, contextualComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditorPackage.PART_FILTER__FILTERED_PART:
				if (resolve) return getFilteredPart();
				return basicGetFilteredPart();
			case EditorPackage.PART_FILTER__CONTEXTUAL_COMPONENT:
				if (resolve) return getContextualComponent();
				return basicGetContextualComponent();
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
			case EditorPackage.PART_FILTER__FILTERED_PART:
				setFilteredPart((View)newValue);
				return;
			case EditorPackage.PART_FILTER__CONTEXTUAL_COMPONENT:
				setContextualComponent((PropertiesEditionComponent)newValue);
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
			case EditorPackage.PART_FILTER__FILTERED_PART:
				setFilteredPart((View)null);
				return;
			case EditorPackage.PART_FILTER__CONTEXTUAL_COMPONENT:
				setContextualComponent((PropertiesEditionComponent)null);
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
			case EditorPackage.PART_FILTER__FILTERED_PART:
				return filteredPart != null;
			case EditorPackage.PART_FILTER__CONTEXTUAL_COMPONENT:
				return contextualComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //PartFilterImpl
