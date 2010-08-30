/**
 * <copyright>
 * </copyright>
 *
 * $Id: TalkImpl.java,v 1.2.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.ab.abstractnonreg.impl.DocumentedElementImpl;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.TALK_TYPE;
import org.eclipse.emf.eef.nonreg.Talk;
import org.eclipse.emf.eef.nonreg.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl#getPresenter <em>Presenter</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.TalkImpl#getCreator <em>Creator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TalkImpl extends DocumentedElementImpl implements Talk {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TALK_TYPE TYPE_EDEFAULT = TALK_TYPE.WORKSHOP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TALK_TYPE type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresenter() <em>Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenter()
	 * @generated
	 * @ordered
	 */
	protected Person presenter;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Person creator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TalkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NonregPackage.Literals.TALK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.TALK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NonregPackage.TALK__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Topic newTopic) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.TALK__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TALK_TYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TALK_TYPE newType) {
		TALK_TYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.TALK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPresenter() {
		if (presenter != null && presenter.eIsProxy()) {
			InternalEObject oldPresenter = (InternalEObject)presenter;
			presenter = (Person)eResolveProxy(oldPresenter);
			if (presenter != oldPresenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NonregPackage.TALK__PRESENTER, oldPresenter, presenter));
			}
		}
		return presenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPresenter() {
		return presenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresenter(Person newPresenter) {
		Person oldPresenter = presenter;
		presenter = newPresenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.TALK__PRESENTER, oldPresenter, presenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCreator() {
		if (creator != null && creator.eIsProxy()) {
			InternalEObject oldCreator = (InternalEObject)creator;
			creator = (Person)eResolveProxy(oldCreator);
			if (creator != oldCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NonregPackage.TALK__CREATOR, oldCreator, creator));
			}
		}
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Person newCreator) {
		Person oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.TALK__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NonregPackage.TALK__TITLE:
				return getTitle();
			case NonregPackage.TALK__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
			case NonregPackage.TALK__TYPE:
				return getType();
			case NonregPackage.TALK__PRESENTER:
				if (resolve) return getPresenter();
				return basicGetPresenter();
			case NonregPackage.TALK__CREATOR:
				if (resolve) return getCreator();
				return basicGetCreator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NonregPackage.TALK__TITLE:
				setTitle((String)newValue);
				return;
			case NonregPackage.TALK__TOPIC:
				setTopic((Topic)newValue);
				return;
			case NonregPackage.TALK__TYPE:
				setType((TALK_TYPE)newValue);
				return;
			case NonregPackage.TALK__PRESENTER:
				setPresenter((Person)newValue);
				return;
			case NonregPackage.TALK__CREATOR:
				setCreator((Person)newValue);
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
			case NonregPackage.TALK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case NonregPackage.TALK__TOPIC:
				setTopic((Topic)null);
				return;
			case NonregPackage.TALK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NonregPackage.TALK__PRESENTER:
				setPresenter((Person)null);
				return;
			case NonregPackage.TALK__CREATOR:
				setCreator((Person)null);
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
			case NonregPackage.TALK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case NonregPackage.TALK__TOPIC:
				return topic != null;
			case NonregPackage.TALK__TYPE:
				return type != TYPE_EDEFAULT;
			case NonregPackage.TALK__PRESENTER:
				return presenter != null;
			case NonregPackage.TALK__CREATOR:
				return creator != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TalkImpl
