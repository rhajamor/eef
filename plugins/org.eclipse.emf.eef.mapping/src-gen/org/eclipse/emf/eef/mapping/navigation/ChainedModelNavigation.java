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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chained Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getChainedModelNavigation()
 * @model
 * @generated
 */
public interface ChainedModelNavigation extends StructuredModelNavigation {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' containment reference.
	 * @see #setCurrent(StructuredModelNavigation)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getChainedModelNavigation_Current()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructuredModelNavigation getCurrent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getCurrent <em>Current</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' containment reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(StructuredModelNavigation value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(StructuredModelNavigation)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getChainedModelNavigation_Next()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructuredModelNavigation getNext();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(StructuredModelNavigation value);

	/**
	 * @return the owning EClass
	 * @generated NOT
	 */
	EClass owningEClass();

	/**
	 * @return the current EClass
	 * @generated NOT
	 */
	EClass currentEClass();

} // ChainedModelNavigation
