/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.modelNavigation.impl;

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
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.Source;
import org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl#getUniqueRef <em>Unique Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl#getMultipleRef <em>Multiple Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.SourceImpl#getMultipleContainment <em>Multiple Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends EObjectImpl implements Source {
	/**
	 * The cached value of the '{@link #getUniqueRef() <em>Unique Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueRef()
	 * @generated
	 * @ordered
	 */
	protected SuperCible uniqueRef;

	/**
	 * The cached value of the '{@link #getMultipleRef() <em>Multiple Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperCible> multipleRef;

	/**
	 * The cached value of the '{@link #getMultipleContainment() <em>Multiple Containment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleContainment()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperCible> multipleContainment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelNavigationPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperCible getUniqueRef() {
		return uniqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniqueRef(SuperCible newUniqueRef, NotificationChain msgs) {
		SuperCible oldUniqueRef = uniqueRef;
		uniqueRef = newUniqueRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelNavigationPackage.SOURCE__UNIQUE_REF, oldUniqueRef, newUniqueRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueRef(SuperCible newUniqueRef) {
		if (newUniqueRef != uniqueRef) {
			NotificationChain msgs = null;
			if (uniqueRef != null)
				msgs = ((InternalEObject)uniqueRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelNavigationPackage.SOURCE__UNIQUE_REF, null, msgs);
			if (newUniqueRef != null)
				msgs = ((InternalEObject)newUniqueRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelNavigationPackage.SOURCE__UNIQUE_REF, null, msgs);
			msgs = basicSetUniqueRef(newUniqueRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelNavigationPackage.SOURCE__UNIQUE_REF, newUniqueRef, newUniqueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperCible> getMultipleRef() {
		if (multipleRef == null) {
			multipleRef = new EObjectResolvingEList<SuperCible>(SuperCible.class, this, ModelNavigationPackage.SOURCE__MULTIPLE_REF);
		}
		return multipleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperCible> getMultipleContainment() {
		if (multipleContainment == null) {
			multipleContainment = new EObjectContainmentEList<SuperCible>(SuperCible.class, this, ModelNavigationPackage.SOURCE__MULTIPLE_CONTAINMENT);
		}
		return multipleContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelNavigationPackage.SOURCE__UNIQUE_REF:
				return basicSetUniqueRef(null, msgs);
			case ModelNavigationPackage.SOURCE__MULTIPLE_CONTAINMENT:
				return ((InternalEList<?>)getMultipleContainment()).basicRemove(otherEnd, msgs);
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
			case ModelNavigationPackage.SOURCE__UNIQUE_REF:
				return getUniqueRef();
			case ModelNavigationPackage.SOURCE__MULTIPLE_REF:
				return getMultipleRef();
			case ModelNavigationPackage.SOURCE__MULTIPLE_CONTAINMENT:
				return getMultipleContainment();
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
			case ModelNavigationPackage.SOURCE__UNIQUE_REF:
				setUniqueRef((SuperCible)newValue);
				return;
			case ModelNavigationPackage.SOURCE__MULTIPLE_REF:
				getMultipleRef().clear();
				getMultipleRef().addAll((Collection<? extends SuperCible>)newValue);
				return;
			case ModelNavigationPackage.SOURCE__MULTIPLE_CONTAINMENT:
				getMultipleContainment().clear();
				getMultipleContainment().addAll((Collection<? extends SuperCible>)newValue);
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
			case ModelNavigationPackage.SOURCE__UNIQUE_REF:
				setUniqueRef((SuperCible)null);
				return;
			case ModelNavigationPackage.SOURCE__MULTIPLE_REF:
				getMultipleRef().clear();
				return;
			case ModelNavigationPackage.SOURCE__MULTIPLE_CONTAINMENT:
				getMultipleContainment().clear();
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
			case ModelNavigationPackage.SOURCE__UNIQUE_REF:
				return uniqueRef != null;
			case ModelNavigationPackage.SOURCE__MULTIPLE_REF:
				return multipleRef != null && !multipleRef.isEmpty();
			case ModelNavigationPackage.SOURCE__MULTIPLE_CONTAINMENT:
				return multipleContainment != null && !multipleContainment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
