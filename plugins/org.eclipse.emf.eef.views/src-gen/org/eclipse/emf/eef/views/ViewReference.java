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
 * A representation of the model object '<em><b>View Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.views.ViewReference#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewReference()
 * @model
 * @generated
 */
public interface ViewReference extends ViewElement, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(ViewElement)
	 * @see org.eclipse.emf.eef.views.ViewsPackage#getViewReference_View()
	 * @model required="true"
	 * @generated
	 */
	ViewElement getView();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.views.ViewReference#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(ViewElement value);

} // ViewReference
