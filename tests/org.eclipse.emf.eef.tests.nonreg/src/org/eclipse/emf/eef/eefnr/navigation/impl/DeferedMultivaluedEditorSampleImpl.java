/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedMultivaluedEditorSampleImpl.java,v 1.1.4.2 2012/02/15 13:37:46 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.eef.eefnr.impl.AbstractSampleImpl;

import org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor;
import org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defered Multivalued Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorSampleImpl#getDeferedEditor <em>Defered Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeferedMultivaluedEditorSampleImpl extends AbstractSampleImpl implements DeferedMultivaluedEditorSample {
	/**
	 * The cached value of the '{@link #getDeferedEditor() <em>Defered Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferedEditor()
	 * @generated
	 * @ordered
	 */
	protected DeferedMultivaluedEditor deferedEditor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferedMultivaluedEditorSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DEFERED_MULTIVALUED_EDITOR_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferedMultivaluedEditor getDeferedEditor() {
		return deferedEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeferedEditor(DeferedMultivaluedEditor newDeferedEditor, NotificationChain msgs) {
		DeferedMultivaluedEditor oldDeferedEditor = deferedEditor;
		deferedEditor = newDeferedEditor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR, oldDeferedEditor, newDeferedEditor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferedEditor(DeferedMultivaluedEditor newDeferedEditor) {
		if (newDeferedEditor != deferedEditor) {
			NotificationChain msgs = null;
			if (deferedEditor != null)
				msgs = ((InternalEObject)deferedEditor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR, null, msgs);
			if (newDeferedEditor != null)
				msgs = ((InternalEObject)newDeferedEditor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR, null, msgs);
			msgs = basicSetDeferedEditor(newDeferedEditor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR, newDeferedEditor, newDeferedEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR:
				return basicSetDeferedEditor(null, msgs);
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR:
				return getDeferedEditor();
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR:
				setDeferedEditor((DeferedMultivaluedEditor)newValue);
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR:
				setDeferedEditor((DeferedMultivaluedEditor)null);
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR_SAMPLE__DEFERED_EDITOR:
				return deferedEditor != null;
		}
		return super.eIsSet(featureID);
	}

} //DeferedMultivaluedEditorSampleImpl
