/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextareaSampleImpl.java,v 1.1 2010/02/01 13:00:44 nlepine Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TextareaSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textarea Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TextareaSampleImpl#getTextareaRequiredProperty <em>Textarea Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TextareaSampleImpl#getTextareaOptionalProperty <em>Textarea Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextareaSampleImpl extends AbstractSampleImpl implements TextareaSample {
	/**
	 * The default value of the '{@link #getTextareaRequiredProperty() <em>Textarea Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTAREA_REQUIRED_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextareaRequiredProperty() <em>Textarea Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected String textareaRequiredProperty = TEXTAREA_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextareaOptionalProperty() <em>Textarea Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextareaOptionalProperty() <em>Textarea Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected String textareaOptionalProperty = TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextareaSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.TEXTAREA_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextareaRequiredProperty() {
		return textareaRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextareaRequiredProperty(String newTextareaRequiredProperty) {
		String oldTextareaRequiredProperty = textareaRequiredProperty;
		textareaRequiredProperty = newTextareaRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_REQUIRED_PROPERTY, oldTextareaRequiredProperty, textareaRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextareaOptionalProperty() {
		return textareaOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextareaOptionalProperty(String newTextareaOptionalProperty) {
		String oldTextareaOptionalProperty = textareaOptionalProperty;
		textareaOptionalProperty = newTextareaOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY, oldTextareaOptionalProperty, textareaOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				return getTextareaRequiredProperty();
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				return getTextareaOptionalProperty();
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
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				setTextareaRequiredProperty((String)newValue);
				return;
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				setTextareaOptionalProperty((String)newValue);
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
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				setTextareaRequiredProperty(TEXTAREA_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				setTextareaOptionalProperty(TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT);
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
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
				return TEXTAREA_REQUIRED_PROPERTY_EDEFAULT == null ? textareaRequiredProperty != null : !TEXTAREA_REQUIRED_PROPERTY_EDEFAULT.equals(textareaRequiredProperty);
			case EefnrPackage.TEXTAREA_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
				return TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT == null ? textareaOptionalProperty != null : !TEXTAREA_OPTIONAL_PROPERTY_EDEFAULT.equals(textareaOptionalProperty);
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
		result.append(" (textareaRequiredProperty: ");
		result.append(textareaRequiredProperty);
		result.append(", textareaOptionalProperty: ");
		result.append(textareaOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //TextareaSampleImpl
