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
package org.eclipse.emf.eef.extended.editor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.extended.editor.AllResourcesRootsRelativeInput;
import org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.EEFEditorContributions;
import org.eclipse.emf.eef.extended.editor.EEFEditorPages;
import org.eclipse.emf.eef.extended.editor.EEFMasterPage;
import org.eclipse.emf.eef.extended.editor.EditorFactory;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.FirstResourceRootRelativeInput;
import org.eclipse.emf.eef.extended.editor.PartFilter;
import org.eclipse.emf.eef.extended.editor.StandardFormPage;
import org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.TreeMasterPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorFactoryImpl extends EFactoryImpl implements EditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditorFactory init() {
		try {
			EditorFactory theEditorFactory = (EditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/extended/editor/1.0.0"); 
			if (theEditorFactory != null) {
				return theEditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EditorPackage.STANDARD_FORM_PAGE: return createStandardFormPage();
			case EditorPackage.EEF_MASTER_PAGE: return createEEFMasterPage();
			case EditorPackage.TREE_MASTER_PAGE: return createTreeMasterPage();
			case EditorPackage.ALL_RESOURCES_ROOTS_RELATIVE_INPUT: return createAllResourcesRootsRelativeInput();
			case EditorPackage.FIRST_RESOURCE_ROOT_RELATIVE_INPUT: return createFirstResourceRootRelativeInput();
			case EditorPackage.PART_FILTER: return createPartFilter();
			case EditorPackage.EEF_EDITOR_CONTRIBUTIONS: return createEEFEditorContributions();
			case EditorPackage.EEF_EDITOR_PAGES: return createEEFEditorPages();
			case EditorPackage.STATIC_EEF_EDITOR_CONTRIBUTION: return createStaticEEFEditorContribution();
			case EditorPackage.DYNAMIC_EEF_EDITOR_CONTRIBUTION: return createDynamicEEFEditorContribution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFormPage createStandardFormPage() {
		StandardFormPageImpl standardFormPage = new StandardFormPageImpl();
		return standardFormPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFMasterPage createEEFMasterPage() {
		EEFMasterPageImpl eefMasterPage = new EEFMasterPageImpl();
		return eefMasterPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMasterPage createTreeMasterPage() {
		TreeMasterPageImpl treeMasterPage = new TreeMasterPageImpl();
		return treeMasterPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllResourcesRootsRelativeInput createAllResourcesRootsRelativeInput() {
		AllResourcesRootsRelativeInputImpl allResourcesRootsRelativeInput = new AllResourcesRootsRelativeInputImpl();
		return allResourcesRootsRelativeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstResourceRootRelativeInput createFirstResourceRootRelativeInput() {
		FirstResourceRootRelativeInputImpl firstResourceRootRelativeInput = new FirstResourceRootRelativeInputImpl();
		return firstResourceRootRelativeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartFilter createPartFilter() {
		PartFilterImpl partFilter = new PartFilterImpl();
		return partFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFEditorContributions createEEFEditorContributions() {
		EEFEditorContributionsImpl eefEditorContributions = new EEFEditorContributionsImpl();
		return eefEditorContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFEditorPages createEEFEditorPages() {
		EEFEditorPagesImpl eefEditorPages = new EEFEditorPagesImpl();
		return eefEditorPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEEFEditorContribution createStaticEEFEditorContribution() {
		StaticEEFEditorContributionImpl staticEEFEditorContribution = new StaticEEFEditorContributionImpl();
		return staticEEFEditorContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicEEFEditorContribution createDynamicEEFEditorContribution() {
		DynamicEEFEditorContributionImpl dynamicEEFEditorContribution = new DynamicEEFEditorContributionImpl();
		return dynamicEEFEditorContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorPackage getEditorPackage() {
		return (EditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EditorPackage getPackage() {
		return EditorPackage.eINSTANCE;
	}

} //EditorFactoryImpl
