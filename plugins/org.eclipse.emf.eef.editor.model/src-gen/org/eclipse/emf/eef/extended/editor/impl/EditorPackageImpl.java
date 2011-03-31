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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.components.ComponentsPackage;
import org.eclipse.emf.eef.extended.editor.AllResourcesRootsRelativeInput;
import org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.EEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.EEFEditorContributions;
import org.eclipse.emf.eef.extended.editor.EEFEditorPages;
import org.eclipse.emf.eef.extended.editor.EEFMasterPage;
import org.eclipse.emf.eef.extended.editor.EEFPage;
import org.eclipse.emf.eef.extended.editor.EEFPageInput;
import org.eclipse.emf.eef.extended.editor.EditorFactory;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.FirstResourceRootRelativeInput;
import org.eclipse.emf.eef.extended.editor.MasterDetailsPage;
import org.eclipse.emf.eef.extended.editor.PartFilter;
import org.eclipse.emf.eef.extended.editor.StandardFormPage;
import org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.TreeMasterPage;
import org.eclipse.emf.eef.extended.query.QueryPackage;
import org.eclipse.emf.eef.extended.query.impl.QueryPackageImpl;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorPackageImpl extends EPackageImpl implements EditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefEditorContributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardFormPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterDetailsPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefMasterPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeMasterPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefPageInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allResourcesRootsRelativeInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstResourceRootRelativeInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefEditorContributionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefEditorPagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticEEFEditorContributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicEEFEditorContributionEClass = null;

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
	 * @see org.eclipse.emf.eef.extended.editor.EditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EditorPackageImpl() {
		super(eNS_URI, EditorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EditorPackage init() {
		if (isInited) return (EditorPackage)EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI);

		// Obtain or create and register package
		EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);

		// Create package meta-data objects
		theEditorPackage.createPackageContents();
		theQueryPackage.createPackageContents();

		// Initialize created meta-data
		theEditorPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EditorPackage.eNS_URI, theEditorPackage);
		return theEditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFEditorContribution() {
		return eefEditorContributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFEditorContribution_Input() {
		return (EReference)eefEditorContributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFPage() {
		return eefPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFPage_Title() {
		return (EAttribute)eefPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardFormPage() {
		return standardFormPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterDetailsPage() {
		return masterDetailsPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFMasterPage() {
		return eefMasterPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFMasterPage_Orientable() {
		return (EAttribute)eefMasterPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFMasterPage_ShowValidatePage() {
		return (EAttribute)eefMasterPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeMasterPage() {
		return treeMasterPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeMasterPage_ToolbarVisible() {
		return (EAttribute)treeMasterPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFPageInput() {
		return eefPageInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFPageInput_Query() {
		return (EReference)eefPageInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllResourcesRootsRelativeInput() {
		return allResourcesRootsRelativeInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstResourceRootRelativeInput() {
		return firstResourceRootRelativeInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartFilter() {
		return partFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartFilter_FilteredPart() {
		return (EReference)partFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartFilter_ContextualComponent() {
		return (EReference)partFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFEditorContributions() {
		return eefEditorContributionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFEditorPages() {
		return eefEditorPagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticEEFEditorContribution() {
		return staticEEFEditorContributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicEEFEditorContribution() {
		return dynamicEEFEditorContributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorFactory getEditorFactory() {
		return (EditorFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eefEditorContributionEClass = createEClass(EEF_EDITOR_CONTRIBUTION);
		createEReference(eefEditorContributionEClass, EEF_EDITOR_CONTRIBUTION__INPUT);

		eefPageEClass = createEClass(EEF_PAGE);
		createEAttribute(eefPageEClass, EEF_PAGE__TITLE);

		standardFormPageEClass = createEClass(STANDARD_FORM_PAGE);

		masterDetailsPageEClass = createEClass(MASTER_DETAILS_PAGE);

		eefMasterPageEClass = createEClass(EEF_MASTER_PAGE);
		createEAttribute(eefMasterPageEClass, EEF_MASTER_PAGE__ORIENTABLE);
		createEAttribute(eefMasterPageEClass, EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE);

		treeMasterPageEClass = createEClass(TREE_MASTER_PAGE);
		createEAttribute(treeMasterPageEClass, TREE_MASTER_PAGE__TOOLBAR_VISIBLE);

		eefPageInputEClass = createEClass(EEF_PAGE_INPUT);
		createEReference(eefPageInputEClass, EEF_PAGE_INPUT__QUERY);

		allResourcesRootsRelativeInputEClass = createEClass(ALL_RESOURCES_ROOTS_RELATIVE_INPUT);

		firstResourceRootRelativeInputEClass = createEClass(FIRST_RESOURCE_ROOT_RELATIVE_INPUT);

		partFilterEClass = createEClass(PART_FILTER);
		createEReference(partFilterEClass, PART_FILTER__FILTERED_PART);
		createEReference(partFilterEClass, PART_FILTER__CONTEXTUAL_COMPONENT);

		eefEditorContributionsEClass = createEClass(EEF_EDITOR_CONTRIBUTIONS);

		eefEditorPagesEClass = createEClass(EEF_EDITOR_PAGES);

		staticEEFEditorContributionEClass = createEClass(STATIC_EEF_EDITOR_CONTRIBUTION);

		dynamicEEFEditorContributionEClass = createEClass(DYNAMIC_EEF_EDITOR_CONTRIBUTION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ViewsPackage theViewsPackage = (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		FiltersPackage theFiltersPackage = (FiltersPackage)EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		MappingPackage theMappingPackage = (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefPageEClass.getESuperTypes().add(theViewsPackage.getView());
		standardFormPageEClass.getESuperTypes().add(this.getEEFPage());
		masterDetailsPageEClass.getESuperTypes().add(this.getEEFPage());
		eefMasterPageEClass.getESuperTypes().add(this.getMasterDetailsPage());
		treeMasterPageEClass.getESuperTypes().add(this.getMasterDetailsPage());
		allResourcesRootsRelativeInputEClass.getESuperTypes().add(this.getEEFPageInput());
		firstResourceRootRelativeInputEClass.getESuperTypes().add(this.getEEFPageInput());
		partFilterEClass.getESuperTypes().add(theFiltersPackage.getBindingFilter());
		eefEditorContributionsEClass.getESuperTypes().add(theMappingPackage.getCategory());
		eefEditorPagesEClass.getESuperTypes().add(theViewsPackage.getCategory());
		staticEEFEditorContributionEClass.getESuperTypes().add(theMappingPackage.getAbstractElementBinding());
		staticEEFEditorContributionEClass.getESuperTypes().add(this.getEEFEditorContribution());
		dynamicEEFEditorContributionEClass.getESuperTypes().add(theMappingPackage.getEMFElementBinding());
		dynamicEEFEditorContributionEClass.getESuperTypes().add(this.getEEFEditorContribution());

		// Initialize classes and features; add operations and parameters
		initEClass(eefEditorContributionEClass, EEFEditorContribution.class, "EEFEditorContribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFEditorContribution_Input(), this.getEEFPageInput(), null, "input", null, 1, 1, EEFEditorContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefPageEClass, EEFPage.class, "EEFPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, EEFPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardFormPageEClass, StandardFormPage.class, "StandardFormPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterDetailsPageEClass, MasterDetailsPage.class, "MasterDetailsPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefMasterPageEClass, EEFMasterPage.class, "EEFMasterPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFMasterPage_Orientable(), ecorePackage.getEBoolean(), "orientable", null, 0, 1, EEFMasterPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFMasterPage_ShowValidatePage(), ecorePackage.getEBoolean(), "showValidatePage", null, 0, 1, EEFMasterPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeMasterPageEClass, TreeMasterPage.class, "TreeMasterPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeMasterPage_ToolbarVisible(), theEcorePackage.getEBoolean(), "toolbarVisible", null, 0, 1, TreeMasterPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefPageInputEClass, EEFPageInput.class, "EEFPageInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFPageInput_Query(), theQueryPackage.getEEFUnderstandableQuery(), null, "query", null, 0, 1, EEFPageInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allResourcesRootsRelativeInputEClass, AllResourcesRootsRelativeInput.class, "AllResourcesRootsRelativeInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firstResourceRootRelativeInputEClass, FirstResourceRootRelativeInput.class, "FirstResourceRootRelativeInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partFilterEClass, PartFilter.class, "PartFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartFilter_FilteredPart(), theViewsPackage.getView(), null, "filteredPart", null, 1, 1, PartFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartFilter_ContextualComponent(), theComponentsPackage.getPropertiesEditionComponent(), null, "contextualComponent", null, 0, 1, PartFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefEditorContributionsEClass, EEFEditorContributions.class, "EEFEditorContributions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefEditorPagesEClass, EEFEditorPages.class, "EEFEditorPages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticEEFEditorContributionEClass, StaticEEFEditorContribution.class, "StaticEEFEditorContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicEEFEditorContributionEClass, DynamicEEFEditorContribution.class, "DynamicEEFEditorContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EditorPackageImpl
