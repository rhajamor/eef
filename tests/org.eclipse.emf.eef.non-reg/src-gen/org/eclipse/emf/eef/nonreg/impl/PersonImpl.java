/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.3.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.nonreg.Access;
import org.eclipse.emf.eef.nonreg.Company;
import org.eclipse.emf.eef.nonreg.GENDER;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.Talk;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#isEclipseCommiter <em>Eclipse Commiter</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#isIsRegistered <em>Is Registered</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getAccreditations <em>Accreditations</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.PersonImpl#getWorkFor <em>Work For</em>}</li>
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
	 * The cached value of the '{@link #getAccreditations() <em>Accreditations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccreditations()
	 * @generated
	 * @ordered
	 */
	protected EList<Access> accreditations;

	/**
	 * The cached value of the '{@link #getWorkFor() <em>Work For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFor()
	 * @generated
	 * @ordered
	 */
	protected Company workFor;

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
		return NonregPackage.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__FIRSTNAME, oldFirstname, firstname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__LASTNAME, oldLastname, lastname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__AGE, oldAge, age));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__ECLIPSE_COMMITER, oldEclipseCommiter, eclipseCommiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Talk> getAssists() {
		if (assists == null) {
			assists = new EObjectResolvingEList<Talk>(Talk.class, this, NonregPackage.PERSON__ASSISTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__GENDER, oldGender, gender));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__IS_REGISTERED, oldIsRegistered, isRegistered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Access> getAccreditations() {
		if (accreditations == null) {
			accreditations = new EObjectContainmentEList<Access>(Access.class, this, NonregPackage.PERSON__ACCREDITATIONS);
		}
		return accreditations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company getWorkFor() {
		if (workFor != null && workFor.eIsProxy()) {
			InternalEObject oldWorkFor = (InternalEObject)workFor;
			workFor = (Company)eResolveProxy(oldWorkFor);
			if (workFor != oldWorkFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NonregPackage.PERSON__WORK_FOR, oldWorkFor, workFor));
			}
		}
		return workFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company basicGetWorkFor() {
		return workFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkFor(Company newWorkFor) {
		Company oldWorkFor = workFor;
		workFor = newWorkFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.PERSON__WORK_FOR, oldWorkFor, workFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NonregPackage.PERSON__ACCREDITATIONS:
				return ((InternalEList<?>)getAccreditations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NonregPackage.PERSON__FIRSTNAME:
				return getFirstname();
			case NonregPackage.PERSON__LASTNAME:
				return getLastname();
			case NonregPackage.PERSON__AGE:
				return new Integer(getAge());
			case NonregPackage.PERSON__ECLIPSE_COMMITER:
				return isEclipseCommiter() ? Boolean.TRUE : Boolean.FALSE;
			case NonregPackage.PERSON__ASSISTS:
				return getAssists();
			case NonregPackage.PERSON__GENDER:
				return getGender();
			case NonregPackage.PERSON__IS_REGISTERED:
				return isIsRegistered() ? Boolean.TRUE : Boolean.FALSE;
			case NonregPackage.PERSON__ACCREDITATIONS:
				return getAccreditations();
			case NonregPackage.PERSON__WORK_FOR:
				if (resolve) return getWorkFor();
				return basicGetWorkFor();
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
			case NonregPackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case NonregPackage.PERSON__LASTNAME:
				setLastname((String)newValue);
				return;
			case NonregPackage.PERSON__AGE:
				setAge(((Integer)newValue).intValue());
				return;
			case NonregPackage.PERSON__ECLIPSE_COMMITER:
				setEclipseCommiter(((Boolean)newValue).booleanValue());
				return;
			case NonregPackage.PERSON__ASSISTS:
				getAssists().clear();
				getAssists().addAll((Collection<? extends Talk>)newValue);
				return;
			case NonregPackage.PERSON__GENDER:
				setGender((GENDER)newValue);
				return;
			case NonregPackage.PERSON__IS_REGISTERED:
				setIsRegistered(((Boolean)newValue).booleanValue());
				return;
			case NonregPackage.PERSON__ACCREDITATIONS:
				getAccreditations().clear();
				getAccreditations().addAll((Collection<? extends Access>)newValue);
				return;
			case NonregPackage.PERSON__WORK_FOR:
				setWorkFor((Company)newValue);
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
			case NonregPackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case NonregPackage.PERSON__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case NonregPackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case NonregPackage.PERSON__ECLIPSE_COMMITER:
				setEclipseCommiter(ECLIPSE_COMMITER_EDEFAULT);
				return;
			case NonregPackage.PERSON__ASSISTS:
				getAssists().clear();
				return;
			case NonregPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case NonregPackage.PERSON__IS_REGISTERED:
				setIsRegistered(IS_REGISTERED_EDEFAULT);
				return;
			case NonregPackage.PERSON__ACCREDITATIONS:
				getAccreditations().clear();
				return;
			case NonregPackage.PERSON__WORK_FOR:
				setWorkFor((Company)null);
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
			case NonregPackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case NonregPackage.PERSON__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case NonregPackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case NonregPackage.PERSON__ECLIPSE_COMMITER:
				return eclipseCommiter != ECLIPSE_COMMITER_EDEFAULT;
			case NonregPackage.PERSON__ASSISTS:
				return assists != null && !assists.isEmpty();
			case NonregPackage.PERSON__GENDER:
				return gender != GENDER_EDEFAULT;
			case NonregPackage.PERSON__IS_REGISTERED:
				return isRegistered != IS_REGISTERED_EDEFAULT;
			case NonregPackage.PERSON__ACCREDITATIONS:
				return accreditations != null && !accreditations.isEmpty();
			case NonregPackage.PERSON__WORK_FOR:
				return workFor != null;
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
