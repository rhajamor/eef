/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.mapping.navigation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getSmartModelNavigation()
 * @model
 * @generated
 */
public interface SmartModelNavigation extends ModelNavigation {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(NavigationStep)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getSmartModelNavigation_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NavigationStep getStep();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(NavigationStep value);

} // SmartModelNavigation
