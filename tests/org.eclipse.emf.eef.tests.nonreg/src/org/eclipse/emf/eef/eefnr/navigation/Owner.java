/**
 * <copyright>
 * </copyright>
 *
 * $Id: Owner.java,v 1.1 2010/11/24 21:50:53 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.eef.eefnr.AbstractSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.Owner#getMultipleReferencers <em>Multiple Referencers</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.Owner#getSingleReferencers <em>Single Referencers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getOwner()
 * @model
 * @generated
 */
public interface Owner extends AbstractSample {
	/**
	 * Returns the value of the '<em><b>Multiple Referencers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Referencers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Referencers</em>' containment reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getOwner_MultipleReferencers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleReferencer> getMultipleReferencers();

	/**
	 * Returns the value of the '<em><b>Single Referencers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Referencers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Referencers</em>' containment reference.
	 * @see #setSingleReferencers(SingleReferencer)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getOwner_SingleReferencers()
	 * @model containment="true"
	 * @generated
	 */
	SingleReferencer getSingleReferencers();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.Owner#getSingleReferencers <em>Single Referencers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Referencers</em>' containment reference.
	 * @see #getSingleReferencers()
	 * @generated
	 */
	void setSingleReferencers(SingleReferencer value);

} // Owner
