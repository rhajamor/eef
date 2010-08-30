/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationPackage.java,v 1.1.2.1 2010/08/30 08:48:25 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationFactory
 * @model kind="package"
 * @generated
 */
public interface NavigationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "navigation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/navigation/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnr-nav";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationPackage eINSTANCE = org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl <em>Defered Flat Reference Table Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedFlatReferenceTableEditorSample()
	 * @generated
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defered Flat Reference Table Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl <em>Defered Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl
	 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedReference()
	 * @generated
	 */
	int DEFERED_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Flatreference Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE__FLATREFERENCE_EDITOR = 0;

	/**
	 * The number of structural features of the '<em>Defered Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERED_REFERENCE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample <em>Defered Flat Reference Table Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Flat Reference Table Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample
	 * @generated
	 */
	EClass getDeferedFlatReferenceTableEditorSample();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample#getReferences()
	 * @see #getDeferedFlatReferenceTableEditorSample()
	 * @generated
	 */
	EReference getDeferedFlatReferenceTableEditorSample_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference <em>Defered Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defered Reference</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReference
	 * @generated
	 */
	EClass getDeferedReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference#getFlatreferenceEditor <em>Flatreference Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flatreference Editor</em>'.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReference#getFlatreferenceEditor()
	 * @see #getDeferedReference()
	 * @generated
	 */
	EReference getDeferedReference_FlatreferenceEditor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NavigationFactory getNavigationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl <em>Defered Flat Reference Table Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedFlatReferenceTableEditorSample()
		 * @generated
		 */
		EClass DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE = eINSTANCE.getDeferedFlatReferenceTableEditorSample();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES = eINSTANCE.getDeferedFlatReferenceTableEditorSample_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl <em>Defered Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl
		 * @see org.eclipse.emf.eef.eefnr.navigation.impl.NavigationPackageImpl#getDeferedReference()
		 * @generated
		 */
		EClass DEFERED_REFERENCE = eINSTANCE.getDeferedReference();

		/**
		 * The meta object literal for the '<em><b>Flatreference Editor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFERED_REFERENCE__FLATREFERENCE_EDITOR = eINSTANCE.getDeferedReference_FlatreferenceEditor();

	}

} //NavigationPackage
