/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditAction.java,v 1.2.2.1 2011/08/12 09:21:12 sbouchet Exp $
 */
package org.eclipse.emf.eef.modelingBot.EEFActions;

import org.eclipse.emf.eef.components.PropertiesEditionElement;

import org.eclipse.emf.eef.extended.editor.ReferenceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getPropertiesEditionElement <em>Properties Edition Element</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getReferenceableObject <em>Referenceable Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getEditAction()
 * @model abstract="true"
 * @generated
 */
public interface EditAction extends EEFAction, ReferenceableObject {
	/**
	 * Returns the value of the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Edition Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Edition Element</em>' reference.
	 * @see #setPropertiesEditionElement(PropertiesEditionElement)
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getEditAction_PropertiesEditionElement()
	 * @model
	 * @generated
	 */
	PropertiesEditionElement getPropertiesEditionElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getPropertiesEditionElement <em>Properties Edition Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Edition Element</em>' reference.
	 * @see #getPropertiesEditionElement()
	 * @generated
	 */
	void setPropertiesEditionElement(PropertiesEditionElement value);

	/**
	 * Returns the value of the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenceable Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenceable Object</em>' reference.
	 * @see #setReferenceableObject(ReferenceableObject)
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage#getEditAction_ReferenceableObject()
	 * @model
	 * @generated
	 */
	ReferenceableObject getReferenceableObject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getReferenceableObject <em>Referenceable Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenceable Object</em>' reference.
	 * @see #getReferenceableObject()
	 * @generated
	 */
	void setReferenceableObject(ReferenceableObject value);

} // EditAction
