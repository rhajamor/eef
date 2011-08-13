/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeNavigationSample.java,v 1.1.4.2 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.eef.eefnr.AbstractSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Navigation Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getSingleValuedAttributeDelegate <em>Single Valued Attribute Delegate</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getMultiValuedAttributeDelegate <em>Multi Valued Attribute Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getAttributeNavigationSample()
 * @model
 * @generated
 */
public interface AttributeNavigationSample extends AbstractSample {
	/**
	 * Returns the value of the '<em><b>Single Valued Attribute Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Valued Attribute Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Valued Attribute Delegate</em>' containment reference.
	 * @see #setSingleValuedAttributeDelegate(AttributeDelegate)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getAttributeNavigationSample_SingleValuedAttributeDelegate()
	 * @model containment="true"
	 * @generated
	 */
	AttributeDelegate getSingleValuedAttributeDelegate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample#getSingleValuedAttributeDelegate <em>Single Valued Attribute Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Valued Attribute Delegate</em>' containment reference.
	 * @see #getSingleValuedAttributeDelegate()
	 * @generated
	 */
	void setSingleValuedAttributeDelegate(AttributeDelegate value);

	/**
	 * Returns the value of the '<em><b>Multi Valued Attribute Delegate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Valued Attribute Delegate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Valued Attribute Delegate</em>' containment reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getAttributeNavigationSample_MultiValuedAttributeDelegate()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDelegate> getMultiValuedAttributeDelegate();

} // AttributeNavigationSample
