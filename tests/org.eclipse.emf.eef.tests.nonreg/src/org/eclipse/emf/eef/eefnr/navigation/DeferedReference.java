/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedReference.java,v 1.1 2010/04/16 08:00:57 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defered Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference#getFlatreferenceEditor <em>Flatreference Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedReference()
 * @model
 * @generated
 */
public interface DeferedReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Flatreference Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flatreference Editor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flatreference Editor</em>' reference.
	 * @see #setFlatreferenceEditor(TotalSample)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedReference_FlatreferenceEditor()
	 * @model required="true"
	 * @generated
	 */
	TotalSample getFlatreferenceEditor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference#getFlatreferenceEditor <em>Flatreference Editor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flatreference Editor</em>' reference.
	 * @see #getFlatreferenceEditor()
	 * @generated
	 */
	void setFlatreferenceEditor(TotalSample value);

} // DeferedReference
