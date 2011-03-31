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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.views.IdentifiedElement;
import org.eclipse.emf.eef.views.ViewElement;
import org.eclipse.emf.eef.views.ViewReference;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclispe.emf.eef.views.helpers.NamingHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewReferenceImpl#getQualifiedIdentifier <em>Qualified Identifier</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.impl.ViewReferenceImpl#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewReferenceImpl extends ViewElementImpl implements ViewReference {
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
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected ViewElement view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.VIEW_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedIdentifier() {
		if (name == null)
			setName("");
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
	public ViewElement getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject) view;
			view = (ViewElement) eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.VIEW_REFERENCE__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(ViewElement newView) {
		ViewElement oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.VIEW_REFERENCE__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ViewsPackage.VIEW_REFERENCE__QUALIFIED_IDENTIFIER:
			return getQualifiedIdentifier();
		case ViewsPackage.VIEW_REFERENCE__VIEW:
			if (resolve)
				return getView();
			return basicGetView();
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
		case ViewsPackage.VIEW_REFERENCE__VIEW:
			setView((ViewElement) newValue);
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
		case ViewsPackage.VIEW_REFERENCE__VIEW:
			setView((ViewElement) null);
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
		case ViewsPackage.VIEW_REFERENCE__QUALIFIED_IDENTIFIER:
			return QUALIFIED_IDENTIFIER_EDEFAULT == null ? getQualifiedIdentifier() != null : !QUALIFIED_IDENTIFIER_EDEFAULT.equals(getQualifiedIdentifier());
		case ViewsPackage.VIEW_REFERENCE__VIEW:
			return view != null;
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
			case ViewsPackage.VIEW_REFERENCE__QUALIFIED_IDENTIFIER:
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
				return ViewsPackage.VIEW_REFERENCE__QUALIFIED_IDENTIFIER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ViewReferenceImpl
