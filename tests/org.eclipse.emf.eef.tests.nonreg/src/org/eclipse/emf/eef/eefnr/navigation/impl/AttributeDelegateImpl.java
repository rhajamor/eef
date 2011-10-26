/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeDelegateImpl.java,v 1.1.2.2 2011/10/26 16:16:44 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Delegate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeDelegateImpl#getDelegate1 <em>Delegate1</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeDelegateImpl#getDelegate2 <em>Delegate2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDelegateImpl extends EObjectImpl implements AttributeDelegate {
	/**
	 * The default value of the '{@link #getDelegate1() <em>Delegate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate1()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegate1() <em>Delegate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate1()
	 * @generated
	 * @ordered
	 */
	protected String delegate1 = DELEGATE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelegate2() <em>Delegate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate2()
	 * @generated
	 * @ordered
	 */
	protected static final int DELEGATE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelegate2() <em>Delegate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate2()
	 * @generated
	 * @ordered
	 */
	protected int delegate2 = DELEGATE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDelegateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.ATTRIBUTE_DELEGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelegate1() {
		return delegate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate1(String newDelegate1) {
		String oldDelegate1 = delegate1;
		delegate1 = newDelegate1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE1, oldDelegate1, delegate1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelegate2() {
		return delegate2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate2(int newDelegate2) {
		int oldDelegate2 = delegate2;
		delegate2 = newDelegate2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE2, oldDelegate2, delegate2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE1:
				return getDelegate1();
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE2:
				return getDelegate2();
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
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE1:
				setDelegate1((String)newValue);
				return;
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE2:
				setDelegate2((Integer)newValue);
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
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE1:
				setDelegate1(DELEGATE1_EDEFAULT);
				return;
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE2:
				setDelegate2(DELEGATE2_EDEFAULT);
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
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE1:
				return DELEGATE1_EDEFAULT == null ? delegate1 != null : !DELEGATE1_EDEFAULT.equals(delegate1);
			case NavigationPackage.ATTRIBUTE_DELEGATE__DELEGATE2:
				return delegate2 != DELEGATE2_EDEFAULT;
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
		result.append(" (delegate1: ");
		result.append(delegate1);
		result.append(", delegate2: ");
		result.append(delegate2);
		result.append(')');
		return result.toString();
	}

} //AttributeDelegateImpl
