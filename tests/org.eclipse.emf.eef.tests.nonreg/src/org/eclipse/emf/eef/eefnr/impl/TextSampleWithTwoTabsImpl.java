/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextSampleWithTwoTabsImpl.java,v 1.1.2.1 2010/08/30 08:48:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Sample With Two Tabs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TextSampleWithTwoTabsImpl#getTextRequiredPropertyInFirstTab <em>Text Required Property In First Tab</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TextSampleWithTwoTabsImpl#getTextOptionalPropertyInFirstTab <em>Text Optional Property In First Tab</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TextSampleWithTwoTabsImpl#getTextRequiredPropertyInSecondTab <em>Text Required Property In Second Tab</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TextSampleWithTwoTabsImpl#getTextOptionalPropertyInSecondTab <em>Text Optional Property In Second Tab</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextSampleWithTwoTabsImpl extends AbstractSampleImpl implements TextSampleWithTwoTabs {
	/**
	 * The default value of the '{@link #getTextRequiredPropertyInFirstTab() <em>Text Required Property In First Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRequiredPropertyInFirstTab()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextRequiredPropertyInFirstTab() <em>Text Required Property In First Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRequiredPropertyInFirstTab()
	 * @generated
	 * @ordered
	 */
	protected String textRequiredPropertyInFirstTab = TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextOptionalPropertyInFirstTab() <em>Text Optional Property In First Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOptionalPropertyInFirstTab()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextOptionalPropertyInFirstTab() <em>Text Optional Property In First Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOptionalPropertyInFirstTab()
	 * @generated
	 * @ordered
	 */
	protected String textOptionalPropertyInFirstTab = TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextRequiredPropertyInSecondTab() <em>Text Required Property In Second Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRequiredPropertyInSecondTab()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextRequiredPropertyInSecondTab() <em>Text Required Property In Second Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRequiredPropertyInSecondTab()
	 * @generated
	 * @ordered
	 */
	protected String textRequiredPropertyInSecondTab = TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextOptionalPropertyInSecondTab() <em>Text Optional Property In Second Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOptionalPropertyInSecondTab()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextOptionalPropertyInSecondTab() <em>Text Optional Property In Second Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOptionalPropertyInSecondTab()
	 * @generated
	 * @ordered
	 */
	protected String textOptionalPropertyInSecondTab = TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextSampleWithTwoTabsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.TEXT_SAMPLE_WITH_TWO_TABS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextRequiredPropertyInFirstTab() {
		return textRequiredPropertyInFirstTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRequiredPropertyInFirstTab(String newTextRequiredPropertyInFirstTab) {
		String oldTextRequiredPropertyInFirstTab = textRequiredPropertyInFirstTab;
		textRequiredPropertyInFirstTab = newTextRequiredPropertyInFirstTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB, oldTextRequiredPropertyInFirstTab, textRequiredPropertyInFirstTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextOptionalPropertyInFirstTab() {
		return textOptionalPropertyInFirstTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOptionalPropertyInFirstTab(String newTextOptionalPropertyInFirstTab) {
		String oldTextOptionalPropertyInFirstTab = textOptionalPropertyInFirstTab;
		textOptionalPropertyInFirstTab = newTextOptionalPropertyInFirstTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB, oldTextOptionalPropertyInFirstTab, textOptionalPropertyInFirstTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextRequiredPropertyInSecondTab() {
		return textRequiredPropertyInSecondTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRequiredPropertyInSecondTab(String newTextRequiredPropertyInSecondTab) {
		String oldTextRequiredPropertyInSecondTab = textRequiredPropertyInSecondTab;
		textRequiredPropertyInSecondTab = newTextRequiredPropertyInSecondTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB, oldTextRequiredPropertyInSecondTab, textRequiredPropertyInSecondTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextOptionalPropertyInSecondTab() {
		return textOptionalPropertyInSecondTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOptionalPropertyInSecondTab(String newTextOptionalPropertyInSecondTab) {
		String oldTextOptionalPropertyInSecondTab = textOptionalPropertyInSecondTab;
		textOptionalPropertyInSecondTab = newTextOptionalPropertyInSecondTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB, oldTextOptionalPropertyInSecondTab, textOptionalPropertyInSecondTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB:
				return getTextRequiredPropertyInFirstTab();
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB:
				return getTextOptionalPropertyInFirstTab();
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB:
				return getTextRequiredPropertyInSecondTab();
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB:
				return getTextOptionalPropertyInSecondTab();
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
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB:
				setTextRequiredPropertyInFirstTab((String)newValue);
				return;
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB:
				setTextOptionalPropertyInFirstTab((String)newValue);
				return;
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB:
				setTextRequiredPropertyInSecondTab((String)newValue);
				return;
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB:
				setTextOptionalPropertyInSecondTab((String)newValue);
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
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB:
				setTextRequiredPropertyInFirstTab(TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB_EDEFAULT);
				return;
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB:
				setTextOptionalPropertyInFirstTab(TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB_EDEFAULT);
				return;
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB:
				setTextRequiredPropertyInSecondTab(TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB_EDEFAULT);
				return;
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB:
				setTextOptionalPropertyInSecondTab(TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB_EDEFAULT);
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
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB:
				return TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB_EDEFAULT == null ? textRequiredPropertyInFirstTab != null : !TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB_EDEFAULT.equals(textRequiredPropertyInFirstTab);
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB:
				return TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB_EDEFAULT == null ? textOptionalPropertyInFirstTab != null : !TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB_EDEFAULT.equals(textOptionalPropertyInFirstTab);
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB:
				return TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB_EDEFAULT == null ? textRequiredPropertyInSecondTab != null : !TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB_EDEFAULT.equals(textRequiredPropertyInSecondTab);
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB:
				return TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB_EDEFAULT == null ? textOptionalPropertyInSecondTab != null : !TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB_EDEFAULT.equals(textOptionalPropertyInSecondTab);
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
		result.append(" (textRequiredPropertyInFirstTab: ");
		result.append(textRequiredPropertyInFirstTab);
		result.append(", textOptionalPropertyInFirstTab: ");
		result.append(textOptionalPropertyInFirstTab);
		result.append(", textRequiredPropertyInSecondTab: ");
		result.append(textRequiredPropertyInSecondTab);
		result.append(", textOptionalPropertyInSecondTab: ");
		result.append(textOptionalPropertyInSecondTab);
		result.append(')');
		return result.toString();
	}

} //TextSampleWithTwoTabsImpl
