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
package org.eclipse.emf.eef.views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.eef.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/views/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-views"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = org.eclipse.emf.eef.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.DocumentedElementImpl <em>Documented Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.DocumentedElementImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getDocumentedElement()
	 * @generated
	 */
	int DOCUMENTED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Documented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getViewsRepository()
	 * @generated
	 */
	int VIEWS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY__QUALIFIED_IDENTIFIER = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY__VIEWS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository Kind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY__REPOSITORY_KIND = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY__CATEGORIES = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY__NAME = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_REPOSITORY_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.ViewElementImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__REPRESENTATION = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__CONTAINER = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NAME = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.ContainerImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION = VIEW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPRESENTATION = VIEW_ELEMENT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER = VIEW_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__QUALIFIED_IDENTIFIER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.ViewImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DOCUMENTATION = CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__REPRESENTATION = CONTAINER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTAINER = CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__QUALIFIED_IDENTIFIER = CONTAINER__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__REPOSITORY = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EXPLICIT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CATEGORY = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.ElementEditorImpl <em>Element Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.ElementEditorImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getElementEditor()
	 * @generated
	 */
	int ELEMENT_EDITOR = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR__DOCUMENTATION = VIEW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR__REPRESENTATION = VIEW_ELEMENT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR__CONTAINER = VIEW_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR__QUALIFIED_IDENTIFIER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR__READ_ONLY = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EDITOR_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.CategoryImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VIEWS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__REPOSITORY = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIES = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.CustomElementEditorImpl <em>Custom Element Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.CustomElementEditorImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getCustomElementEditor()
	 * @generated
	 */
	int CUSTOM_ELEMENT_EDITOR = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR__DOCUMENTATION = ELEMENT_EDITOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR__REPRESENTATION = ELEMENT_EDITOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR__CONTAINER = ELEMENT_EDITOR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR__NAME = ELEMENT_EDITOR__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR__QUALIFIED_IDENTIFIER = ELEMENT_EDITOR__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR__READ_ONLY = ELEMENT_EDITOR__READ_ONLY;

	/**
	 * The number of structural features of the '<em>Custom Element Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ELEMENT_EDITOR_FEATURE_COUNT = ELEMENT_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.CustomViewImpl <em>Custom View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.CustomViewImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getCustomView()
	 * @generated
	 */
	int CUSTOM_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__DOCUMENTATION = VIEW__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__REPRESENTATION = VIEW__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__CONTAINER = VIEW__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__QUALIFIED_IDENTIFIER = VIEW__QUALIFIED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__ELEMENTS = VIEW__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__REPOSITORY = VIEW__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__EXPLICIT = VIEW__EXPLICIT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__CATEGORY = VIEW__CATEGORY;

	/**
	 * The number of structural features of the '<em>Custom View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.ViewReferenceImpl <em>View Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.ViewReferenceImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getViewReference()
	 * @generated
	 */
	int VIEW_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE__DOCUMENTATION = VIEW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE__REPRESENTATION = VIEW_ELEMENT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE__CONTAINER = VIEW_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE__QUALIFIED_IDENTIFIER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE__VIEW = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REFERENCE_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.views.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.views.impl.IdentifiedElementImpl
	 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Qualified Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.ViewsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.eclipse.emf.eef.views.ViewsRepository
	 * @generated
	 */
	EClass getViewsRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.views.ViewsRepository#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.eef.views.ViewsRepository#getViews()
	 * @see #getViewsRepository()
	 * @generated
	 */
	EReference getViewsRepository_Views();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.eef.views.ViewsRepository#getRepositoryKind <em>Repository Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repository Kind</em>'.
	 * @see org.eclipse.emf.eef.views.ViewsRepository#getRepositoryKind()
	 * @see #getViewsRepository()
	 * @generated
	 */
	EAttribute getViewsRepository_RepositoryKind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.views.ViewsRepository#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.emf.eef.views.ViewsRepository#getCategories()
	 * @see #getViewsRepository()
	 * @generated
	 */
	EReference getViewsRepository_Categories();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.ViewsRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.views.ViewsRepository#getName()
	 * @see #getViewsRepository()
	 * @generated
	 */
	EAttribute getViewsRepository_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.emf.eef.views.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.views.View#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see org.eclipse.emf.eef.views.View#getRepository()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.View#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see org.eclipse.emf.eef.views.View#isExplicit()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Explicit();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.views.View#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see org.eclipse.emf.eef.views.View#getCategory()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Category();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.ElementEditor <em>Element Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Editor</em>'.
	 * @see org.eclipse.emf.eef.views.ElementEditor
	 * @generated
	 */
	EClass getElementEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.ElementEditor#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.emf.eef.views.ElementEditor#isReadOnly()
	 * @see #getElementEditor()
	 * @generated
	 */
	EAttribute getElementEditor_ReadOnly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.emf.eef.views.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.views.Category#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.eef.views.Category#getViews()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Views();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.views.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.views.Category#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see org.eclipse.emf.eef.views.Category#getRepository()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.views.Category#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.emf.eef.views.Category#getCategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Categories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.emf.eef.views.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.views.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.eef.views.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see org.eclipse.emf.eef.views.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.views.ViewElement#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see org.eclipse.emf.eef.views.ViewElement#getRepresentation()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_Representation();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.views.ViewElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.emf.eef.views.ViewElement#getContainer()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.ViewElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.views.ViewElement#getName()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.CustomElementEditor <em>Custom Element Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Element Editor</em>'.
	 * @see org.eclipse.emf.eef.views.CustomElementEditor
	 * @generated
	 */
	EClass getCustomElementEditor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.CustomView <em>Custom View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom View</em>'.
	 * @see org.eclipse.emf.eef.views.CustomView
	 * @generated
	 */
	EClass getCustomView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.DocumentedElement <em>Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Element</em>'.
	 * @see org.eclipse.emf.eef.views.DocumentedElement
	 * @generated
	 */
	EClass getDocumentedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.DocumentedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.emf.eef.views.DocumentedElement#getDocumentation()
	 * @see #getDocumentedElement()
	 * @generated
	 */
	EAttribute getDocumentedElement_Documentation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.ViewReference <em>View Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Reference</em>'.
	 * @see org.eclipse.emf.eef.views.ViewReference
	 * @generated
	 */
	EClass getViewReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.views.ViewReference#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.eclipse.emf.eef.views.ViewReference#getView()
	 * @see #getViewReference()
	 * @generated
	 */
	EReference getViewReference_View();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.views.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see org.eclipse.emf.eef.views.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.views.IdentifiedElement#getQualifiedIdentifier <em>Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Identifier</em>'.
	 * @see org.eclipse.emf.eef.views.IdentifiedElement#getQualifiedIdentifier()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_QualifiedIdentifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.ViewsRepositoryImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getViewsRepository()
		 * @generated
		 */
		EClass VIEWS_REPOSITORY = eINSTANCE.getViewsRepository();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS_REPOSITORY__VIEWS = eINSTANCE.getViewsRepository_Views();

		/**
		 * The meta object literal for the '<em><b>Repository Kind</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS_REPOSITORY__REPOSITORY_KIND = eINSTANCE.getViewsRepository_RepositoryKind();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS_REPOSITORY__CATEGORIES = eINSTANCE.getViewsRepository_Categories();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS_REPOSITORY__NAME = eINSTANCE.getViewsRepository_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.ViewImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__REPOSITORY = eINSTANCE.getView_Repository();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__EXPLICIT = eINSTANCE.getView_Explicit();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CATEGORY = eINSTANCE.getView_Category();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.ElementEditorImpl <em>Element Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.ElementEditorImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getElementEditor()
		 * @generated
		 */
		EClass ELEMENT_EDITOR = eINSTANCE.getElementEditor();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_EDITOR__READ_ONLY = eINSTANCE.getElementEditor_ReadOnly();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.CategoryImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__VIEWS = eINSTANCE.getCategory_Views();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__REPOSITORY = eINSTANCE.getCategory_Repository();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORIES = eINSTANCE.getCategory_Categories();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.ContainerImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.ViewElementImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__REPRESENTATION = eINSTANCE.getViewElement_Representation();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__CONTAINER = eINSTANCE.getViewElement_Container();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__NAME = eINSTANCE.getViewElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.CustomElementEditorImpl <em>Custom Element Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.CustomElementEditorImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getCustomElementEditor()
		 * @generated
		 */
		EClass CUSTOM_ELEMENT_EDITOR = eINSTANCE.getCustomElementEditor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.CustomViewImpl <em>Custom View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.CustomViewImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getCustomView()
		 * @generated
		 */
		EClass CUSTOM_VIEW = eINSTANCE.getCustomView();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.DocumentedElementImpl <em>Documented Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.DocumentedElementImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getDocumentedElement()
		 * @generated
		 */
		EClass DOCUMENTED_ELEMENT = eINSTANCE.getDocumentedElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_ELEMENT__DOCUMENTATION = eINSTANCE.getDocumentedElement_Documentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.ViewReferenceImpl <em>View Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.ViewReferenceImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getViewReference()
		 * @generated
		 */
		EClass VIEW_REFERENCE = eINSTANCE.getViewReference();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_REFERENCE__VIEW = eINSTANCE.getViewReference_View();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.views.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.views.impl.IdentifiedElementImpl
		 * @see org.eclipse.emf.eef.views.impl.ViewsPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Qualified Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER = eINSTANCE.getIdentifiedElement_QualifiedIdentifier();

	}

} //ViewsPackage
