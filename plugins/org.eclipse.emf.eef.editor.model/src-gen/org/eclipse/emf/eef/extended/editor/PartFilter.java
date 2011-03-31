/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.eef.extended.editor;

import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.mapping.filters.BindingFilter;
import org.eclipse.emf.eef.views.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.PartFilter#getFilteredPart <em>Filtered Part</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.PartFilter#getContextualComponent <em>Contextual Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getPartFilter()
 * @model
 * @generated
 */
public interface PartFilter extends BindingFilter {
	/**
	 * Returns the value of the '<em><b>Filtered Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtered Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtered Part</em>' reference.
	 * @see #setFilteredPart(View)
	 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getPartFilter_FilteredPart()
	 * @model required="true"
	 * @generated
	 */
	View getFilteredPart();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.extended.editor.PartFilter#getFilteredPart <em>Filtered Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtered Part</em>' reference.
	 * @see #getFilteredPart()
	 * @generated
	 */
	void setFilteredPart(View value);

	/**
	 * Returns the value of the '<em><b>Contextual Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextual Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Component</em>' reference.
	 * @see #setContextualComponent(PropertiesEditionComponent)
	 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getPartFilter_ContextualComponent()
	 * @model
	 * @generated
	 */
	PropertiesEditionComponent getContextualComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.extended.editor.PartFilter#getContextualComponent <em>Contextual Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Component</em>' reference.
	 * @see #getContextualComponent()
	 * @generated
	 */
	void setContextualComponent(PropertiesEditionComponent value);

} // PartFilter
