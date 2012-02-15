/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedMultivaluedEditor.java,v 1.1.4.2 2012/02/15 13:37:46 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defered Multivalued Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor#getMultiValuedEditor <em>Multi Valued Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedMultivaluedEditor()
 * @model
 * @generated
 */
public interface DeferedMultivaluedEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Multi Valued Editor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Valued Editor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Valued Editor</em>' attribute list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedMultivaluedEditor_MultiValuedEditor()
	 * @model
	 * @generated
	 */
	EList<String> getMultiValuedEditor();

} // DeferedMultivaluedEditor
