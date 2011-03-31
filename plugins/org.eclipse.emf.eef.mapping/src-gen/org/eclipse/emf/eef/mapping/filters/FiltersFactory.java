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
package org.eclipse.emf.eef.mapping.filters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.mapping.filters.FiltersPackage
 * @generated
 */
public interface FiltersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersFactory eINSTANCE = org.eclipse.emf.eef.mapping.filters.impl.FiltersFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>OCL Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Filter</em>'.
	 * @generated
	 */
	OCLFilter createOCLFilter();

	/**
	 * Returns a new object of class '<em>Java Declaration Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Declaration Filter</em>'.
	 * @generated
	 */
	JavaDeclarationFilter createJavaDeclarationFilter();

	/**
	 * Returns a new object of class '<em>Java Expression Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Expression Filter</em>'.
	 * @generated
	 */
	JavaExpressionFilter createJavaExpressionFilter();

	/**
	 * Returns a new object of class '<em>Only Reference Type Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Only Reference Type Filter</em>'.
	 * @generated
	 */
	OnlyReferenceTypeFilter createOnlyReferenceTypeFilter();

	/**
	 * Returns a new object of class '<em>Strict Typing Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strict Typing Filter</em>'.
	 * @generated
	 */
	StrictTypingFilter createStrictTypingFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FiltersPackage getFiltersPackage();

} //FiltersFactory
