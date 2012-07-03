/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrFactory.java,v 1.6 2011/02/22 08:54:40 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.EefnrPackage
 * @generated
 */
public interface EefnrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefnrFactory eINSTANCE = org.eclipse.emf.eef.eefnr.impl.EefnrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Total Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total Sample</em>'.
	 * @generated
	 */
	TotalSample createTotalSample();

	/**
	 * Returns a new object of class '<em>Text Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Sample</em>'.
	 * @generated
	 */
	TextSample createTextSample();

	/**
	 * Returns a new object of class '<em>Checkbox Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkbox Sample</em>'.
	 * @generated
	 */
	CheckboxSample createCheckboxSample();

	/**
	 * Returns a new object of class '<em>Textarea Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textarea Sample</em>'.
	 * @generated
	 */
	TextareaSample createTextareaSample();

	/**
	 * Returns a new object of class '<em>Radio Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Sample</em>'.
	 * @generated
	 */
	RadioSample createRadioSample();

	/**
	 * Returns a new object of class '<em>EObject Flat Combo Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Flat Combo Viewer Sample</em>'.
	 * @generated
	 */
	EObjectFlatComboViewerSample createEObjectFlatComboViewerSample();

	/**
	 * Returns a new object of class '<em>References Table Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>References Table Sample</em>'.
	 * @generated
	 */
	ReferencesTableSample createReferencesTableSample();

	/**
	 * Returns a new object of class '<em>EMF Combo Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Combo Viewer Sample</em>'.
	 * @generated
	 */
	EMFComboViewerSample createEMFComboViewerSample();

	/**
	 * Returns a new object of class '<em>Combo Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Sample</em>'.
	 * @generated
	 */
	ComboSample createComboSample();

	/**
	 * Returns a new object of class '<em>Multi Valued Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Valued Editor Sample</em>'.
	 * @generated
	 */
	MultiValuedEditorSample createMultiValuedEditorSample();

	/**
	 * Returns a new object of class '<em>Table Composition Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Composition Editor Sample</em>'.
	 * @generated
	 */
	TableCompositionEditorSample createTableCompositionEditorSample();

	/**
	 * Returns a new object of class '<em>Advanced References Table Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advanced References Table Sample</em>'.
	 * @generated
	 */
	AdvancedReferencesTableSample createAdvancedReferencesTableSample();

	/**
	 * Returns a new object of class '<em>Advanced EObject Flat Combo Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advanced EObject Flat Combo Viewer Sample</em>'.
	 * @generated
	 */
	AdvancedEObjectFlatComboViewerSample createAdvancedEObjectFlatComboViewerSample();

	/**
	 * Returns a new object of class '<em>Advanced Table Composition Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advanced Table Composition Editor Sample</em>'.
	 * @generated
	 */
	AdvancedTableCompositionEditorSample createAdvancedTableCompositionEditorSample();

	/**
	 * Returns a new object of class '<em>Flat References Table Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat References Table Sample</em>'.
	 * @generated
	 */
	FlatReferencesTableSample createFlatReferencesTableSample();

	/**
	 * Returns a new object of class '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample</em>'.
	 * @generated
	 */
	Sample createSample();

	/**
	 * Returns a new object of class '<em>Text Sample With Two Tabs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Sample With Two Tabs</em>'.
	 * @generated
	 */
	TextSampleWithTwoTabs createTextSampleWithTwoTabs();

	/**
	 * Returns a new object of class '<em>Table Composition Extension Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Composition Extension Editor Sample</em>'.
	 * @generated
	 */
	TableCompositionExtensionEditorSample createTableCompositionExtensionEditorSample();

	/**
	 * Returns a new object of class '<em>Image Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Viewer Sample</em>'.
	 * @generated
	 */
	ImageViewerSample createImageViewerSample();

	/**
	 * Returns a new object of class '<em>Selection Dialog Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Dialog Sample</em>'.
	 * @generated
	 */
	SelectionDialogSample createSelectionDialogSample();

	/**
	 * Returns a new object of class '<em>Single Composition Viewer Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Composition Viewer Sample</em>'.
	 * @generated
	 */
	SingleCompositionViewerSample createSingleCompositionViewerSample();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefnrPackage getEefnrPackage();

} //EefnrFactory
