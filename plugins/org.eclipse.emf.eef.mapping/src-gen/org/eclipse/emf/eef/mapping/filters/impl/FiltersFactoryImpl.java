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
package org.eclipse.emf.eef.mapping.filters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.mapping.filters.*;
import org.eclipse.emf.eef.mapping.filters.FiltersFactory;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter;
import org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter;
import org.eclipse.emf.eef.mapping.filters.OCLFilter;
import org.eclipse.emf.eef.mapping.filters.OnlyReferenceTypeFilter;
import org.eclipse.emf.eef.mapping.filters.StrictTypingFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiltersFactoryImpl extends EFactoryImpl implements FiltersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FiltersFactory init() {
		try {
			FiltersFactory theFiltersFactory = (FiltersFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/eef/mapping/filters/1.0.0");
			if (theFiltersFactory != null) {
				return theFiltersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FiltersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactoryImpl() {
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
		case FiltersPackage.OCL_FILTER:
			return createOCLFilter();
		case FiltersPackage.JAVA_DECLARATION_FILTER:
			return createJavaDeclarationFilter();
		case FiltersPackage.JAVA_EXPRESSION_FILTER:
			return createJavaExpressionFilter();
		case FiltersPackage.ONLY_REFERENCE_TYPE_FILTER:
			return createOnlyReferenceTypeFilter();
		case FiltersPackage.STRICT_TYPING_FILTER:
			return createStrictTypingFilter();
		case FiltersPackage.JAVA_BODY_STEP_FILTER:
			return createJavaBodyStepFilter();
		case FiltersPackage.JAVA_DECLARATION_STEP_FILTER:
			return createJavaDeclarationStepFilter();
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
	public OCLFilter createOCLFilter() {
		OCLFilterImpl oclFilter = new OCLFilterImpl();
		return oclFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDeclarationFilter createJavaDeclarationFilter() {
		JavaDeclarationFilterImpl javaDeclarationFilter = new JavaDeclarationFilterImpl();
		return javaDeclarationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExpressionFilter createJavaExpressionFilter() {
		JavaExpressionFilterImpl javaExpressionFilter = new JavaExpressionFilterImpl();
		return javaExpressionFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlyReferenceTypeFilter createOnlyReferenceTypeFilter() {
		OnlyReferenceTypeFilterImpl onlyReferenceTypeFilter = new OnlyReferenceTypeFilterImpl();
		return onlyReferenceTypeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrictTypingFilter createStrictTypingFilter() {
		StrictTypingFilterImpl strictTypingFilter = new StrictTypingFilterImpl();
		return strictTypingFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBodyStepFilter createJavaBodyStepFilter() {
		JavaBodyStepFilterImpl javaBodyStepFilter = new JavaBodyStepFilterImpl();
		return javaBodyStepFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDeclarationStepFilter createJavaDeclarationStepFilter() {
		JavaDeclarationStepFilterImpl javaDeclarationStepFilter = new JavaDeclarationStepFilterImpl();
		return javaDeclarationStepFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersPackage getFiltersPackage() {
		return (FiltersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FiltersPackage getPackage() {
		return FiltersPackage.eINSTANCE;
	}

} //FiltersFactoryImpl
