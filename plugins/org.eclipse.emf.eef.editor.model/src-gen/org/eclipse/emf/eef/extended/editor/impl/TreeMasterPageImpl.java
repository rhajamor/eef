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
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.TreeMasterPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Master Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.extended.editor.impl.TreeMasterPageImpl#isToolbarVisible <em>Toolbar Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeMasterPageImpl extends MasterDetailsPageImpl implements TreeMasterPage {
	/**
	 * The default value of the '{@link #isToolbarVisible() <em>Toolbar Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolbarVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLBAR_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToolbarVisible() <em>Toolbar Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolbarVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean toolbarVisible = TOOLBAR_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeMasterPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditorPackage.Literals.TREE_MASTER_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToolbarVisible() {
		return toolbarVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolbarVisible(boolean newToolbarVisible) {
		boolean oldToolbarVisible = toolbarVisible;
		toolbarVisible = newToolbarVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.TREE_MASTER_PAGE__TOOLBAR_VISIBLE, oldToolbarVisible, toolbarVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditorPackage.TREE_MASTER_PAGE__TOOLBAR_VISIBLE:
				return isToolbarVisible();
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
			case EditorPackage.TREE_MASTER_PAGE__TOOLBAR_VISIBLE:
				setToolbarVisible((Boolean)newValue);
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
			case EditorPackage.TREE_MASTER_PAGE__TOOLBAR_VISIBLE:
				setToolbarVisible(TOOLBAR_VISIBLE_EDEFAULT);
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
			case EditorPackage.TREE_MASTER_PAGE__TOOLBAR_VISIBLE:
				return toolbarVisible != TOOLBAR_VISIBLE_EDEFAULT;
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
		result.append(" (toolbarVisible: ");
		result.append(toolbarVisible);
		result.append(')');
		return result.toString();
	}

} //TreeMasterPageImpl
