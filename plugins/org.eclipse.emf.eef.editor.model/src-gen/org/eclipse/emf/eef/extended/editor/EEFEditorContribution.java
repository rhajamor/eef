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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Editor Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.EEFEditorContribution#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getEEFEditorContribution()
 * @model abstract="true"
 * @generated
 */
public interface EEFEditorContribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(EEFPageInput)
	 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#getEEFEditorContribution_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EEFPageInput getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.extended.editor.EEFEditorContribution#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EEFPageInput value);

} // EEFEditorContribution
