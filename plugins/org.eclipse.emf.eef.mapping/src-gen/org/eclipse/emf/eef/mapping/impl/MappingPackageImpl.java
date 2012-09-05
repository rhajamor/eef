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
package org.eclipse.emf.eef.mapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.mapping.AbstractElementBinding;
import org.eclipse.emf.eef.mapping.AbstractPropertyBinding;
import org.eclipse.emf.eef.mapping.Category;
import org.eclipse.emf.eef.mapping.Databinding;
import org.eclipse.emf.eef.mapping.DocumentedElement;
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.ElementBindingReference;
import org.eclipse.emf.eef.mapping.MappingFactory;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.ModelElement;
import org.eclipse.emf.eef.mapping.ModelProperty;
import org.eclipse.emf.eef.mapping.StandardElementBinding;
import org.eclipse.emf.eef.mapping.StandardPropertyBinding;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl;
import org.eclipse.emf.eef.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingPackageImpl extends EPackageImpl implements MappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfElementBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfPropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardElementBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardPropertyBindingEClass = null;

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
	private EClass elementBindingReferenceEClass = null;

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
	private EClass emfMultiPropertiesBindingEClass = null;

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
	 * @see org.eclipse.emf.eef.mapping.MappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingPackageImpl() {
		super(eNS_URI, MappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingPackage init() {
		if (isInited)
			return (MappingPackage) EPackage.Registry.INSTANCE
					.getEPackage(MappingPackage.eNS_URI);

		// Obtain or create and register package
		MappingPackageImpl theMappingPackage = (MappingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new MappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ViewsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NavigationPackage.eNS_URI)
				: NavigationPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);

		// Create package meta-data objects
		theMappingPackage.createPackageContents();
		theNavigationPackage.createPackageContents();
		theFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theMappingPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI,
				theMappingPackage);
		return theMappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabinding() {
		return databindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabinding_Bindings() {
		return (EReference) databindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabinding_Categories() {
		return (EReference) databindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Properties() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_SubElements() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Binding() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_SuperElement() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElementBinding() {
		return abstractElementBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_SubElements() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_Properties() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_Databinding() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_SuperElement() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElementBinding_Name() {
		return (EAttribute) abstractElementBindingEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_ReferencedBinding() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_Views() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_Category() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementBinding_BindingFilters() {
		return (EReference) abstractElementBindingEClass
				.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelProperty() {
		return modelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelProperty_Binding() {
		return (EReference) modelPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelProperty_ModelElement() {
		return (EReference) modelPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPropertyBinding() {
		return abstractPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPropertyBinding_Name() {
		return (EAttribute) abstractPropertyBindingEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPropertyBinding_Views() {
		return (EReference) abstractPropertyBindingEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPropertyBinding_Element() {
		return (EReference) abstractPropertyBindingEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPropertyBinding_BindingFilters() {
		return (EReference) abstractPropertyBindingEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFElementBinding() {
		return emfElementBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFElementBinding_Model() {
		return (EReference) emfElementBindingEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFPropertyBinding() {
		return emfPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFPropertyBinding_Model() {
		return (EReference) emfPropertyBindingEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFPropertyBinding_Navigation() {
		return (EReference) emfPropertyBindingEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardElementBinding() {
		return standardElementBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardElementBinding_Model() {
		return (EReference) standardElementBindingEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardPropertyBinding() {
		return standardPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardPropertyBinding_Model() {
		return (EReference) standardPropertyBindingEClass
				.getEStructuralFeatures().get(0);
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
	public EAttribute getCategory_Name() {
		return (EAttribute) categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Bindings() {
		return (EReference) categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Databinding() {
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
	public EClass getElementBindingReference() {
		return elementBindingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementBindingReference_Binding() {
		return (EReference) elementBindingReferenceEClass
				.getEStructuralFeatures().get(0);
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
		return (EAttribute) documentedElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFMultiPropertiesBinding() {
		return emfMultiPropertiesBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFMultiPropertiesBinding_Model() {
		return (EReference) emfMultiPropertiesBindingEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFMultiPropertiesBinding_Navigation() {
		return (EReference) emfMultiPropertiesBindingEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactory getMappingFactory() {
		return (MappingFactory) getEFactoryInstance();
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
		databindingEClass = createEClass(DATABINDING);
		createEReference(databindingEClass, DATABINDING__BINDINGS);
		createEReference(databindingEClass, DATABINDING__CATEGORIES);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__PROPERTIES);
		createEReference(modelElementEClass, MODEL_ELEMENT__SUB_ELEMENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__BINDING);
		createEReference(modelElementEClass, MODEL_ELEMENT__SUPER_ELEMENT);

		abstractElementBindingEClass = createEClass(ABSTRACT_ELEMENT_BINDING);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__PROPERTIES);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__DATABINDING);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT);
		createEAttribute(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__NAME);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__VIEWS);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__CATEGORY);
		createEReference(abstractElementBindingEClass,
				ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS);

		modelPropertyEClass = createEClass(MODEL_PROPERTY);
		createEReference(modelPropertyEClass, MODEL_PROPERTY__BINDING);
		createEReference(modelPropertyEClass, MODEL_PROPERTY__MODEL_ELEMENT);

		abstractPropertyBindingEClass = createEClass(ABSTRACT_PROPERTY_BINDING);
		createEAttribute(abstractPropertyBindingEClass,
				ABSTRACT_PROPERTY_BINDING__NAME);
		createEReference(abstractPropertyBindingEClass,
				ABSTRACT_PROPERTY_BINDING__VIEWS);
		createEReference(abstractPropertyBindingEClass,
				ABSTRACT_PROPERTY_BINDING__ELEMENT);
		createEReference(abstractPropertyBindingEClass,
				ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS);

		emfElementBindingEClass = createEClass(EMF_ELEMENT_BINDING);
		createEReference(emfElementBindingEClass, EMF_ELEMENT_BINDING__MODEL);

		emfPropertyBindingEClass = createEClass(EMF_PROPERTY_BINDING);
		createEReference(emfPropertyBindingEClass, EMF_PROPERTY_BINDING__MODEL);
		createEReference(emfPropertyBindingEClass,
				EMF_PROPERTY_BINDING__NAVIGATION);

		standardElementBindingEClass = createEClass(STANDARD_ELEMENT_BINDING);
		createEReference(standardElementBindingEClass,
				STANDARD_ELEMENT_BINDING__MODEL);

		standardPropertyBindingEClass = createEClass(STANDARD_PROPERTY_BINDING);
		createEReference(standardPropertyBindingEClass,
				STANDARD_PROPERTY_BINDING__MODEL);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__BINDINGS);
		createEReference(categoryEClass, CATEGORY__DATABINDING);
		createEReference(categoryEClass, CATEGORY__CATEGORIES);

		elementBindingReferenceEClass = createEClass(ELEMENT_BINDING_REFERENCE);
		createEReference(elementBindingReferenceEClass,
				ELEMENT_BINDING_REFERENCE__BINDING);

		documentedElementEClass = createEClass(DOCUMENTED_ELEMENT);
		createEAttribute(documentedElementEClass,
				DOCUMENTED_ELEMENT__DOCUMENTATION);

		emfMultiPropertiesBindingEClass = createEClass(EMF_MULTI_PROPERTIES_BINDING);
		createEReference(emfMultiPropertiesBindingEClass,
				EMF_MULTI_PROPERTIES_BINDING__MODEL);
		createEReference(emfMultiPropertiesBindingEClass,
				EMF_MULTI_PROPERTIES_BINDING__NAVIGATION);
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
		NavigationPackage theNavigationPackage = (NavigationPackage) EPackage.Registry.INSTANCE
				.getEPackage(NavigationPackage.eNS_URI);
		FiltersPackage theFiltersPackage = (FiltersPackage) EPackage.Registry.INSTANCE
				.getEPackage(FiltersPackage.eNS_URI);
		ViewsPackage theViewsPackage = (ViewsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ViewsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theNavigationPackage);
		getESubpackages().add(theFiltersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		databindingEClass.getESuperTypes().add(this.getDocumentedElement());
		modelElementEClass.getESuperTypes().add(this.getDocumentedElement());
		abstractElementBindingEClass.getESuperTypes().add(
				this.getDocumentedElement());
		modelPropertyEClass.getESuperTypes().add(this.getDocumentedElement());
		abstractPropertyBindingEClass.getESuperTypes().add(
				this.getDocumentedElement());
		emfElementBindingEClass.getESuperTypes().add(
				this.getAbstractElementBinding());
		emfPropertyBindingEClass.getESuperTypes().add(
				this.getAbstractPropertyBinding());
		standardElementBindingEClass.getESuperTypes().add(
				this.getAbstractElementBinding());
		standardPropertyBindingEClass.getESuperTypes().add(
				this.getAbstractPropertyBinding());
		categoryEClass.getESuperTypes().add(this.getDocumentedElement());
		elementBindingReferenceEClass.getESuperTypes().add(
				this.getDocumentedElement());
		emfMultiPropertiesBindingEClass.getESuperTypes().add(
				this.getAbstractPropertyBinding());

		// Initialize classes and features; add operations and parameters
		initEClass(databindingEClass, Databinding.class, "Databinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabinding_Bindings(),
				this.getAbstractElementBinding(),
				this.getAbstractElementBinding_Databinding(), "bindings", null,
				0, -1, Databinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabinding_Categories(), this.getCategory(),
				this.getCategory_Databinding(), "categories", null, 0, -1,
				Databinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Properties(), this.getModelProperty(),
				this.getModelProperty_ModelElement(), "properties", null, 0,
				-1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_SubElements(), this.getModelElement(),
				this.getModelElement_SuperElement(), "subElements", null, 0,
				-1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Binding(),
				this.getStandardElementBinding(),
				this.getStandardElementBinding_Model(), "binding", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_SuperElement(), this.getModelElement(),
				this.getModelElement_SubElements(), "superElement", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(abstractElementBindingEClass, AbstractElementBinding.class,
				"AbstractElementBinding", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractElementBinding_SubElements(),
				this.getAbstractElementBinding(),
				this.getAbstractElementBinding_SuperElement(), "subElements",
				null, 0, -1, AbstractElementBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractElementBinding_Properties(),
				this.getAbstractPropertyBinding(),
				this.getAbstractPropertyBinding_Element(), "properties", null,
				0, -1, AbstractElementBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractElementBinding_Databinding(),
				this.getDatabinding(), this.getDatabinding_Bindings(),
				"databinding", null, 0, 1, AbstractElementBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractElementBinding_SuperElement(),
				this.getAbstractElementBinding(),
				this.getAbstractElementBinding_SubElements(), "superElement",
				null, 0, 1, AbstractElementBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAbstractElementBinding_Name(),
				ecorePackage.getEString(), "name", null, 1, 1,
				AbstractElementBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractElementBinding_ReferencedBinding(),
				this.getElementBindingReference(), null, "referencedBinding",
				null, 0, -1, AbstractElementBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractElementBinding_Views(),
				theViewsPackage.getView(), null, "views", null, 1, -1,
				AbstractElementBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractElementBinding_Category(),
				this.getCategory(), this.getCategory_Bindings(), "category",
				null, 0, 1, AbstractElementBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractElementBinding_BindingFilters(),
				theFiltersPackage.getBindingFilter(), null, "bindingFilters",
				null, 0, -1, AbstractElementBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelPropertyEClass, ModelProperty.class, "ModelProperty",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelProperty_Binding(),
				this.getStandardPropertyBinding(),
				this.getStandardPropertyBinding_Model(), "binding", null, 0, 1,
				ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelProperty_ModelElement(), this.getModelElement(),
				this.getModelElement_Properties(), "modelElement", null, 0, 1,
				ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPropertyBindingEClass,
				AbstractPropertyBinding.class, "AbstractPropertyBinding",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPropertyBinding_Name(),
				ecorePackage.getEString(), "name", null, 1, 1,
				AbstractPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractPropertyBinding_Views(),
				theViewsPackage.getElementEditor(), null, "views", null, 1, -1,
				AbstractPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPropertyBinding_Element(),
				this.getAbstractElementBinding(),
				this.getAbstractElementBinding_Properties(), "element", null,
				0, 1, AbstractPropertyBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractPropertyBinding_BindingFilters(),
				theFiltersPackage.getBindingFilter(), null, "bindingFilters",
				null, 0, -1, AbstractPropertyBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfElementBindingEClass, EMFElementBinding.class,
				"EMFElementBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFElementBinding_Model(),
				ecorePackage.getEClassifier(), null, "model", null, 1, 1,
				EMFElementBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfPropertyBindingEClass, EMFPropertyBinding.class,
				"EMFPropertyBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFPropertyBinding_Model(),
				ecorePackage.getEStructuralFeature(), null, "model", null, 1,
				1, EMFPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFPropertyBinding_Navigation(),
				theNavigationPackage.getModelNavigation(), null, "navigation",
				null, 0, 1, EMFPropertyBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardElementBindingEClass, StandardElementBinding.class,
				"StandardElementBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardElementBinding_Model(),
				this.getModelElement(), this.getModelElement_Binding(),
				"model", null, 1, 1, StandardElementBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(standardPropertyBindingEClass,
				StandardPropertyBinding.class, "StandardPropertyBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardPropertyBinding_Model(),
				this.getModelProperty(), this.getModelProperty_Binding(),
				"model", null, 1, 1, StandardPropertyBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCategory_Bindings(),
				this.getAbstractElementBinding(),
				this.getAbstractElementBinding_Category(), "bindings", null, 0,
				-1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Databinding(), this.getDatabinding(),
				this.getDatabinding_Categories(), "databinding", null, 0, 1,
				Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Categories(), this.getCategory(), null,
				"categories", null, 0, -1, Category.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementBindingReferenceEClass,
				ElementBindingReference.class, "ElementBindingReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementBindingReference_Binding(),
				this.getAbstractElementBinding(), null, "binding", null, 1, 1,
				ElementBindingReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedElementEClass, DocumentedElement.class,
				"DocumentedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentedElement_Documentation(),
				ecorePackage.getEString(), "documentation", null, 0, 1,
				DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(emfMultiPropertiesBindingEClass,
				EMFMultiPropertiesBinding.class, "EMFMultiPropertiesBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFMultiPropertiesBinding_Model(),
				ecorePackage.getEStructuralFeature(), null, "model", null, 1,
				-1, EMFMultiPropertiesBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFMultiPropertiesBinding_Navigation(),
				theNavigationPackage.getModelNavigation(), null, "navigation",
				null, 0, 1, EMFMultiPropertiesBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MappingPackageImpl
