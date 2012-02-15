/**
 * <copyright>
 * </copyright>
 *
 * $Id: FiltersFactoryImpl.java,v 1.1.6.2 2012/02/15 13:37:46 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.filters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnr.filters.*;
import org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample;
import org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample1;
import org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample2;
import org.eclipse.emf.eef.eefnr.filters.FiltersFactory;
import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiltersFactoryImpl extends EFactoryImpl implements FiltersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FiltersFactory init() {
		try {
			FiltersFactory theFiltersFactory = (FiltersFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/nonreg/filters/1.0.0"); 
			if (theFiltersFactory != null) {
				return theFiltersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FiltersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersFactoryImpl() {
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
			case FiltersPackage.CONCRETE_REFERENCE_OWNER_SAMPLE: return createConcreteReferenceOwnerSample();
			case FiltersPackage.CONCRETE_REFERENCE_TARGET_SAMPLE1: return createConcreteReferenceTargetSample1();
			case FiltersPackage.CONCRETE_REFERENCE_TARGET_SAMPLE2: return createConcreteReferenceTargetSample2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteReferenceOwnerSample createConcreteReferenceOwnerSample() {
		ConcreteReferenceOwnerSampleImpl concreteReferenceOwnerSample = new ConcreteReferenceOwnerSampleImpl();
		return concreteReferenceOwnerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteReferenceTargetSample1 createConcreteReferenceTargetSample1() {
		ConcreteReferenceTargetSample1Impl concreteReferenceTargetSample1 = new ConcreteReferenceTargetSample1Impl();
		return concreteReferenceTargetSample1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteReferenceTargetSample2 createConcreteReferenceTargetSample2() {
		ConcreteReferenceTargetSample2Impl concreteReferenceTargetSample2 = new ConcreteReferenceTargetSample2Impl();
		return concreteReferenceTargetSample2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersPackage getFiltersPackage() {
		return (FiltersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FiltersPackage getPackage() {
		return FiltersPackage.eINSTANCE;
	}

} //FiltersFactoryImpl
