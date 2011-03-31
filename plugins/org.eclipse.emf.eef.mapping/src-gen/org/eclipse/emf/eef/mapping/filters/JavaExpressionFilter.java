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
 * A representation of the model object '<em><b>Java Expression Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter#getJavaBody <em>Java Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.filters.FiltersPackage#getJavaExpressionFilter()
 * @model
 * @generated
 */
public interface JavaExpressionFilter extends JavaFilter {
	/**
	 * Returns the value of the '<em><b>Java Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Body</em>' attribute.
	 * @see #setJavaBody(String)
	 * @see org.eclipse.emf.eef.mapping.filters.FiltersPackage#getJavaExpressionFilter_JavaBody()
	 * @model
	 * @generated
	 */
	String getJavaBody();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter#getJavaBody <em>Java Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Body</em>' attribute.
	 * @see #getJavaBody()
	 * @generated
	 */
	void setJavaBody(String value);

} // JavaExpressionFilter
