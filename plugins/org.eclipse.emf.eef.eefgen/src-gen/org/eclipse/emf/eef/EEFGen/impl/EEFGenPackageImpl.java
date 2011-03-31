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
package org.eclipse.emf.eef.EEFGen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.EEFGen.EEFGenFactory;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.EEFGenModelReference;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.components.ComponentsPackage;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFGenPackageImpl extends EPackageImpl implements EEFGenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefGenModelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefGenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genViewsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum helP_STRATEGYEEnum = null;

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
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EEFGenPackageImpl() {
		super(eNS_URI, EEFGenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EEFGenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EEFGenPackage init() {
		if (isInited) return (EEFGenPackage)EPackage.Registry.INSTANCE.getEPackage(EEFGenPackage.eNS_URI);

		// Obtain or create and register package
		EEFGenPackageImpl theEEFGenPackage = (EEFGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EEFGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EEFGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEEFGenPackage.createPackageContents();

		// Initialize created meta-data
		theEEFGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEEFGenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EEFGenPackage.eNS_URI, theEEFGenPackage);
		return theEEFGenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditionContext() {
		return genEditionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditionContext_PropertiesEditionContext() {
		return (EReference)genEditionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_BasePackage() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditionContext_EefGenModel() {
		return (EReference)genEditionContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_DescriptorsContributorID() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_DescriptorsGenericPropertiesViews() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_GmfPropertiesViews() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_GenerateJunitTestCases() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_LeafComponentsSuperClass() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditionContext_PropertiesEditingProvidersSuperClass() {
		return (EAttribute)genEditionContextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFGenModelReference() {
		return eefGenModelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFGenModelReference_ReferencedContext() {
		return (EReference)eefGenModelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFGenModel() {
		return eefGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFGenModel_EditionContexts() {
		return (EReference)eefGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFGenModel_ViewsRepositories() {
		return (EReference)eefGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFGenModel_GenDirectory() {
		return (EAttribute)eefGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFGenModel_Author() {
		return (EAttribute)eefGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFGenModel_License() {
		return (EAttribute)eefGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFGenModel_References() {
		return (EReference)eefGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFGenModel_TestsGenDirectory() {
		return (EAttribute)eefGenModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFGenModel_UseJMergeForUserCode() {
		return (EAttribute)eefGenModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenViewsRepository() {
		return genViewsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenViewsRepository_ViewsRepository() {
		return (EReference)genViewsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenViewsRepository_BasePackage() {
		return (EAttribute)genViewsRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenViewsRepository_SwtViews() {
		return (EAttribute)genViewsRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenViewsRepository_FormViews() {
		return (EAttribute)genViewsRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenViewsRepository_HelpStrategy() {
		return (EAttribute)genViewsRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenViewsRepository_EefGenModel() {
		return (EReference)genViewsRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenViewsRepository_PartsSuperClass() {
		return (EAttribute)genViewsRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHELP_STRATEGY() {
		return helP_STRATEGYEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenFactory getEEFGenFactory() {
		return (EEFGenFactory)getEFactoryInstance();
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
		genEditionContextEClass = createEClass(GEN_EDITION_CONTEXT);
		createEReference(genEditionContextEClass, GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__BASE_PACKAGE);
		createEReference(genEditionContextEClass, GEN_EDITION_CONTEXT__EEF_GEN_MODEL);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS);
		createEAttribute(genEditionContextEClass, GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS);

		eefGenModelReferenceEClass = createEClass(EEF_GEN_MODEL_REFERENCE);
		createEReference(eefGenModelReferenceEClass, EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT);

		eefGenModelEClass = createEClass(EEF_GEN_MODEL);
		createEReference(eefGenModelEClass, EEF_GEN_MODEL__EDITION_CONTEXTS);
		createEReference(eefGenModelEClass, EEF_GEN_MODEL__VIEWS_REPOSITORIES);
		createEAttribute(eefGenModelEClass, EEF_GEN_MODEL__GEN_DIRECTORY);
		createEAttribute(eefGenModelEClass, EEF_GEN_MODEL__AUTHOR);
		createEAttribute(eefGenModelEClass, EEF_GEN_MODEL__LICENSE);
		createEReference(eefGenModelEClass, EEF_GEN_MODEL__REFERENCES);
		createEAttribute(eefGenModelEClass, EEF_GEN_MODEL__TESTS_GEN_DIRECTORY);
		createEAttribute(eefGenModelEClass, EEF_GEN_MODEL__USE_JMERGE_FOR_USER_CODE);

		genViewsRepositoryEClass = createEClass(GEN_VIEWS_REPOSITORY);
		createEReference(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__VIEWS_REPOSITORY);
		createEAttribute(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__BASE_PACKAGE);
		createEAttribute(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__SWT_VIEWS);
		createEAttribute(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__FORM_VIEWS);
		createEAttribute(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__HELP_STRATEGY);
		createEReference(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__EEF_GEN_MODEL);
		createEAttribute(genViewsRepositoryEClass, GEN_VIEWS_REPOSITORY__PARTS_SUPER_CLASS);

		// Create enums
		helP_STRATEGYEEnum = createEEnum(HELP_STRATEGY);
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
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ViewsPackage theViewsPackage = (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(genEditionContextEClass, GenEditionContext.class, "GenEditionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenEditionContext_PropertiesEditionContext(), theComponentsPackage.getPropertiesEditionContext(), null, "PropertiesEditionContext", null, 1, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEditionContext_EefGenModel(), this.getEEFGenModel(), this.getEEFGenModel_EditionContexts(), "eefGenModel", null, 1, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_DescriptorsContributorID(), ecorePackage.getEString(), "descriptorsContributorID", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_DescriptorsGenericPropertiesViews(), ecorePackage.getEBoolean(), "descriptorsGenericPropertiesViews", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_GmfPropertiesViews(), ecorePackage.getEBoolean(), "gmfPropertiesViews", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_GenerateJunitTestCases(), ecorePackage.getEBoolean(), "generateJunitTestCases", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_LeafComponentsSuperClass(), ecorePackage.getEString(), "leafComponentsSuperClass", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEditionContext_PropertiesEditingProvidersSuperClass(), ecorePackage.getEString(), "propertiesEditingProvidersSuperClass", null, 0, 1, GenEditionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefGenModelReferenceEClass, EEFGenModelReference.class, "EEFGenModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFGenModelReference_ReferencedContext(), this.getEEFGenModel(), null, "referencedContext", null, 1, 1, EEFGenModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefGenModelEClass, EEFGenModel.class, "EEFGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFGenModel_EditionContexts(), this.getGenEditionContext(), this.getGenEditionContext_EefGenModel(), "editionContexts", null, 0, -1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFGenModel_ViewsRepositories(), this.getGenViewsRepository(), this.getGenViewsRepository_EefGenModel(), "viewsRepositories", null, 0, -1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGenModel_GenDirectory(), ecorePackage.getEString(), "genDirectory", null, 1, 1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGenModel_Author(), ecorePackage.getEString(), "author", null, 0, 1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGenModel_License(), ecorePackage.getEString(), "license", null, 0, 1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFGenModel_References(), this.getEEFGenModelReference(), null, "references", null, 0, -1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGenModel_TestsGenDirectory(), ecorePackage.getEString(), "testsGenDirectory", null, 0, 1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGenModel_UseJMergeForUserCode(), ecorePackage.getEBoolean(), "useJMergeForUserCode", "false", 0, 1, EEFGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genViewsRepositoryEClass, GenViewsRepository.class, "GenViewsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenViewsRepository_ViewsRepository(), theViewsPackage.getViewsRepository(), null, "viewsRepository", null, 1, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenViewsRepository_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenViewsRepository_SwtViews(), ecorePackage.getEBoolean(), "swtViews", null, 0, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenViewsRepository_FormViews(), ecorePackage.getEBoolean(), "formViews", null, 0, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenViewsRepository_HelpStrategy(), this.getHELP_STRATEGY(), "helpStrategy", null, 1, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenViewsRepository_EefGenModel(), this.getEEFGenModel(), this.getEEFGenModel_ViewsRepositories(), "eefGenModel", null, 1, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenViewsRepository_PartsSuperClass(), ecorePackage.getEString(), "partsSuperClass", null, 0, 1, GenViewsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(helP_STRATEGYEEnum, org.eclipse.emf.eef.EEFGen.HELP_STRATEGY.class, "HELP_STRATEGY");
		addEEnumLiteral(helP_STRATEGYEEnum, org.eclipse.emf.eef.EEFGen.HELP_STRATEGY.GENMODEL);
		addEEnumLiteral(helP_STRATEGYEEnum, org.eclipse.emf.eef.EEFGen.HELP_STRATEGY.ECOREMODEL);

		// Create resource
		createResource(eNS_URI);
	}

} //EEFGenPackageImpl
