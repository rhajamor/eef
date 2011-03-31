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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.eef.views.IdentifiedElement;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.impl.IdentifiedElementImpl#getQualifiedIdentifier <em>Qualified Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IdentifiedElementImpl extends EObjectImpl implements IdentifiedElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IDENTIFIED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getQualifiedIdentifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void setQualifiedIdentifier(String newQualifiedIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ViewsPackage.IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER:
			return getQualifiedIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ViewsPackage.IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER:
			return QUALIFIED_IDENTIFIER_EDEFAULT == null ? getQualifiedIdentifier() != null : !QUALIFIED_IDENTIFIER_EDEFAULT.equals(getQualifiedIdentifier());
		}
		return super.eIsSet(featureID);
	}

} //IdentifiedElementImpl
