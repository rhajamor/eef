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
package org.eclipse.emf.eef.mapping.navigation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage
 * @generated
 */
public interface NavigationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationFactory eINSTANCE = org.eclipse.emf.eef.mapping.navigation.impl.NavigationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Simple Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Model Navigation</em>'.
	 * @generated
	 */
	SimpleModelNavigation createSimpleModelNavigation();

	/**
	 * Returns a new object of class '<em>Chained Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chained Model Navigation</em>'.
	 * @generated
	 */
	ChainedModelNavigation createChainedModelNavigation();

	/**
	 * Returns a new object of class '<em>Custom Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Model Navigation</em>'.
	 * @generated
	 */
	CustomModelNavigation createCustomModelNavigation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NavigationPackage getNavigationPackage();

} //NavigationFactory
