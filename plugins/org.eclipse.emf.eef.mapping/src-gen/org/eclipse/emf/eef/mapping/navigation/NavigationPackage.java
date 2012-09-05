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
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.SmartModelNavigationImpl <em>Smart Model Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.SmartModelNavigationImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getSmartModelNavigation()
	 * @generated
	 */
	int SMART_MODEL_NAVIGATION = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MODEL_NAVIGATION__STEP = MODEL_NAVIGATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Smart Model Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MODEL_NAVIGATION_FEATURE_COUNT = MODEL_NAVIGATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getNavigationStep()
	 * @generated
	 */
	int NAVIGATION_STEP = 6;

	/**
	 * The feature id for the '<em><b>Creates If Not Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STEP__CREATES_IF_NOT_EXISTS = 0;

	/**
	 * The feature id for the '<em><b>Sub Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STEP__SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STEP__INITIALIZER = 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STEP__FILTERS = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_STEP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl <em>Declarative Navigation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getDeclarativeNavigationStep()
	 * @generated
	 */
	int DECLARATIVE_NAVIGATION_STEP = 7;

	/**
	 * The feature id for the '<em><b>Creates If Not Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__CREATES_IF_NOT_EXISTS = NAVIGATION_STEP__CREATES_IF_NOT_EXISTS;

	/**
	 * The feature id for the '<em><b>Sub Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__SUB_STEP = NAVIGATION_STEP__SUB_STEP;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__INITIALIZER = NAVIGATION_STEP__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__FILTERS = NAVIGATION_STEP__FILTERS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__INDEX = NAVIGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__FEATURE = NAVIGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE = NAVIGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declarative Navigation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_NAVIGATION_STEP_FEATURE_COUNT = NAVIGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.StepInitializerImpl <em>Step Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.StepInitializerImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getStepInitializer()
	 * @generated
	 */
	int STEP_INITIALIZER = 8;

	/**
	 * The number of structural features of the '<em>Step Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_INITIALIZER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer <em>Java Step Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaStepInitializer()
	 * @generated
	 */
	int JAVA_STEP_INITIALIZER = 9;

	/**
	 * The number of structural features of the '<em>Java Step Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STEP_INITIALIZER_FEATURE_COUNT = STEP_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl <em>Java Declaration Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaDeclarationExpression()
	 * @generated
	 */
	int JAVA_DECLARATION_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Qualified Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Method Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_EXPRESSION__METHOD_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Static Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_EXPRESSION__STATIC_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Java Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyExpressionImpl <em>Java Body Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyExpressionImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaBodyExpression()
	 * @generated
	 */
	int JAVA_BODY_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BODY_EXPRESSION__BODY = 0;

	/**
	 * The number of structural features of the '<em>Java Body Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BODY_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationStepInitializerImpl <em>Java Declaration Step Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationStepInitializerImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaDeclarationStepInitializer()
	 * @generated
	 */
	int JAVA_DECLARATION_STEP_INITIALIZER = 12;

	/**
	 * The feature id for the '<em><b>Qualified Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_STEP_INITIALIZER__QUALIFIED_CLASS = JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS;

	/**
	 * The feature id for the '<em><b>Method Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_STEP_INITIALIZER__METHOD_FILTER = JAVA_DECLARATION_EXPRESSION__METHOD_FILTER;

	/**
	 * The feature id for the '<em><b>Static Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_STEP_INITIALIZER__STATIC_METHOD = JAVA_DECLARATION_EXPRESSION__STATIC_METHOD;

	/**
	 * The number of structural features of the '<em>Java Declaration Step Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_STEP_INITIALIZER_FEATURE_COUNT = JAVA_DECLARATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyStepInitializerImpl <em>Java Body Step Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyStepInitializerImpl
	 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaBodyStepInitializer()
	 * @generated
	 */
	int JAVA_BODY_STEP_INITIALIZER = 13;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BODY_STEP_INITIALIZER__BODY = JAVA_BODY_EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Java Body Step Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_BODY_STEP_INITIALIZER_FEATURE_COUNT = JAVA_BODY_EXPRESSION_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation <em>Smart Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Model Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation
	 * @generated
	 */
	EClass getSmartModelNavigation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation#getStep()
	 * @see #getSmartModelNavigation()
	 * @generated
	 */
	EReference getSmartModelNavigation_Step();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationStep
	 * @generated
	 */
	EClass getNavigationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#isCreatesIfNotExists <em>Creates If Not Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creates If Not Exists</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationStep#isCreatesIfNotExists()
	 * @see #getNavigationStep()
	 * @generated
	 */
	EAttribute getNavigationStep_CreatesIfNotExists();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getSubStep <em>Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Step</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationStep#getSubStep()
	 * @see #getNavigationStep()
	 * @generated
	 */
	EReference getNavigationStep_SubStep();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationStep#getInitializer()
	 * @see #getNavigationStep()
	 * @generated
	 */
	EReference getNavigationStep_Initializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationStep#getFilters()
	 * @see #getNavigationStep()
	 * @generated
	 */
	EReference getNavigationStep_Filters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep <em>Declarative Navigation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarative Navigation Step</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep
	 * @generated
	 */
	EClass getDeclarativeNavigationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#getIndex()
	 * @see #getDeclarativeNavigationStep()
	 * @generated
	 */
	EAttribute getDeclarativeNavigationStep_Index();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#getFeature()
	 * @see #getDeclarativeNavigationStep()
	 * @generated
	 */
	EReference getDeclarativeNavigationStep_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discriminator Type</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep#getDiscriminatorType()
	 * @see #getDeclarativeNavigationStep()
	 * @generated
	 */
	EReference getDeclarativeNavigationStep_DiscriminatorType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.StepInitializer <em>Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Initializer</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.StepInitializer
	 * @generated
	 */
	EClass getStepInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer <em>Java Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Step Initializer</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer
	 * @generated
	 */
	EClass getJavaStepInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression <em>Java Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Declaration Expression</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression
	 * @generated
	 */
	EClass getJavaDeclarationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getQualifiedClass <em>Qualified Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Class</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getQualifiedClass()
	 * @see #getJavaDeclarationExpression()
	 * @generated
	 */
	EAttribute getJavaDeclarationExpression_QualifiedClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getMethodFilter <em>Method Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getMethodFilter()
	 * @see #getJavaDeclarationExpression()
	 * @generated
	 */
	EAttribute getJavaDeclarationExpression_MethodFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#isStaticMethod <em>Static Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Method</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#isStaticMethod()
	 * @see #getJavaDeclarationExpression()
	 * @generated
	 */
	EAttribute getJavaDeclarationExpression_StaticMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression <em>Java Body Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Body Expression</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression
	 * @generated
	 */
	EClass getJavaBodyExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression#getBody()
	 * @see #getJavaBodyExpression()
	 * @generated
	 */
	EAttribute getJavaBodyExpression_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer <em>Java Declaration Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Declaration Step Initializer</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer
	 * @generated
	 */
	EClass getJavaDeclarationStepInitializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer <em>Java Body Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Body Step Initializer</em>'.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer
	 * @generated
	 */
	EClass getJavaBodyStepInitializer();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.SmartModelNavigationImpl <em>Smart Model Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.SmartModelNavigationImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getSmartModelNavigation()
		 * @generated
		 */
		EClass SMART_MODEL_NAVIGATION = eINSTANCE.getSmartModelNavigation();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_MODEL_NAVIGATION__STEP = eINSTANCE
				.getSmartModelNavigation_Step();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getNavigationStep()
		 * @generated
		 */
		EClass NAVIGATION_STEP = eINSTANCE.getNavigationStep();

		/**
		 * The meta object literal for the '<em><b>Creates If Not Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_STEP__CREATES_IF_NOT_EXISTS = eINSTANCE
				.getNavigationStep_CreatesIfNotExists();

		/**
		 * The meta object literal for the '<em><b>Sub Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_STEP__SUB_STEP = eINSTANCE
				.getNavigationStep_SubStep();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_STEP__INITIALIZER = eINSTANCE
				.getNavigationStep_Initializer();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_STEP__FILTERS = eINSTANCE
				.getNavigationStep_Filters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl <em>Declarative Navigation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.DeclarativeNavigationStepImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getDeclarativeNavigationStep()
		 * @generated
		 */
		EClass DECLARATIVE_NAVIGATION_STEP = eINSTANCE
				.getDeclarativeNavigationStep();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATIVE_NAVIGATION_STEP__INDEX = eINSTANCE
				.getDeclarativeNavigationStep_Index();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_NAVIGATION_STEP__FEATURE = eINSTANCE
				.getDeclarativeNavigationStep_Feature();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_NAVIGATION_STEP__DISCRIMINATOR_TYPE = eINSTANCE
				.getDeclarativeNavigationStep_DiscriminatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.StepInitializerImpl <em>Step Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.StepInitializerImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getStepInitializer()
		 * @generated
		 */
		EClass STEP_INITIALIZER = eINSTANCE.getStepInitializer();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer <em>Java Step Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaStepInitializer()
		 * @generated
		 */
		EClass JAVA_STEP_INITIALIZER = eINSTANCE.getJavaStepInitializer();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl <em>Java Declaration Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaDeclarationExpression()
		 * @generated
		 */
		EClass JAVA_DECLARATION_EXPRESSION = eINSTANCE
				.getJavaDeclarationExpression();

		/**
		 * The meta object literal for the '<em><b>Qualified Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS = eINSTANCE
				.getJavaDeclarationExpression_QualifiedClass();

		/**
		 * The meta object literal for the '<em><b>Method Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DECLARATION_EXPRESSION__METHOD_FILTER = eINSTANCE
				.getJavaDeclarationExpression_MethodFilter();

		/**
		 * The meta object literal for the '<em><b>Static Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DECLARATION_EXPRESSION__STATIC_METHOD = eINSTANCE
				.getJavaDeclarationExpression_StaticMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyExpressionImpl <em>Java Body Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyExpressionImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaBodyExpression()
		 * @generated
		 */
		EClass JAVA_BODY_EXPRESSION = eINSTANCE.getJavaBodyExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_BODY_EXPRESSION__BODY = eINSTANCE
				.getJavaBodyExpression_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationStepInitializerImpl <em>Java Declaration Step Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationStepInitializerImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaDeclarationStepInitializer()
		 * @generated
		 */
		EClass JAVA_DECLARATION_STEP_INITIALIZER = eINSTANCE
				.getJavaDeclarationStepInitializer();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyStepInitializerImpl <em>Java Body Step Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.JavaBodyStepInitializerImpl
		 * @see org.eclipse.emf.eef.mapping.navigation.impl.NavigationPackageImpl#getJavaBodyStepInitializer()
		 * @generated
		 */
		EClass JAVA_BODY_STEP_INITIALIZER = eINSTANCE
				.getJavaBodyStepInitializer();

	}

} //NavigationPackage
