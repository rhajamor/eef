/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.modelingBot.EEFActions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.eef.extended.editor.ReferenceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unset Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getUnsetReference()
 * @model
 * @generated
 */
public interface UnsetReference extends EditAction {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getUnsetReference_Feature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.extended.editor.ReferenceableObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getUnsetReference_Values()
	 * @model
	 * @generated
	 */
	EList<ReferenceableObject> getValues();

} // UnsetReference
