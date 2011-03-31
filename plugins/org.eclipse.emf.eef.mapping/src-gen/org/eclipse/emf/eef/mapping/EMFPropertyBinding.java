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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.mapping.navigation.ModelNavigation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding#getNavigation <em>Navigation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.MappingPackage#getEMFPropertyBinding()
 * @model
 * @generated
 */
public interface EMFPropertyBinding extends AbstractPropertyBinding {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EStructuralFeature)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getEMFPropertyBinding_Model()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Navigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation</em>' containment reference.
	 * @see #setNavigation(ModelNavigation)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getEMFPropertyBinding_Navigation()
	 * @model containment="true"
	 * @generated
	 */
	ModelNavigation getNavigation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding#getNavigation <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation</em>' containment reference.
	 * @see #getNavigation()
	 * @generated
	 */
	void setNavigation(ModelNavigation value);

} // EMFPropertyBinding
