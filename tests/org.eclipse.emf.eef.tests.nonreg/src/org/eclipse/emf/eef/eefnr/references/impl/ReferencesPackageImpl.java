/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencesPackageImpl.java,v 1.4.6.1 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.references.impl;

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
import org.eclipse.emf.eef.eefnr.references.AbstractEnabledSample;
import org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample;
import org.eclipse.emf.eef.eefnr.references.ReferencesFactory;
import org.eclipse.emf.eef.eefnr.references.ReferencesPackage;

import org.eclipse.emf.eef.eefnr.references.Tests;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;

import org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesPackageImpl extends EPackageImpl implements ReferencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEnabledSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEnabledSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testsEClass = null;

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
	 * @see org.eclipse.emf.eef.eefnr.references.ReferencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencesPackageImpl() {
		super(eNS_URI, ReferencesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReferencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferencesPackage init() {
		if (isInited) return (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Obtain or create and register package
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReferencesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EefnrPackageImpl theEefnrPackage = (EefnrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) instanceof EefnrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) : EefnrPackage.eINSTANCE);
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) : NavigationPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);
		CustomNamingPackageImpl theCustomNamingPackage = (CustomNamingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) instanceof CustomNamingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) : CustomNamingPackage.eINSTANCE);
		EefnrextPackageImpl theEefnrextPackage = (EefnrextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) instanceof EefnrextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) : EefnrextPackage.eINSTANCE);

		// Create package meta-data objects
		theReferencesPackage.createPackageContents();
		theEefnrPackage.createPackageContents();
		theNavigationPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theCustomNamingPackage.createPackageContents();
		theEefnrextPackage.createPackageContents();

		// Initialize created meta-data
		theReferencesPackage.initializePackageContents();
		theEefnrPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theCustomNamingPackage.initializePackageContents();
		theEefnrextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferencesPackage.eNS_URI, theReferencesPackage);
		return theReferencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEnabledSample() {
		return abstractEnabledSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEnabledSample_Enabled() {
		return (EAttribute)abstractEnabledSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceEnabledSample() {
		return referenceEnabledSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceEnabledSample_Reference() {
		return (EReference)referenceEnabledSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTests() {
		return testsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesFactory getReferencesFactory() {
		return (ReferencesFactory)getEFactoryInstance();
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
		abstractEnabledSampleEClass = createEClass(ABSTRACT_ENABLED_SAMPLE);
		createEAttribute(abstractEnabledSampleEClass, ABSTRACT_ENABLED_SAMPLE__ENABLED);

		referenceEnabledSampleEClass = createEClass(REFERENCE_ENABLED_SAMPLE);
		createEReference(referenceEnabledSampleEClass, REFERENCE_ENABLED_SAMPLE__REFERENCE);

		testsEClass = createEClass(TESTS);
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
		abstractEnabledSampleEClass.getESuperTypes().add(theEefnrPackage.getAbstractSample());
		referenceEnabledSampleEClass.getESuperTypes().add(this.getAbstractEnabledSample());
		testsEClass.getESuperTypes().add(theEefnrPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractEnabledSampleEClass, AbstractEnabledSample.class, "AbstractEnabledSample", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEnabledSample_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, AbstractEnabledSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEnabledSampleEClass, ReferenceEnabledSample.class, "ReferenceEnabledSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceEnabledSample_Reference(), theEefnrPackage.getTotalSample(), null, "reference", null, 0, -1, ReferenceEnabledSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testsEClass, Tests.class, "Tests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ReferencesPackageImpl
