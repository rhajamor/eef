/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.navigation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationFactory
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
	String eNS_URI = "http://www.eclipse.org/emf/eef/mapping/navigation/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-mapping-navigation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationPackage eINSTANCE = org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.ModelNavigationImpl <em>Model Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.ModelNavigationImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getModelNavigation()
	 * @generated
	 */
	int MODEL_NAVIGATION = 0;

	/**
	 * The number of structural features of the '<em>Model Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NAVIGATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.StructuredModelNavigationImpl <em>Structured Model Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.StructuredModelNavigationImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getStructuredModelNavigation()
	 * @generated
	 */
	int STRUCTURED_MODEL_NAVIGATION = 3;

	/**
	 * The number of structural features of the '<em>Structured Model Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT = MODEL_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl <em>Simple Model Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getSimpleModelNavigation()
	 * @generated
	 */
	int SIMPLE_MODEL_NAVIGATION = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MODEL_NAVIGATION__FEATURE = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MODEL_NAVIGATION__INDEX = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Model Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MODEL_NAVIGATION_FEATURE_COUNT = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.ChainedModelNavigationImpl <em>Chained Model Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.ChainedModelNavigationImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getChainedModelNavigation()
	 * @generated
	 */
	int CHAINED_MODEL_NAVIGATION = 2;

	/**
	 * The feature id for the '<em><b>Current</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_MODEL_NAVIGATION__CURRENT = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_MODEL_NAVIGATION__NEXT = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chained Model Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_MODEL_NAVIGATION_FEATURE_COUNT = STRUCTURED_MODEL_NAVIGATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.CustomModelNavigationImpl <em>Custom Model Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.CustomModelNavigationImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getCustomModelNavigation()
	 * @generated
	 */
	int CUSTOM_MODEL_NAVIGATION = 4;

	/**
	 * The number of structural features of the '<em>Custom Model Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_MODEL_NAVIGATION_FEATURE_COUNT = MODEL_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.ModelNavigation <em>Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.ModelNavigation
	 * @generated
	 */
	EClass getModelNavigation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation <em>Simple Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Model Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation
	 * @generated
	 */
	EClass getSimpleModelNavigation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getFeature()
	 * @see #getSimpleModelNavigation()
	 * @generated
	 */
	EReference getSimpleModelNavigation_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getIndex()
	 * @see #getSimpleModelNavigation()
	 * @generated
	 */
	EAttribute getSimpleModelNavigation_Index();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discriminator Type</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation#getDiscriminatorType()
	 * @see #getSimpleModelNavigation()
	 * @generated
	 */
	EReference getSimpleModelNavigation_DiscriminatorType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation <em>Chained Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chained Model Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation
	 * @generated
	 */
	EClass getChainedModelNavigation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getCurrent()
	 * @see #getChainedModelNavigation()
	 * @generated
	 */
	EReference getChainedModelNavigation_Current();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation#getNext()
	 * @see #getChainedModelNavigation()
	 * @generated
	 */
	EReference getChainedModelNavigation_Next();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation <em>Structured Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Model Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation
	 * @generated
	 */
	EClass getStructuredModelNavigation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation <em>Custom Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Model Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation
	 * @generated
	 */
	EClass getCustomModelNavigation();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.ModelNavigationImpl <em>Model Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.ModelNavigationImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getModelNavigation()
		 * @generated
		 */
		EClass MODEL_NAVIGATION = eINSTANCE.getModelNavigation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl <em>Simple Model Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.SimpleModelNavigationImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getSimpleModelNavigation()
		 * @generated
		 */
		EClass SIMPLE_MODEL_NAVIGATION = eINSTANCE.getSimpleModelNavigation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MODEL_NAVIGATION__FEATURE = eINSTANCE
				.getSimpleModelNavigation_Feature();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_MODEL_NAVIGATION__INDEX = eINSTANCE
				.getSimpleModelNavigation_Index();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE = eINSTANCE
				.getSimpleModelNavigation_DiscriminatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.ChainedModelNavigationImpl <em>Chained Model Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.ChainedModelNavigationImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getChainedModelNavigation()
		 * @generated
		 */
		EClass CHAINED_MODEL_NAVIGATION = eINSTANCE.getChainedModelNavigation();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAINED_MODEL_NAVIGATION__CURRENT = eINSTANCE
				.getChainedModelNavigation_Current();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAINED_MODEL_NAVIGATION__NEXT = eINSTANCE
				.getChainedModelNavigation_Next();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.StructuredModelNavigationImpl <em>Structured Model Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.StructuredModelNavigationImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getStructuredModelNavigation()
		 * @generated
		 */
		EClass STRUCTURED_MODEL_NAVIGATION = eINSTANCE
				.getStructuredModelNavigation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.CustomModelNavigationImpl <em>Custom Model Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.CustomModelNavigationImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getCustomModelNavigation()
		 * @generated
		 */
		EClass CUSTOM_MODEL_NAVIGATION = eINSTANCE.getCustomModelNavigation();

	}

} //NavigationPackage
