/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrSwitch.java,v 1.7.6.1 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.eef.eefnr.*;

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
 * @see org.eclipse.emf.eef.eefnr.EefnrPackage
 * @generated
 */
public class EefnrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EefnrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrSwitch() {
		if (modelPackage == null) {
			modelPackage = EefnrPackage.eINSTANCE;
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
			case EefnrPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.ABSTRACT_SAMPLE: {
				AbstractSample abstractSample = (AbstractSample)theEObject;
				T result = caseAbstractSample(abstractSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.TOTAL_SAMPLE: {
				TotalSample totalSample = (TotalSample)theEObject;
				T result = caseTotalSample(totalSample);
				if (result == null) result = caseAbstractSample(totalSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.TEXT_SAMPLE: {
				TextSample textSample = (TextSample)theEObject;
				T result = caseTextSample(textSample);
				if (result == null) result = caseAbstractSample(textSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.CHECKBOX_SAMPLE: {
				CheckboxSample checkboxSample = (CheckboxSample)theEObject;
				T result = caseCheckboxSample(checkboxSample);
				if (result == null) result = caseAbstractSample(checkboxSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.TEXTAREA_SAMPLE: {
				TextareaSample textareaSample = (TextareaSample)theEObject;
				T result = caseTextareaSample(textareaSample);
				if (result == null) result = caseAbstractSample(textareaSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.RADIO_SAMPLE: {
				RadioSample radioSample = (RadioSample)theEObject;
				T result = caseRadioSample(radioSample);
				if (result == null) result = caseAbstractSample(radioSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE: {
				EObjectFlatComboViewerSample eObjectFlatComboViewerSample = (EObjectFlatComboViewerSample)theEObject;
				T result = caseEObjectFlatComboViewerSample(eObjectFlatComboViewerSample);
				if (result == null) result = caseAbstractSample(eObjectFlatComboViewerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.REFERENCES_TABLE_SAMPLE: {
				ReferencesTableSample referencesTableSample = (ReferencesTableSample)theEObject;
				T result = caseReferencesTableSample(referencesTableSample);
				if (result == null) result = caseAbstractSample(referencesTableSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE: {
				EMFComboViewerSample emfComboViewerSample = (EMFComboViewerSample)theEObject;
				T result = caseEMFComboViewerSample(emfComboViewerSample);
				if (result == null) result = caseAbstractSample(emfComboViewerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE: {
				MultiValuedEditorSample multiValuedEditorSample = (MultiValuedEditorSample)theEObject;
				T result = caseMultiValuedEditorSample(multiValuedEditorSample);
				if (result == null) result = caseAbstractSample(multiValuedEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.TABLE_COMPOSITION_EDITOR_SAMPLE: {
				TableCompositionEditorSample tableCompositionEditorSample = (TableCompositionEditorSample)theEObject;
				T result = caseTableCompositionEditorSample(tableCompositionEditorSample);
				if (result == null) result = caseAbstractSample(tableCompositionEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE: {
				AdvancedReferencesTableSample advancedReferencesTableSample = (AdvancedReferencesTableSample)theEObject;
				T result = caseAdvancedReferencesTableSample(advancedReferencesTableSample);
				if (result == null) result = caseAbstractSample(advancedReferencesTableSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE: {
				AdvancedEObjectFlatComboViewerSample advancedEObjectFlatComboViewerSample = (AdvancedEObjectFlatComboViewerSample)theEObject;
				T result = caseAdvancedEObjectFlatComboViewerSample(advancedEObjectFlatComboViewerSample);
				if (result == null) result = caseAbstractSample(advancedEObjectFlatComboViewerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.ADVANCED_TABLE_COMPOSITION_EDITOR_SAMPLE: {
				AdvancedTableCompositionEditorSample advancedTableCompositionEditorSample = (AdvancedTableCompositionEditorSample)theEObject;
				T result = caseAdvancedTableCompositionEditorSample(advancedTableCompositionEditorSample);
				if (result == null) result = caseAbstractSample(advancedTableCompositionEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE: {
				FlatReferencesTableSample flatReferencesTableSample = (FlatReferencesTableSample)theEObject;
				T result = caseFlatReferencesTableSample(flatReferencesTableSample);
				if (result == null) result = caseAbstractSample(flatReferencesTableSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.SAMPLE: {
				Sample sample = (Sample)theEObject;
				T result = caseSample(sample);
				if (result == null) result = caseAbstractSample(sample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS: {
				TextSampleWithTwoTabs textSampleWithTwoTabs = (TextSampleWithTwoTabs)theEObject;
				T result = caseTextSampleWithTwoTabs(textSampleWithTwoTabs);
				if (result == null) result = caseAbstractSample(textSampleWithTwoTabs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE: {
				TableCompositionExtensionEditorSample tableCompositionExtensionEditorSample = (TableCompositionExtensionEditorSample)theEObject;
				T result = caseTableCompositionExtensionEditorSample(tableCompositionExtensionEditorSample);
				if (result == null) result = caseAbstractSample(tableCompositionExtensionEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.ABSTRACT_TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE: {
				AbstractTableCompositionTargetExtensionEditorSample abstractTableCompositionTargetExtensionEditorSample = (AbstractTableCompositionTargetExtensionEditorSample)theEObject;
				T result = caseAbstractTableCompositionTargetExtensionEditorSample(abstractTableCompositionTargetExtensionEditorSample);
				if (result == null) result = caseAbstractSample(abstractTableCompositionTargetExtensionEditorSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseAbstractSample(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.IMAGE_VIEWER_SAMPLE: {
				ImageViewerSample imageViewerSample = (ImageViewerSample)theEObject;
				T result = caseImageViewerSample(imageViewerSample);
				if (result == null) result = caseAbstractSample(imageViewerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.SELECTION_DIALOG_SAMPLE: {
				SelectionDialogSample selectionDialogSample = (SelectionDialogSample)theEObject;
				T result = caseSelectionDialogSample(selectionDialogSample);
				if (result == null) result = caseAbstractSample(selectionDialogSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE: {
				SingleCompositionViewerSample singleCompositionViewerSample = (SingleCompositionViewerSample)theEObject;
				T result = caseSingleCompositionViewerSample(singleCompositionViewerSample);
				if (result == null) result = caseAbstractSample(singleCompositionViewerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Total Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalSample(TotalSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSample(TextSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckboxSample(CheckboxSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textarea Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textarea Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextareaSample(TextareaSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioSample(RadioSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Flat Combo Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Flat Combo Viewer Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectFlatComboViewerSample(EObjectFlatComboViewerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Table Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Table Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesTableSample(ReferencesTableSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Combo Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Combo Viewer Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFComboViewerSample(EMFComboViewerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Valued Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Valued Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiValuedEditorSample(MultiValuedEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Composition Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Composition Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCompositionEditorSample(TableCompositionEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advanced References Table Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advanced References Table Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvancedReferencesTableSample(AdvancedReferencesTableSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advanced EObject Flat Combo Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advanced EObject Flat Combo Viewer Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvancedEObjectFlatComboViewerSample(AdvancedEObjectFlatComboViewerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advanced Table Composition Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advanced Table Composition Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvancedTableCompositionEditorSample(AdvancedTableCompositionEditorSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat References Table Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat References Table Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatReferencesTableSample(FlatReferencesTableSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSample(Sample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Sample With Two Tabs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Sample With Two Tabs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSampleWithTwoTabs(TextSampleWithTwoTabs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Composition Extension Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Composition Extension Editor Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCompositionExtensionEditorSample(TableCompositionExtensionEditorSample object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Viewer Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageViewerSample(ImageViewerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Dialog Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Dialog Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionDialogSample(SelectionDialogSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Composition Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Composition Viewer Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleCompositionViewerSample(SingleCompositionViewerSample object) {
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

} //EefnrSwitch
