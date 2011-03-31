/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.eef.extended.editor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.extended.editor.EEFMasterPage;
import org.eclipse.emf.eef.extended.editor.EditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Master Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.impl.EEFMasterPageImpl#isOrientable <em>Orientable</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.impl.EEFMasterPageImpl#isShowValidatePage <em>Show Validate Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFMasterPageImpl extends MasterDetailsPageImpl implements EEFMasterPage {
	/**
	 * The default value of the '{@link #isOrientable() <em>Orientable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrientable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORIENTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrientable() <em>Orientable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrientable()
	 * @generated
	 * @ordered
	 */
	protected boolean orientable = ORIENTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowValidatePage() <em>Show Validate Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowValidatePage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_VALIDATE_PAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowValidatePage() <em>Show Validate Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowValidatePage()
	 * @generated
	 * @ordered
	 */
	protected boolean showValidatePage = SHOW_VALIDATE_PAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFMasterPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditorPackage.Literals.EEF_MASTER_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrientable() {
		return orientable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientable(boolean newOrientable) {
		boolean oldOrientable = orientable;
		orientable = newOrientable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EEF_MASTER_PAGE__ORIENTABLE, oldOrientable, orientable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowValidatePage() {
		return showValidatePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowValidatePage(boolean newShowValidatePage) {
		boolean oldShowValidatePage = showValidatePage;
		showValidatePage = newShowValidatePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE, oldShowValidatePage, showValidatePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditorPackage.EEF_MASTER_PAGE__ORIENTABLE:
				return isOrientable();
			case EditorPackage.EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE:
				return isShowValidatePage();
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
			case EditorPackage.EEF_MASTER_PAGE__ORIENTABLE:
				setOrientable((Boolean)newValue);
				return;
			case EditorPackage.EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE:
				setShowValidatePage((Boolean)newValue);
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
			case EditorPackage.EEF_MASTER_PAGE__ORIENTABLE:
				setOrientable(ORIENTABLE_EDEFAULT);
				return;
			case EditorPackage.EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE:
				setShowValidatePage(SHOW_VALIDATE_PAGE_EDEFAULT);
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
			case EditorPackage.EEF_MASTER_PAGE__ORIENTABLE:
				return orientable != ORIENTABLE_EDEFAULT;
			case EditorPackage.EEF_MASTER_PAGE__SHOW_VALIDATE_PAGE:
				return showValidatePage != SHOW_VALIDATE_PAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (orientable: ");
		result.append(orientable);
		result.append(", showValidatePage: ");
		result.append(showValidatePage);
		result.append(')');
		return result.toString();
	}

} //EEFMasterPageImpl
