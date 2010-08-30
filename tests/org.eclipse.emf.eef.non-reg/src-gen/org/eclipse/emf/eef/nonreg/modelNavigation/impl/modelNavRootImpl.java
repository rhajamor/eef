/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.modelNavigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.Source;
import org.eclipse.emf.eef.nonreg.modelNavigation.SuperCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>model Nav Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.modelNavRootImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.modelNavigation.impl.modelNavRootImpl#getCibles <em>Cibles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class modelNavRootImpl extends EObjectImpl implements modelNavRoot {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> sources;

	/**
	 * The cached value of the '{@link #getCibles() <em>Cibles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCibles()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperCible> cibles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected modelNavRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelNavigationPackage.Literals.MODEL_NAV_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Source>(Source.class, this, ModelNavigationPackage.MODEL_NAV_ROOT__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperCible> getCibles() {
		if (cibles == null) {
			cibles = new EObjectContainmentEList<SuperCible>(SuperCible.class, this, ModelNavigationPackage.MODEL_NAV_ROOT__CIBLES);
		}
		return cibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelNavigationPackage.MODEL_NAV_ROOT__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ModelNavigationPackage.MODEL_NAV_ROOT__CIBLES:
				return ((InternalEList<?>)getCibles()).basicRemove(otherEnd, msgs);
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
			case ModelNavigationPackage.MODEL_NAV_ROOT__SOURCES:
				return getSources();
			case ModelNavigationPackage.MODEL_NAV_ROOT__CIBLES:
				return getCibles();
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
			case ModelNavigationPackage.MODEL_NAV_ROOT__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case ModelNavigationPackage.MODEL_NAV_ROOT__CIBLES:
				getCibles().clear();
				getCibles().addAll((Collection<? extends SuperCible>)newValue);
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
			case ModelNavigationPackage.MODEL_NAV_ROOT__SOURCES:
				getSources().clear();
				return;
			case ModelNavigationPackage.MODEL_NAV_ROOT__CIBLES:
				getCibles().clear();
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
			case ModelNavigationPackage.MODEL_NAV_ROOT__SOURCES:
				return sources != null && !sources.isEmpty();
			case ModelNavigationPackage.MODEL_NAV_ROOT__CIBLES:
				return cibles != null && !cibles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //modelNavRootImpl
