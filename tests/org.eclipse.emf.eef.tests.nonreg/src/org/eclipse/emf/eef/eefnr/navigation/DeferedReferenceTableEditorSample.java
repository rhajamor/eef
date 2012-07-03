/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedReferenceTableEditorSample.java,v 1.1 2010/09/27 10:02:36 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.eef.eefnr.AbstractSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defered Reference Table Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedReferenceTableEditorSample()
 * @model
 * @generated
 */
public interface DeferedReferenceTableEditorSample extends AbstractSample {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage#getDeferedReferenceTableEditorSample_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeferedReference> getReferences();

} // DeferedReferenceTableEditorSample
