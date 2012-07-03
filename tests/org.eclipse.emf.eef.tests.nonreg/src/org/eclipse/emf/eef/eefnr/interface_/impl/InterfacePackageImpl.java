/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfacePackageImpl.java,v 1.2 2011/11/14 14:00:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.interface_.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;
import org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl;
import org.eclipse.emf.eef.eefnr.impl.EefnrPackageImpl;
import org.eclipse.emf.eef.eefnr.interface_.InterfaceFactory;
import org.eclipse.emf.eef.eefnr.interface_.InterfacePackage;
import org.eclipse.emf.eef.eefnr.interface_.SimpleSample;
import org.eclipse.emf.eef.eefnr.naming.CustomNamingPackage;
import org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingPackageImpl;
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
public class InterfacePackageImpl extends EPackageImpl implements InterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSampleEClass = null;

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
	 * @see org.eclipse.emf.eef.eefnr.interface_.InterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacePackageImpl() {
		super(eNS_URI, InterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacePackage init() {
		if (isInited) return (InterfacePackage)EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);

		// Obtain or create and register package
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfacePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EefnrPackageImpl theEefnrPackage = (EefnrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) instanceof EefnrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) : EefnrPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI) : NavigationPackage.eINSTANCE);
		FiltersPackageImpl theFiltersPackage = (FiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) instanceof FiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FiltersPackage.eNS_URI) : FiltersPackage.eINSTANCE);
		CustomNamingPackageImpl theCustomNamingPackage = (CustomNamingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) instanceof CustomNamingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomNamingPackage.eNS_URI) : CustomNamingPackage.eINSTANCE);
		EefnrextPackageImpl theEefnrextPackage = (EefnrextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) instanceof EefnrextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) : EefnrextPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfacePackage.createPackageContents();
		theEefnrPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theNavigationPackage.createPackageContents();
		theFiltersPackage.createPackageContents();
		theCustomNamingPackage.createPackageContents();
		theEefnrextPackage.createPackageContents();

		// Initialize created meta-data
		theInterfacePackage.initializePackageContents();
		theEefnrPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theNavigationPackage.initializePackageContents();
		theFiltersPackage.initializePackageContents();
		theCustomNamingPackage.initializePackageContents();
		theEefnrextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacePackage.eNS_URI, theInterfacePackage);
		return theInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSample() {
		return simpleSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFactory getInterfaceFactory() {
		return (InterfaceFactory)getEFactoryInstance();
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
		simpleSampleEClass = createEClass(SIMPLE_SAMPLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(simpleSampleEClass, SimpleSample.class, "SimpleSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //InterfacePackageImpl
