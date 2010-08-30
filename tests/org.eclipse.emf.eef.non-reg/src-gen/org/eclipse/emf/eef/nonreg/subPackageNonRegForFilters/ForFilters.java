/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.ab.abstractnonreg.DocumentedElement;
import org.eclipse.emf.eef.middle.middlenonreg.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Filters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters#getEOFCV <em>EOFCV</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters#getRT <em>RT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage#getForFilters()
 * @model
 * @generated
 */
public interface ForFilters extends EObject {
	/**
	 * Returns the value of the '<em><b>EOFCV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOFCV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOFCV</em>' reference.
	 * @see #setEOFCV(NamedElement)
	 * @see org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage#getForFilters_EOFCV()
	 * @model
	 * @generated
	 */
	NamedElement getEOFCV();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters#getEOFCV <em>EOFCV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOFCV</em>' reference.
	 * @see #getEOFCV()
	 * @generated
	 */
	void setEOFCV(NamedElement value);

	/**
	 * Returns the value of the '<em><b>RT</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.ab.abstractnonreg.DocumentedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RT</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RT</em>' reference list.
	 * @see org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage#getForFilters_RT()
	 * @model
	 * @generated
	 */
	EList<DocumentedElement> getRT();

} // ForFilters
