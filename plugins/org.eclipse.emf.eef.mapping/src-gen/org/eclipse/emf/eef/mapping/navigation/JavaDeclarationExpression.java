/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.mapping.navigation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getQualifiedClass <em>Qualified Class</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getMethodFilter <em>Method Filter</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#isStaticMethod <em>Static Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getJavaDeclarationExpression()
 * @model abstract="true"
 * @generated
 */
public interface JavaDeclarationExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Class</em>' attribute.
	 * @see #setQualifiedClass(String)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getJavaDeclarationExpression_QualifiedClass()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getQualifiedClass <em>Qualified Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Class</em>' attribute.
	 * @see #getQualifiedClass()
	 * @generated
	 */
	void setQualifiedClass(String value);

	/**
	 * Returns the value of the '<em><b>Method Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Filter</em>' attribute.
	 * @see #setMethodFilter(String)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getJavaDeclarationExpression_MethodFilter()
	 * @model required="true"
	 * @generated
	 */
	String getMethodFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#getMethodFilter <em>Method Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Filter</em>' attribute.
	 * @see #getMethodFilter()
	 * @generated
	 */
	void setMethodFilter(String value);

	/**
	 * Returns the value of the '<em><b>Static Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Method</em>' attribute.
	 * @see #setStaticMethod(boolean)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getJavaDeclarationExpression_StaticMethod()
	 * @model
	 * @generated
	 */
	boolean isStaticMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationExpression#isStaticMethod <em>Static Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Method</em>' attribute.
	 * @see #isStaticMethod()
	 * @generated
	 */
	void setStaticMethod(boolean value);

} // JavaDeclarationExpression
