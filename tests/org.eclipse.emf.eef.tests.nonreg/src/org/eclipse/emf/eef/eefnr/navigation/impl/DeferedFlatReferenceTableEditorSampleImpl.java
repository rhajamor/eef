/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeferedFlatReferenceTableEditorSampleImpl.java,v 1.1.2.1 2010/08/30 08:48:25 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.eef.eefnr.impl.AbstractSampleImpl;
import org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReference;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defered Flat Reference Table Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.navigation.impl.DeferedFlatReferenceTableEditorSampleImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeferedFlatReferenceTableEditorSampleImpl extends AbstractSampleImpl implements DeferedFlatReferenceTableEditorSample {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DeferedReference> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferedFlatReferenceTableEditorSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeferedReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<DeferedReference>(DeferedReference.class, this, NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES:
				return getReferences();
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
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends DeferedReference>)newValue);
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
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES:
				getReferences().clear();
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
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE__REFERENCES:
				return references != null && !references.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeferedFlatReferenceTableEditorSampleImpl
