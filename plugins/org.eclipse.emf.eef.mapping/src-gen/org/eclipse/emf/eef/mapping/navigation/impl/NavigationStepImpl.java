/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.mapping.navigation.impl;

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

import org.eclipse.emf.eef.mapping.filters.StepFilter;

import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.NavigationStep;
import org.eclipse.emf.eef.mapping.navigation.StepInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl#isCreatesIfNotExists <em>Creates If Not Exists</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl#getSubStep <em>Sub Step</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.mapping.navigation.impl.NavigationStepImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NavigationStepImpl extends EObjectImpl implements
		NavigationStep {
	/**
	 * The default value of the '{@link #isCreatesIfNotExists() <em>Creates If Not Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreatesIfNotExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATES_IF_NOT_EXISTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreatesIfNotExists() <em>Creates If Not Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreatesIfNotExists()
	 * @generated
	 * @ordered
	 */
	protected boolean createsIfNotExists = CREATES_IF_NOT_EXISTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubStep() <em>Sub Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStep()
	 * @generated
	 * @ordered
	 */
	protected NavigationStep subStep;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected StepInitializer initializer;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<StepFilter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.NAVIGATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreatesIfNotExists() {
		return createsIfNotExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatesIfNotExists(boolean newCreatesIfNotExists) {
		boolean oldCreatesIfNotExists = createsIfNotExists;
		createsIfNotExists = newCreatesIfNotExists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.NAVIGATION_STEP__CREATES_IF_NOT_EXISTS,
					oldCreatesIfNotExists, createsIfNotExists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationStep getSubStep() {
		return subStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubStep(NavigationStep newSubStep,
			NotificationChain msgs) {
		NavigationStep oldSubStep = subStep;
		subStep = newSubStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					NavigationPackage.NAVIGATION_STEP__SUB_STEP, oldSubStep,
					newSubStep);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubStep(NavigationStep newSubStep) {
		if (newSubStep != subStep) {
			NotificationChain msgs = null;
			if (subStep != null)
				msgs = ((InternalEObject) subStep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- NavigationPackage.NAVIGATION_STEP__SUB_STEP,
						null, msgs);
			if (newSubStep != null)
				msgs = ((InternalEObject) newSubStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- NavigationPackage.NAVIGATION_STEP__SUB_STEP,
						null, msgs);
			msgs = basicSetSubStep(newSubStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.NAVIGATION_STEP__SUB_STEP, newSubStep,
					newSubStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepInitializer getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(
			StepInitializer newInitializer, NotificationChain msgs) {
		StepInitializer oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					NavigationPackage.NAVIGATION_STEP__INITIALIZER,
					oldInitializer, newInitializer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(StepInitializer newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject) initializer)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- NavigationPackage.NAVIGATION_STEP__INITIALIZER,
								null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject) newInitializer)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- NavigationPackage.NAVIGATION_STEP__INITIALIZER,
								null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NavigationPackage.NAVIGATION_STEP__INITIALIZER,
					newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<StepFilter>(StepFilter.class,
					this, NavigationPackage.NAVIGATION_STEP__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NavigationPackage.NAVIGATION_STEP__SUB_STEP:
			return basicSetSubStep(null, msgs);
		case NavigationPackage.NAVIGATION_STEP__INITIALIZER:
			return basicSetInitializer(null, msgs);
		case NavigationPackage.NAVIGATION_STEP__FILTERS:
			return ((InternalEList<?>) getFilters())
					.basicRemove(otherEnd, msgs);
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
		case NavigationPackage.NAVIGATION_STEP__CREATES_IF_NOT_EXISTS:
			return isCreatesIfNotExists();
		case NavigationPackage.NAVIGATION_STEP__SUB_STEP:
			return getSubStep();
		case NavigationPackage.NAVIGATION_STEP__INITIALIZER:
			return getInitializer();
		case NavigationPackage.NAVIGATION_STEP__FILTERS:
			return getFilters();
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
		case NavigationPackage.NAVIGATION_STEP__CREATES_IF_NOT_EXISTS:
			setCreatesIfNotExists((Boolean) newValue);
			return;
		case NavigationPackage.NAVIGATION_STEP__SUB_STEP:
			setSubStep((NavigationStep) newValue);
			return;
		case NavigationPackage.NAVIGATION_STEP__INITIALIZER:
			setInitializer((StepInitializer) newValue);
			return;
		case NavigationPackage.NAVIGATION_STEP__FILTERS:
			getFilters().clear();
			getFilters().addAll((Collection<? extends StepFilter>) newValue);
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
		case NavigationPackage.NAVIGATION_STEP__CREATES_IF_NOT_EXISTS:
			setCreatesIfNotExists(CREATES_IF_NOT_EXISTS_EDEFAULT);
			return;
		case NavigationPackage.NAVIGATION_STEP__SUB_STEP:
			setSubStep((NavigationStep) null);
			return;
		case NavigationPackage.NAVIGATION_STEP__INITIALIZER:
			setInitializer((StepInitializer) null);
			return;
		case NavigationPackage.NAVIGATION_STEP__FILTERS:
			getFilters().clear();
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
		case NavigationPackage.NAVIGATION_STEP__CREATES_IF_NOT_EXISTS:
			return createsIfNotExists != CREATES_IF_NOT_EXISTS_EDEFAULT;
		case NavigationPackage.NAVIGATION_STEP__SUB_STEP:
			return subStep != null;
		case NavigationPackage.NAVIGATION_STEP__INITIALIZER:
			return initializer != null;
		case NavigationPackage.NAVIGATION_STEP__FILTERS:
			return filters != null && !filters.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (createsIfNotExists: ");
		result.append(createsIfNotExists);
		result.append(')');
		return result.toString();
	}

} //NavigationStepImpl
