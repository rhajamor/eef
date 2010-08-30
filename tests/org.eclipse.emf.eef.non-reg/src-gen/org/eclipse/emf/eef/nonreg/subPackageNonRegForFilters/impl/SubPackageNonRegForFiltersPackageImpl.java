/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersFactory;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackageNonRegForFiltersPackageImpl extends EPackageImpl implements SubPackageNonRegForFiltersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forFiltersEClass = null;

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
	 * @see org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubPackageNonRegForFiltersPackageImpl() {
		super(eNS_URI, SubPackageNonRegForFiltersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubPackageNonRegForFiltersPackage init() {
		if (isInited) return (SubPackageNonRegForFiltersPackage)EPackage.Registry.INSTANCE.getEPackage(SubPackageNonRegForFiltersPackage.eNS_URI);

		// Obtain or create and register package
		SubPackageNonRegForFiltersPackageImpl theSubPackageNonRegForFiltersPackage = (SubPackageNonRegForFiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SubPackageNonRegForFiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SubPackageNonRegForFiltersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MiddlenonregPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NonregPackageImpl theNonregPackage = (NonregPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NonregPackage.eNS_URI) instanceof NonregPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NonregPackage.eNS_URI) : NonregPackage.eINSTANCE);
		ModelNavigationPackageImpl theModelNavigationPackage = (ModelNavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelNavigationPackage.eNS_URI) instanceof ModelNavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelNavigationPackage.eNS_URI) : ModelNavigationPackage.eINSTANCE);

		// Create package meta-data objects
		theSubPackageNonRegForFiltersPackage.createPackageContents();
		theNonregPackage.createPackageContents();
		theModelNavigationPackage.createPackageContents();

		// Initialize created meta-data
		theSubPackageNonRegForFiltersPackage.initializePackageContents();
		theNonregPackage.initializePackageContents();
		theModelNavigationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubPackageNonRegForFiltersPackage.freeze();

		return theSubPackageNonRegForFiltersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForFilters() {
		return forFiltersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForFilters_EOFCV() {
		return (EReference)forFiltersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForFilters_RT() {
		return (EReference)forFiltersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageNonRegForFiltersFactory getSubPackageNonRegForFiltersFactory() {
		return (SubPackageNonRegForFiltersFactory)getEFactoryInstance();
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
		forFiltersEClass = createEClass(FOR_FILTERS);
		createEReference(forFiltersEClass, FOR_FILTERS__EOFCV);
		createEReference(forFiltersEClass, FOR_FILTERS__RT);
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
		MiddlenonregPackage theMiddlenonregPackage = (MiddlenonregPackage)EPackage.Registry.INSTANCE.getEPackage(MiddlenonregPackage.eNS_URI);
		AbstractnonregPackage theAbstractnonregPackage = (AbstractnonregPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractnonregPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(forFiltersEClass, ForFilters.class, "ForFilters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForFilters_EOFCV(), theMiddlenonregPackage.getNamedElement(), null, "EOFCV", null, 0, 1, ForFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForFilters_RT(), theAbstractnonregPackage.getDocumentedElement(), null, "RT", null, 0, -1, ForFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SubPackageNonRegForFiltersPackageImpl
