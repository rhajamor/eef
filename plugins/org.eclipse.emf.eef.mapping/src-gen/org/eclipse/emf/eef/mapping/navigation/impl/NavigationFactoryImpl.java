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
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.mapping.navigation.*;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationFactory;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationFactoryImpl extends EFactoryImpl implements
		NavigationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationFactory init() {
		try {
			NavigationFactory theNavigationFactory = (NavigationFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/eef/mapping/navigation/1.0.0");
			if (theNavigationFactory != null) {
				return theNavigationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NavigationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION:
			return createSimpleModelNavigation();
		case NavigationPackage.CHAINED_MODEL_NAVIGATION:
			return createChainedModelNavigation();
		case NavigationPackage.CUSTOM_MODEL_NAVIGATION:
			return createCustomModelNavigation();
		case NavigationPackage.SMART_MODEL_NAVIGATION:
			return createSmartModelNavigation();
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP:
			return createDeclarativeNavigationStep();
		case NavigationPackage.JAVA_BODY_EXPRESSION:
			return createJavaBodyExpression();
		case NavigationPackage.JAVA_DECLARATION_STEP_INITIALIZER:
			return createJavaDeclarationStepInitializer();
		case NavigationPackage.JAVA_BODY_STEP_INITIALIZER:
			return createJavaBodyStepInitializer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleModelNavigation createSimpleModelNavigation() {
		SimpleModelNavigationImpl simpleModelNavigation = new SimpleModelNavigationImpl();
		return simpleModelNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainedModelNavigation createChainedModelNavigation() {
		ChainedModelNavigationImpl chainedModelNavigation = new ChainedModelNavigationImpl();
		return chainedModelNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomModelNavigation createCustomModelNavigation() {
		CustomModelNavigationImpl customModelNavigation = new CustomModelNavigationImpl();
		return customModelNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartModelNavigation createSmartModelNavigation() {
		SmartModelNavigationImpl smartModelNavigation = new SmartModelNavigationImpl();
		return smartModelNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarativeNavigationStep createDeclarativeNavigationStep() {
		DeclarativeNavigationStepImpl declarativeNavigationStep = new DeclarativeNavigationStepImpl();
		return declarativeNavigationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBodyExpression createJavaBodyExpression() {
		JavaBodyExpressionImpl javaBodyExpression = new JavaBodyExpressionImpl();
		return javaBodyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDeclarationStepInitializer createJavaDeclarationStepInitializer() {
		JavaDeclarationStepInitializerImpl javaDeclarationStepInitializer = new JavaDeclarationStepInitializerImpl();
		return javaDeclarationStepInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBodyStepInitializer createJavaBodyStepInitializer() {
		JavaBodyStepInitializerImpl javaBodyStepInitializer = new JavaBodyStepInitializerImpl();
		return javaBodyStepInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationPackage getNavigationPackage() {
		return (NavigationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NavigationPackage getPackage() {
		return NavigationPackage.eINSTANCE;
	}

} //NavigationFactoryImpl
