/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeDelegate.java,v 1.1.4.2 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Delegate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate1 <em>Delegate1</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate2 <em>Delegate2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getAttributeDelegate()
 * @model
 * @generated
 */
public interface AttributeDelegate extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate1</em>' attribute.
	 * @see #setDelegate1(String)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getAttributeDelegate_Delegate1()
	 * @model required="true"
	 * @generated
	 */
	String getDelegate1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate1 <em>Delegate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate1</em>' attribute.
	 * @see #getDelegate1()
	 * @generated
	 */
	void setDelegate1(String value);

	/**
	 * Returns the value of the '<em><b>Delegate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate2</em>' attribute.
	 * @see #setDelegate2(int)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getAttributeDelegate_Delegate2()
	 * @model
	 * @generated
	 */
	int getDelegate2();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate#getDelegate2 <em>Delegate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate2</em>' attribute.
	 * @see #getDelegate2()
	 * @generated
	 */
	void setDelegate2(int value);

} // AttributeDelegate
