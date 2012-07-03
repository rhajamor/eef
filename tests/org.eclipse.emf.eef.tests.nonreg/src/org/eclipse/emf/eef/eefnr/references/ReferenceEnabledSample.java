/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceEnabledSample.java,v 1.1 2010/04/15 12:48:58 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.references;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Enabled Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.references.ReferencesPackage#getReferenceEnabledSample()
 * @model
 * @generated
 */
public interface ReferenceEnabledSample extends AbstractEnabledSample {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.TotalSample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see org.eclipse.emf.eef.eefnr.references.ReferencesPackage#getReferenceEnabledSample_Reference()
	 * @model
	 * @generated
	 */
	EList<TotalSample> getReference();

} // ReferenceEnabledSample
