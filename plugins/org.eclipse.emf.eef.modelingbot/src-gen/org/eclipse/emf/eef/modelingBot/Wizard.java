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
package org.eclipse.emf.eef.modelingBot;

import org.eclipse.emf.eef.extended.editor.ReferenceableObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.Wizard#getReferenceableObject <em>Referenceable Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.modelingBot.ModelingBotPackage#getWizard()
 * @model
 * @generated
 */
public interface Wizard extends Sequence {

	/**
	 * Returns the value of the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenceable Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenceable Object</em>' reference.
	 * @see #setReferenceableObject(ReferenceableObject)
	 * @see org.eclipse.emf.eef.modelingBot.ModelingBotPackage#getWizard_ReferenceableObject()
	 * @model
	 * @generated
	 */
	ReferenceableObject getReferenceableObject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.modelingBot.Wizard#getReferenceableObject <em>Referenceable Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenceable Object</em>' reference.
	 * @see #getReferenceableObject()
	 * @generated
	 */
	void setReferenceableObject(ReferenceableObject value);
} // Wizard
