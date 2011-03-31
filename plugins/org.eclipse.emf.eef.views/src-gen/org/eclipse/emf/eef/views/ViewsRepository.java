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
package org.eclipse.emf.eef.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.ViewsRepository#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.ViewsRepository#getRepositoryKind <em>Repository Kind</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.ViewsRepository#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.ViewsRepository#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewsRepository()
 * @model
 * @generated
 */
public interface ViewsRepository extends DocumentedElement, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.views.View}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.views.View#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewsRepository_Views()
	 * @see org.eclipse.emf.eef.views.View#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Repository Kind</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Kind</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Kind</em>' attribute list.
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewsRepository_RepositoryKind()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getRepositoryKind();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.views.Category}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.views.Category#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewsRepository_Categories()
	 * @see org.eclipse.emf.eef.views.Category#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewsRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.views.ViewsRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ViewsRepository
