/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomNamingPackageImpl.java,v 1.1.2.1 2011/07/18 08:57:17 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.naming.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.eef.eefnr.EefnrPackage;

import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;

import org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl;

import org.eclipse.emf.eef.eefnr.impl.EefnrPackageImpl;

import org.eclipse.emf.eef.eefnr.naming.CustomNamingFactory;
import org.eclipse.emf.eef.eefnr.naming.CustomNamingPackage;
import org.eclipse.emf.eef.eefnr.naming.Event;

import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

import org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl;

import org.eclipse.emf.eef.eefnr.references.ReferencesPackage;

import org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl;

import org.eclipse.emf.eef.eefnrext.EefnrextPackage;

import org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomNamingPackageImpl extends EPackageImpl implements CustomNamingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

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
	 * @see org.eclipse.emf.eef.eefnr.naming.CustomNamingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomNamingPackageImpl() {
		super(eNS_URI, CustomNamingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CustomNamingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CustomNamingPackage init() {
		if (isInited) return (CustomNamingPackage)EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI);

		// Obtain or create and register package
		CustomNamingPackageImpl theCustomNamingPackage = (CustomNamingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomNamingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomNamingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EefnrPackageImpl theEefnrPackage = (EefnrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) instanceof EefnrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) : EefnrPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) : NavigationPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);
		EefnrextPackageImpl theEefnrextPackage = (EefnrextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) instanceof EefnrextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) : EefnrextPackage.eINSTANCE);

		// Create package meta-data objects
		theCustomNamingPackage.createPackageContents();
		theEefnrPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theNavigationPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theEefnrextPackage.createPackageContents();

		// Initialize created meta-data
		theCustomNamingPackage.initializePackageContents();
		theEefnrPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theEefnrextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCustomNamingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CustomNamingPackage.eNS_URI, theCustomNamingPackage);
		return theCustomNamingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomNamingFactory getCustomNamingFactory() {
		return (CustomNamingFactory)getEFactoryInstance();
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
		eventEClass = createEClass(EVENT);
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
		eventEClass.getESuperTypes().add(theEefnrPackage.getAbstractSample());

		// Initialize classes and features; add operations and parameters
		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //CustomNamingPackageImpl
