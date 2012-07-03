/**
 * <copyright>
 * </copyright>
 *
 * $Id: EefnrextAdapterFactory.java,v 1.2 2011/11/14 15:01:16 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnrext.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample;
import org.eclipse.emf.eef.eefnrext.*;
import org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;
import org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnrext.EefnrextPackage
 * @generated
 */
public class EefnrextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EefnrextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefnrextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EefnrextPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EefnrextSwitch<Adapter> modelSwitch =
		new EefnrextSwitch<Adapter>() {
			@Override
			public Adapter caseTableCompositionTargetExtensionEditorSample(TableCompositionTargetExtensionEditorSample object) {
				return createTableCompositionTargetExtensionEditorSampleAdapter();
			}
			@Override
			public Adapter caseFlatReferenceExtendedEditorSample(FlatReferenceExtendedEditorSample object) {
				return createFlatReferenceExtendedEditorSampleAdapter();
			}
			@Override
			public Adapter caseCheckBoxExtendedEditorSample(CheckBoxExtendedEditorSample object) {
				return createCheckBoxExtendedEditorSampleAdapter();
			}
			@Override
			public Adapter caseAbstractSample(AbstractSample object) {
				return createAbstractSampleAdapter();
			}
			@Override
			public Adapter caseAbstractTableCompositionTargetExtensionEditorSample(AbstractTableCompositionTargetExtensionEditorSample object) {
				return createAbstractTableCompositionTargetExtensionEditorSampleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample <em>Table Composition Target Extension Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnrext.TableCompositionTargetExtensionEditorSample
	 * @generated
	 */
	public Adapter createTableCompositionTargetExtensionEditorSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample <em>Flat Reference Extended Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample
	 * @generated
	 */
	public Adapter createFlatReferenceExtendedEditorSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample <em>Check Box Extended Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnrext.CheckBoxExtendedEditorSample
	 * @generated
	 */
	public Adapter createCheckBoxExtendedEditorSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.AbstractSample <em>Abstract Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.AbstractSample
	 * @generated
	 */
	public Adapter createAbstractSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample <em>Abstract Table Composition Target Extension Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample
	 * @generated
	 */
	public Adapter createAbstractTableCompositionTargetExtensionEditorSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EefnrextAdapterFactory
