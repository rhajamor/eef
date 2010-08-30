/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.2.2.1 2010/08/30 08:51:54 sbouchet Exp $
 */
package org.eclipse.emf.samples.conference.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.GENDER;
import org.eclipse.emf.samples.conference.Person;
import org.eclipse.emf.samples.conference.Talk;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#isEclipseCommiter <em>Eclipse Commiter</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.emf.samples.conference.impl.PersonImpl#isIsRegistered <em>Is Registered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEclipseCommiter() <em>Eclipse Commiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEclipseCommiter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ECLIPSE_COMMITER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEclipseCommiter() <em>Eclipse Commiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEclipseCommiter()
	 * @generated
	 * @ordered
	 */
	protected boolean eclipseCommiter = ECLIPSE_COMMITER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssists() <em>Assists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected EList<Talk> assists;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GENDER GENDER_EDEFAULT = GENDER.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GENDER gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRegistered() <em>Is Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRegistered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REGISTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRegistered() <em>Is Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRegistered()
	 * @generated
	 * @ordered
	 */
	protected boolean isRegistered = IS_REGISTERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEclipseCommiter() {
		return eclipseCommiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEclipseCommiter(boolean newEclipseCommiter) {
		boolean oldEclipseCommiter = eclipseCommiter;
		eclipseCommiter = newEclipseCommiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__ECLIPSE_COMMITER, oldEclipseCommiter, eclipseCommiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Talk> getAssists() {
		if (assists == null) {
			assists = new EObjectResolvingEList<Talk>(Talk.class, this, ConferencePackage.PERSON__ASSISTS);
		}
		return assists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENDER getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(GENDER newGender) {
		GENDER oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRegistered() {
		return isRegistered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRegistered(boolean newIsRegistered) {
		boolean oldIsRegistered = isRegistered;
		isRegistered = newIsRegistered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__IS_REGISTERED, oldIsRegistered, isRegistered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.PERSON__FIRSTNAME:
				return getFirstname();
			case ConferencePackage.PERSON__LASTNAME:
				return getLastname();
			case ConferencePackage.PERSON__AGE:
				return getAge();
			case ConferencePackage.PERSON__ECLIPSE_COMMITER:
				return isEclipseCommiter();
			case ConferencePackage.PERSON__ASSISTS:
				return getAssists();
			case ConferencePackage.PERSON__GENDER:
				return getGender();
			case ConferencePackage.PERSON__IS_REGISTERED:
				return isIsRegistered();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConferencePackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case ConferencePackage.PERSON__LASTNAME:
				setLastname((String)newValue);
				return;
			case ConferencePackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case ConferencePackage.PERSON__ECLIPSE_COMMITER:
				setEclipseCommiter((Boolean)newValue);
				return;
			case ConferencePackage.PERSON__ASSISTS:
				getAssists().clear();
				getAssists().addAll((Collection<? extends Talk>)newValue);
				return;
			case ConferencePackage.PERSON__GENDER:
				setGender((GENDER)newValue);
				return;
			case ConferencePackage.PERSON__IS_REGISTERED:
				setIsRegistered((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConferencePackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case ConferencePackage.PERSON__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case ConferencePackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case ConferencePackage.PERSON__ECLIPSE_COMMITER:
				setEclipseCommiter(ECLIPSE_COMMITER_EDEFAULT);
				return;
			case ConferencePackage.PERSON__ASSISTS:
				getAssists().clear();
				return;
			case ConferencePackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case ConferencePackage.PERSON__IS_REGISTERED:
				setIsRegistered(IS_REGISTERED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConferencePackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case ConferencePackage.PERSON__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case ConferencePackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case ConferencePackage.PERSON__ECLIPSE_COMMITER:
				return eclipseCommiter != ECLIPSE_COMMITER_EDEFAULT;
			case ConferencePackage.PERSON__ASSISTS:
				return assists != null && !assists.isEmpty();
			case ConferencePackage.PERSON__GENDER:
				return gender != GENDER_EDEFAULT;
			case ConferencePackage.PERSON__IS_REGISTERED:
				return isRegistered != IS_REGISTERED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", age: ");
		result.append(age);
		result.append(", eclipseCommiter: ");
		result.append(eclipseCommiter);
		result.append(", gender: ");
		result.append(gender);
		result.append(", isRegistered: ");
		result.append(isRegistered);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
