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
package org.eclipse.emf.eef.EEFGen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.EEFGen.EEFGenFactory;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.EEFGenModelReference;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.EEFGen.HELP_STRATEGY;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFGenFactoryImpl extends EFactoryImpl implements EEFGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEFGenFactory init() {
		try {
			EEFGenFactory theEEFGenFactory = (EEFGenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/generation/1.0.0"); 
			if (theEEFGenFactory != null) {
				return theEEFGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EEFGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenFactoryImpl() {
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
			case EEFGenPackage.GEN_EDITION_CONTEXT: return createGenEditionContext();
			case EEFGenPackage.EEF_GEN_MODEL_REFERENCE: return createEEFGenModelReference();
			case EEFGenPackage.EEF_GEN_MODEL: return createEEFGenModel();
			case EEFGenPackage.GEN_VIEWS_REPOSITORY: return createGenViewsRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EEFGenPackage.HELP_STRATEGY:
				return createHELP_STRATEGYFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EEFGenPackage.HELP_STRATEGY:
				return convertHELP_STRATEGYToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditionContext createGenEditionContext() {
		GenEditionContextImpl genEditionContext = new GenEditionContextImpl();
		return genEditionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenModelReference createEEFGenModelReference() {
		EEFGenModelReferenceImpl eefGenModelReference = new EEFGenModelReferenceImpl();
		return eefGenModelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenModel createEEFGenModel() {
		EEFGenModelImpl eefGenModel = new EEFGenModelImpl();
		return eefGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenViewsRepository createGenViewsRepository() {
		GenViewsRepositoryImpl genViewsRepository = new GenViewsRepositoryImpl();
		return genViewsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HELP_STRATEGY createHELP_STRATEGYFromString(EDataType eDataType, String initialValue) {
		HELP_STRATEGY result = HELP_STRATEGY.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHELP_STRATEGYToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenPackage getEEFGenPackage() {
		return (EEFGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EEFGenPackage getPackage() {
		return EEFGenPackage.eINSTANCE;
	}

} //EEFGenFactoryImpl
