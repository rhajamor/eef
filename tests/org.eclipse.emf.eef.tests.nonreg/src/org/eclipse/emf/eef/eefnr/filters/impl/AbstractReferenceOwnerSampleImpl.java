/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractReferenceOwnerSampleImpl.java,v 1.1 2011/02/01 09:54:40 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.filters.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample;
import org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample;
import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;
import org.eclipse.emf.eef.eefnr.impl.AbstractSampleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Reference Owner Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnr.filters.impl.AbstractReferenceOwnerSampleImpl#getAbstractTarget <em>Abstract Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractReferenceOwnerSampleImpl extends AbstractSampleImpl implements AbstractReferenceOwnerSample {
	/**
	 * The cached value of the '{@link #getAbstractTarget() <em>Abstract Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractReferenceTargetSample> abstractTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractReferenceOwnerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.ABSTRACT_REFERENCE_OWNER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractReferenceTargetSample> getAbstractTarget() {
		if (abstractTarget == null) {
			abstractTarget = new EObjectResolvingEList<AbstractReferenceTargetSample>(AbstractReferenceTargetSample.class, this, FiltersPackage.ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET);
		}
		return abstractTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FiltersPackage.ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET:
				return getAbstractTarget();
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
			case FiltersPackage.ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET:
				getAbstractTarget().clear();
				getAbstractTarget().addAll((Collection<? extends AbstractReferenceTargetSample>)newValue);
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
			case FiltersPackage.ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET:
				getAbstractTarget().clear();
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
			case FiltersPackage.ABSTRACT_REFERENCE_OWNER_SAMPLE__ABSTRACT_TARGET:
				return abstractTarget != null && !abstractTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractReferenceOwnerSampleImpl
