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
package org.eclipse.emf.eef.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingFactory eINSTANCE = org.eclipse.emf.eef.mapping.impl.MappingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Databinding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databinding</em>'.
	 * @generated
	 */
	Databinding createDatabinding();

	/**
	 * Returns a new object of class '<em>EMF Element Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Element Binding</em>'.
	 * @generated
	 */
	EMFElementBinding createEMFElementBinding();

	/**
	 * Returns a new object of class '<em>EMF Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Property Binding</em>'.
	 * @generated
	 */
	EMFPropertyBinding createEMFPropertyBinding();

	/**
	 * Returns a new object of class '<em>Standard Element Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Element Binding</em>'.
	 * @generated
	 */
	StandardElementBinding createStandardElementBinding();

	/**
	 * Returns a new object of class '<em>Standard Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Property Binding</em>'.
	 * @generated
	 */
	StandardPropertyBinding createStandardPropertyBinding();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Element Binding Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Binding Reference</em>'.
	 * @generated
	 */
	ElementBindingReference createElementBindingReference();

	/**
	 * Returns a new object of class '<em>EMF Multi Properties Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Multi Properties Binding</em>'.
	 * @generated
	 */
	EMFMultiPropertiesBinding createEMFMultiPropertiesBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingPackage getMappingPackage();

} //MappingFactory
