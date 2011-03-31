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
package org.eclipse.emf.eef.toolkits.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.toolkits.Toolkit;
import org.eclipse.emf.eef.toolkits.ToolkitsPackage;
import org.eclipse.emf.eef.toolkits.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.toolkits.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.toolkits.impl.WidgetImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.toolkits.impl.WidgetImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.toolkits.impl.WidgetImpl#getToolkit <em>Toolkit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends EObjectImpl implements Widget {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolkitsPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toolkit getToolkit() {
		if (eContainerFeatureID() != ToolkitsPackage.WIDGET__TOOLKIT)
			return null;
		return (Toolkit) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolkit(Toolkit newToolkit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newToolkit, ToolkitsPackage.WIDGET__TOOLKIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolkit(Toolkit newToolkit) {
		if (newToolkit != eInternalContainer() || (eContainerFeatureID() != ToolkitsPackage.WIDGET__TOOLKIT && newToolkit != null)) {
			if (EcoreUtil.isAncestor(this, newToolkit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newToolkit != null)
				msgs = ((InternalEObject) newToolkit).eInverseAdd(this, ToolkitsPackage.TOOLKIT__WIDGETS, Toolkit.class, msgs);
			msgs = basicSetToolkit(newToolkit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__TOOLKIT, newToolkit, newToolkit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToolkitsPackage.WIDGET__TOOLKIT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetToolkit((Toolkit) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToolkitsPackage.WIDGET__TOOLKIT:
			return basicSetToolkit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ToolkitsPackage.WIDGET__TOOLKIT:
			return eInternalContainer().eInverseRemove(this, ToolkitsPackage.TOOLKIT__WIDGETS, Toolkit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolkitsPackage.WIDGET__NAME:
			return getName();
		case ToolkitsPackage.WIDGET__ICON:
			return getIcon();
		case ToolkitsPackage.WIDGET__IMPLEMENTATION:
			return getImplementation();
		case ToolkitsPackage.WIDGET__TOOLKIT:
			return getToolkit();
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
		case ToolkitsPackage.WIDGET__NAME:
			setName((String) newValue);
			return;
		case ToolkitsPackage.WIDGET__ICON:
			setIcon((String) newValue);
			return;
		case ToolkitsPackage.WIDGET__IMPLEMENTATION:
			setImplementation((String) newValue);
			return;
		case ToolkitsPackage.WIDGET__TOOLKIT:
			setToolkit((Toolkit) newValue);
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
		case ToolkitsPackage.WIDGET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ToolkitsPackage.WIDGET__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case ToolkitsPackage.WIDGET__IMPLEMENTATION:
			setImplementation(IMPLEMENTATION_EDEFAULT);
			return;
		case ToolkitsPackage.WIDGET__TOOLKIT:
			setToolkit((Toolkit) null);
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
		case ToolkitsPackage.WIDGET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ToolkitsPackage.WIDGET__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
		case ToolkitsPackage.WIDGET__IMPLEMENTATION:
			return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
		case ToolkitsPackage.WIDGET__TOOLKIT:
			return getToolkit() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", icon: "); //$NON-NLS-1$
		result.append(icon);
		result.append(", implementation: "); //$NON-NLS-1$
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
