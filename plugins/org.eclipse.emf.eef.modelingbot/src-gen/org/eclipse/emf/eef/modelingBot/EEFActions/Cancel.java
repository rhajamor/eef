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
package org.eclipse.emf.eef.modelingBot.EEFActions;

import org.eclipse.emf.eef.modelingBot.Processing;
import org.eclipse.emf.eef.modelingBot.Action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.Cancel#getProcessing <em>Processing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getCancel()
 * @model
 * @generated
 */
public interface Cancel extends EEFAction {

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' reference.
	 * @see #setProcessing(Processing)
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getCancel_Processing()
	 * @model
	 * @generated
	 */
	Processing getProcessing();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Cancel#getProcessing <em>Processing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing</em>' reference.
	 * @see #getProcessing()
	 * @generated
	 */
	void setProcessing(Processing value);
} // Cancel
