/**
 * <copyright>
 * </copyright>
 *
 * $Id: Root.java,v 1.1 2010/02/01 13:00:44 nlepine Exp $
 */
package org.eclipse.emf.eef.eefnr;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.Root#getSamples <em>Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.EefnrPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.AbstractSample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' containment reference list.
	 * @see org.eclipse.emf.eef.eefnr.EefnrPackage#getRoot_Samples()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSample> getSamples();

} // Root
