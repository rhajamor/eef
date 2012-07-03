/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractReferenceOwnerSample.java,v 1.1 2011/02/01 09:54:40 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.filters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.eef.eefnr.AbstractSample;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Reference Owner Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample#getAbstractTarget <em>Abstract Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.filters.FiltersPackage#getAbstractReferenceOwnerSample()
 * @model abstract="true"
 * @generated
 */
public interface AbstractReferenceOwnerSample extends AbstractSample {
	/**
	 * Returns the value of the '<em><b>Abstract Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Target</em>' reference list.
	 * @see org.eclipse.emf.eef.eefnr.filters.FiltersPackage#getAbstractReferenceOwnerSample_AbstractTarget()
	 * @model
	 * @generated
	 */
	EList<AbstractReferenceTargetSample> getAbstractTarget();

} // AbstractReferenceOwnerSample
