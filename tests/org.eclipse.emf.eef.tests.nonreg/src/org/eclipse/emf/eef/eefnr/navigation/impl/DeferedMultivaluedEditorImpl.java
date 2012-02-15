/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedMultivaluedEditorImpl.java,v 1.1.4.2 2012/02/15 13:37:46 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.eef.eefnr.navigation.DeferedMultivaluedEditor;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defered Multivalued Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedMultivaluedEditorImpl#getMultiValuedEditor <em>Multi Valued Editor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeferedMultivaluedEditorImpl extends EObjectImpl implements DeferedMultivaluedEditor {
	/**
	 * The cached value of the '{@link #getMultiValuedEditor() <em>Multi Valued Editor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiValuedEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multiValuedEditor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferedMultivaluedEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DEFERED_MULTIVALUED_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMultiValuedEditor() {
		if (multiValuedEditor == null) {
			multiValuedEditor = new EDataTypeUniqueEList<String>(String.class, this, NavigationPackage.DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR);
		}
		return multiValuedEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR:
				return getMultiValuedEditor();
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR:
				getMultiValuedEditor().clear();
				getMultiValuedEditor().addAll((Collection<? extends String>)newValue);
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR:
				getMultiValuedEditor().clear();
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
			case NavigationPackage.DEFERED_MULTIVALUED_EDITOR__MULTI_VALUED_EDITOR:
				return multiValuedEditor != null && !multiValuedEditor.isEmpty();
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
		result.append(" (multiValuedEditor: ");
		result.append(multiValuedEditor);
		result.append(')');
		return result.toString();
	}

} //DeferedMultivaluedEditorImpl
