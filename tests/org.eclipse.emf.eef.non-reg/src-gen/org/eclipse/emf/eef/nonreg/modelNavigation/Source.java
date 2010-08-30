/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.modelNavigation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getUniqueRef <em>Unique Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getMultipleRef <em>Multiple Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getMultipleContainment <em>Multiple Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Ref</em>' containment reference.
	 * @see #setUniqueRef(SuperCible)
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getSource_UniqueRef()
	 * @model containment="true"
	 * @generated
	 */
	SuperCible getUniqueRef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.nonreg.modelNavigation.Source#getUniqueRef <em>Unique Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Ref</em>' containment reference.
	 * @see #getUniqueRef()
	 * @generated
	 */
	void setUniqueRef(SuperCible value);

	/**
	 * Returns the value of the '<em><b>Multiple Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Ref</em>' reference list.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getSource_MultipleRef()
	 * @model
	 * @generated
	 */
	EList<SuperCible> getMultipleRef();

	/**
	 * Returns the value of the '<em><b>Multiple Containment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Containment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Containment</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getSource_MultipleContainment()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperCible> getMultipleContainment();

} // Source
