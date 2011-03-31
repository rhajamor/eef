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
import org.eclipse.emf.eef.views.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getDatabinding <em>Databinding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getReferencedBinding <em>Referenced Binding</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getBindingFilters <em>Binding Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding()
 * @model abstract="true"
 * @generated
 */
public interface AbstractElementBinding extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.mapping.AbstractElementBinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference list.
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_SubElements()
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getSuperElement
	 * @model opposite="superElement" containment="true"
	 * @generated
	 */
	EList<AbstractElementBinding> getSubElements();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_Properties()
	 * @see org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	EList<AbstractPropertyBinding> getProperties();

	/**
	 * Returns the value of the '<em><b>Databinding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.Databinding#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databinding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databinding</em>' container reference.
	 * @see #setDatabinding(Databinding)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_Databinding()
	 * @see org.eclipse.emf.eef.mapping.Databinding#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	Databinding getDatabinding();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getDatabinding <em>Databinding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databinding</em>' container reference.
	 * @see #getDatabinding()
	 * @generated
	 */
	void setDatabinding(Databinding value);

	/**
	 * Returns the value of the '<em><b>Super Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Element</em>' container reference.
	 * @see #setSuperElement(AbstractElementBinding)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_SuperElement()
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getSubElements
	 * @model opposite="subElements" transient="false"
	 * @generated
	 */
	AbstractElementBinding getSuperElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSuperElement <em>Super Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Element</em>' container reference.
	 * @see #getSuperElement()
	 * @generated
	 */
	void setSuperElement(AbstractElementBinding value);

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
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.mapping.ElementBindingReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Binding</em>' containment reference list.
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_ReferencedBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementBindingReference> getReferencedBinding();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.views.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_Views()
	 * @model required="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.Category#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_Category()
	 * @see org.eclipse.emf.eef.mapping.Category#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

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
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getAbstractElementBinding_BindingFilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingFilter> getBindingFilters();

} // AbstractElementBinding
