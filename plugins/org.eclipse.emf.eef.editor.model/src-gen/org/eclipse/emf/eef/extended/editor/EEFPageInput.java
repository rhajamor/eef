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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.extended.query.EEFUnderstandableQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Page Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.EEFPageInput#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getEEFPageInput()
 * @model abstract="true"
 * @generated
 */
public interface EEFPageInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(EEFUnderstandableQuery)
	 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getEEFPageInput_Query()
	 * @model containment="true"
	 * @generated
	 */
	EEFUnderstandableQuery getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.extended.editor.EEFPageInput#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(EEFUnderstandableQuery value);

} // EEFPageInput
