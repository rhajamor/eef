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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getDiscriminatorType <em>Discriminator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getSimpleModelNavigation()
 * @model
 * @generated
 */
public interface SimpleModelNavigation extends StructuredModelNavigation {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EReference)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getSimpleModelNavigation_Feature()
	 * @model required="true"
	 * @generated
	 */
	EReference getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getSimpleModelNavigation_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' reference.
	 * @see #setDiscriminatorType(EClassifier)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getSimpleModelNavigation_DiscriminatorType()
	 * @model
	 * @generated
	 */
	EClassifier getDiscriminatorType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getDiscriminatorType <em>Discriminator Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' reference.
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(EClassifier value);

	/**
	 * @return the owning EClass
	 * @generated NOT
	 */
	EClass owningEClass();

	/**
	 * @return the current EClass
	 * @generated NOT
	 */
	EClass targetEClass();

} // SimpleModelNavigation
