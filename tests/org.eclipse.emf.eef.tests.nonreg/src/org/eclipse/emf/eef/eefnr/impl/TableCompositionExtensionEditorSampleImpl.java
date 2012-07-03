/**
 * <copyright>
 * </copyright>
 *
 * $Id: TableCompositionExtensionEditorSampleImpl.java,v 1.1 2010/04/15 12:48:57 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TableCompositionExtensionEditorSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Composition Extension Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TableCompositionExtensionEditorSampleImpl#getTablecompositionRequiredProperty <em>Tablecomposition Required Property</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnr.impl.TableCompositionExtensionEditorSampleImpl#getTablecompositionOptionalProperty <em>Tablecomposition Optional Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableCompositionExtensionEditorSampleImpl extends AbstractSampleImpl implements TableCompositionExtensionEditorSample {
	/**
	 * The cached value of the '{@link #getTablecompositionRequiredProperty() <em>Tablecomposition Required Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablecompositionRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTableCompositionTargetExtensionEditorSample> tablecompositionRequiredProperty;

	/**
	 * The cached value of the '{@link #getTablecompositionOptionalProperty() <em>Tablecomposition Optional Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablecompositionOptionalProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTableCompositionTargetExtensionEditorSample> tablecompositionOptionalProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCompositionExtensionEditorSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTableCompositionTargetExtensionEditorSample> getTablecompositionRequiredProperty() {
		if (tablecompositionRequiredProperty == null) {
			tablecompositionRequiredProperty = new EObjectContainmentEList<AbstractTableCompositionTargetExtensionEditorSample>(AbstractTableCompositionTargetExtensionEditorSample.class, this, EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
		}
		return tablecompositionRequiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTableCompositionTargetExtensionEditorSample> getTablecompositionOptionalProperty() {
		if (tablecompositionOptionalProperty == null) {
			tablecompositionOptionalProperty = new EObjectContainmentEList<AbstractTableCompositionTargetExtensionEditorSample>(AbstractTableCompositionTargetExtensionEditorSample.class, this, EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);
		}
		return tablecompositionOptionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				return ((InternalEList<?>)getTablecompositionRequiredProperty()).basicRemove(otherEnd, msgs);
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				return ((InternalEList<?>)getTablecompositionOptionalProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				return getTablecompositionRequiredProperty();
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				return getTablecompositionOptionalProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				getTablecompositionRequiredProperty().clear();
				getTablecompositionRequiredProperty().addAll((Collection<? extends AbstractTableCompositionTargetExtensionEditorSample>)newValue);
				return;
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				getTablecompositionOptionalProperty().clear();
				getTablecompositionOptionalProperty().addAll((Collection<? extends AbstractTableCompositionTargetExtensionEditorSample>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				getTablecompositionRequiredProperty().clear();
				return;
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				getTablecompositionOptionalProperty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
				return tablecompositionRequiredProperty != null && !tablecompositionRequiredProperty.isEmpty();
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
				return tablecompositionOptionalProperty != null && !tablecompositionOptionalProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableCompositionExtensionEditorSampleImpl
