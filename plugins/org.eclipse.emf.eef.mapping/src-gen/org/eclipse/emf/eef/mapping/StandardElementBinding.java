/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Element Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.StandardElementBinding#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.MappingPackage#getStandardElementBinding()
 * @model
 * @generated
 */
public interface StandardElementBinding extends AbstractElementBinding {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.mapping.ModelElement#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelElement)
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#getStandardElementBinding_Model()
	 * @see org.eclipse.emf.eef.mapping.ModelElement#getBinding
	 * @model opposite="binding" required="true"
	 * @generated
	 */
	ModelElement getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.StandardElementBinding#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelElement value);

} // StandardElementBinding
