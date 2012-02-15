/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedMultivaluedEditorSample.java,v 1.1.4.2 2012/02/15 13:37:46 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.eef.eefnr.AbstractSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defered Multivalued Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample#getDeferedEditor <em>Defered Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedMultivaluedEditorSample()
 * @model
 * @generated
 */
public interface DeferedMultivaluedEditorSample extends AbstractSample {
	/**
	 * Returns the value of the '<em><b>Defered Editor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defered Editor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defered Editor</em>' containment reference.
	 * @see #setDeferedEditor(DeferedMultivaluedEditor)
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedMultivaluedEditorSample_DeferedEditor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeferedMultivaluedEditor getDeferedEditor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample#getDeferedEditor <em>Defered Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defered Editor</em>' containment reference.
	 * @see #getDeferedEditor()
	 * @generated
	 */
	void setDeferedEditor(DeferedMultivaluedEditor value);

} // DeferedMultivaluedEditorSample
