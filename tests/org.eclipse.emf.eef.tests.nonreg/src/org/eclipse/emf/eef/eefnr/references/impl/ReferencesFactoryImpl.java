/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencesFactoryImpl.java,v 1.1.2.1 2010/08/30 08:48:25 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.references.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnr.references.ReferenceEnabledSample;
import org.eclipse.emf.eef.eefnr.references.ReferencesFactory;
import org.eclipse.emf.eef.eefnr.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesFactoryImpl extends EFactoryImpl implements ReferencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferencesFactory init() {
		try {
			ReferencesFactory theReferencesFactory = (ReferencesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/nonreg/references/1.0.0"); 
			if (theReferencesFactory != null) {
				return theReferencesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReferencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesFactoryImpl() {
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
			case ReferencesPackage.REFERENCE_ENABLED_SAMPLE: return createReferenceEnabledSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceEnabledSample createReferenceEnabledSample() {
		ReferenceEnabledSampleImpl referenceEnabledSample = new ReferenceEnabledSampleImpl();
		return referenceEnabledSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesPackage getReferencesPackage() {
		return (ReferencesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReferencesPackage getPackage() {
		return ReferencesPackage.eINSTANCE;
	}

} //ReferencesFactoryImpl
