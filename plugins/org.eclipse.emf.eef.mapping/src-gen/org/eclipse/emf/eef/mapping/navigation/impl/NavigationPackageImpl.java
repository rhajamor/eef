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
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl;
import org.eclipse.emf.eef.mapping.impl.MappingPackageImpl;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.ModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationFactory;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
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
	}

} //NavigationPackageImpl
