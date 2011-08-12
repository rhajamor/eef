/**
 * <copyright>
 * </copyright>
 *
 * $Id: EclipseActionsSwitch.java,v 1.1.2.1 2011/08/12 09:21:12 sbouchet Exp $
 */
package org.eclipse.emf.eef.modelingBot.EclipseActions.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.extended.editor.ReferenceableObject;
import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.DocumentedElement;

import org.eclipse.emf.eef.modelingBot.EclipseActions.*;
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
 * @see org.eclipse.emf.eef.modelingBot.EclipseActions.EclipseActionsPackage
 * @generated
 */
public class EclipseActionsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EclipseActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = EclipseActionsPackage.eINSTANCE;
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
			case EclipseActionsPackage.ECLIPSE_ACTION: {
				EclipseAction eclipseAction = (EclipseAction)theEObject;
				T result = caseEclipseAction(eclipseAction);
				if (result == null) result = caseAction(eclipseAction);
				if (result == null) result = caseDocumentedElement(eclipseAction);
				if (result == null) result = caseProcessing(eclipseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.CREATE_PROJECT: {
				CreateProject createProject = (CreateProject)theEObject;
				T result = caseCreateProject(createProject);
				if (result == null) result = caseEclipseAction(createProject);
				if (result == null) result = caseAction(createProject);
				if (result == null) result = caseDocumentedElement(createProject);
				if (result == null) result = caseProcessing(createProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.OPEN_PERSPECTIVE: {
				OpenPerspective openPerspective = (OpenPerspective)theEObject;
				T result = caseOpenPerspective(openPerspective);
				if (result == null) result = caseEclipseAction(openPerspective);
				if (result == null) result = caseAction(openPerspective);
				if (result == null) result = caseDocumentedElement(openPerspective);
				if (result == null) result = caseProcessing(openPerspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.CLOSE_PROJECT: {
				CloseProject closeProject = (CloseProject)theEObject;
				T result = caseCloseProject(closeProject);
				if (result == null) result = caseEclipseAction(closeProject);
				if (result == null) result = caseAction(closeProject);
				if (result == null) result = caseDocumentedElement(closeProject);
				if (result == null) result = caseProcessing(closeProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.SAVE: {
				Save save = (Save)theEObject;
				T result = caseSave(save);
				if (result == null) result = caseEclipseAction(save);
				if (result == null) result = caseAction(save);
				if (result == null) result = caseDocumentedElement(save);
				if (result == null) result = caseProcessing(save);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.UNDO: {
				Undo undo = (Undo)theEObject;
				T result = caseUndo(undo);
				if (result == null) result = caseEclipseAction(undo);
				if (result == null) result = caseAction(undo);
				if (result == null) result = caseDocumentedElement(undo);
				if (result == null) result = caseProcessing(undo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.REDO: {
				Redo redo = (Redo)theEObject;
				T result = caseRedo(redo);
				if (result == null) result = caseEclipseAction(redo);
				if (result == null) result = caseAction(redo);
				if (result == null) result = caseDocumentedElement(redo);
				if (result == null) result = caseProcessing(redo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.OPEN_PROJECT: {
				OpenProject openProject = (OpenProject)theEObject;
				T result = caseOpenProject(openProject);
				if (result == null) result = caseEclipseAction(openProject);
				if (result == null) result = caseAction(openProject);
				if (result == null) result = caseDocumentedElement(openProject);
				if (result == null) result = caseProcessing(openProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.REMOVE_PROJECT: {
				RemoveProject removeProject = (RemoveProject)theEObject;
				T result = caseRemoveProject(removeProject);
				if (result == null) result = caseEclipseAction(removeProject);
				if (result == null) result = caseAction(removeProject);
				if (result == null) result = caseDocumentedElement(removeProject);
				if (result == null) result = caseProcessing(removeProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.CLOSE_EDITOR: {
				CloseEditor closeEditor = (CloseEditor)theEObject;
				T result = caseCloseEditor(closeEditor);
				if (result == null) result = caseEclipseAction(closeEditor);
				if (result == null) result = caseAction(closeEditor);
				if (result == null) result = caseDocumentedElement(closeEditor);
				if (result == null) result = caseProcessing(closeEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EclipseActionsPackage.CREATE_MODEL: {
				CreateModel createModel = (CreateModel)theEObject;
				T result = caseCreateModel(createModel);
				if (result == null) result = caseEclipseAction(createModel);
				if (result == null) result = caseReferenceableObject(createModel);
				if (result == null) result = caseAction(createModel);
				if (result == null) result = caseDocumentedElement(createModel);
				if (result == null) result = caseProcessing(createModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eclipse Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eclipse Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEclipseAction(EclipseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateProject(CreateProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenPerspective(OpenPerspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseProject(CloseProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Save</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Save</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSave(Save object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndo(Undo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedo(Redo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenProject(OpenProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveProject(RemoveProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseEditor(CloseEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateModel(CreateModel object) {
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

} //EclipseActionsSwitch
