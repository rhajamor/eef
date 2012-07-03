/**
 * <copyright>
 * </copyright>
 *
 * $Id: CheckBoxExtendedEditorSampleImpl.java,v 1.1 2010/04/15 12:48:57 glefur Exp $
 */
package org.eclipse.emf.eef.eefnrext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.impl.AbstractSampleImpl;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Box Extended Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnrext.impl.CheckBoxExtendedEditorSampleImpl#isCheckboxEditorSample <em>Checkbox Editor Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckBoxExtendedEditorSampleImpl extends AbstractSampleImpl implements CheckBoxExtendedEditorSample {
	/**
	 * The default value of the '{@link #isCheckboxEditorSample() <em>Checkbox Editor Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxEditorSample()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKBOX_EDITOR_SAMPLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCheckboxEditorSample() <em>Checkbox Editor Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckboxEditorSample()
	 * @generated
	 * @ordered
	 */
	protected boolean checkboxEditorSample = CHECKBOX_EDITOR_SAMPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckBoxExtendedEditorSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrextPackage.Literals.CHECK_BOX_EXTENDED_EDITOR_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckboxEditorSample() {
		return checkboxEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckboxEditorSample(boolean newCheckboxEditorSample) {
		boolean oldCheckboxEditorSample = checkboxEditorSample;
		checkboxEditorSample = newCheckboxEditorSample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE, oldCheckboxEditorSample, checkboxEditorSample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE:
				return isCheckboxEditorSample();
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
			case EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE:
				setCheckboxEditorSample((Boolean)newValue);
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
			case EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE:
				setCheckboxEditorSample(CHECKBOX_EDITOR_SAMPLE_EDEFAULT);
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
			case EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE:
				return checkboxEditorSample != CHECKBOX_EDITOR_SAMPLE_EDEFAULT;
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
		result.append(" (checkboxEditorSample: ");
		result.append(checkboxEditorSample);
		result.append(')');
		return result.toString();
	}

} //CheckBoxExtendedEditorSampleImpl
