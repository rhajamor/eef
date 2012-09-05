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
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl;
import org.eclipse.emf.eef.mapping.impl.MappingPackageImpl;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep;
import org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression;
import org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer;
import org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression;
import org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer;
import org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer;
import org.eclipse.emf.eef.mapping.navigation.ModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationFactory;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.NavigationStep;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.StepInitializer;
import org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationPackageImpl extends EPackageImpl implements
		NavigationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleModelNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainedModelNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredModelNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customModelNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartModelNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarativeNavigationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaStepInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDeclarationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaBodyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDeclarationStepInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaBodyStepInitializerEClass = null;

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
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NavigationPackageImpl() {
		super(eNS_URI, NavigationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NavigationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NavigationPackage init() {
		if (isInited)
			return (NavigationPackage) EPackage.Registry.INSTANCE
					.getEPackage(NavigationPackage.eNS_URI);

		// Obtain or create and register package
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new NavigationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ViewsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MappingPackageImpl theMappingPackage = (MappingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);

		// Create package meta-data objects
		theNavigationPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theNavigationPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNavigationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NavigationPackage.eNS_URI,
				theNavigationPackage);
		return theNavigationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelNavigation() {
		return modelNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleModelNavigation() {
		return simpleModelNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleModelNavigation_Feature() {
		return (EReference) simpleModelNavigationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleModelNavigation_Index() {
		return (EAttribute) simpleModelNavigationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleModelNavigation_DiscriminatorType() {
		return (EReference) simpleModelNavigationEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainedModelNavigation() {
		return chainedModelNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainedModelNavigation_Current() {
		return (EReference) chainedModelNavigationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainedModelNavigation_Next() {
		return (EReference) chainedModelNavigationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredModelNavigation() {
		return structuredModelNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomModelNavigation() {
		return customModelNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartModelNavigation() {
		return smartModelNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartModelNavigation_Step() {
		return (EReference) smartModelNavigationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationStep() {
		return navigationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationStep_CreatesIfNotExists() {
		return (EAttribute) navigationStepEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationStep_SubStep() {
		return (EReference) navigationStepEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationStep_Initializer() {
		return (EReference) navigationStepEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationStep_Filters() {
		return (EReference) navigationStepEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarativeNavigationStep() {
		return declarativeNavigationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclarativeNavigationStep_Index() {
		return (EAttribute) declarativeNavigationStepEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarativeNavigationStep_Feature() {
		return (EReference) declarativeNavigationStepEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarativeNavigationStep_DiscriminatorType() {
		return (EReference) declarativeNavigationStepEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepInitializer() {
		return stepInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaStepInitializer() {
		return javaStepInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDeclarationExpression() {
		return javaDeclarationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDeclarationExpression_QualifiedClass() {
		return (EAttribute) javaDeclarationExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDeclarationExpression_MethodFilter() {
		return (EAttribute) javaDeclarationExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDeclarationExpression_StaticMethod() {
		return (EAttribute) javaDeclarationExpressionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaBodyExpression() {
		return javaBodyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaBodyExpression_Body() {
		return (EAttribute) javaBodyExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDeclarationStepInitializer() {
		return javaDeclarationStepInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaBodyStepInitializer() {
		return javaBodyStepInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFactory getNavigationFactory() {
		return (NavigationFactory) getEFactoryInstance();
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
		modelNavigationEClass = createEClass(MODEL_NAVIGATION);

		simpleModelNavigationEClass = createEClass(SIMPLE_MODEL_NAVIGATION);
		createEReference(simpleModelNavigationEClass,
				SIMPLE_MODEL_NAVIGATION__FEATURE);
		createEAttribute(simpleModelNavigationEClass,
				SIMPLE_MODEL_NAVIGATION__INDEX);
		createEReference(simpleModelNavigationEClass,
				SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE);

		chainedModelNavigationEClass = createEClass(CHAINED_MODEL_NAVIGATION);
		createEReference(chainedModelNavigationEClass,
				CHAINED_MODEL_NAVIGATION__CURRENT);
		createEReference(chainedModelNavigationEClass,
				CHAINED_MODEL_NAVIGATION__NEXT);

		structuredModelNavigationEClass = createEClass(STRUCTURED_MODEL_NAVIGATION);

		customModelNavigationEClass = createEClass(CUSTOM_MODEL_NAVIGATION);

		smartModelNavigationEClass = createEClass(SMART_MODEL_NAVIGATION);
		createEReference(smartModelNavigationEClass,
				SMART_MODEL_NAVIGATION__STEP);

		navigationStepEClass = createEClass(NAVIGATION_STEP);
		createEAttribute(navigationStepEClass,
				NAVIGATION_STEP__CREATES_IF_NOT_EXISTS);
		createEReference(navigationStepEClass, NAVIGATION_STEP__SUB_STEP);
		createEReference(navigationStepEClass, NAVIGATION_STEP__INITIALIZER);
		createEReference(navigationStepEClass, NAVIGATION_STEP__FILTERS);

		declarativeNavigationStepEClass = createEClass(DECLARATIVE_NAVIGATION_STEP);
		createEAttribute(declarativeNavigationStepEClass,
				DECLARATIVE_NAVIGATION_STEP__INDEX);
		createEReference(declarativeNavigationStepEClass,
				DECLARATIVE_NAVIGATION_STEP__FEATURE);
		createEReference(declarativeNavigationStepEClass,
				DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE);

		stepInitializerEClass = createEClass(STEP_INITIALIZER);

		javaStepInitializerEClass = createEClass(JAVA_STEP_INITIALIZER);

		javaDeclarationExpressionEClass = createEClass(JAVA_DECLARATION_EXPRESSION);
		createEAttribute(javaDeclarationExpressionEClass,
				JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS);
		createEAttribute(javaDeclarationExpressionEClass,
				JAVA_DECLARATION_EXPRESSION__METHOD_FILTER);
		createEAttribute(javaDeclarationExpressionEClass,
				JAVA_DECLARATION_EXPRESSION__STATIC_METHOD);

		javaBodyExpressionEClass = createEClass(JAVA_BODY_EXPRESSION);
		createEAttribute(javaBodyExpressionEClass, JAVA_BODY_EXPRESSION__BODY);

		javaDeclarationStepInitializerEClass = createEClass(JAVA_DECLARATION_STEP_INITIALIZER);

		javaBodyStepInitializerEClass = createEClass(JAVA_BODY_STEP_INITIALIZER);
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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		FiltersPackage theFiltersPackage = (FiltersPackage) EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleModelNavigationEClass.getESuperTypes().add(
				this.getStructuredModelNavigation());
		chainedModelNavigationEClass.getESuperTypes().add(
				this.getStructuredModelNavigation());
		structuredModelNavigationEClass.getESuperTypes().add(
				this.getModelNavigation());
		customModelNavigationEClass.getESuperTypes().add(
				this.getModelNavigation());
		smartModelNavigationEClass.getESuperTypes().add(
				this.getModelNavigation());
		declarativeNavigationStepEClass.getESuperTypes().add(
				this.getNavigationStep());
		javaStepInitializerEClass.getESuperTypes().add(
				this.getStepInitializer());
		javaDeclarationStepInitializerEClass.getESuperTypes().add(
				this.getJavaDeclarationExpression());
		javaDeclarationStepInitializerEClass.getESuperTypes().add(
				this.getJavaStepInitializer());
		javaBodyStepInitializerEClass.getESuperTypes().add(
				this.getJavaBodyExpression());
		javaBodyStepInitializerEClass.getESuperTypes().add(
				this.getJavaStepInitializer());

		// Initialize classes and features; add operations and parameters
		initEClass(modelNavigationEClass, ModelNavigation.class,
				"ModelNavigation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleModelNavigationEClass, SimpleModelNavigation.class,
				"SimpleModelNavigation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleModelNavigation_Feature(),
				ecorePackage.getEReference(), null, "feature", null, 1, 1,
				SimpleModelNavigation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleModelNavigation_Index(),
				ecorePackage.getEInt(), "index", null, 0, 1,
				SimpleModelNavigation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSimpleModelNavigation_DiscriminatorType(),
				ecorePackage.getEClassifier(), null, "discriminatorType", null,
				0, 1, SimpleModelNavigation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainedModelNavigationEClass, ChainedModelNavigation.class,
				"ChainedModelNavigation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainedModelNavigation_Current(),
				this.getStructuredModelNavigation(), null, "current", null, 1,
				1, ChainedModelNavigation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainedModelNavigation_Next(),
				this.getStructuredModelNavigation(), null, "next", null, 1, 1,
				ChainedModelNavigation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredModelNavigationEClass,
				StructuredModelNavigation.class, "StructuredModelNavigation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(structuredModelNavigationEClass,
				ecorePackage.getEClass(), "evaluate", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(customModelNavigationEClass, CustomModelNavigation.class,
				"CustomModelNavigation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(smartModelNavigationEClass, SmartModelNavigation.class,
				"SmartModelNavigation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartModelNavigation_Step(),
				this.getNavigationStep(), null, "step", null, 1, 1,
				SmartModelNavigation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationStepEClass, NavigationStep.class,
				"NavigationStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationStep_CreatesIfNotExists(),
				theEcorePackage.getEBoolean(), "createsIfNotExists", "true", 1,
				1, NavigationStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNavigationStep_SubStep(), this.getNavigationStep(),
				null, "subStep", null, 0, 1, NavigationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNavigationStep_Initializer(),
				this.getStepInitializer(), null, "initializer", null, 0, 1,
				NavigationStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigationStep_Filters(),
				theFiltersPackage.getStepFilter(), null, "filters", null, 0,
				-1, NavigationStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarativeNavigationStepEClass,
				DeclarativeNavigationStep.class, "DeclarativeNavigationStep",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclarativeNavigationStep_Index(),
				theEcorePackage.getEInt(), "index", null, 0, 1,
				DeclarativeNavigationStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDeclarativeNavigationStep_Feature(),
				ecorePackage.getEReference(), null, "feature", null, 1, 1,
				DeclarativeNavigationStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclarativeNavigationStep_DiscriminatorType(),
				ecorePackage.getEClassifier(), null, "discriminatorType", null,
				0, 1, DeclarativeNavigationStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepInitializerEClass, StepInitializer.class,
				"StepInitializer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaStepInitializerEClass, JavaStepInitializer.class,
				"JavaStepInitializer", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaDeclarationExpressionEClass,
				JavaDeclarationExpression.class, "JavaDeclarationExpression",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaDeclarationExpression_QualifiedClass(),
				theEcorePackage.getEString(), "qualifiedClass", null, 1, 1,
				JavaDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getJavaDeclarationExpression_MethodFilter(),
				theEcorePackage.getEString(), "methodFilter", null, 1, 1,
				JavaDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getJavaDeclarationExpression_StaticMethod(),
				theEcorePackage.getEBoolean(), "staticMethod", null, 0, 1,
				JavaDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(javaBodyExpressionEClass, JavaBodyExpression.class,
				"JavaBodyExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaBodyExpression_Body(),
				theEcorePackage.getEString(), "body", null, 1, 1,
				JavaBodyExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(javaDeclarationStepInitializerEClass,
				JavaDeclarationStepInitializer.class,
				"JavaDeclarationStepInitializer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaBodyStepInitializerEClass,
				JavaBodyStepInitializer.class, "JavaBodyStepInitializer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //NavigationPackageImpl
