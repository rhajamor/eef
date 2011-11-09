/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrextFactoryImpl.java,v 1.1.8.1 2011/11/09 10:11:51 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnrext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextFactory;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefnrextFactoryImpl extends EFactoryImpl implements EefnrextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EefnrextFactory init() {
		try {
			EefnrextFactory theEefnrextFactory = (EefnrextFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/nonreg/extension/1.0.0"); 
			if (theEefnrextFactory != null) {
				return theEefnrextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefnrextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrextFactoryImpl() {
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
			case EefnrextPackage.TABLE_COMPOSITION_TARGET_EXTENSION_EDITOR_SAMPLE: return createTableCompositionTargetExtensionEditorSample();
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE: return createFlatReferenceExtendedEditorSample();
			case EefnrextPackage.CHECK_BOX_EXTENDED_EDITOR_SAMPLE: return createCheckBoxExtendedEditorSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCompositionTargetExtensionEditorSample createTableCompositionTargetExtensionEditorSample() {
		TableCompositionTargetExtensionEditorSampleImpl tableCompositionTargetExtensionEditorSample = new TableCompositionTargetExtensionEditorSampleImpl();
		return tableCompositionTargetExtensionEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatReferenceExtendedEditorSample createFlatReferenceExtendedEditorSample() {
		FlatReferenceExtendedEditorSampleImpl flatReferenceExtendedEditorSample = new FlatReferenceExtendedEditorSampleImpl();
		return flatReferenceExtendedEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBoxExtendedEditorSample createCheckBoxExtendedEditorSample() {
		CheckBoxExtendedEditorSampleImpl checkBoxExtendedEditorSample = new CheckBoxExtendedEditorSampleImpl();
		return checkBoxExtendedEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrextPackage getEefnrextPackage() {
		return (EefnrextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefnrextPackage getPackage() {
		return EefnrextPackage.eINSTANCE;
	}

} //EefnrextFactoryImpl
