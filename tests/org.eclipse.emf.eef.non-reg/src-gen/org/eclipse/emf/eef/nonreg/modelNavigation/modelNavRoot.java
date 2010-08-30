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
 * A representation of the model object '<em><b>model Nav Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot#getCibles <em>Cibles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getmodelNavRoot()
 * @model
 * @generated
 */
public interface modelNavRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.modelNavigation.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getmodelNavRoot_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Cibles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cibles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cibles</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage#getmodelNavRoot_Cibles()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperCible> getCibles();

} // modelNavRoot
