/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencesPackage.java,v 1.2 2010/11/30 08:23:18 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.references;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.eclipse.emf.eef.eefnr.references.ReferencesFactory
 * @model kind="package"
 * @generated
 */
public interface ReferencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "references";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/references/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnr-ref";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencesPackage eINSTANCE = org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.references.impl.AbstractEnabledSampleImpl <em>Abstract Enabled Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.references.impl.AbstractEnabledSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl#getAbstractEnabledSample()
	 * @generated
	 */
	int ABSTRACT_ENABLED_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENABLED_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENABLED_SAMPLE__ENABLED = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Enabled Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENABLED_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.references.impl.ReferenceEnabledSampleImpl <em>Reference Enabled Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferenceEnabledSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl#getReferenceEnabledSample()
	 * @generated
	 */
	int REFERENCE_ENABLED_SAMPLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ENABLED_SAMPLE__NAME = ABSTRACT_ENABLED_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ENABLED_SAMPLE__ENABLED = ABSTRACT_ENABLED_SAMPLE__ENABLED;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ENABLED_SAMPLE__REFERENCE = ABSTRACT_ENABLED_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Enabled Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ENABLED_SAMPLE_FEATURE_COUNT = ABSTRACT_ENABLED_SAMPLE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.references.impl.TestsImpl <em>Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.references.impl.TestsImpl
	 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl#getTests()
	 * @generated
	 */
	int TESTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS__NAME = EefnrPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS_FEATURE_COUNT = EefnrPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.references.AbstractEnabledSample <em>Abstract Enabled Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Enabled Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.references.AbstractEnabledSample
	 * @generated
	 */
	EClass getAbstractEnabledSample();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnr.references.AbstractEnabledSample#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.emf.eef.eefnr.references.AbstractEnabledSample#isEnabled()
	 * @see #getAbstractEnabledSample()
	 * @generated
	 */
	EAttribute getAbstractEnabledSample_Enabled();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample <em>Reference Enabled Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Enabled Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample
	 * @generated
	 */
	EClass getReferenceEnabledSample();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample#getReference()
	 * @see #getReferenceEnabledSample()
	 * @generated
	 */
	EReference getReferenceEnabledSample_Reference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.references.Tests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tests</em>'.
	 * @see org.eclipse.emf.eef.eefnr.references.Tests
	 * @generated
	 */
	EClass getTests();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferencesFactory getReferencesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.references.impl.AbstractEnabledSampleImpl <em>Abstract Enabled Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.references.impl.AbstractEnabledSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl#getAbstractEnabledSample()
		 * @generated
		 */
		EClass ABSTRACT_ENABLED_SAMPLE = eINSTANCE.getAbstractEnabledSample();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ENABLED_SAMPLE__ENABLED = eINSTANCE.getAbstractEnabledSample_Enabled();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.references.impl.ReferenceEnabledSampleImpl <em>Reference Enabled Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferenceEnabledSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl#getReferenceEnabledSample()
		 * @generated
		 */
		EClass REFERENCE_ENABLED_SAMPLE = eINSTANCE.getReferenceEnabledSample();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ENABLED_SAMPLE__REFERENCE = eINSTANCE.getReferenceEnabledSample_Reference();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.references.impl.TestsImpl <em>Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.references.impl.TestsImpl
		 * @see org.eclipse.emf.eef.eefnr.references.impl.ReferencesPackageImpl#getTests()
		 * @generated
		 */
		EClass TESTS = eINSTANCE.getTests();

	}

} //ReferencesPackage
