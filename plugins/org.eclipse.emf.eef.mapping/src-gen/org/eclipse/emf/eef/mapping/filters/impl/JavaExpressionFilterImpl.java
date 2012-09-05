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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.mapping.filters.FiltersPackage;
import org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Expression Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.filters.impl.JavaExpressionFilterImpl#getJavaBody <em>Java Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaExpressionFilterImpl extends JavaFilterImpl implements
		JavaExpressionFilter {
	/**
	 * The default value of the '{@link #getJavaBody() <em>Java Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaBody()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaBody() <em>Java Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaBody()
	 * @generated
	 * @ordered
	 */
	protected String javaBody = JAVA_BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaExpressionFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.JAVA_EXPRESSION_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaBody() {
		return javaBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaBody(String newJavaBody) {
		String oldJavaBody = javaBody;
		javaBody = newJavaBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FiltersPackage.JAVA_EXPRESSION_FILTER__JAVA_BODY,
					oldJavaBody, javaBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FiltersPackage.JAVA_EXPRESSION_FILTER__JAVA_BODY:
			return getJavaBody();
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
		case FiltersPackage.JAVA_EXPRESSION_FILTER__JAVA_BODY:
			setJavaBody((String) newValue);
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
		case FiltersPackage.JAVA_EXPRESSION_FILTER__JAVA_BODY:
			setJavaBody(JAVA_BODY_EDEFAULT);
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
		case FiltersPackage.JAVA_EXPRESSION_FILTER__JAVA_BODY:
			return JAVA_BODY_EDEFAULT == null ? javaBody != null
					: !JAVA_BODY_EDEFAULT.equals(javaBody);
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
		result.append(" (javaBody: ");
		result.append(javaBody);
		result.append(')');
		return result.toString();
	}

} //JavaExpressionFilterImpl
