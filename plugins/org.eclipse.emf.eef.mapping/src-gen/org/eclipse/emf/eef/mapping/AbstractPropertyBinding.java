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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.eef.mapping.filters.BindingFilter;
import org.eclipse.emf.eef.views.ElementEditor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getBindingFilters <em>Binding Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractPropertyBinding()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPropertyBinding extends DocumentedElement {
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
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractPropertyBinding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.views.ElementEditor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractPropertyBinding_Views()
	 * @model required="true"
	 * @generated
	 */
	EList<ElementEditor> getViews();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(AbstractElementBinding)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractPropertyBinding_Element()
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getProperties
	 * @model opposite="properties" transient="false"
	 * @generated
	 */
	AbstractElementBinding getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(AbstractElementBinding value);

	/**
	 * Returns the value of the '<em><b>Binding Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.mapping.filters.BindingFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Filters</em>' containment reference list.
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractPropertyBinding_BindingFilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingFilter> getBindingFilters();

} // AbstractPropertyBinding
