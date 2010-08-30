/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccessImpl.java,v 1.2.4.1 2010/08/30 08:45:00 sbouchet Exp $
 */
package org.eclipse.emf.eef.nonreg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.eef.nonreg.Access;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.Site;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.AccessImpl#getSiteAcceded <em>Site Acceded</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.nonreg.impl.AccessImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessImpl extends EObjectImpl implements Access {
	/**
	 * The cached value of the '{@link #getSiteAcceded() <em>Site Acceded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAcceded()
	 * @generated
	 * @ordered
	 */
	protected Site siteAcceded;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NonregPackage.Literals.ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getSiteAcceded() {
		if (siteAcceded != null && siteAcceded.eIsProxy()) {
			InternalEObject oldSiteAcceded = (InternalEObject)siteAcceded;
			siteAcceded = (Site)eResolveProxy(oldSiteAcceded);
			if (siteAcceded != oldSiteAcceded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NonregPackage.ACCESS__SITE_ACCEDED, oldSiteAcceded, siteAcceded));
			}
		}
		return siteAcceded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSiteAcceded() {
		return siteAcceded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAcceded(Site newSiteAcceded) {
		Site oldSiteAcceded = siteAcceded;
		siteAcceded = newSiteAcceded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.ACCESS__SITE_ACCEDED, oldSiteAcceded, siteAcceded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod) {
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NonregPackage.ACCESS__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NonregPackage.ACCESS__SITE_ACCEDED:
				if (resolve) return getSiteAcceded();
				return basicGetSiteAcceded();
			case NonregPackage.ACCESS__PERIOD:
				return new Double(getPeriod());
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
			case NonregPackage.ACCESS__SITE_ACCEDED:
				setSiteAcceded((Site)newValue);
				return;
			case NonregPackage.ACCESS__PERIOD:
				setPeriod(((Double)newValue).doubleValue());
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
			case NonregPackage.ACCESS__SITE_ACCEDED:
				setSiteAcceded((Site)null);
				return;
			case NonregPackage.ACCESS__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
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
			case NonregPackage.ACCESS__SITE_ACCEDED:
				return siteAcceded != null;
			case NonregPackage.ACCESS__PERIOD:
				return period != PERIOD_EDEFAULT;
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
		result.append(" (Period: ");
		result.append(period);
		result.append(')');
		return result.toString();
	}

} //AccessImpl
