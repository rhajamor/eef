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
package org.eclipse.emf.eef.modelingBot.EEFActions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.eef.modelingBot.EEFActions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFActionsFactoryImpl extends EFactoryImpl implements EEFActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEFActionsFactory init() {
		try {
			EEFActionsFactory theEEFActionsFactory = (EEFActionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/test/EEFActions/1.0.0"); 
			if (theEEFActionsFactory != null) {
				return theEEFActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EEFActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFActionsFactoryImpl() {
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
			case EEFActionsPackage.ADD: return createAdd();
			case EEFActionsPackage.REMOVE: return createRemove();
			case EEFActionsPackage.SET_ATTRIBUTE: return createSetAttribute();
			case EEFActionsPackage.UNSET: return createUnset();
			case EEFActionsPackage.CANCEL: return createCancel();
			case EEFActionsPackage.CHECK: return createCheck();
			case EEFActionsPackage.OPEN_EEF_EDITOR: return createOpenEEFEditor();
			case EEFActionsPackage.SET_REFERENCE: return createSetReference();
			case EEFActionsPackage.UNSET_REFERENCE: return createUnsetReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remove createRemove() {
		RemoveImpl remove = new RemoveImpl();
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAttribute createSetAttribute() {
		SetAttributeImpl setAttribute = new SetAttributeImpl();
		return setAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unset createUnset() {
		UnsetImpl unset = new UnsetImpl();
		return unset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cancel createCancel() {
		CancelImpl cancel = new CancelImpl();
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Check createCheck() {
		CheckImpl check = new CheckImpl();
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenEEFEditor createOpenEEFEditor() {
		OpenEEFEditorImpl openEEFEditor = new OpenEEFEditorImpl();
		return openEEFEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetReference createSetReference() {
		SetReferenceImpl setReference = new SetReferenceImpl();
		return setReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsetReference createUnsetReference() {
		UnsetReferenceImpl unsetReference = new UnsetReferenceImpl();
		return unsetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFActionsPackage getEEFActionsPackage() {
		return (EEFActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EEFActionsPackage getPackage() {
		return EEFActionsPackage.eINSTANCE;
	}

} //EEFActionsFactoryImpl
