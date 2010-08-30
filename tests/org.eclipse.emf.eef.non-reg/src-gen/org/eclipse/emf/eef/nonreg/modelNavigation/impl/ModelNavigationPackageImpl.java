/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.modelNavigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.impl.NonregPackageImpl;
import org.eclipse.emf.eef.nonreg.modelNavigation.ConcreteCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationFactory;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.RealCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.Source;
import org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl.SubPackageNonRegForFiltersPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelNavigationPackageImpl extends EPackageImpl implements ModelNavigationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superCibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realCibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteCibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNavRootEClass = null;

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
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelNavigationPackageImpl() {
		super(eNS_URI, ModelNavigationFactory.eINSTANCE);
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
	public static ModelNavigationPackage init() {
		if (isInited) return (ModelNavigationPackage)EPackage.Registry.INSTANCE.getEPackage(ModelNavigationPackage.eNS_URI);

		// Obtain or create and register package
		ModelNavigationPackageImpl theModelNavigationPackage = (ModelNavigationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ModelNavigationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ModelNavigationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MiddlenonregPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NonregPackageImpl theNonregPackage = (NonregPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NonregPackage.eNS_URI) instanceof NonregPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NonregPackage.eNS_URI) : NonregPackage.eINSTANCE);
		SubPackageNonRegForFiltersPackageImpl theSubPackageNonRegForFiltersPackage = (SubPackageNonRegForFiltersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubPackageNonRegForFiltersPackage.eNS_URI) instanceof SubPackageNonRegForFiltersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubPackageNonRegForFiltersPackage.eNS_URI) : SubPackageNonRegForFiltersPackage.eINSTANCE);

		// Create package meta-data objects
		theModelNavigationPackage.createPackageContents();
		theNonregPackage.createPackageContents();
		theSubPackageNonRegForFiltersPackage.createPackageContents();

		// Initialize created meta-data
		theModelNavigationPackage.initializePackageContents();
		theNonregPackage.initializePackageContents();
		theSubPackageNonRegForFiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelNavigationPackage.freeze();

		return theModelNavigationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_UniqueRef() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_MultipleRef() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_MultipleContainment() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperCible() {
		return superCibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealCible() {
		return realCibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealCible_Ref() {
		return (EReference)realCibleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteCible() {
		return concreteCibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmodelNavRoot() {
		return modelNavRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmodelNavRoot_Sources() {
		return (EReference)modelNavRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmodelNavRoot_Cibles() {
		return (EReference)modelNavRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNavigationFactory getModelNavigationFactory() {
		return (ModelNavigationFactory)getEFactoryInstance();
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
		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__UNIQUE_REF);
		createEReference(sourceEClass, SOURCE__MULTIPLE_REF);
		createEReference(sourceEClass, SOURCE__MULTIPLE_CONTAINMENT);

		superCibleEClass = createEClass(SUPER_CIBLE);

		realCibleEClass = createEClass(REAL_CIBLE);
		createEReference(realCibleEClass, REAL_CIBLE__REF);

		concreteCibleEClass = createEClass(CONCRETE_CIBLE);

		modelNavRootEClass = createEClass(MODEL_NAV_ROOT);
		createEReference(modelNavRootEClass, MODEL_NAV_ROOT__SOURCES);
		createEReference(modelNavRootEClass, MODEL_NAV_ROOT__CIBLES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		superCibleEClass.getESuperTypes().add(theMiddlenonregPackage.getNamedElement());
		realCibleEClass.getESuperTypes().add(this.getSuperCible());
		concreteCibleEClass.getESuperTypes().add(this.getSuperCible());

		// Initialize classes and features; add operations and parameters
		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_UniqueRef(), this.getSuperCible(), null, "UniqueRef", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_MultipleRef(), this.getSuperCible(), null, "MultipleRef", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_MultipleContainment(), this.getSuperCible(), null, "MultipleContainment", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superCibleEClass, SuperCible.class, "SuperCible", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realCibleEClass, RealCible.class, "RealCible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealCible_Ref(), this.getSuperCible(), null, "ref", null, 0, 1, RealCible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteCibleEClass, ConcreteCible.class, "ConcreteCible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelNavRootEClass, modelNavRoot.class, "modelNavRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmodelNavRoot_Sources(), this.getSource(), null, "Sources", null, 0, -1, modelNavRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmodelNavRoot_Cibles(), this.getSuperCible(), null, "Cibles", null, 0, -1, modelNavRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ModelNavigationPackageImpl
