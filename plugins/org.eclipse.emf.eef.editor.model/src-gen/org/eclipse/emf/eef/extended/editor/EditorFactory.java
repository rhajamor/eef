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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.extended.editor.EditorPackage
 * @generated
 */
public interface EditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditorFactory eINSTANCE = org.eclipse.emf.eef.extended.editor.impl.EditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Standard Form Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Form Page</em>'.
	 * @generated
	 */
	StandardFormPage createStandardFormPage();

	/**
	 * Returns a new object of class '<em>EEF Master Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Master Page</em>'.
	 * @generated
	 */
	EEFMasterPage createEEFMasterPage();

	/**
	 * Returns a new object of class '<em>Tree Master Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Master Page</em>'.
	 * @generated
	 */
	TreeMasterPage createTreeMasterPage();

	/**
	 * Returns a new object of class '<em>All Resources Roots Relative Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Resources Roots Relative Input</em>'.
	 * @generated
	 */
	AllResourcesRootsRelativeInput createAllResourcesRootsRelativeInput();

	/**
	 * Returns a new object of class '<em>First Resource Root Relative Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Resource Root Relative Input</em>'.
	 * @generated
	 */
	FirstResourceRootRelativeInput createFirstResourceRootRelativeInput();

	/**
	 * Returns a new object of class '<em>Part Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Filter</em>'.
	 * @generated
	 */
	PartFilter createPartFilter();

	/**
	 * Returns a new object of class '<em>EEF Editor Contributions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Editor Contributions</em>'.
	 * @generated
	 */
	EEFEditorContributions createEEFEditorContributions();

	/**
	 * Returns a new object of class '<em>EEF Editor Pages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Editor Pages</em>'.
	 * @generated
	 */
	EEFEditorPages createEEFEditorPages();

	/**
	 * Returns a new object of class '<em>Static EEF Editor Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static EEF Editor Contribution</em>'.
	 * @generated
	 */
	StaticEEFEditorContribution createStaticEEFEditorContribution();

	/**
	 * Returns a new object of class '<em>Dynamic EEF Editor Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic EEF Editor Contribution</em>'.
	 * @generated
	 */
	DynamicEEFEditorContribution createDynamicEEFEditorContribution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EditorPackage getEditorPackage();

} //EditorFactory
