/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1.4.1 2010/08/30 08:51:54 sbouchet Exp $
 */
package org.eclipse.emf.samples.conference;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#isEclipseCommiter <em>Eclipse Commiter</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#getAssists <em>Assists</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.Person#isIsRegistered <em>Is Registered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_Firstname()
	 * @model required="true"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Eclipse Commiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclipse Commiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclipse Commiter</em>' attribute.
	 * @see #setEclipseCommiter(boolean)
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_EclipseCommiter()
	 * @model
	 * @generated
	 */
	boolean isEclipseCommiter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Person#isEclipseCommiter <em>Eclipse Commiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclipse Commiter</em>' attribute.
	 * @see #isEclipseCommiter()
	 * @generated
	 */
	void setEclipseCommiter(boolean value);

	/**
	 * Returns the value of the '<em><b>Assists</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.samples.conference.Talk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists</em>' reference list.
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_Assists()
	 * @model
	 * @generated
	 */
	EList<Talk> getAssists();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.samples.conference.GENDER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see org.eclipse.emf.samples.conference.GENDER
	 * @see #setGender(GENDER)
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	GENDER getGender();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see org.eclipse.emf.samples.conference.GENDER
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GENDER value);

	/**
	 * Returns the value of the '<em><b>Is Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Registered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Registered</em>' attribute.
	 * @see #setIsRegistered(boolean)
	 * @see org.eclipse.emf.samples.conference.ConferencePackage#getPerson_IsRegistered()
	 * @model
	 * @generated
	 */
	boolean isIsRegistered();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.samples.conference.Person#isIsRegistered <em>Is Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Registered</em>' attribute.
	 * @see #isIsRegistered()
	 * @generated
	 */
	void setIsRegistered(boolean value);

} // Person
