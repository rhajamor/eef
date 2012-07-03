/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleCompositionViewerSampleImpl.java,v 1.1 2011/02/22 08:54:40 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.SingleCompositionViewerSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Composition Viewer Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.SingleCompositionViewerSampleImpl#getSinglecompositionviewSingleRequiredProperty <em>Singlecompositionview Single Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.SingleCompositionViewerSampleImpl#getSinglecompositionviewSingleOptionalProperty <em>Singlecompositionview Single Optional Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.SingleCompositionViewerSampleImpl#getSinglecompositionviewMultiRequiredProperty <em>Singlecompositionview Multi Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.SingleCompositionViewerSampleImpl#getSinglecompositionviewMultiOptionalProperty <em>Singlecompositionview Multi Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleCompositionViewerSampleImpl extends AbstractSampleImpl implements SingleCompositionViewerSample {
	/**
	 * The cached value of the '{@link #getSinglecompositionviewSingleRequiredProperty() <em>Singlecompositionview Single Required Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglecompositionviewSingleRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected Sample singlecompositionviewSingleRequiredProperty;

	/**
	 * The cached value of the '{@link #getSinglecompositionviewSingleOptionalProperty() <em>Singlecompositionview Single Optional Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglecompositionviewSingleOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected Sample singlecompositionviewSingleOptionalProperty;

	/**
	 * The cached value of the '{@link #getSinglecompositionviewMultiRequiredProperty() <em>Singlecompositionview Multi Required Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglecompositionviewMultiRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected AbstractSample singlecompositionviewMultiRequiredProperty;

	/**
	 * The cached value of the '{@link #getSinglecompositionviewMultiOptionalProperty() <em>Singlecompositionview Multi Optional Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglecompositionviewMultiOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected AbstractSample singlecompositionviewMultiOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleCompositionViewerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample getSinglecompositionviewSingleRequiredProperty() {
		return singlecompositionviewSingleRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSinglecompositionviewSingleRequiredProperty(Sample newSinglecompositionviewSingleRequiredProperty, NotificationChain msgs) {
		Sample oldSinglecompositionviewSingleRequiredProperty = singlecompositionviewSingleRequiredProperty;
		singlecompositionviewSingleRequiredProperty = newSinglecompositionviewSingleRequiredProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY, oldSinglecompositionviewSingleRequiredProperty, newSinglecompositionviewSingleRequiredProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinglecompositionviewSingleRequiredProperty(Sample newSinglecompositionviewSingleRequiredProperty) {
		if (newSinglecompositionviewSingleRequiredProperty != singlecompositionviewSingleRequiredProperty) {
			NotificationChain msgs = null;
			if (singlecompositionviewSingleRequiredProperty != null)
				msgs = ((InternalEObject)singlecompositionviewSingleRequiredProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY, null, msgs);
			if (newSinglecompositionviewSingleRequiredProperty != null)
				msgs = ((InternalEObject)newSinglecompositionviewSingleRequiredProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY, null, msgs);
			msgs = basicSetSinglecompositionviewSingleRequiredProperty(newSinglecompositionviewSingleRequiredProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY, newSinglecompositionviewSingleRequiredProperty, newSinglecompositionviewSingleRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample getSinglecompositionviewSingleOptionalProperty() {
		return singlecompositionviewSingleOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSinglecompositionviewSingleOptionalProperty(Sample newSinglecompositionviewSingleOptionalProperty, NotificationChain msgs) {
		Sample oldSinglecompositionviewSingleOptionalProperty = singlecompositionviewSingleOptionalProperty;
		singlecompositionviewSingleOptionalProperty = newSinglecompositionviewSingleOptionalProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY, oldSinglecompositionviewSingleOptionalProperty, newSinglecompositionviewSingleOptionalProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinglecompositionviewSingleOptionalProperty(Sample newSinglecompositionviewSingleOptionalProperty) {
		if (newSinglecompositionviewSingleOptionalProperty != singlecompositionviewSingleOptionalProperty) {
			NotificationChain msgs = null;
			if (singlecompositionviewSingleOptionalProperty != null)
				msgs = ((InternalEObject)singlecompositionviewSingleOptionalProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY, null, msgs);
			if (newSinglecompositionviewSingleOptionalProperty != null)
				msgs = ((InternalEObject)newSinglecompositionviewSingleOptionalProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY, null, msgs);
			msgs = basicSetSinglecompositionviewSingleOptionalProperty(newSinglecompositionviewSingleOptionalProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY, newSinglecompositionviewSingleOptionalProperty, newSinglecompositionviewSingleOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSample getSinglecompositionviewMultiRequiredProperty() {
		return singlecompositionviewMultiRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSinglecompositionviewMultiRequiredProperty(AbstractSample newSinglecompositionviewMultiRequiredProperty, NotificationChain msgs) {
		AbstractSample oldSinglecompositionviewMultiRequiredProperty = singlecompositionviewMultiRequiredProperty;
		singlecompositionviewMultiRequiredProperty = newSinglecompositionviewMultiRequiredProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY, oldSinglecompositionviewMultiRequiredProperty, newSinglecompositionviewMultiRequiredProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinglecompositionviewMultiRequiredProperty(AbstractSample newSinglecompositionviewMultiRequiredProperty) {
		if (newSinglecompositionviewMultiRequiredProperty != singlecompositionviewMultiRequiredProperty) {
			NotificationChain msgs = null;
			if (singlecompositionviewMultiRequiredProperty != null)
				msgs = ((InternalEObject)singlecompositionviewMultiRequiredProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY, null, msgs);
			if (newSinglecompositionviewMultiRequiredProperty != null)
				msgs = ((InternalEObject)newSinglecompositionviewMultiRequiredProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY, null, msgs);
			msgs = basicSetSinglecompositionviewMultiRequiredProperty(newSinglecompositionviewMultiRequiredProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY, newSinglecompositionviewMultiRequiredProperty, newSinglecompositionviewMultiRequiredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSample getSinglecompositionviewMultiOptionalProperty() {
		return singlecompositionviewMultiOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSinglecompositionviewMultiOptionalProperty(AbstractSample newSinglecompositionviewMultiOptionalProperty, NotificationChain msgs) {
		AbstractSample oldSinglecompositionviewMultiOptionalProperty = singlecompositionviewMultiOptionalProperty;
		singlecompositionviewMultiOptionalProperty = newSinglecompositionviewMultiOptionalProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY, oldSinglecompositionviewMultiOptionalProperty, newSinglecompositionviewMultiOptionalProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinglecompositionviewMultiOptionalProperty(AbstractSample newSinglecompositionviewMultiOptionalProperty) {
		if (newSinglecompositionviewMultiOptionalProperty != singlecompositionviewMultiOptionalProperty) {
			NotificationChain msgs = null;
			if (singlecompositionviewMultiOptionalProperty != null)
				msgs = ((InternalEObject)singlecompositionviewMultiOptionalProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY, null, msgs);
			if (newSinglecompositionviewMultiOptionalProperty != null)
				msgs = ((InternalEObject)newSinglecompositionviewMultiOptionalProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY, null, msgs);
			msgs = basicSetSinglecompositionviewMultiOptionalProperty(newSinglecompositionviewMultiOptionalProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY, newSinglecompositionviewMultiOptionalProperty, newSinglecompositionviewMultiOptionalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY:
				return basicSetSinglecompositionviewSingleRequiredProperty(null, msgs);
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY:
				return basicSetSinglecompositionviewSingleOptionalProperty(null, msgs);
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY:
				return basicSetSinglecompositionviewMultiRequiredProperty(null, msgs);
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY:
				return basicSetSinglecompositionviewMultiOptionalProperty(null, msgs);
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
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY:
				return getSinglecompositionviewSingleRequiredProperty();
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY:
				return getSinglecompositionviewSingleOptionalProperty();
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY:
				return getSinglecompositionviewMultiRequiredProperty();
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY:
				return getSinglecompositionviewMultiOptionalProperty();
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
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY:
				setSinglecompositionviewSingleRequiredProperty((Sample)newValue);
				return;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY:
				setSinglecompositionviewSingleOptionalProperty((Sample)newValue);
				return;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY:
				setSinglecompositionviewMultiRequiredProperty((AbstractSample)newValue);
				return;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY:
				setSinglecompositionviewMultiOptionalProperty((AbstractSample)newValue);
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
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY:
				setSinglecompositionviewSingleRequiredProperty((Sample)null);
				return;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY:
				setSinglecompositionviewSingleOptionalProperty((Sample)null);
				return;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY:
				setSinglecompositionviewMultiRequiredProperty((AbstractSample)null);
				return;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY:
				setSinglecompositionviewMultiOptionalProperty((AbstractSample)null);
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
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY:
				return singlecompositionviewSingleRequiredProperty != null;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY:
				return singlecompositionviewSingleOptionalProperty != null;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY:
				return singlecompositionviewMultiRequiredProperty != null;
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY:
				return singlecompositionviewMultiOptionalProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleCompositionViewerSampleImpl
