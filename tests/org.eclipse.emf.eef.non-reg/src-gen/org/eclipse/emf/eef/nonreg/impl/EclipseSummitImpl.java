/**
 * <copyright>
 * </copyright>
 *
 * $Id: EclipseSummitImpl.java,v 1.3.4.1 2010/08/30 08:45:00 sbouchet Exp $
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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.nonreg.Company;
import org.eclipse.emf.eef.nonreg.EclipseSummit;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.Site;
import org.eclipse.emf.eef.nonreg.Talk;
import org.eclipse.emf.eef.nonreg.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Summit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl#getTalks <em>Talks</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl#getSites <em>Sites</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.EclipseSummitImpl#getSponsors <em>Sponsors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EclipseSummitImpl extends EObjectImpl implements EclipseSummit {
	/**
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected String place = PLACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> participants;

	/**
	 * The cached value of the '{@link #getTalks() <em>Talks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalks()
	 * @generated
	 * @ordered
	 */
	protected EList<Talk> talks;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topics;

	/**
	 * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSites()
	 * @generated
	 * @ordered
	 */
	protected EList<Site> sites;

	/**
	 * The cached value of the '{@link #getSponsors() <em>Sponsors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsors()
	 * @generated
	 * @ordered
	 */
	protected Company sponsors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseSummitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NonregPackage.Literals.ECLIPSE_SUMMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		String oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.ECLIPSE_SUMMIT__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Person>(Person.class, this, NonregPackage.ECLIPSE_SUMMIT__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Talk> getTalks() {
		if (talks == null) {
			talks = new EObjectContainmentEList<Talk>(Talk.class, this, NonregPackage.ECLIPSE_SUMMIT__TALKS);
		}
		return talks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, NonregPackage.ECLIPSE_SUMMIT__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Site> getSites() {
		if (sites == null) {
			sites = new EObjectContainmentEList<Site>(Site.class, this, NonregPackage.ECLIPSE_SUMMIT__SITES);
		}
		return sites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company getSponsors() {
		return sponsors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSponsors(Company newSponsors, NotificationChain msgs) {
		Company oldSponsors = sponsors;
		sponsors = newSponsors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NonregPackage.ECLIPSE_SUMMIT__SPONSORS, oldSponsors, newSponsors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSponsors(Company newSponsors) {
		if (newSponsors != sponsors) {
			NotificationChain msgs = null;
			if (sponsors != null)
				msgs = ((InternalEObject)sponsors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NonregPackage.ECLIPSE_SUMMIT__SPONSORS, null, msgs);
			if (newSponsors != null)
				msgs = ((InternalEObject)newSponsors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NonregPackage.ECLIPSE_SUMMIT__SPONSORS, null, msgs);
			msgs = basicSetSponsors(newSponsors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.ECLIPSE_SUMMIT__SPONSORS, newSponsors, newSponsors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NonregPackage.ECLIPSE_SUMMIT__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case NonregPackage.ECLIPSE_SUMMIT__TALKS:
				return ((InternalEList<?>)getTalks()).basicRemove(otherEnd, msgs);
			case NonregPackage.ECLIPSE_SUMMIT__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case NonregPackage.ECLIPSE_SUMMIT__SITES:
				return ((InternalEList<?>)getSites()).basicRemove(otherEnd, msgs);
			case NonregPackage.ECLIPSE_SUMMIT__SPONSORS:
				return basicSetSponsors(null, msgs);
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
			case NonregPackage.ECLIPSE_SUMMIT__PLACE:
				return getPlace();
			case NonregPackage.ECLIPSE_SUMMIT__PARTICIPANTS:
				return getParticipants();
			case NonregPackage.ECLIPSE_SUMMIT__TALKS:
				return getTalks();
			case NonregPackage.ECLIPSE_SUMMIT__TOPICS:
				return getTopics();
			case NonregPackage.ECLIPSE_SUMMIT__SITES:
				return getSites();
			case NonregPackage.ECLIPSE_SUMMIT__SPONSORS:
				return getSponsors();
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
			case NonregPackage.ECLIPSE_SUMMIT__PLACE:
				setPlace((String)newValue);
				return;
			case NonregPackage.ECLIPSE_SUMMIT__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Person>)newValue);
				return;
			case NonregPackage.ECLIPSE_SUMMIT__TALKS:
				getTalks().clear();
				getTalks().addAll((Collection<? extends Talk>)newValue);
				return;
			case NonregPackage.ECLIPSE_SUMMIT__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case NonregPackage.ECLIPSE_SUMMIT__SITES:
				getSites().clear();
				getSites().addAll((Collection<? extends Site>)newValue);
				return;
			case NonregPackage.ECLIPSE_SUMMIT__SPONSORS:
				setSponsors((Company)newValue);
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
			case NonregPackage.ECLIPSE_SUMMIT__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case NonregPackage.ECLIPSE_SUMMIT__PARTICIPANTS:
				getParticipants().clear();
				return;
			case NonregPackage.ECLIPSE_SUMMIT__TALKS:
				getTalks().clear();
				return;
			case NonregPackage.ECLIPSE_SUMMIT__TOPICS:
				getTopics().clear();
				return;
			case NonregPackage.ECLIPSE_SUMMIT__SITES:
				getSites().clear();
				return;
			case NonregPackage.ECLIPSE_SUMMIT__SPONSORS:
				setSponsors((Company)null);
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
			case NonregPackage.ECLIPSE_SUMMIT__PLACE:
				return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
			case NonregPackage.ECLIPSE_SUMMIT__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case NonregPackage.ECLIPSE_SUMMIT__TALKS:
				return talks != null && !talks.isEmpty();
			case NonregPackage.ECLIPSE_SUMMIT__TOPICS:
				return topics != null && !topics.isEmpty();
			case NonregPackage.ECLIPSE_SUMMIT__SITES:
				return sites != null && !sites.isEmpty();
			case NonregPackage.ECLIPSE_SUMMIT__SPONSORS:
				return sponsors != null;
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
		result.append(" (place: ");
		result.append(place);
		result.append(')');
		return result.toString();
	}

} //EclipseSummitImpl
