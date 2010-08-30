/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedReferenceImpl.java,v 1.1.2.1 2010/08/30 08:48:25 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.eef.eefnr.TotalSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReference;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defered Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedReferenceImpl#getFlatreferenceEditor <em>Flatreference Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeferedReferenceImpl extends EObjectImpl implements DeferedReference {
	/**
	 * The cached value of the '{@link #getFlatreferenceEditor() <em>Flatreference Editor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatreferenceEditor()
	 * @generated
	 * @ordered
	 */
	protected TotalSample flatreferenceEditor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferedReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DEFERED_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample getFlatreferenceEditor() {
		if (flatreferenceEditor != null && flatreferenceEditor.eIsProxy()) {
			InternalEObject oldFlatreferenceEditor = (InternalEObject)flatreferenceEditor;
			flatreferenceEditor = (TotalSample)eResolveProxy(oldFlatreferenceEditor);
			if (flatreferenceEditor != oldFlatreferenceEditor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationPackage.DEFERED_REFERENCE__FLATREFERENCE_EDITOR, oldFlatreferenceEditor, flatreferenceEditor));
			}
		}
		return flatreferenceEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample basicGetFlatreferenceEditor() {
		return flatreferenceEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlatreferenceEditor(TotalSample newFlatreferenceEditor) {
		TotalSample oldFlatreferenceEditor = flatreferenceEditor;
		flatreferenceEditor = newFlatreferenceEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.DEFERED_REFERENCE__FLATREFERENCE_EDITOR, oldFlatreferenceEditor, flatreferenceEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NavigationPackage.DEFERED_REFERENCE__FLATREFERENCE_EDITOR:
				if (resolve) return getFlatreferenceEditor();
				return basicGetFlatreferenceEditor();
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
			case NavigationPackage.DEFERED_REFERENCE__FLATREFERENCE_EDITOR:
				setFlatreferenceEditor((TotalSample)newValue);
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
			case NavigationPackage.DEFERED_REFERENCE__FLATREFERENCE_EDITOR:
				setFlatreferenceEditor((TotalSample)null);
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
			case NavigationPackage.DEFERED_REFERENCE__FLATREFERENCE_EDITOR:
				return flatreferenceEditor != null;
		}
		return super.eIsSet(featureID);
	}

} //DeferedReferenceImpl
