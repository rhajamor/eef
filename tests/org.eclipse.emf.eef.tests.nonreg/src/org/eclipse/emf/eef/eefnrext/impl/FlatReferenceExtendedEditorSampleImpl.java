/**
 * <copyright>
 * </copyright>
 *
 * $Id: FlatReferenceExtendedEditorSampleImpl.java,v 1.2 2011/11/14 15:01:16 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnrext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flat Reference Extended Editor Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl#getFlatReferenceEditorSample <em>Flat Reference Editor Sample</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl#getDemo <em>Demo</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.eefnrext.impl.FlatReferenceExtendedEditorSampleImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlatReferenceExtendedEditorSampleImpl extends CheckBoxExtendedEditorSampleImpl implements FlatReferenceExtendedEditorSample {
	/**
	 * The cached value of the '{@link #getFlatReferenceEditorSample() <em>Flat Reference Editor Sample</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatReferenceEditorSample()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSample> flatReferenceEditorSample;

	/**
	 * The default value of the '{@link #getDemo() <em>Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemo()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDemo() <em>Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemo()
	 * @generated
	 * @ordered
	 */
	protected String demo = DEMO_EDEFAULT;
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatReferenceExtendedEditorSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefnrextPackage.Literals.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSample> getFlatReferenceEditorSample() {
		if (flatReferenceEditorSample == null) {
			flatReferenceEditorSample = new EObjectResolvingEList<AbstractSample>(AbstractSample.class, this, EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE);
		}
		return flatReferenceEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemo() {
		return demo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemo(String newDemo) {
		String oldDemo = demo;
		demo = newDemo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO, oldDemo, demo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE:
				return getFlatReferenceEditorSample();
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO:
				return getDemo();
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE:
				return getSize();
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
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE:
				getFlatReferenceEditorSample().clear();
				getFlatReferenceEditorSample().addAll((Collection<? extends AbstractSample>)newValue);
				return;
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO:
				setDemo((String)newValue);
				return;
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE:
				setSize((Integer)newValue);
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
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE:
				getFlatReferenceEditorSample().clear();
				return;
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO:
				setDemo(DEMO_EDEFAULT);
				return;
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE:
				return flatReferenceEditorSample != null && !flatReferenceEditorSample.isEmpty();
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO:
				return DEMO_EDEFAULT == null ? demo != null : !DEMO_EDEFAULT.equals(demo);
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE:
				return size != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (demo: ");
		result.append(demo);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //FlatReferenceExtendedEditorSampleImpl
