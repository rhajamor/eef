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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.extended.editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "editor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/extended/editor/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-ext-edt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditorPackage eINSTANCE = org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionImpl <em>EEF Editor Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFEditorContribution()
	 * @generated
	 */
	int EEF_EDITOR_CONTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTION__INPUT = 0;

	/**
	 * The number of structural features of the '<em>EEF Editor Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFPageImpl <em>EEF Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.EEFPageImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFPage()
	 * @generated
	 */
	int EEF_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__DOCUMENTATION = ViewsPackage.VIEW__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__REPRESENTATION = ViewsPackage.VIEW__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__CONTAINER = ViewsPackage.VIEW__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__NAME = ViewsPackage.VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__QUALIFIED_IDENTIFIER = ViewsPackage.VIEW__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__ELEMENTS = ViewsPackage.VIEW__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__REPOSITORY = ViewsPackage.VIEW__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__EXPLICIT = ViewsPackage.VIEW__EXPLICIT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__CATEGORY = ViewsPackage.VIEW__CATEGORY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE__TITLE = ViewsPackage.VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_FEATURE_COUNT = ViewsPackage.VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.StandardFormPageImpl <em>Standard Form Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.StandardFormPageImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getStandardFormPage()
	 * @generated
	 */
	int STANDARD_FORM_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__DOCUMENTATION = EEF_PAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__REPRESENTATION = EEF_PAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__CONTAINER = EEF_PAGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__NAME = EEF_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__QUALIFIED_IDENTIFIER = EEF_PAGE__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__ELEMENTS = EEF_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__REPOSITORY = EEF_PAGE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__EXPLICIT = EEF_PAGE__EXPLICIT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__CATEGORY = EEF_PAGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE__TITLE = EEF_PAGE__TITLE;

	/**
	 * The number of structural features of the '<em>Standard Form Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FORM_PAGE_FEATURE_COUNT = EEF_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.MasterDetailsPageImpl <em>Master Details Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.MasterDetailsPageImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getMasterDetailsPage()
	 * @generated
	 */
	int MASTER_DETAILS_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__DOCUMENTATION = EEF_PAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__REPRESENTATION = EEF_PAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__CONTAINER = EEF_PAGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__NAME = EEF_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__QUALIFIED_IDENTIFIER = EEF_PAGE__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__ELEMENTS = EEF_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__REPOSITORY = EEF_PAGE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__EXPLICIT = EEF_PAGE__EXPLICIT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__CATEGORY = EEF_PAGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE__TITLE = EEF_PAGE__TITLE;

	/**
	 * The number of structural features of the '<em>Master Details Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_DETAILS_PAGE_FEATURE_COUNT = EEF_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFMasterPageImpl <em>EEF Master Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.EEFMasterPageImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFMasterPage()
	 * @generated
	 */
	int EEF_MASTER_PAGE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__DOCUMENTATION = MASTER_DETAILS_PAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__REPRESENTATION = MASTER_DETAILS_PAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__CONTAINER = MASTER_DETAILS_PAGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__NAME = MASTER_DETAILS_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__QUALIFIED_IDENTIFIER = MASTER_DETAILS_PAGE__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__ELEMENTS = MASTER_DETAILS_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__REPOSITORY = MASTER_DETAILS_PAGE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__EXPLICIT = MASTER_DETAILS_PAGE__EXPLICIT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__CATEGORY = MASTER_DETAILS_PAGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__TITLE = MASTER_DETAILS_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Orientable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__ORIENTABLE = MASTER_DETAILS_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Validate Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE = MASTER_DETAILS_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Master Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_MASTER_PAGE_FEATURE_COUNT = MASTER_DETAILS_PAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.TreeMasterPageImpl <em>Tree Master Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.TreeMasterPageImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getTreeMasterPage()
	 * @generated
	 */
	int TREE_MASTER_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__DOCUMENTATION = MASTER_DETAILS_PAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__REPRESENTATION = MASTER_DETAILS_PAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__CONTAINER = MASTER_DETAILS_PAGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__NAME = MASTER_DETAILS_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__QUALIFIED_IDENTIFIER = MASTER_DETAILS_PAGE__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__ELEMENTS = MASTER_DETAILS_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__REPOSITORY = MASTER_DETAILS_PAGE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__EXPLICIT = MASTER_DETAILS_PAGE__EXPLICIT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__CATEGORY = MASTER_DETAILS_PAGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__TITLE = MASTER_DETAILS_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Toolbar Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE__TOOLBAR_VISIBLE = MASTER_DETAILS_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tree Master Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_MASTER_PAGE_FEATURE_COUNT = MASTER_DETAILS_PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFPageInputImpl <em>EEF Page Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.EEFPageInputImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFPageInput()
	 * @generated
	 */
	int EEF_PAGE_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_INPUT__QUERY = 0;

	/**
	 * The number of structural features of the '<em>EEF Page Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.AllResourcesRootsRelativeInputImpl <em>All Resources Roots Relative Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.AllResourcesRootsRelativeInputImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getAllResourcesRootsRelativeInput()
	 * @generated
	 */
	int ALL_RESOURCES_ROOTS_RELATIVE_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_RESOURCES_ROOTS_RELATIVE_INPUT__QUERY = EEF_PAGE_INPUT__QUERY;

	/**
	 * The number of structural features of the '<em>All Resources Roots Relative Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_RESOURCES_ROOTS_RELATIVE_INPUT_FEATURE_COUNT = EEF_PAGE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.FirstResourceRootRelativeInputImpl <em>First Resource Root Relative Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.FirstResourceRootRelativeInputImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getFirstResourceRootRelativeInput()
	 * @generated
	 */
	int FIRST_RESOURCE_ROOT_RELATIVE_INPUT = 8;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RESOURCE_ROOT_RELATIVE_INPUT__QUERY = EEF_PAGE_INPUT__QUERY;

	/**
	 * The number of structural features of the '<em>First Resource Root Relative Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_RESOURCE_ROOT_RELATIVE_INPUT_FEATURE_COUNT = EEF_PAGE_INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.PartFilterImpl <em>Part Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.PartFilterImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getPartFilter()
	 * @generated
	 */
	int PART_FILTER = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FILTER__DOCUMENTATION = FiltersPackage.BINDING_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FILTER__NAME = FiltersPackage.BINDING_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FILTER__MANDATORY = FiltersPackage.BINDING_FILTER__MANDATORY;

	/**
	 * The feature id for the '<em><b>Filtered Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FILTER__FILTERED_PART = FiltersPackage.BINDING_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contextual Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FILTER__CONTEXTUAL_COMPONENT = FiltersPackage.BINDING_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Part Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FILTER_FEATURE_COUNT = FiltersPackage.BINDING_FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionsImpl <em>EEF Editor Contributions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionsImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFEditorContributions()
	 * @generated
	 */
	int EEF_EDITOR_CONTRIBUTIONS = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTIONS__DOCUMENTATION = MappingPackage.CATEGORY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTIONS__NAME = MappingPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTIONS__BINDINGS = MappingPackage.CATEGORY__BINDINGS;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTIONS__DATABINDING = MappingPackage.CATEGORY__DATABINDING;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTIONS__CATEGORIES = MappingPackage.CATEGORY__CATEGORIES;

	/**
	 * The number of structural features of the '<em>EEF Editor Contributions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_CONTRIBUTIONS_FEATURE_COUNT = MappingPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFEditorPagesImpl <em>EEF Editor Pages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.EEFEditorPagesImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFEditorPages()
	 * @generated
	 */
	int EEF_EDITOR_PAGES = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_PAGES__DOCUMENTATION = ViewsPackage.CATEGORY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_PAGES__VIEWS = ViewsPackage.CATEGORY__VIEWS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_PAGES__NAME = ViewsPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_PAGES__REPOSITORY = ViewsPackage.CATEGORY__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_PAGES__CATEGORIES = ViewsPackage.CATEGORY__CATEGORIES;

	/**
	 * The number of structural features of the '<em>EEF Editor Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EDITOR_PAGES_FEATURE_COUNT = ViewsPackage.CATEGORY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.StaticEEFEditorContributionImpl <em>Static EEF Editor Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.StaticEEFEditorContributionImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getStaticEEFEditorContribution()
	 * @generated
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__DOCUMENTATION = MappingPackage.ABSTRACT_ELEMENT_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__SUB_ELEMENTS = MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__PROPERTIES = MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__DATABINDING = MappingPackage.ABSTRACT_ELEMENT_BINDING__DATABINDING;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__SUPER_ELEMENT = MappingPackage.ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__NAME = MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__REFERENCED_BINDING = MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__VIEWS = MappingPackage.ABSTRACT_ELEMENT_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__CATEGORY = MappingPackage.ABSTRACT_ELEMENT_BINDING__CATEGORY;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__BINDING_FILTERS = MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION__INPUT = MappingPackage.ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static EEF Editor Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_EEF_EDITOR_CONTRIBUTION_FEATURE_COUNT = MappingPackage.ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.extended.editor.impl.DynamicEEFEditorContributionImpl <em>Dynamic EEF Editor Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.extended.editor.impl.DynamicEEFEditorContributionImpl
	 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getDynamicEEFEditorContribution()
	 * @generated
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__DOCUMENTATION = MappingPackage.EMF_ELEMENT_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__SUB_ELEMENTS = MappingPackage.EMF_ELEMENT_BINDING__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__PROPERTIES = MappingPackage.EMF_ELEMENT_BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__DATABINDING = MappingPackage.EMF_ELEMENT_BINDING__DATABINDING;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__SUPER_ELEMENT = MappingPackage.EMF_ELEMENT_BINDING__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__NAME = MappingPackage.EMF_ELEMENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__REFERENCED_BINDING = MappingPackage.EMF_ELEMENT_BINDING__REFERENCED_BINDING;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__VIEWS = MappingPackage.EMF_ELEMENT_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__CATEGORY = MappingPackage.EMF_ELEMENT_BINDING__CATEGORY;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__BINDING_FILTERS = MappingPackage.EMF_ELEMENT_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__MODEL = MappingPackage.EMF_ELEMENT_BINDING__MODEL;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION__INPUT = MappingPackage.EMF_ELEMENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic EEF Editor Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EEF_EDITOR_CONTRIBUTION_FEATURE_COUNT = MappingPackage.EMF_ELEMENT_BINDING_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.EEFEditorContribution <em>EEF Editor Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Editor Contribution</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFEditorContribution
	 * @generated
	 */
	EClass getEEFEditorContribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.extended.editor.EEFEditorContribution#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFEditorContribution#getInput()
	 * @see #getEEFEditorContribution()
	 * @generated
	 */
	EReference getEEFEditorContribution_Input();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.EEFPage <em>EEF Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Page</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFPage
	 * @generated
	 */
	EClass getEEFPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.extended.editor.EEFPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFPage#getTitle()
	 * @see #getEEFPage()
	 * @generated
	 */
	EAttribute getEEFPage_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.StandardFormPage <em>Standard Form Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Form Page</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.StandardFormPage
	 * @generated
	 */
	EClass getStandardFormPage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.MasterDetailsPage <em>Master Details Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Details Page</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.MasterDetailsPage
	 * @generated
	 */
	EClass getMasterDetailsPage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.EEFMasterPage <em>EEF Master Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Master Page</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFMasterPage
	 * @generated
	 */
	EClass getEEFMasterPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.extended.editor.EEFMasterPage#isOrientable <em>Orientable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientable</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFMasterPage#isOrientable()
	 * @see #getEEFMasterPage()
	 * @generated
	 */
	EAttribute getEEFMasterPage_Orientable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.extended.editor.EEFMasterPage#isShowValidatePage <em>Show Validate Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Validate Page</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFMasterPage#isShowValidatePage()
	 * @see #getEEFMasterPage()
	 * @generated
	 */
	EAttribute getEEFMasterPage_ShowValidatePage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.TreeMasterPage <em>Tree Master Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Master Page</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.TreeMasterPage
	 * @generated
	 */
	EClass getTreeMasterPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.extended.editor.TreeMasterPage#isToolbarVisible <em>Toolbar Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toolbar Visible</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.TreeMasterPage#isToolbarVisible()
	 * @see #getTreeMasterPage()
	 * @generated
	 */
	EAttribute getTreeMasterPage_ToolbarVisible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.EEFPageInput <em>EEF Page Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Page Input</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFPageInput
	 * @generated
	 */
	EClass getEEFPageInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.extended.editor.EEFPageInput#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFPageInput#getQuery()
	 * @see #getEEFPageInput()
	 * @generated
	 */
	EReference getEEFPageInput_Query();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.AllResourcesRootsRelativeInput <em>All Resources Roots Relative Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Resources Roots Relative Input</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.AllResourcesRootsRelativeInput
	 * @generated
	 */
	EClass getAllResourcesRootsRelativeInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.FirstResourceRootRelativeInput <em>First Resource Root Relative Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Resource Root Relative Input</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.FirstResourceRootRelativeInput
	 * @generated
	 */
	EClass getFirstResourceRootRelativeInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.PartFilter <em>Part Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Filter</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.PartFilter
	 * @generated
	 */
	EClass getPartFilter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.extended.editor.PartFilter#getFilteredPart <em>Filtered Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filtered Part</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.PartFilter#getFilteredPart()
	 * @see #getPartFilter()
	 * @generated
	 */
	EReference getPartFilter_FilteredPart();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.extended.editor.PartFilter#getContextualComponent <em>Contextual Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contextual Component</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.PartFilter#getContextualComponent()
	 * @see #getPartFilter()
	 * @generated
	 */
	EReference getPartFilter_ContextualComponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.EEFEditorContributions <em>EEF Editor Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Editor Contributions</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFEditorContributions
	 * @generated
	 */
	EClass getEEFEditorContributions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.EEFEditorPages <em>EEF Editor Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Editor Pages</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.EEFEditorPages
	 * @generated
	 */
	EClass getEEFEditorPages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution <em>Static EEF Editor Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static EEF Editor Contribution</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution
	 * @generated
	 */
	EClass getStaticEEFEditorContribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution <em>Dynamic EEF Editor Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic EEF Editor Contribution</em>'.
	 * @see org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution
	 * @generated
	 */
	EClass getDynamicEEFEditorContribution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditorFactory getEditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionImpl <em>EEF Editor Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFEditorContribution()
		 * @generated
		 */
		EClass EEF_EDITOR_CONTRIBUTION = eINSTANCE.getEEFEditorContribution();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_EDITOR_CONTRIBUTION__INPUT = eINSTANCE.getEEFEditorContribution_Input();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFPageImpl <em>EEF Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.EEFPageImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFPage()
		 * @generated
		 */
		EClass EEF_PAGE = eINSTANCE.getEEFPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_PAGE__TITLE = eINSTANCE.getEEFPage_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.StandardFormPageImpl <em>Standard Form Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.StandardFormPageImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getStandardFormPage()
		 * @generated
		 */
		EClass STANDARD_FORM_PAGE = eINSTANCE.getStandardFormPage();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.MasterDetailsPageImpl <em>Master Details Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.MasterDetailsPageImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getMasterDetailsPage()
		 * @generated
		 */
		EClass MASTER_DETAILS_PAGE = eINSTANCE.getMasterDetailsPage();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFMasterPageImpl <em>EEF Master Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.EEFMasterPageImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFMasterPage()
		 * @generated
		 */
		EClass EEF_MASTER_PAGE = eINSTANCE.getEEFMasterPage();

		/**
		 * The meta object literal for the '<em><b>Orientable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_MASTER_PAGE__ORIENTABLE = eINSTANCE.getEEFMasterPage_Orientable();

		/**
		 * The meta object literal for the '<em><b>Show Validate Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE = eINSTANCE.getEEFMasterPage_ShowValidatePage();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.TreeMasterPageImpl <em>Tree Master Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.TreeMasterPageImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getTreeMasterPage()
		 * @generated
		 */
		EClass TREE_MASTER_PAGE = eINSTANCE.getTreeMasterPage();

		/**
		 * The meta object literal for the '<em><b>Toolbar Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_MASTER_PAGE__TOOLBAR_VISIBLE = eINSTANCE.getTreeMasterPage_ToolbarVisible();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFPageInputImpl <em>EEF Page Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.EEFPageInputImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFPageInput()
		 * @generated
		 */
		EClass EEF_PAGE_INPUT = eINSTANCE.getEEFPageInput();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_PAGE_INPUT__QUERY = eINSTANCE.getEEFPageInput_Query();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.AllResourcesRootsRelativeInputImpl <em>All Resources Roots Relative Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.AllResourcesRootsRelativeInputImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getAllResourcesRootsRelativeInput()
		 * @generated
		 */
		EClass ALL_RESOURCES_ROOTS_RELATIVE_INPUT = eINSTANCE.getAllResourcesRootsRelativeInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.FirstResourceRootRelativeInputImpl <em>First Resource Root Relative Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.FirstResourceRootRelativeInputImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getFirstResourceRootRelativeInput()
		 * @generated
		 */
		EClass FIRST_RESOURCE_ROOT_RELATIVE_INPUT = eINSTANCE.getFirstResourceRootRelativeInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.PartFilterImpl <em>Part Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.PartFilterImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getPartFilter()
		 * @generated
		 */
		EClass PART_FILTER = eINSTANCE.getPartFilter();

		/**
		 * The meta object literal for the '<em><b>Filtered Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_FILTER__FILTERED_PART = eINSTANCE.getPartFilter_FilteredPart();

		/**
		 * The meta object literal for the '<em><b>Contextual Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_FILTER__CONTEXTUAL_COMPONENT = eINSTANCE.getPartFilter_ContextualComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionsImpl <em>EEF Editor Contributions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.EEFEditorContributionsImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFEditorContributions()
		 * @generated
		 */
		EClass EEF_EDITOR_CONTRIBUTIONS = eINSTANCE.getEEFEditorContributions();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.EEFEditorPagesImpl <em>EEF Editor Pages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.EEFEditorPagesImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getEEFEditorPages()
		 * @generated
		 */
		EClass EEF_EDITOR_PAGES = eINSTANCE.getEEFEditorPages();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.StaticEEFEditorContributionImpl <em>Static EEF Editor Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.StaticEEFEditorContributionImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getStaticEEFEditorContribution()
		 * @generated
		 */
		EClass STATIC_EEF_EDITOR_CONTRIBUTION = eINSTANCE.getStaticEEFEditorContribution();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.extended.editor.impl.DynamicEEFEditorContributionImpl <em>Dynamic EEF Editor Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.extended.editor.impl.DynamicEEFEditorContributionImpl
		 * @see org.eclipse.emf.eef.extended.editor.impl.EditorPackageImpl#getDynamicEEFEditorContribution()
		 * @generated
		 */
		EClass DYNAMIC_EEF_EDITOR_CONTRIBUTION = eINSTANCE.getDynamicEEFEditorContribution();

	}

} //EditorPackage
