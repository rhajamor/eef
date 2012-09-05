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
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class StructuredModelNavigationImpl extends ModelNavigationImpl
		implements StructuredModelNavigation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredModelNavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.STRUCTURED_MODEL_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EClass evaluate();

} //StructuredModelNavigationImpl
