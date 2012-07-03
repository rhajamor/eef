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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage
 * @generated
 */
public interface EEFActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EEFActionsFactory eINSTANCE = org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove</em>'.
	 * @generated
	 */
	Remove createRemove();

	/**
	 * Returns a new object of class '<em>Set Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Attribute</em>'.
	 * @generated
	 */
	SetAttribute createSetAttribute();

	/**
	 * Returns a new object of class '<em>Unset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unset</em>'.
	 * @generated
	 */
	Unset createUnset();

	/**
	 * Returns a new object of class '<em>Cancel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel</em>'.
	 * @generated
	 */
	Cancel createCancel();

	/**
	 * Returns a new object of class '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check</em>'.
	 * @generated
	 */
	Check createCheck();

	/**
	 * Returns a new object of class '<em>Open EEF Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open EEF Editor</em>'.
	 * @generated
	 */
	OpenEEFEditor createOpenEEFEditor();

	/**
	 * Returns a new object of class '<em>Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Reference</em>'.
	 * @generated
	 */
	SetReference createSetReference();

	/**
	 * Returns a new object of class '<em>Unset Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unset Reference</em>'.
	 * @generated
	 */
	UnsetReference createUnsetReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EEFActionsPackage getEEFActionsPackage();

} //EEFActionsFactory
