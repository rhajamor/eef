/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.modelingBot.EEFActions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unset Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getEContainingFeature <em>EContaining Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getUnsetAttribute()
 * @model
 * @generated
 */
public interface UnsetAttribute extends EditAction {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getUnsetAttribute_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>EContaining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Feature</em>' reference.
	 * @see #setEContainingFeature(EStructuralFeature)
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getUnsetAttribute_EContainingFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getEContainingFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getEContainingFeature <em>EContaining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContaining Feature</em>' reference.
	 * @see #getEContainingFeature()
	 * @generated
	 */
	void setEContainingFeature(EStructuralFeature value);

} // UnsetAttribute
