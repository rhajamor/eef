/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImageViewerSampleImpl.java,v 1.1 2011/02/22 08:54:40 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.ImageViewerSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Viewer Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.ImageViewerSampleImpl#getImageviewerRequiredProperty <em>Imageviewer Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.ImageViewerSampleImpl#getImageviewerOptionalProperty <em>Imageviewer Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageViewerSampleImpl extends AbstractSampleImpl implements ImageViewerSample {
	/**
	 * The default value of the '{@link #getImageviewerRequiredProperty() <em>Imageviewer Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGEVIEWER_REQUIRED_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageviewerRequiredProperty() <em>Imageviewer Required Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageviewerRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected String imageviewerRequiredProperty = IMAGEVIEWER_REQUIRED_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageviewerOptionalProperty() <em>Imageviewer Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGEVIEWER_OPTIONAL_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageviewerOptionalProperty() <em>Imageviewer Optional Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageviewerOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected String imageviewerOptionalProperty = IMAGEVIEWER_OPTIONAL_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageViewerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.IMAGE_VIEWER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageviewerRequiredProperty() {
		return imageviewerRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageviewerRequiredProperty(String newImageviewerRequiredProperty) {
		String oldImageviewerRequiredProperty = imageviewerRequiredProperty;
		imageviewerRequiredProperty = newImageviewerRequiredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_REQUIRED_PROPERTY, oldImageviewerRequiredProperty, imageviewerRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageviewerOptionalProperty() {
		return imageviewerOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageviewerOptionalProperty(String newImageviewerOptionalProperty) {
		String oldImageviewerOptionalProperty = imageviewerOptionalProperty;
		imageviewerOptionalProperty = newImageviewerOptionalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_OPTIONAL_PROPERTY, oldImageviewerOptionalProperty, imageviewerOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_REQUIRED_PROPERTY:
				return getImageviewerRequiredProperty();
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_OPTIONAL_PROPERTY:
				return getImageviewerOptionalProperty();
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
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_REQUIRED_PROPERTY:
				setImageviewerRequiredProperty((String)newValue);
				return;
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_OPTIONAL_PROPERTY:
				setImageviewerOptionalProperty((String)newValue);
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
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_REQUIRED_PROPERTY:
				setImageviewerRequiredProperty(IMAGEVIEWER_REQUIRED_PROPERTY_EDEFAULT);
				return;
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_OPTIONAL_PROPERTY:
				setImageviewerOptionalProperty(IMAGEVIEWER_OPTIONAL_PROPERTY_EDEFAULT);
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
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_REQUIRED_PROPERTY:
				return IMAGEVIEWER_REQUIRED_PROPERTY_EDEFAULT == null ? imageviewerRequiredProperty != null : !IMAGEVIEWER_REQUIRED_PROPERTY_EDEFAULT.equals(imageviewerRequiredProperty);
			case EefnrPackage.IMAGE_VIEWER_SAMPLE__IMAGEVIEWER_OPTIONAL_PROPERTY:
				return IMAGEVIEWER_OPTIONAL_PROPERTY_EDEFAULT == null ? imageviewerOptionalProperty != null : !IMAGEVIEWER_OPTIONAL_PROPERTY_EDEFAULT.equals(imageviewerOptionalProperty);
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
		result.append(" (imageviewerRequiredProperty: ");
		result.append(imageviewerRequiredProperty);
		result.append(", imageviewerOptionalProperty: ");
		result.append(imageviewerOptionalProperty);
		result.append(')');
		return result.toString();
	}

} //ImageViewerSampleImpl
