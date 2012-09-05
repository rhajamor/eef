/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl#getQualifiedClass <em>Qualified Class</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl#getMethodFilter <em>Method Filter</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.JavaDeclarationExpressionImpl#isStaticMethod <em>Static Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class JavaDeclarationExpressionImpl extends EObjectImpl
		implements JavaDeclarationExpression {
	/**
	 * The default value of the '{@link #getQualifiedClass() <em>Qualified Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClass()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedClass() <em>Qualified Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClass()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedClass = QUALIFIED_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodFilter() <em>Method Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodFilter() <em>Method Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodFilter()
	 * @generated
	 * @ordered
	 */
	protected String methodFilter = METHOD_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isStaticMethod() <em>Static Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticMethod()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_METHOD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStaticMethod() <em>Static Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticMethod()
	 * @generated
	 * @ordered
	 */
	protected boolean staticMethod = STATIC_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaDeclarationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.JAVA_DECLARATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedClass() {
		return qualifiedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedClass(String newQualifiedClass) {
		String oldQualifiedClass = qualifiedClass;
		qualifiedClass = newQualifiedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					NavigationPackage.JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS,
					oldQualifiedClass, qualifiedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodFilter() {
		return methodFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodFilter(String newMethodFilter) {
		String oldMethodFilter = methodFilter;
		methodFilter = newMethodFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					NavigationPackage.JAVA_DECLARATION_EXPRESSION__METHOD_FILTER,
					oldMethodFilter, methodFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStaticMethod() {
		return staticMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticMethod(boolean newStaticMethod) {
		boolean oldStaticMethod = staticMethod;
		staticMethod = newStaticMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					NavigationPackage.JAVA_DECLARATION_EXPRESSION__STATIC_METHOD,
					oldStaticMethod, staticMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS:
			return getQualifiedClass();
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__METHOD_FILTER:
			return getMethodFilter();
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__STATIC_METHOD:
			return isStaticMethod();
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
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS:
			setQualifiedClass((String) newValue);
			return;
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__METHOD_FILTER:
			setMethodFilter((String) newValue);
			return;
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__STATIC_METHOD:
			setStaticMethod((Boolean) newValue);
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
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS:
			setQualifiedClass(QUALIFIED_CLASS_EDEFAULT);
			return;
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__METHOD_FILTER:
			setMethodFilter(METHOD_FILTER_EDEFAULT);
			return;
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__STATIC_METHOD:
			setStaticMethod(STATIC_METHOD_EDEFAULT);
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
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__QUALIFIED_CLASS:
			return QUALIFIED_CLASS_EDEFAULT == null ? qualifiedClass != null
					: !QUALIFIED_CLASS_EDEFAULT.equals(qualifiedClass);
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__METHOD_FILTER:
			return METHOD_FILTER_EDEFAULT == null ? methodFilter != null
					: !METHOD_FILTER_EDEFAULT.equals(methodFilter);
		case NavigationPackage.JAVA_DECLARATION_EXPRESSION__STATIC_METHOD:
			return staticMethod != STATIC_METHOD_EDEFAULT;
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
		result.append(" (qualifiedClass: ");
		result.append(qualifiedClass);
		result.append(", methodFilter: ");
		result.append(methodFilter);
		result.append(", staticMethod: ");
		result.append(staticMethod);
		result.append(')');
		return result.toString();
	}

} //JavaDeclarationExpressionImpl
