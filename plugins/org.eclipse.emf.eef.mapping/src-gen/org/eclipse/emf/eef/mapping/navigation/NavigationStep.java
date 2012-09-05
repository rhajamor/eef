/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.mapping.navigation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.mapping.filters.StepFilter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#isCreatesIfNotExists <em>Creates If Not Exists</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getSubStep <em>Sub Step</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getNavigationStep()
 * @model abstract="true"
 * @generated
 */
public interface NavigationStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Creates If Not Exists</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creates If Not Exists</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates If Not Exists</em>' attribute.
	 * @see #setCreatesIfNotExists(boolean)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getNavigationStep_CreatesIfNotExists()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCreatesIfNotExists();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#isCreatesIfNotExists <em>Creates If Not Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creates If Not Exists</em>' attribute.
	 * @see #isCreatesIfNotExists()
	 * @generated
	 */
	void setCreatesIfNotExists(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Step</em>' containment reference.
	 * @see #setSubStep(NavigationStep)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getNavigationStep_SubStep()
	 * @model containment="true"
	 * @generated
	 */
	NavigationStep getSubStep();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getSubStep <em>Sub Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Step</em>' containment reference.
	 * @see #getSubStep()
	 * @generated
	 */
	void setSubStep(NavigationStep value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(StepInitializer)
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getNavigationStep_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	StepInitializer getInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.mapping.navigation.NavigationStep#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(StepInitializer value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.mapping.filters.StepFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see org.eclipse.emf.eef.mapping.navigation.NavigationPackage#getNavigationStep_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepFilter> getFilters();

	/**
	 * @return the owning EClass
	 * @generated NOT
	 */
	EClass owningEClass();
	
	/**
	 * @return the current EClass
	 * @generated NOT
	 */
	EClass currentEClass();
	
	/**
	 * @return the current EClass
	 * @generated NOT
	 */
	EClass evaluate();
} // NavigationStep
