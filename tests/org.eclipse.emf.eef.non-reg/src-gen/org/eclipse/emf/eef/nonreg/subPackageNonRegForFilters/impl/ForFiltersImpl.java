/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.ab.abstractnonreg.DocumentedElement;
import org.eclipse.emf.eef.middle.middlenonreg.NamedElement;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Filters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl.ForFiltersImpl#getEOFCV <em>EOFCV</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl.ForFiltersImpl#getRT <em>RT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForFiltersImpl extends EObjectImpl implements ForFilters {
	/**
	 * The cached value of the '{@link #getEOFCV() <em>EOFCV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOFCV()
	 * @generated
	 * @ordered
	 */
	protected NamedElement eofcv;

	/**
	 * The cached value of the '{@link #getRT() <em>RT</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRT()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedElement> rt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForFiltersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubPackageNonRegForFiltersPackage.Literals.FOR_FILTERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getEOFCV() {
		if (eofcv != null && eofcv.eIsProxy()) {
			InternalEObject oldEOFCV = (InternalEObject)eofcv;
			eofcv = (NamedElement)eResolveProxy(oldEOFCV);
			if (eofcv != oldEOFCV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubPackageNonRegForFiltersPackage.FOR_FILTERS__EOFCV, oldEOFCV, eofcv));
			}
		}
		return eofcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetEOFCV() {
		return eofcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOFCV(NamedElement newEOFCV) {
		NamedElement oldEOFCV = eofcv;
		eofcv = newEOFCV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubPackageNonRegForFiltersPackage.FOR_FILTERS__EOFCV, oldEOFCV, eofcv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedElement> getRT() {
		if (rt == null) {
			rt = new EObjectResolvingEList<DocumentedElement>(DocumentedElement.class, this, SubPackageNonRegForFiltersPackage.FOR_FILTERS__RT);
		}
		return rt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__EOFCV:
				if (resolve) return getEOFCV();
				return basicGetEOFCV();
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__RT:
				return getRT();
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
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__EOFCV:
				setEOFCV((NamedElement)newValue);
				return;
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__RT:
				getRT().clear();
				getRT().addAll((Collection<? extends DocumentedElement>)newValue);
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
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__EOFCV:
				setEOFCV((NamedElement)null);
				return;
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__RT:
				getRT().clear();
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
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__EOFCV:
				return eofcv != null;
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS__RT:
				return rt != null && !rt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForFiltersImpl
