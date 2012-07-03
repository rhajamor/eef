/**
 * <copyright>
 * </copyright>
 *
 * $Id: FiltersPackage.java,v 1.1 2011/02/01 09:54:39 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.filters;

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
 * @see org.eclipse.emf.eef.eefnr.filters.FiltersFactory
 * @model kind="package"
 * @generated
 */
public interface FiltersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/filters/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnr-fltr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersPackage eINSTANCE = org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceOwnerSampleImpl <em>Abstract Reference Owner Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceOwnerSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getAbstractReferenceOwnerSample()
	 * @generated
	 */
	int ABSTRACT_REFERENCE_OWNER_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_OWNER_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Reference Owner Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_OWNER_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceTargetSampleImpl <em>Abstract Reference Target Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceTargetSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getAbstractReferenceTargetSample()
	 * @generated
	 */
	int ABSTRACT_REFERENCE_TARGET_SAMPLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_TARGET_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Reference Target Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_TARGET_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceOwnerSampleImpl <em>Concrete Reference Owner Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceOwnerSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getConcreteReferenceOwnerSample()
	 * @generated
	 */
	int CONCRETE_REFERENCE_OWNER_SAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_OWNER_SAMPLE__NAME = ABSTRACT_REFERENCE_OWNER_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET = ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_OWNER_SAMPLE__TARGET = ABSTRACT_REFERENCE_OWNER_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strict Typing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_OWNER_SAMPLE__STRICT_TYPING = ABSTRACT_REFERENCE_OWNER_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concrete Reference Owner Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_OWNER_SAMPLE_FEATURE_COUNT = ABSTRACT_REFERENCE_OWNER_SAMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample1Impl <em>Concrete Reference Target Sample1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample1Impl
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getConcreteReferenceTargetSample1()
	 * @generated
	 */
	int CONCRETE_REFERENCE_TARGET_SAMPLE1 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_TARGET_SAMPLE1__NAME = ABSTRACT_REFERENCE_TARGET_SAMPLE__NAME;

	/**
	 * The number of structural features of the '<em>Concrete Reference Target Sample1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_TARGET_SAMPLE1_FEATURE_COUNT = ABSTRACT_REFERENCE_TARGET_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample2Impl <em>Concrete Reference Target Sample2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample2Impl
	 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getConcreteReferenceTargetSample2()
	 * @generated
	 */
	int CONCRETE_REFERENCE_TARGET_SAMPLE2 = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_TARGET_SAMPLE2__NAME = ABSTRACT_REFERENCE_TARGET_SAMPLE__NAME;

	/**
	 * The number of structural features of the '<em>Concrete Reference Target Sample2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENCE_TARGET_SAMPLE2_FEATURE_COUNT = ABSTRACT_REFERENCE_TARGET_SAMPLE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample <em>Abstract Reference Owner Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Reference Owner Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample
	 * @generated
	 */
	EClass getAbstractReferenceOwnerSample();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample#getAbstractTarget <em>Abstract Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract Target</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample#getAbstractTarget()
	 * @see #getAbstractReferenceOwnerSample()
	 * @generated
	 */
	EReference getAbstractReferenceOwnerSample_AbstractTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample <em>Abstract Reference Target Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Reference Target Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample
	 * @generated
	 */
	EClass getAbstractReferenceTargetSample();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample <em>Concrete Reference Owner Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Reference Owner Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample
	 * @generated
	 */
	EClass getConcreteReferenceOwnerSample();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample#getTarget()
	 * @see #getConcreteReferenceOwnerSample()
	 * @generated
	 */
	EReference getConcreteReferenceOwnerSample_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample#getStrictTyping <em>Strict Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strict Typing</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample#getStrictTyping()
	 * @see #getConcreteReferenceOwnerSample()
	 * @generated
	 */
	EReference getConcreteReferenceOwnerSample_StrictTyping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample1 <em>Concrete Reference Target Sample1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Reference Target Sample1</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample1
	 * @generated
	 */
	EClass getConcreteReferenceTargetSample1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample2 <em>Concrete Reference Target Sample2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Reference Target Sample2</em>'.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample2
	 * @generated
	 */
	EClass getConcreteReferenceTargetSample2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiltersFactory getFiltersFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceOwnerSampleImpl <em>Abstract Reference Owner Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceOwnerSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getAbstractReferenceOwnerSample()
		 * @generated
		 */
		EClass ABSTRACT_REFERENCE_OWNER_SAMPLE = eINSTANCE.getAbstractReferenceOwnerSample();

		/**
		 * The meta object literal for the '<em><b>Abstract Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET = eINSTANCE.getAbstractReferenceOwnerSample_AbstractTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceTargetSampleImpl <em>Abstract Reference Target Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceTargetSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getAbstractReferenceTargetSample()
		 * @generated
		 */
		EClass ABSTRACT_REFERENCE_TARGET_SAMPLE = eINSTANCE.getAbstractReferenceTargetSample();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceOwnerSampleImpl <em>Concrete Reference Owner Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceOwnerSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getConcreteReferenceOwnerSample()
		 * @generated
		 */
		EClass CONCRETE_REFERENCE_OWNER_SAMPLE = eINSTANCE.getConcreteReferenceOwnerSample();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_REFERENCE_OWNER_SAMPLE__TARGET = eINSTANCE.getConcreteReferenceOwnerSample_Target();

		/**
		 * The meta object literal for the '<em><b>Strict Typing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_REFERENCE_OWNER_SAMPLE__STRICT_TYPING = eINSTANCE.getConcreteReferenceOwnerSample_StrictTyping();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample1Impl <em>Concrete Reference Target Sample1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample1Impl
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getConcreteReferenceTargetSample1()
		 * @generated
		 */
		EClass CONCRETE_REFERENCE_TARGET_SAMPLE1 = eINSTANCE.getConcreteReferenceTargetSample1();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample2Impl <em>Concrete Reference Target Sample2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.ConcreteReferenceTargetSample2Impl
		 * @see org.eclipse.emf.eef.eefnr.filters.impl.FiltersPackageImpl#getConcreteReferenceTargetSample2()
		 * @generated
		 */
		EClass CONCRETE_REFERENCE_TARGET_SAMPLE2 = eINSTANCE.getConcreteReferenceTargetSample2();

	}

} //FiltersPackage
