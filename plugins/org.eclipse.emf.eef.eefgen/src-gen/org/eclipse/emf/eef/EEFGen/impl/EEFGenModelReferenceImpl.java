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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.eef.EEFGen.EEFGenModel;
import org.eclipse.emf.eef.EEFGen.EEFGenModelReference;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.impl.EEFGenModelReferenceImpl#getReferencedContext <em>Referenced Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFGenModelReferenceImpl extends EObjectImpl implements EEFGenModelReference {
	/**
	 * The cached value of the '{@link #getReferencedContext() <em>Referenced Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedContext()
	 * @generated
	 * @ordered
	 */
	protected EEFGenModel referencedContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFGenModelReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EEFGenPackage.Literals.EEF_GEN_MODEL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenModel getReferencedContext() {
		if (referencedContext != null && referencedContext.eIsProxy()) {
			InternalEObject oldReferencedContext = (InternalEObject)referencedContext;
			referencedContext = (EEFGenModel)eResolveProxy(oldReferencedContext);
			if (referencedContext != oldReferencedContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEFGenPackage.EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT, oldReferencedContext, referencedContext));
			}
		}
		return referencedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFGenModel basicGetReferencedContext() {
		return referencedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedContext(EEFGenModel newReferencedContext) {
		EEFGenModel oldReferencedContext = referencedContext;
		referencedContext = newReferencedContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EEFGenPackage.EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT, oldReferencedContext, referencedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EEFGenPackage.EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT:
				if (resolve) return getReferencedContext();
				return basicGetReferencedContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EEFGenPackage.EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT:
				setReferencedContext((EEFGenModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EEFGenPackage.EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT:
				setReferencedContext((EEFGenModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EEFGenPackage.EEF_GEN_MODEL_REFERENCE__REFERENCED_CONTEXT:
				return referencedContext != null;
		}
		return super.eIsSet(featureID);
	}

} //EEFGenModelReferenceImpl
