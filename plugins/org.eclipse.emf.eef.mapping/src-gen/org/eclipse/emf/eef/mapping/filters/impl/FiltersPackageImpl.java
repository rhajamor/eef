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
package org.eclipse.emf.eef.mapping.filters.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.BindingFilter;
import org.eclipse.emf.eef.mapping.filters.BusinessFilter;
import org.eclipse.emf.eef.mapping.filters.FiltersFactory;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.JavaBodyStepFilter;
import org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter;
import org.eclipse.emf.eef.mapping.filters.JavaDeclarationStepFilter;
import org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter;
import org.eclipse.emf.eef.mapping.filters.JavaFilter;
import org.eclipse.emf.eef.mapping.filters.JavaStepFilter;
import org.eclipse.emf.eef.mapping.filters.OCLFilter;
import org.eclipse.emf.eef.mapping.filters.OnlyReferenceTypeFilter;
import org.eclipse.emf.eef.mapping.filters.StepFilter;
import org.eclipse.emf.eef.mapping.filters.StrictTypingFilter;
import org.eclipse.emf.eef.mapping.impl.MappingPackageImpl;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiltersPackageImpl extends EPackageImpl implements FiltersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDeclarationFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaExpressionFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlyReferenceTypeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictTypingFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaStepFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaBodyStepFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDeclarationStepFilterEClass = null;

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
	 * @see org.eclipse.emf.eef.mapping.filters.FiltersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FiltersPackageImpl() {
		super(eNS_URI, FiltersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FiltersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FiltersPackage init() {
		if (isInited)
			return (FiltersPackage) EPackage.Registry.INSTANCE
					.getEPackage(FiltersPackage.eNS_URI);

		// Obtain or create and register package
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new FiltersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ViewsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MappingPackageImpl theMappingPackage = (MappingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NavigationPackage.eNS_URI)
				: NavigationPackage.eINSTANCE);

		// Create package meta-data objects
		theFiltersPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theNavigationPackage.createPackageContents();

		// Initialize created meta-data
		theFiltersPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFiltersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FiltersPackage.eNS_URI,
				theFiltersPackage);
		return theFiltersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingFilter() {
		return bindingFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingFilter_Name() {
		return (EAttribute) bindingFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingFilter_Mandatory() {
		return (EAttribute) bindingFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLFilter() {
		return oclFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLFilter_OCLBody() {
		return (EAttribute) oclFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaFilter() {
		return javaFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDeclarationFilter() {
		return javaDeclarationFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDeclarationFilter_MethodName() {
		return (EAttribute) javaDeclarationFilterEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaExpressionFilter() {
		return javaExpressionFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaExpressionFilter_JavaBody() {
		return (EAttribute) javaExpressionFilterEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessFilter() {
		return businessFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlyReferenceTypeFilter() {
		return onlyReferenceTypeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlyReferenceTypeFilter_Reference() {
		return (EReference) onlyReferenceTypeFilterEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrictTypingFilter() {
		return strictTypingFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrictTypingFilter_Type() {
		return (EReference) strictTypingFilterEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepFilter() {
		return stepFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaStepFilter() {
		return javaStepFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaBodyStepFilter() {
		return javaBodyStepFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDeclarationStepFilter() {
		return javaDeclarationStepFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactory getFiltersFactory() {
		return (FiltersFactory) getEFactoryInstance();
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
		bindingFilterEClass = createEClass(BINDING_FILTER);
		createEAttribute(bindingFilterEClass, BINDING_FILTER__NAME);
		createEAttribute(bindingFilterEClass, BINDING_FILTER__MANDATORY);

		oclFilterEClass = createEClass(OCL_FILTER);
		createEAttribute(oclFilterEClass, OCL_FILTER__OCL_BODY);

		javaFilterEClass = createEClass(JAVA_FILTER);

		javaDeclarationFilterEClass = createEClass(JAVA_DECLARATION_FILTER);
		createEAttribute(javaDeclarationFilterEClass,
				JAVA_DECLARATION_FILTER__METHOD_NAME);

		javaExpressionFilterEClass = createEClass(JAVA_EXPRESSION_FILTER);
		createEAttribute(javaExpressionFilterEClass,
				JAVA_EXPRESSION_FILTER__JAVA_BODY);

		businessFilterEClass = createEClass(BUSINESS_FILTER);

		onlyReferenceTypeFilterEClass = createEClass(ONLY_REFERENCE_TYPE_FILTER);
		createEReference(onlyReferenceTypeFilterEClass,
				ONLY_REFERENCE_TYPE_FILTER__REFERENCE);

		strictTypingFilterEClass = createEClass(STRICT_TYPING_FILTER);
		createEReference(strictTypingFilterEClass, STRICT_TYPING_FILTER__TYPE);

		stepFilterEClass = createEClass(STEP_FILTER);

		javaStepFilterEClass = createEClass(JAVA_STEP_FILTER);

		javaBodyStepFilterEClass = createEClass(JAVA_BODY_STEP_FILTER);

		javaDeclarationStepFilterEClass = createEClass(JAVA_DECLARATION_STEP_FILTER);
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
		MappingPackage theMappingPackage = (MappingPackage) EPackage.Registry.INSTANCE
				.getEPackage(MappingPackage.eNS_URI);
		NavigationPackage theNavigationPackage = (NavigationPackage) EPackage.Registry.INSTANCE
				.getEPackage(NavigationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bindingFilterEClass.getESuperTypes().add(
				theMappingPackage.getDocumentedElement());
		oclFilterEClass.getESuperTypes().add(this.getBindingFilter());
		javaFilterEClass.getESuperTypes().add(this.getBindingFilter());
		javaDeclarationFilterEClass.getESuperTypes().add(this.getJavaFilter());
		javaExpressionFilterEClass.getESuperTypes().add(this.getJavaFilter());
		businessFilterEClass.getESuperTypes().add(this.getBindingFilter());
		onlyReferenceTypeFilterEClass.getESuperTypes().add(
				this.getBusinessFilter());
		strictTypingFilterEClass.getESuperTypes().add(this.getBusinessFilter());
		javaStepFilterEClass.getESuperTypes().add(this.getStepFilter());
		javaBodyStepFilterEClass.getESuperTypes().add(
				theNavigationPackage.getJavaBodyExpression());
		javaBodyStepFilterEClass.getESuperTypes().add(this.getJavaStepFilter());
		javaDeclarationStepFilterEClass.getESuperTypes().add(
				theNavigationPackage.getJavaDeclarationExpression());
		javaDeclarationStepFilterEClass.getESuperTypes().add(
				this.getJavaStepFilter());

		// Initialize classes and features; add operations and parameters
		initEClass(bindingFilterEClass, BindingFilter.class, "BindingFilter",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingFilter_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, BindingFilter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingFilter_Mandatory(),
				ecorePackage.getEBoolean(), "mandatory", "true", 0, 1,
				BindingFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(oclFilterEClass, OCLFilter.class, "OCLFilter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLFilter_OCLBody(), ecorePackage.getEString(),
				"OCLBody", null, 0, 1, OCLFilter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(javaFilterEClass, JavaFilter.class, "JavaFilter",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaDeclarationFilterEClass, JavaDeclarationFilter.class,
				"JavaDeclarationFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaDeclarationFilter_MethodName(),
				ecorePackage.getEString(), "methodName", null, 0, 1,
				JavaDeclarationFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(javaExpressionFilterEClass, JavaExpressionFilter.class,
				"JavaExpressionFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaExpressionFilter_JavaBody(),
				ecorePackage.getEString(), "javaBody", null, 0, 1,
				JavaExpressionFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(businessFilterEClass, BusinessFilter.class,
				"BusinessFilter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(onlyReferenceTypeFilterEClass,
				OnlyReferenceTypeFilter.class, "OnlyReferenceTypeFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnlyReferenceTypeFilter_Reference(),
				ecorePackage.getEReference(), null, "reference", null, 0, 1,
				OnlyReferenceTypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strictTypingFilterEClass, StrictTypingFilter.class,
				"StrictTypingFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrictTypingFilter_Type(),
				ecorePackage.getEClassifier(), null, "type", null, 1, 1,
				StrictTypingFilter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepFilterEClass, StepFilter.class, "StepFilter",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaStepFilterEClass, JavaStepFilter.class,
				"JavaStepFilter", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaBodyStepFilterEClass, JavaBodyStepFilter.class,
				"JavaBodyStepFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaDeclarationStepFilterEClass,
				JavaDeclarationStepFilter.class, "JavaDeclarationStepFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //FiltersPackageImpl
