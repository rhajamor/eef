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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.filters.OCLFilter#getOCLBody <em>OCL Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.filters.FiltersPackage#getOCLFilter()
 * @model
 * @generated
 */
public interface OCLFilter extends BindingFilter {
	/**
	 * Returns the value of the '<em><b>OCL Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OCL Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OCL Body</em>' attribute.
	 * @see #setOCLBody(String)
	 * @see org.eclipse.emf.eef.mapping.filters.FiltersPackage#getOCLFilter_OCLBody()
	 * @model
	 * @generated
	 */
	String getOCLBody();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.filters.OCLFilter#getOCLBody <em>OCL Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCL Body</em>' attribute.
	 * @see #getOCLBody()
	 * @generated
	 */
	void setOCLBody(String value);

} // OCLFilter
