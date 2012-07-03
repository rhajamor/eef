/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.eefnr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.ComboSample#getComboRequiredReferenceProperty <em>Combo Required Reference Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.ComboSample#getComboOptionalReferenceProperty <em>Combo Optional Reference Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.eefnr.EefnrPackage#getComboSample()
 * @model
 * @generated
 */
public interface ComboSample extends AbstractSample {
	/**
	 * Returns the value of the '<em><b>Combo Required Reference Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Required Reference Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Required Reference Property</em>' reference.
	 * @see #setComboRequiredReferenceProperty(TotalSample)
	 * @see org.eclipse.emf.eef.eefnr.EefnrPackage#getComboSample_ComboRequiredReferenceProperty()
	 * @model required="true"
	 * @generated
	 */
	TotalSample getComboRequiredReferenceProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.ComboSample#getComboRequiredReferenceProperty <em>Combo Required Reference Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Required Reference Property</em>' reference.
	 * @see #getComboRequiredReferenceProperty()
	 * @generated
	 */
	void setComboRequiredReferenceProperty(TotalSample value);

	/**
	 * Returns the value of the '<em><b>Combo Optional Reference Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Optional Reference Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Optional Reference Property</em>' reference.
	 * @see #setComboOptionalReferenceProperty(TotalSample)
	 * @see org.eclipse.emf.eef.eefnr.EefnrPackage#getComboSample_ComboOptionalReferenceProperty()
	 * @model
	 * @generated
	 */
	TotalSample getComboOptionalReferenceProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.eefnr.ComboSample#getComboOptionalReferenceProperty <em>Combo Optional Reference Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Optional Reference Property</em>' reference.
	 * @see #getComboOptionalReferenceProperty()
	 * @generated
	 */
	void setComboOptionalReferenceProperty(TotalSample value);

} // ComboSample
