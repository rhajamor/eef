/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationPackageImpl.java,v 1.1.2.1 2010/08/30 08:48:25 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.impl.EefnrPackageImpl;
import org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReference;
import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
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
public class NavigationPackageImpl extends EPackageImpl implements NavigationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deferedFlatReferenceTableEditorSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deferedReferenceEClass = null;

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
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#eNS_URI
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
		if (isInited) return (NavigationPackage)EPackage.Registry.INSTANCE.getEPackage(NavigationPackage.eNS_URI);

		// Obtain or create and register package
		NavigationPackageImpl theNavigationPackage = (NavigationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NavigationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NavigationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EefnrPackageImpl theEefnrPackage = (EefnrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) instanceof EefnrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrPackage.eNS_URI) : EefnrPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		EefnrextPackageImpl theEefnrextPackage = (EefnrextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) instanceof EefnrextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EefnrextPackage.eNS_URI) : EefnrextPackage.eINSTANCE);

		// Create package meta-data objects
		theNavigationPackage.createPackageContents();
		theEefnrPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theEefnrextPackage.createPackageContents();

		// Initialize created meta-data
		theNavigationPackage.initializePackageContents();
		theEefnrPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theEefnrextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNavigationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NavigationPackage.eNS_URI, theNavigationPackage);
		return theNavigationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeferedFlatReferenceTableEditorSample() {
		return deferedFlatReferenceTableEditorSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeferedFlatReferenceTableEditorSample_References() {
		return (EReference)deferedFlatReferenceTableEditorSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeferedReference() {
		return deferedReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeferedReference_FlatreferenceEditor() {
		return (EReference)deferedReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFactory getNavigationFactory() {
		return (NavigationFactory)getEFactoryInstance();
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
		deferedFlatReferenceTableEditorSampleEClass = createEClass(DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE);
		createEReference(deferedFlatReferenceTableEditorSampleEClass, DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES);

		deferedReferenceEClass = createEClass(DEFERED_REFERENCE);
		createEReference(deferedReferenceEClass, DEFERED_REFERENCE__FLATREFERENCE_EDITOR);
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
		deferedFlatReferenceTableEditorSampleEClass.getESuperTypes().add(theEefnrPackage.getAbstractSample());

		// Initialize classes and features; add operations and parameters
		initEClass(deferedFlatReferenceTableEditorSampleEClass, DeferedFlatReferenceTableEditorSample.class, "DeferedFlatReferenceTableEditorSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeferedFlatReferenceTableEditorSample_References(), this.getDeferedReference(), null, "references", null, 0, -1, DeferedFlatReferenceTableEditorSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deferedReferenceEClass, DeferedReference.class, "DeferedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeferedReference_FlatreferenceEditor(), theEefnrPackage.getTotalSample(), null, "flatreferenceEditor", null, 1, 1, DeferedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //NavigationPackageImpl
