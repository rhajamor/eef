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
package org.eclipse.emf.eef.mapping.navigation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.mapping.navigation.*;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.ModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage
 * @generated
 */
public class NavigationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NavigationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationSwitch<Adapter> modelSwitch = new NavigationSwitch<Adapter>() {
		@Override
		public Adapter caseModelNavigation(ModelNavigation object) {
			return createModelNavigationAdapter();
		}

		@Override
		public Adapter caseSimpleModelNavigation(SimpleModelNavigation object) {
			return createSimpleModelNavigationAdapter();
		}

		@Override
		public Adapter caseChainedModelNavigation(ChainedModelNavigation object) {
			return createChainedModelNavigationAdapter();
		}

		@Override
		public Adapter caseStructuredModelNavigation(
				StructuredModelNavigation object) {
			return createStructuredModelNavigationAdapter();
		}

		@Override
		public Adapter caseCustomModelNavigation(CustomModelNavigation object) {
			return createCustomModelNavigationAdapter();
		}

		@Override
		public Adapter caseSmartModelNavigation(SmartModelNavigation object) {
			return createSmartModelNavigationAdapter();
		}

		@Override
		public Adapter caseNavigationStep(NavigationStep object) {
			return createNavigationStepAdapter();
		}

		@Override
		public Adapter caseDeclarativeNavigationStep(
				DeclarativeNavigationStep object) {
			return createDeclarativeNavigationStepAdapter();
		}

		@Override
		public Adapter caseStepInitializer(StepInitializer object) {
			return createStepInitializerAdapter();
		}

		@Override
		public Adapter caseJavaStepInitializer(JavaStepInitializer object) {
			return createJavaStepInitializerAdapter();
		}

		@Override
		public Adapter caseJavaDeclarationExpression(
				JavaDeclarationExpression object) {
			return createJavaDeclarationExpressionAdapter();
		}

		@Override
		public Adapter caseJavaBodyExpression(JavaBodyExpression object) {
			return createJavaBodyExpressionAdapter();
		}

		@Override
		public Adapter caseJavaDeclarationStepInitializer(
				JavaDeclarationStepInitializer object) {
			return createJavaDeclarationStepInitializerAdapter();
		}

		@Override
		public Adapter caseJavaBodyStepInitializer(
				JavaBodyStepInitializer object) {
			return createJavaBodyStepInitializerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.ModelNavigation <em>Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.ModelNavigation
	 * @generated
	 */
	public Adapter createModelNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation <em>Simple Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation
	 * @generated
	 */
	public Adapter createSimpleModelNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation <em>Chained Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation
	 * @generated
	 */
	public Adapter createChainedModelNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation <em>Structured Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation
	 * @generated
	 */
	public Adapter createStructuredModelNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation <em>Custom Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation
	 * @generated
	 */
	public Adapter createCustomModelNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation <em>Smart Model Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation
	 * @generated
	 */
	public Adapter createSmartModelNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationStep
	 * @generated
	 */
	public Adapter createNavigationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep <em>Declarative Navigation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep
	 * @generated
	 */
	public Adapter createDeclarativeNavigationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.StepInitializer <em>Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.StepInitializer
	 * @generated
	 */
	public Adapter createStepInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer <em>Java Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaStepInitializer
	 * @generated
	 */
	public Adapter createJavaStepInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression <em>Java Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression
	 * @generated
	 */
	public Adapter createJavaDeclarationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression <em>Java Body Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression
	 * @generated
	 */
	public Adapter createJavaBodyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer <em>Java Declaration Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer
	 * @generated
	 */
	public Adapter createJavaDeclarationStepInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer <em>Java Body Step Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer
	 * @generated
	 */
	public Adapter createJavaBodyStepInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NavigationAdapterFactory
