/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrFactoryImpl.java,v 1.7 2011/11/14 15:01:16 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnr.*;
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.AdvancedReferencesTableSample;
import org.eclipse.emf.eef.eefnr.AdvancedTableCompositionEditorSample;
import org.eclipse.emf.eef.eefnr.CheckboxSample;
import org.eclipse.emf.eef.eefnr.ComboSample;
import org.eclipse.emf.eef.eefnr.EMFComboViewerSample;
import org.eclipse.emf.eef.eefnr.ENUM_SAMPLE;
import org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.FlatReferencesTableSample;
import org.eclipse.emf.eef.eefnr.ImageViewerSample;
import org.eclipse.emf.eef.eefnr.MultiValuedEditorSample;
import org.eclipse.emf.eef.eefnr.RadioSample;
import org.eclipse.emf.eef.eefnr.ReferencesTableSample;
import org.eclipse.emf.eef.eefnr.Root;
import org.eclipse.emf.eef.eefnr.Sample;
import org.eclipse.emf.eef.eefnr.SelectionDialogSample;
import org.eclipse.emf.eef.eefnr.SingleCompositionViewerSample;
import org.eclipse.emf.eef.eefnr.TableCompositionEditorSample;
import org.eclipse.emf.eef.eefnr.TableCompositionExtensionEditorSample;
import org.eclipse.emf.eef.eefnr.TextSample;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;
import org.eclipse.emf.eef.eefnr.TextareaSample;
import org.eclipse.emf.eef.eefnr.TotalSample;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefnrFactoryImpl extends EFactoryImpl implements EefnrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EefnrFactory init() {
		try {
			EefnrFactory theEefnrFactory = (EefnrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/nonreg/1.0.0"); 
			if (theEefnrFactory != null) {
				return theEefnrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefnrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EefnrPackage.ROOT: return createRoot();
			case EefnrPackage.TOTAL_SAMPLE: return createTotalSample();
			case EefnrPackage.TEXT_SAMPLE: return createTextSample();
			case EefnrPackage.CHECKBOX_SAMPLE: return createCheckboxSample();
			case EefnrPackage.TEXTAREA_SAMPLE: return createTextareaSample();
			case EefnrPackage.RADIO_SAMPLE: return createRadioSample();
			case EefnrPackage.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE: return createEObjectFlatComboViewerSample();
			case EefnrPackage.REFERENCES_TABLE_SAMPLE: return createReferencesTableSample();
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE: return createEMFComboViewerSample();
			case EefnrPackage.COMBO_SAMPLE: return createComboSample();
			case EefnrPackage.MULTI_VALUED_EDITOR_SAMPLE: return createMultiValuedEditorSample();
			case EefnrPackage.TABLE_COMPOSITION_EDITOR_SAMPLE: return createTableCompositionEditorSample();
			case EefnrPackage.ADVANCED_REFERENCES_TABLE_SAMPLE: return createAdvancedReferencesTableSample();
			case EefnrPackage.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE: return createAdvancedEObjectFlatComboViewerSample();
			case EefnrPackage.ADVANCED_TABLE_COMPOSITION_EDITOR_SAMPLE: return createAdvancedTableCompositionEditorSample();
			case EefnrPackage.FLAT_REFERENCES_TABLE_SAMPLE: return createFlatReferencesTableSample();
			case EefnrPackage.SAMPLE: return createSample();
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS: return createTextSampleWithTwoTabs();
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE: return createTableCompositionExtensionEditorSample();
			case EefnrPackage.IMAGE_VIEWER_SAMPLE: return createImageViewerSample();
			case EefnrPackage.SELECTION_DIALOG_SAMPLE: return createSelectionDialogSample();
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE: return createSingleCompositionViewerSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EefnrPackage.ENUM_SAMPLE:
				return createENUM_SAMPLEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EefnrPackage.ENUM_SAMPLE:
				return convertENUM_SAMPLEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSample createTotalSample() {
		TotalSampleImpl totalSample = new TotalSampleImpl();
		return totalSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSample createTextSample() {
		TextSampleImpl textSample = new TextSampleImpl();
		return textSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckboxSample createCheckboxSample() {
		CheckboxSampleImpl checkboxSample = new CheckboxSampleImpl();
		return checkboxSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaSample createTextareaSample() {
		TextareaSampleImpl textareaSample = new TextareaSampleImpl();
		return textareaSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioSample createRadioSample() {
		RadioSampleImpl radioSample = new RadioSampleImpl();
		return radioSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectFlatComboViewerSample createEObjectFlatComboViewerSample() {
		EObjectFlatComboViewerSampleImpl eObjectFlatComboViewerSample = new EObjectFlatComboViewerSampleImpl();
		return eObjectFlatComboViewerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesTableSample createReferencesTableSample() {
		ReferencesTableSampleImpl referencesTableSample = new ReferencesTableSampleImpl();
		return referencesTableSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFComboViewerSample createEMFComboViewerSample() {
		EMFComboViewerSampleImpl emfComboViewerSample = new EMFComboViewerSampleImpl();
		return emfComboViewerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboSample createComboSample() {
		ComboSampleImpl comboSample = new ComboSampleImpl();
		return comboSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiValuedEditorSample createMultiValuedEditorSample() {
		MultiValuedEditorSampleImpl multiValuedEditorSample = new MultiValuedEditorSampleImpl();
		return multiValuedEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCompositionEditorSample createTableCompositionEditorSample() {
		TableCompositionEditorSampleImpl tableCompositionEditorSample = new TableCompositionEditorSampleImpl();
		return tableCompositionEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvancedReferencesTableSample createAdvancedReferencesTableSample() {
		AdvancedReferencesTableSampleImpl advancedReferencesTableSample = new AdvancedReferencesTableSampleImpl();
		return advancedReferencesTableSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvancedEObjectFlatComboViewerSample createAdvancedEObjectFlatComboViewerSample() {
		AdvancedEObjectFlatComboViewerSampleImpl advancedEObjectFlatComboViewerSample = new AdvancedEObjectFlatComboViewerSampleImpl();
		return advancedEObjectFlatComboViewerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvancedTableCompositionEditorSample createAdvancedTableCompositionEditorSample() {
		AdvancedTableCompositionEditorSampleImpl advancedTableCompositionEditorSample = new AdvancedTableCompositionEditorSampleImpl();
		return advancedTableCompositionEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatReferencesTableSample createFlatReferencesTableSample() {
		FlatReferencesTableSampleImpl flatReferencesTableSample = new FlatReferencesTableSampleImpl();
		return flatReferencesTableSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample createSample() {
		SampleImpl sample = new SampleImpl();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSampleWithTwoTabs createTextSampleWithTwoTabs() {
		TextSampleWithTwoTabsImpl textSampleWithTwoTabs = new TextSampleWithTwoTabsImpl();
		return textSampleWithTwoTabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCompositionExtensionEditorSample createTableCompositionExtensionEditorSample() {
		TableCompositionExtensionEditorSampleImpl tableCompositionExtensionEditorSample = new TableCompositionExtensionEditorSampleImpl();
		return tableCompositionExtensionEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageViewerSample createImageViewerSample() {
		ImageViewerSampleImpl imageViewerSample = new ImageViewerSampleImpl();
		return imageViewerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDialogSample createSelectionDialogSample() {
		SelectionDialogSampleImpl selectionDialogSample = new SelectionDialogSampleImpl();
		return selectionDialogSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleCompositionViewerSample createSingleCompositionViewerSample() {
		SingleCompositionViewerSampleImpl singleCompositionViewerSample = new SingleCompositionViewerSampleImpl();
		return singleCompositionViewerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUM_SAMPLE createENUM_SAMPLEFromString(EDataType eDataType, String initialValue) {
		ENUM_SAMPLE result = ENUM_SAMPLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUM_SAMPLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrPackage getEefnrPackage() {
		return (EefnrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefnrPackage getPackage() {
		return EefnrPackage.eINSTANCE;
	}

} //EefnrFactoryImpl
