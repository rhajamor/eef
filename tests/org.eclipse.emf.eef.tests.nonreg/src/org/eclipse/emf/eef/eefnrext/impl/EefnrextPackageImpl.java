/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrextPackageImpl.java,v 1.3.6.1 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnrext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.eef.eefnr.EefnrPackage;

import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;
import org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl;
import org.eclipse.emf.eef.eefnr.impl.EefnrPackageImpl;

import org.eclipse.emf.eef.eefnr.naming.CustomNamingPackage;
import org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingPackageImpl;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl;
import org.eclipse.emf.eef.eefnr.references.ReferencesPackage;
import org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextFactory;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefnrextPackageImpl extends EPackageImpl implements EefnrextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCompositionTargetExtensionEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatReferenceExtendedEditorSampleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxExtendedEditorSampleEClass = null;

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
	 * @see org.eclipse.emf.eef.eefnrext.EefnrextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefnrextPackageImpl() {
		super(eNS_URI, EefnrextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EefnrextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefnrextPackage init() {
		if (isInited) return (EefnrextPackage)EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI);

		// Obtain or create and register package
		EefnrextPackageImpl theEefnrextPackage = (EefnrextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EefnrextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EefnrextPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EefnrPackageImpl theEefnrPackage = (EefnrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) instanceof EefnrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) : EefnrPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) : NavigationPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);
		CustomNamingPackageImpl theCustomNamingPackage = (CustomNamingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) instanceof CustomNamingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) : CustomNamingPackage.eINSTANCE);

		// Create package meta-data objects
		theEefnrextPackage.createPackageContents();
		theEefnrPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theNavigationPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theCustomNamingPackage.createPackageContents();

		// Initialize created meta-data
		theEefnrextPackage.initializePackageContents();
		theEefnrPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theCustomNamingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEefnrextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EefnrextPackage.eNS_URI, theEefnrextPackage);
		return theEefnrextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCompositionTargetExtensionEditorSample() {
		return tableCompositionTargetExtensionEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatReferenceExtendedEditorSample() {
		return flatReferenceExtendedEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatReferenceExtendedEditorSample_FlatReferenceEditorSample() {
		return (EReference)flatReferenceExtendedEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatReferenceExtendedEditorSample_Demo() {
		return (EAttribute)flatReferenceExtendedEditorSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatReferenceExtendedEditorSample_Size() {
		return (EAttribute)flatReferenceExtendedEditorSampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBoxExtendedEditorSample() {
		return checkBoxExtendedEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckBoxExtendedEditorSample_CheckboxEditorSample() {
		return (EAttribute)checkBoxExtendedEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrextFactory getEefnrextFactory() {
		return (EefnrextFactory)getEFactoryInstance();
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
		tableCompositionTargetExtensionEditorSampleEClass = createEClass(TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE);

		flatReferenceExtendedEditorSampleEClass = createEClass(FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE);
		createEReference(flatReferenceExtendedEditorSampleEClass, FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE);
		createEAttribute(flatReferenceExtendedEditorSampleEClass, FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO);
		createEAttribute(flatReferenceExtendedEditorSampleEClass, FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE);

		checkBoxExtendedEditorSampleEClass = createEClass(CHECK_BOX_EXTENDED_EDITOR_SAMPLE);
		createEAttribute(checkBoxExtendedEditorSampleEClass, CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE);
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
		EefnrPackage theEefnrPackage = (EefnrPackage)EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tableCompositionTargetExtensionEditorSampleEClass.getESuperTypes().add(theEefnrPackage.getAbstractTableCompositionTargetExtensionEditorSample());
		flatReferenceExtendedEditorSampleEClass.getESuperTypes().add(this.getCheckBoxExtendedEditorSample());
		checkBoxExtendedEditorSampleEClass.getESuperTypes().add(theEefnrPackage.getAbstractSample());

		// Initialize classes and features; add operations and parameters
		initEClass(tableCompositionTargetExtensionEditorSampleEClass, TableCompositionTargetExtensionEditorSample.class, "TableCompositionTargetExtensionEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flatReferenceExtendedEditorSampleEClass, FlatReferenceExtendedEditorSample.class, "FlatReferenceExtendedEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatReferenceExtendedEditorSample_FlatReferenceEditorSample(), theEefnrPackage.getAbstractSample(), null, "flatReferenceEditorSample", null, 0, -1, FlatReferenceExtendedEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatReferenceExtendedEditorSample_Demo(), ecorePackage.getEString(), "demo", null, 1, 1, FlatReferenceExtendedEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatReferenceExtendedEditorSample_Size(), ecorePackage.getEInt(), "size", null, 0, 1, FlatReferenceExtendedEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkBoxExtendedEditorSampleEClass, CheckBoxExtendedEditorSample.class, "CheckBoxExtendedEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBoxExtendedEditorSample_CheckboxEditorSample(), ecorePackage.getEBoolean(), "checkboxEditorSample", null, 0, 1, CheckBoxExtendedEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EefnrextPackageImpl
