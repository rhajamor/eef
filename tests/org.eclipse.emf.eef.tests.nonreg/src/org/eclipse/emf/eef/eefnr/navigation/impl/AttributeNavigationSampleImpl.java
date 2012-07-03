/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeNavigationSampleImpl.java,v 1.2 2011/08/13 22:21:30 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.eefnr.impl.AbstractSampleImpl;
import org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate;
import org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Navigation Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeNavigationSampleImpl#getSingleValuedAttributeDelegate <em>Single Valued Attribute Delegate</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.AttributeNavigationSampleImpl#getMultiValuedAttributeDelegate <em>Multi Valued Attribute Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeNavigationSampleImpl extends AbstractSampleImpl implements AttributeNavigationSample {
	/**
	 * The cached value of the '{@link #getSingleValuedAttributeDelegate() <em>Single Valued Attribute Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleValuedAttributeDelegate()
	 * @generated
	 * @ordered
	 */
	protected AttributeDelegate singleValuedAttributeDelegate;

	/**
	 * The cached value of the '{@link #getMultiValuedAttributeDelegate() <em>Multi Valued Attribute Delegate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiValuedAttributeDelegate()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDelegate> multiValuedAttributeDelegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeNavigationSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.ATTRIBUTE_NAVIGATION_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDelegate getSingleValuedAttributeDelegate() {
		return singleValuedAttributeDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleValuedAttributeDelegate(AttributeDelegate newSingleValuedAttributeDelegate, NotificationChain msgs) {
		AttributeDelegate oldSingleValuedAttributeDelegate = singleValuedAttributeDelegate;
		singleValuedAttributeDelegate = newSingleValuedAttributeDelegate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE, oldSingleValuedAttributeDelegate, newSingleValuedAttributeDelegate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleValuedAttributeDelegate(AttributeDelegate newSingleValuedAttributeDelegate) {
		if (newSingleValuedAttributeDelegate != singleValuedAttributeDelegate) {
			NotificationChain msgs = null;
			if (singleValuedAttributeDelegate != null)
				msgs = ((InternalEObject)singleValuedAttributeDelegate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE, null, msgs);
			if (newSingleValuedAttributeDelegate != null)
				msgs = ((InternalEObject)newSingleValuedAttributeDelegate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE, null, msgs);
			msgs = basicSetSingleValuedAttributeDelegate(newSingleValuedAttributeDelegate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE, newSingleValuedAttributeDelegate, newSingleValuedAttributeDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDelegate> getMultiValuedAttributeDelegate() {
		if (multiValuedAttributeDelegate == null) {
			multiValuedAttributeDelegate = new EObjectContainmentEList<AttributeDelegate>(AttributeDelegate.class, this, NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE);
		}
		return multiValuedAttributeDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE:
				return basicSetSingleValuedAttributeDelegate(null, msgs);
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE:
				return ((InternalEList<?>)getMultiValuedAttributeDelegate()).basicRemove(otherEnd, msgs);
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
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE:
				return getSingleValuedAttributeDelegate();
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE:
				return getMultiValuedAttributeDelegate();
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
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE:
				setSingleValuedAttributeDelegate((AttributeDelegate)newValue);
				return;
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE:
				getMultiValuedAttributeDelegate().clear();
				getMultiValuedAttributeDelegate().addAll((Collection<? extends AttributeDelegate>)newValue);
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
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE:
				setSingleValuedAttributeDelegate((AttributeDelegate)null);
				return;
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE:
				getMultiValuedAttributeDelegate().clear();
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
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__SINGLE_VALUED_ATTRIBUTE_DELEGATE:
				return singleValuedAttributeDelegate != null;
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE__MULTI_VALUED_ATTRIBUTE_DELEGATE:
				return multiValuedAttributeDelegate != null && !multiValuedAttributeDelegate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeNavigationSampleImpl
