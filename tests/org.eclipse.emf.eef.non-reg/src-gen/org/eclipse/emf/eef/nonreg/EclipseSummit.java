/**
 * <copyright>
 * </copyright>
 *
 * $Id: EclipseSummit.java,v 1.3.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Summit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getPlace <em>Place</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getTalks <em>Talks</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getSites <em>Sites</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getSponsors <em>Sponsors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit()
 * @model
 * @generated
 */
public interface EclipseSummit extends EObject {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit_Place()
	 * @model required="true"
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getParticipants();

	/**
	 * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.Talk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit_Talks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Talk> getTalks();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.nonreg.Site}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference list.
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit_Sites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Site> getSites();

	/**
	 * Returns the value of the '<em><b>Sponsors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sponsors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sponsors</em>' containment reference.
	 * @see #setSponsors(Company)
	 * @see org.eclipse.emf.eef.nonreg.NonregPackage#getEclipseSummit_Sponsors()
	 * @model containment="true"
	 * @generated
	 */
	Company getSponsors();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.nonreg.EclipseSummit#getSponsors <em>Sponsors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsors</em>' containment reference.
	 * @see #getSponsors()
	 * @generated
	 */
	void setSponsors(Company value);

} // EclipseSummit
