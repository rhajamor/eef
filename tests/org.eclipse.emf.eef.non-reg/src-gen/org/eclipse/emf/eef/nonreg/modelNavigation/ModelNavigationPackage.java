/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.modelNavigation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.middle.middlenonreg.MiddlenonregPackage;

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
 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationFactory
 * @model kind="package"
 * @generated
 */
public interface ModelNavigationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelNavigation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/properties/1.0.0/modelnavigation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-modelnavigation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelNavigationPackage eINSTANCE = org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Unique Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__UNIQUE_REF = 0;

	/**
	 * The feature id for the '<em><b>Multiple Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MULTIPLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Multiple Containment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MULTIPLE_CONTAINMENT = 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SuperCibleImpl <em>Super Cible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.SuperCibleImpl
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getSuperCible()
	 * @generated
	 */
	int SUPER_CIBLE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CIBLE__DOCUMENTATION = MiddlenonregPackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CIBLE__NAME = MiddlenonregPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Super Cible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CIBLE_FEATURE_COUNT = MiddlenonregPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.RealCibleImpl <em>Real Cible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.RealCibleImpl
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getRealCible()
	 * @generated
	 */
	int REAL_CIBLE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CIBLE__DOCUMENTATION = SUPER_CIBLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CIBLE__NAME = SUPER_CIBLE__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CIBLE__REF = SUPER_CIBLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Cible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CIBLE_FEATURE_COUNT = SUPER_CIBLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.ConcreteCibleImpl <em>Concrete Cible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ConcreteCibleImpl
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getConcreteCible()
	 * @generated
	 */
	int CONCRETE_CIBLE = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CIBLE__DOCUMENTATION = SUPER_CIBLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CIBLE__NAME = SUPER_CIBLE__NAME;

	/**
	 * The number of structural features of the '<em>Concrete Cible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CIBLE_FEATURE_COUNT = SUPER_CIBLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.modelNavRootImpl <em>model Nav Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.modelNavRootImpl
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getmodelNavRoot()
	 * @generated
	 */
	int MODEL_NAV_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAV_ROOT__SOURCES = 0;

	/**
	 * The feature id for the '<em><b>Cibles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAV_ROOT__CIBLES = 1;

	/**
	 * The number of structural features of the '<em>model Nav Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAV_ROOT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getUniqueRef <em>Unique Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unique Ref</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.Source#getUniqueRef()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_UniqueRef();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getMultipleRef <em>Multiple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multiple Ref</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.Source#getMultipleRef()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_MultipleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getMultipleContainment <em>Multiple Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiple Containment</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.Source#getMultipleContainment()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_MultipleContainment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible <em>Super Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Cible</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible
	 * @generated
	 */
	EClass getSuperCible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.modelNavigation.RealCible <em>Real Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Cible</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.RealCible
	 * @generated
	 */
	EClass getRealCible();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.nonreg.modelNavigation.RealCible#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.RealCible#getRef()
	 * @see #getRealCible()
	 * @generated
	 */
	EReference getRealCible_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.modelNavigation.ConcreteCible <em>Concrete Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Cible</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ConcreteCible
	 * @generated
	 */
	EClass getConcreteCible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot <em>model Nav Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>model Nav Root</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot
	 * @generated
	 */
	EClass getmodelNavRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot#getSources()
	 * @see #getmodelNavRoot()
	 * @generated
	 */
	EReference getmodelNavRoot_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot#getCibles <em>Cibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cibles</em>'.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot#getCibles()
	 * @see #getmodelNavRoot()
	 * @generated
	 */
	EReference getmodelNavRoot_Cibles();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelNavigationFactory getModelNavigationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Unique Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__UNIQUE_REF = eINSTANCE.getSource_UniqueRef();

		/**
		 * The meta object literal for the '<em><b>Multiple Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__MULTIPLE_REF = eINSTANCE.getSource_MultipleRef();

		/**
		 * The meta object literal for the '<em><b>Multiple Containment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__MULTIPLE_CONTAINMENT = eINSTANCE.getSource_MultipleContainment();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SuperCibleImpl <em>Super Cible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.SuperCibleImpl
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getSuperCible()
		 * @generated
		 */
		EClass SUPER_CIBLE = eINSTANCE.getSuperCible();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.RealCibleImpl <em>Real Cible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.RealCibleImpl
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getRealCible()
		 * @generated
		 */
		EClass REAL_CIBLE = eINSTANCE.getRealCible();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_CIBLE__REF = eINSTANCE.getRealCible_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.ConcreteCibleImpl <em>Concrete Cible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ConcreteCibleImpl
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getConcreteCible()
		 * @generated
		 */
		EClass CONCRETE_CIBLE = eINSTANCE.getConcreteCible();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.modelNavRootImpl <em>model Nav Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.modelNavRootImpl
		 * @see org.eclipse.emf.eef.nonreg.modelNavigation.impl.ModelNavigationPackageImpl#getmodelNavRoot()
		 * @generated
		 */
		EClass MODEL_NAV_ROOT = eINSTANCE.getmodelNavRoot();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_NAV_ROOT__SOURCES = eINSTANCE.getmodelNavRoot_Sources();

		/**
		 * The meta object literal for the '<em><b>Cibles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_NAV_ROOT__CIBLES = eINSTANCE.getmodelNavRoot_Cibles();

	}

} //ModelNavigationPackage
