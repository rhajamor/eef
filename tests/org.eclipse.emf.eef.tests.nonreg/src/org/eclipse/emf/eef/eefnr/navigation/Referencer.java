/**
 * <copyright>
 * </copyright>
 *
 * $Id: Referencer.java,v 1.1 2010/11/24 21:50:53 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referencer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.Referencer#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.Referencer#getSingleReferencedElement <em>Single Referenced Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.Referencer#getComposedElement <em>Composed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getReferencer()
 * @model
 * @generated
 */
public interface Referencer extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.Owner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getReferencer_ReferencedElement()
	 * @model
	 * @generated
	 */
	EList<Owner> getReferencedElement();

	/**
	 * Returns the value of the '<em><b>Single Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Referenced Element</em>' reference.
	 * @see #setSingleReferencedElement(Owner)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getReferencer_SingleReferencedElement()
	 * @model
	 * @generated
	 */
	Owner getSingleReferencedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.Referencer#getSingleReferencedElement <em>Single Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Referenced Element</em>' reference.
	 * @see #getSingleReferencedElement()
	 * @generated
	 */
	void setSingleReferencedElement(Owner value);

	/**
	 * Returns the value of the '<em><b>Composed Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Element</em>' containment reference.
	 * @see #setComposedElement(Owner)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getReferencer_ComposedElement()
	 * @model containment="true"
	 * @generated
	 */
	Owner getComposedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.Referencer#getComposedElement <em>Composed Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Element</em>' containment reference.
	 * @see #getComposedElement()
	 * @generated
	 */
	void setComposedElement(Owner value);

} // Referencer
