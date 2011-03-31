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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.View#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.View#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.views.View#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.views.ViewsPackage#getView()
 * @model
 * @generated
 */
public interface View extends Container, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.views.ViewsRepository#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(ViewsRepository)
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getView_Repository()
	 * @see org.eclipse.emf.eef.views.ViewsRepository#getViews
	 * @model opposite="views" transient="false"
	 * @generated
	 */
	ViewsRepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.views.View#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(ViewsRepository value);

	/**
	 * Returns the value of the '<em><b>Explicit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit</em>' attribute.
	 * @see #setExplicit(boolean)
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getView_Explicit()
	 * @model default="true"
	 * @generated
	 */
	boolean isExplicit();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.views.View#isExplicit <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit</em>' attribute.
	 * @see #isExplicit()
	 * @generated
	 */
	void setExplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.views.Category#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getView_Category()
	 * @see org.eclipse.emf.eef.views.Category#getViews
	 * @model opposite="views" transient="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.views.View#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // View
