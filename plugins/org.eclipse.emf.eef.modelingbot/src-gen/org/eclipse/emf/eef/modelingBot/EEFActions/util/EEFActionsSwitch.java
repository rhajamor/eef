/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEFActionsSwitch.java,v 1.1.2.1 2011/08/12 09:21:12 sbouchet Exp $
 */
package org.eclipse.emf.eef.modelingBot.EEFActions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.extended.editor.ReferenceableObject;
import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.DocumentedElement;

import org.eclipse.emf.eef.modelingBot.EEFActions.*;
import org.eclipse.emf.eef.modelingBot.Processing;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsPackage
 * @generated
 */
public class EEFActionsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EEFActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = EEFActionsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EEFActionsPackage.EEF_ACTION: {
				EEFAction eefAction = (EEFAction)theEObject;
				T result = caseEEFAction(eefAction);
				if (result == null) result = caseAction(eefAction);
				if (result == null) result = caseDocumentedElement(eefAction);
				if (result == null) result = caseProcessing(eefAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.EDIT_ACTION: {
				EditAction editAction = (EditAction)theEObject;
				T result = caseEditAction(editAction);
				if (result == null) result = caseEEFAction(editAction);
				if (result == null) result = caseReferenceableObject(editAction);
				if (result == null) result = caseAction(editAction);
				if (result == null) result = caseDocumentedElement(editAction);
				if (result == null) result = caseProcessing(editAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseEditAction(add);
				if (result == null) result = caseEEFAction(add);
				if (result == null) result = caseReferenceableObject(add);
				if (result == null) result = caseAction(add);
				if (result == null) result = caseDocumentedElement(add);
				if (result == null) result = caseProcessing(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.REMOVE: {
				Remove remove = (Remove)theEObject;
				T result = caseRemove(remove);
				if (result == null) result = caseEditAction(remove);
				if (result == null) result = caseEEFAction(remove);
				if (result == null) result = caseReferenceableObject(remove);
				if (result == null) result = caseAction(remove);
				if (result == null) result = caseDocumentedElement(remove);
				if (result == null) result = caseProcessing(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.SET_ATTRIBUTE: {
				SetAttribute setAttribute = (SetAttribute)theEObject;
				T result = caseSetAttribute(setAttribute);
				if (result == null) result = caseEditAction(setAttribute);
				if (result == null) result = caseEEFAction(setAttribute);
				if (result == null) result = caseReferenceableObject(setAttribute);
				if (result == null) result = caseAction(setAttribute);
				if (result == null) result = caseDocumentedElement(setAttribute);
				if (result == null) result = caseProcessing(setAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.UNSET: {
				Unset unset = (Unset)theEObject;
				T result = caseUnset(unset);
				if (result == null) result = caseEditAction(unset);
				if (result == null) result = caseEEFAction(unset);
				if (result == null) result = caseReferenceableObject(unset);
				if (result == null) result = caseAction(unset);
				if (result == null) result = caseDocumentedElement(unset);
				if (result == null) result = caseProcessing(unset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.CANCEL: {
				Cancel cancel = (Cancel)theEObject;
				T result = caseCancel(cancel);
				if (result == null) result = caseEEFAction(cancel);
				if (result == null) result = caseAction(cancel);
				if (result == null) result = caseDocumentedElement(cancel);
				if (result == null) result = caseProcessing(cancel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = caseEEFAction(check);
				if (result == null) result = caseAction(check);
				if (result == null) result = caseDocumentedElement(check);
				if (result == null) result = caseProcessing(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.OPEN_EEF_EDITOR: {
				OpenEEFEditor openEEFEditor = (OpenEEFEditor)theEObject;
				T result = caseOpenEEFEditor(openEEFEditor);
				if (result == null) result = caseEEFAction(openEEFEditor);
				if (result == null) result = caseAction(openEEFEditor);
				if (result == null) result = caseDocumentedElement(openEEFEditor);
				if (result == null) result = caseProcessing(openEEFEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EEFActionsPackage.SET_REFERENCE: {
				SetReference setReference = (SetReference)theEObject;
				T result = caseSetReference(setReference);
				if (result == null) result = caseEditAction(setReference);
				if (result == null) result = caseEEFAction(setReference);
				if (result == null) result = caseReferenceableObject(setReference);
				if (result == null) result = caseAction(setReference);
				if (result == null) result = caseDocumentedElement(setReference);
				if (result == null) result = caseProcessing(setReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFAction(EEFAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditAction(EditAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemove(Remove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAttribute(SetAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnset(Unset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancel(Cancel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open EEF Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open EEF Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenEEFEditor(OpenEEFEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetReference(SetReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedElement(DocumentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessing(Processing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceableObject(ReferenceableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EEFActionsSwitch
