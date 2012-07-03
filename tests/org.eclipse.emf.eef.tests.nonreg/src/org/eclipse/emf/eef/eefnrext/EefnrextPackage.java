/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrextPackage.java,v 1.1 2010/04/15 12:48:57 glefur Exp $
 */
package org.eclipse.emf.eef.eefnrext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnrext.EefnrextFactory
 * @model kind="package"
 * @generated
 */
public interface EefnrextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eefnrext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/extension/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnrext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefnrextPackage eINSTANCE = org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnrext.impl.TableCompositionTargetExtensionEditorSampleImpl <em>Table Composition Target Extension Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnrext.impl.TableCompositionTargetExtensionEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl#getTableCompositionTargetExtensionEditorSample()
	 * @generated
	 */
	int TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE__NAME = EefnrPackage.ABSTRACT_TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE__NAME;

	/**
	 * The number of structural features of the '<em>Table Composition Target Extension Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnrext.impl.CheckBoxExtendedEditorSampleImpl <em>Check Box Extended Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnrext.impl.CheckBoxExtendedEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl#getCheckBoxExtendedEditorSample()
	 * @generated
	 */
	int CHECK_BOX_EXTENDED_EDITOR_SAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_EXTENDED_EDITOR_SAMPLE__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Checkbox Editor Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box Extended Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_EXTENDED_EDITOR_SAMPLE_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl <em>Flat Reference Extended Editor Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl
	 * @see org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl#getFlatReferenceExtendedEditorSample()
	 * @generated
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__NAME = CHECK_BOX_EXTENDED_EDITOR_SAMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Checkbox Editor Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE = CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE;

	/**
	 * The feature id for the '<em><b>Flat Reference Editor Sample</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE = CHECK_BOX_EXTENDED_EDITOR_SAMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO = CHECK_BOX_EXTENDED_EDITOR_SAMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE = CHECK_BOX_EXTENDED_EDITOR_SAMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flat Reference Extended Editor Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE_FEATURE_COUNT = CHECK_BOX_EXTENDED_EDITOR_SAMPLE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample <em>Table Composition Target Extension Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Composition Target Extension Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample
	 * @generated
	 */
	EClass getTableCompositionTargetExtensionEditorSample();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample <em>Flat Reference Extended Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Reference Extended Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample
	 * @generated
	 */
	EClass getFlatReferenceExtendedEditorSample();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample#getFlatReferenceEditorSample <em>Flat Reference Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flat Reference Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample#getFlatReferenceEditorSample()
	 * @see #getFlatReferenceExtendedEditorSample()
	 * @generated
	 */
	EReference getFlatReferenceExtendedEditorSample_FlatReferenceEditorSample();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample#getDemo <em>Demo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demo</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample#getDemo()
	 * @see #getFlatReferenceExtendedEditorSample()
	 * @generated
	 */
	EAttribute getFlatReferenceExtendedEditorSample_Demo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample#getSize()
	 * @see #getFlatReferenceExtendedEditorSample()
	 * @generated
	 */
	EAttribute getFlatReferenceExtendedEditorSample_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample <em>Check Box Extended Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box Extended Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample
	 * @generated
	 */
	EClass getCheckBoxExtendedEditorSample();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample#isCheckboxEditorSample <em>Checkbox Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkbox Editor Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample#isCheckboxEditorSample()
	 * @see #getCheckBoxExtendedEditorSample()
	 * @generated
	 */
	EAttribute getCheckBoxExtendedEditorSample_CheckboxEditorSample();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefnrextFactory getEefnrextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnrext.impl.TableCompositionTargetExtensionEditorSampleImpl <em>Table Composition Target Extension Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnrext.impl.TableCompositionTargetExtensionEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl#getTableCompositionTargetExtensionEditorSample()
		 * @generated
		 */
		EClass TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE = eINSTANCE.getTableCompositionTargetExtensionEditorSample();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl <em>Flat Reference Extended Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl#getFlatReferenceExtendedEditorSample()
		 * @generated
		 */
		EClass FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE = eINSTANCE.getFlatReferenceExtendedEditorSample();
		/**
		 * The meta object literal for the '<em><b>Flat Reference Editor Sample</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE = eINSTANCE.getFlatReferenceExtendedEditorSample_FlatReferenceEditorSample();
		/**
		 * The meta object literal for the '<em><b>Demo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO = eINSTANCE.getFlatReferenceExtendedEditorSample_Demo();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE = eINSTANCE.getFlatReferenceExtendedEditorSample_Size();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnrext.impl.CheckBoxExtendedEditorSampleImpl <em>Check Box Extended Editor Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnrext.impl.CheckBoxExtendedEditorSampleImpl
		 * @see org.eclipse.emf.eef.eefnrext.impl.EefnrextPackageImpl#getCheckBoxExtendedEditorSample()
		 * @generated
		 */
		EClass CHECK_BOX_EXTENDED_EDITOR_SAMPLE = eINSTANCE.getCheckBoxExtendedEditorSample();
		/**
		 * The meta object literal for the '<em><b>Checkbox Editor Sample</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX_EXTENDED_EDITOR_SAMPLE__CHECKBOX_EDITOR_SAMPLE = eINSTANCE.getCheckBoxExtendedEditorSample_CheckboxEditorSample();

	}

} //EefnrextPackage
