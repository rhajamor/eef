/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.ForFilters;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersFactory;
import org.eclipse.emf.eef.nonreg.subPackageNonRegForFilters.SubPackageNonRegForFiltersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackageNonRegForFiltersFactoryImpl extends EFactoryImpl implements SubPackageNonRegForFiltersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubPackageNonRegForFiltersFactory init() {
		try {
			SubPackageNonRegForFiltersFactory theSubPackageNonRegForFiltersFactory = (SubPackageNonRegForFiltersFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/properties/1.0.0/SubPackageNonReg"); 
			if (theSubPackageNonRegForFiltersFactory != null) {
				return theSubPackageNonRegForFiltersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubPackageNonRegForFiltersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageNonRegForFiltersFactoryImpl() {
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
			case SubPackageNonRegForFiltersPackage.FOR_FILTERS: return createForFilters();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForFilters createForFilters() {
		ForFiltersImpl forFilters = new ForFiltersImpl();
		return forFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPackageNonRegForFiltersPackage getSubPackageNonRegForFiltersPackage() {
		return (SubPackageNonRegForFiltersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubPackageNonRegForFiltersPackage getPackage() {
		return SubPackageNonRegForFiltersPackage.eINSTANCE;
	}

} //SubPackageNonRegForFiltersFactoryImpl
