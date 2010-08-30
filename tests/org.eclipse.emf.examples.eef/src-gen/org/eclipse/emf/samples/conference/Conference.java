/**
 * <copyright>
 * </copyright>
 *
 * $Id: Conference.java,v 1.1.4.1 2010/08/30 08:51:54 sbouchet Exp $
 */
package org.eclipse.emf.samples.conference;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.samples.conference.Conference#getPlace <em>Place</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Conference#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Conference#getTalks <em>Talks</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Conference#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Conference#getSites <em>Sites</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.samples.conference.ConferencePackage#getConference()
 * @model
 * @generated
 */
public interface Conference extends EObject {
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
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getConference_Place()
	 * @model required="true"
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Conference#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.samples.conference.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getConference_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getParticipants();

	/**
	 * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.samples.conference.Talk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' containment reference list.
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getConference_Talks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Talk> getTalks();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.samples.conference.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getConference_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.samples.conference.Site}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference list.
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getConference_Sites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Site> getSites();

} // Conference
