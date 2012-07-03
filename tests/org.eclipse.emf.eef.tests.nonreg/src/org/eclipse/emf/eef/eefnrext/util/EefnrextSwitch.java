/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrextSwitch.java,v 1.3 2011/11/14 15:01:16 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnrext.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample;
import org.eclipse.emf.eef.eefnrext.*;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample;


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
 * @see org.eclipse.emf.eef.eefnrext.EefnrextPackage
 * @generated
 */
public class EefnrextSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EefnrextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrextSwitch() {
		if (modelPackage == null) {
			modelPackage = EefnrextPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EefnrextPackage.TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE: {
				TableCompositionTargetExtensionEditorSample tableCompositionTargetExtensionEditorSample = (TableCompositionTargetExtensionEditorSample)theEObject;
				T result = caseTableCompositionTargetExtensionEditorSample(tableCompositionTargetExtensionEditorSample);
				if (result == null) result = caseAbstractTableCompositionTargetExtensionEditorSample(tableCompositionTargetExtensionEditorSample);
				if (result == null) result = caseAbstractSample(tableCompositionTargetExtensionEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE: {
				FlatReferenceExtendedEditorSample flatReferenceExtendedEditorSample = (FlatReferenceExtendedEditorSample)theEObject;
				T result = caseFlatReferenceExtendedEditorSample(flatReferenceExtendedEditorSample);
				if (result == null) result = caseCheckBoxExtendedEditorSample(flatReferenceExtendedEditorSample);
				if (result == null) result = caseAbstractSample(flatReferenceExtendedEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE: {
				CheckBoxExtendedEditorSample checkBoxExtendedEditorSample = (CheckBoxExtendedEditorSample)theEObject;
				T result = caseCheckBoxExtendedEditorSample(checkBoxExtendedEditorSample);
				if (result == null) result = caseAbstractSample(checkBoxExtendedEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Composition Target Extension Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Composition Target Extension Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCompositionTargetExtensionEditorSample(TableCompositionTargetExtensionEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Reference Extended Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Reference Extended Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatReferenceExtendedEditorSample(FlatReferenceExtendedEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box Extended Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box Extended Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBoxExtendedEditorSample(CheckBoxExtendedEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSample(AbstractSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Table Composition Target Extension Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Table Composition Target Extension Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTableCompositionTargetExtensionEditorSample(AbstractTableCompositionTargetExtensionEditorSample object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EefnrextSwitch
