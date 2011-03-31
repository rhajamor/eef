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
package org.eclipse.emf.eef.views.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.toolkits.ToolkitsPackage;
import org.eclipse.emf.eef.toolkits.impl.ToolkitsPackageImpl;
import org.eclipse.emf.eef.views.Category;
import org.eclipse.emf.eef.views.CustomElementEditor;
import org.eclipse.emf.eef.views.CustomView;
import org.eclipse.emf.eef.views.DocumentedElement;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.IdentifiedElement;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewElement;
import org.eclipse.emf.eef.views.ViewReference;
import org.eclipse.emf.eef.views.ViewsFactory;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customElementEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.eef.views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited)
			return (ViewsPackage) EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ToolkitsPackageImpl theToolkitsPackage = (ToolkitsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ToolkitsPackage.eNS_URI) instanceof ToolkitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToolkitsPackage.eNS_URI) : ToolkitsPackage.eINSTANCE);

		// Create package meta-data objects
		theViewsPackage.createPackageContents();
		theToolkitsPackage.createPackageContents();

		// Initialize created meta-data
		theViewsPackage.initializePackageContents();
		theToolkitsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewsRepository() {
		return viewsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewsRepository_Views() {
		return (EReference) viewsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewsRepository_RepositoryKind() {
		return (EAttribute) viewsRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewsRepository_Categories() {
		return (EReference) viewsRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewsRepository_Name() {
		return (EAttribute) viewsRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Repository() {
		return (EReference) viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Explicit() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Category() {
		return (EReference) viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementEditor() {
		return elementEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementEditor_ReadOnly() {
		return (EAttribute) elementEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Views() {
		return (EReference) categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Name() {
		return (EAttribute) categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Repository() {
		return (EReference) categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Categories() {
		return (EReference) categoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Elements() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_Representation() {
		return (EReference) viewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_Container() {
		return (EReference) viewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_Name() {
		return (EAttribute) viewElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomElementEditor() {
		return customElementEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomView() {
		return customViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentedElement() {
		return documentedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentedElement_Documentation() {
		return (EAttribute) documentedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewReference() {
		return viewReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewReference_View() {
		return (EReference) viewReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_QualifiedIdentifier() {
		return (EAttribute) identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		viewsRepositoryEClass = createEClass(VIEWS_REPOSITORY);
		createEReference(viewsRepositoryEClass, VIEWS_REPOSITORY__VIEWS);
		createEAttribute(viewsRepositoryEClass, VIEWS_REPOSITORY__REPOSITORY_KIND);
		createEReference(viewsRepositoryEClass, VIEWS_REPOSITORY__CATEGORIES);
		createEAttribute(viewsRepositoryEClass, VIEWS_REPOSITORY__NAME);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__REPOSITORY);
		createEAttribute(viewEClass, VIEW__EXPLICIT);
		createEReference(viewEClass, VIEW__CATEGORY);

		elementEditorEClass = createEClass(ELEMENT_EDITOR);
		createEAttribute(elementEditorEClass, ELEMENT_EDITOR__READ_ONLY);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__VIEWS);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__REPOSITORY);
		createEReference(categoryEClass, CATEGORY__CATEGORIES);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ELEMENTS);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEReference(viewElementEClass, VIEW_ELEMENT__REPRESENTATION);
		createEReference(viewElementEClass, VIEW_ELEMENT__CONTAINER);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__NAME);

		customElementEditorEClass = createEClass(CUSTOM_ELEMENT_EDITOR);

		customViewEClass = createEClass(CUSTOM_VIEW);

		documentedElementEClass = createEClass(DOCUMENTED_ELEMENT);
		createEAttribute(documentedElementEClass, DOCUMENTED_ELEMENT__DOCUMENTATION);

		viewReferenceEClass = createEClass(VIEW_REFERENCE);
		createEReference(viewReferenceEClass, VIEW_REFERENCE__VIEW);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__QUALIFIED_IDENTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ToolkitsPackage theToolkitsPackage = (ToolkitsPackage) EPackage.Registry.INSTANCE.getEPackage(ToolkitsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theToolkitsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		viewsRepositoryEClass.getESuperTypes().add(this.getDocumentedElement());
		viewsRepositoryEClass.getESuperTypes().add(this.getIdentifiedElement());
		viewEClass.getESuperTypes().add(this.getContainer());
		viewEClass.getESuperTypes().add(this.getIdentifiedElement());
		elementEditorEClass.getESuperTypes().add(this.getViewElement());
		elementEditorEClass.getESuperTypes().add(this.getIdentifiedElement());
		categoryEClass.getESuperTypes().add(this.getDocumentedElement());
		containerEClass.getESuperTypes().add(this.getViewElement());
		containerEClass.getESuperTypes().add(this.getIdentifiedElement());
		viewElementEClass.getESuperTypes().add(this.getDocumentedElement());
		customElementEditorEClass.getESuperTypes().add(this.getElementEditor());
		customViewEClass.getESuperTypes().add(this.getView());
		viewReferenceEClass.getESuperTypes().add(this.getViewElement());
		viewReferenceEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(viewsRepositoryEClass, ViewsRepository.class, "ViewsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getViewsRepository_Views(), this.getView(), this.getView_Repository(), "views", null, 0, -1, ViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewsRepository_RepositoryKind(), ecorePackage.getEString(), "RepositoryKind", null, 1, -1, ViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getViewsRepository_Categories(), this.getCategory(), this.getCategory_Repository(), "categories", null, 0, -1, ViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewsRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1, ViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getView_Repository(), this.getViewsRepository(), this.getViewsRepository_Views(), "repository", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getView_Explicit(), ecorePackage.getEBoolean(), "explicit", "true", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getView_Category(), this.getCategory(), this.getCategory_Views(), "category", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(elementEditorEClass, ElementEditor.class, "ElementEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getElementEditor_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 1, 1, ElementEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCategory_Views(), this.getView(), this.getView_Category(), "views", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCategory_Repository(), this.getViewsRepository(), this.getViewsRepository_Categories(), "repository", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCategory_Categories(), this.getCategory(), null, "categories", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(containerEClass, org.eclipse.emf.eef.views.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContainer_Elements(), this.getViewElement(), this.getViewElement_Container(), "elements", null, 0, -1, org.eclipse.emf.eef.views.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getViewElement_Representation(), theToolkitsPackage.getWidget(), null, "representation", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getViewElement_Container(), this.getContainer(), this.getContainer_Elements(), "container", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(customElementEditorEClass, CustomElementEditor.class, "CustomElementEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(customViewEClass, CustomView.class, "CustomView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(documentedElementEClass, DocumentedElement.class, "DocumentedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentedElement_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(viewReferenceEClass, ViewReference.class, "ViewReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getViewReference_View(), this.getViewElement(), null, "view", null, 1, 1, ViewReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIdentifiedElement_QualifiedIdentifier(), ecorePackage.getEString(), "qualifiedIdentifier", null, 1, 1, IdentifiedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //ViewsPackageImpl
