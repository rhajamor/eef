/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.navigation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage
 * @generated
 */
public class NavigationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationSwitch() {
		if (modelPackage == null) {
			modelPackage = NavigationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case NavigationPackage.MODEL_NAVIGATION: {
			ModelNavigation modelNavigation = (ModelNavigation) theEObject;
			T result = caseModelNavigation(modelNavigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION: {
			SimpleModelNavigation simpleModelNavigation = (SimpleModelNavigation) theEObject;
			T result = caseSimpleModelNavigation(simpleModelNavigation);
			if (result == null)
				result = caseStructuredModelNavigation(simpleModelNavigation);
			if (result == null)
				result = caseModelNavigation(simpleModelNavigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.CHAINED_MODEL_NAVIGATION: {
			ChainedModelNavigation chainedModelNavigation = (ChainedModelNavigation) theEObject;
			T result = caseChainedModelNavigation(chainedModelNavigation);
			if (result == null)
				result = caseStructuredModelNavigation(chainedModelNavigation);
			if (result == null)
				result = caseModelNavigation(chainedModelNavigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.STRUCTURED_MODEL_NAVIGATION: {
			StructuredModelNavigation structuredModelNavigation = (StructuredModelNavigation) theEObject;
			T result = caseStructuredModelNavigation(structuredModelNavigation);
			if (result == null)
				result = caseModelNavigation(structuredModelNavigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.CUSTOM_MODEL_NAVIGATION: {
			CustomModelNavigation customModelNavigation = (CustomModelNavigation) theEObject;
			T result = caseCustomModelNavigation(customModelNavigation);
			if (result == null)
				result = caseModelNavigation(customModelNavigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.SMART_MODEL_NAVIGATION: {
			SmartModelNavigation smartModelNavigation = (SmartModelNavigation) theEObject;
			T result = caseSmartModelNavigation(smartModelNavigation);
			if (result == null)
				result = caseModelNavigation(smartModelNavigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.NAVIGATION_STEP: {
			NavigationStep navigationStep = (NavigationStep) theEObject;
			T result = caseNavigationStep(navigationStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.DECLARATIVE_NAVIGATION_STEP: {
			DeclarativeNavigationStep declarativeNavigationStep = (DeclarativeNavigationStep) theEObject;
			T result = caseDeclarativeNavigationStep(declarativeNavigationStep);
			if (result == null)
				result = caseNavigationStep(declarativeNavigationStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.STEP_INITIALIZER: {
			StepInitializer stepInitializer = (StepInitializer) theEObject;
			T result = caseStepInitializer(stepInitializer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.JAVA_STEP_INITIALIZER: {
			JavaStepInitializer javaStepInitializer = (JavaStepInitializer) theEObject;
			T result = caseJavaStepInitializer(javaStepInitializer);
			if (result == null)
				result = caseStepInitializer(javaStepInitializer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION: {
			JavaDeclarationExpression javaDeclarationExpression = (JavaDeclarationExpression) theEObject;
			T result = caseJavaDeclarationExpression(javaDeclarationExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.JAVA_BODY_EXPRESSION: {
			JavaBodyExpression javaBodyExpression = (JavaBodyExpression) theEObject;
			T result = caseJavaBodyExpression(javaBodyExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.JAVA_DECLARATION_STEP_INITIALIZER: {
			JavaDeclarationStepInitializer javaDeclarationStepInitializer = (JavaDeclarationStepInitializer) theEObject;
			T result = caseJavaDeclarationStepInitializer(javaDeclarationStepInitializer);
			if (result == null)
				result = caseJavaDeclarationExpression(javaDeclarationStepInitializer);
			if (result == null)
				result = caseJavaStepInitializer(javaDeclarationStepInitializer);
			if (result == null)
				result = caseStepInitializer(javaDeclarationStepInitializer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NavigationPackage.JAVA_BODY_STEP_INITIALIZER: {
			JavaBodyStepInitializer javaBodyStepInitializer = (JavaBodyStepInitializer) theEObject;
			T result = caseJavaBodyStepInitializer(javaBodyStepInitializer);
			if (result == null)
				result = caseJavaBodyExpression(javaBodyStepInitializer);
			if (result == null)
				result = caseJavaStepInitializer(javaBodyStepInitializer);
			if (result == null)
				result = caseStepInitializer(javaBodyStepInitializer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelNavigation(ModelNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Model Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleModelNavigation(SimpleModelNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chained Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chained Model Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainedModelNavigation(ChainedModelNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Model Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredModelNavigation(StructuredModelNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Model Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomModelNavigation(CustomModelNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Model Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Model Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartModelNavigation(SmartModelNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationStep(NavigationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarative Navigation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarative Navigation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarativeNavigationStep(DeclarativeNavigationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepInitializer(StepInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Step Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Step Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaStepInitializer(JavaStepInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Declaration Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaDeclarationExpression(JavaDeclarationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Body Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Body Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaBodyExpression(JavaBodyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Declaration Step Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Declaration Step Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaDeclarationStepInitializer(
			JavaDeclarationStepInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Body Step Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Body Step Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaBodyStepInitializer(JavaBodyStepInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //NavigationSwitch
