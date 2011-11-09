/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfacePackage.java,v 1.1.4.2 2011/11/09 10:11:50 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.interface_;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.emf.eef.eefnr.interface_.InterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface InterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/interface/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnr-int";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacePackage eINSTANCE = org.eclipse.emf.eef.eefnr.interface_.impl.InterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.interface_.impl.SimpleSampleImpl <em>Simple Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.interface_.impl.SimpleSampleImpl
	 * @see org.eclipse.emf.eef.eefnr.interface_.impl.InterfacePackageImpl#getSimpleSample()
	 * @generated
	 */
	int SIMPLE_SAMPLE = 0;

	/**
	 * The number of structural features of the '<em>Simple Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SAMPLE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.interface_.SimpleSample <em>Simple Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sample</em>'.
	 * @see org.eclipse.emf.eef.eefnr.interface_.SimpleSample
	 * @generated
	 */
	EClass getSimpleSample();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceFactory getInterfaceFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.interface_.impl.SimpleSampleImpl <em>Simple Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.interface_.impl.SimpleSampleImpl
		 * @see org.eclipse.emf.eef.eefnr.interface_.impl.InterfacePackageImpl#getSimpleSample()
		 * @generated
		 */
		EClass SIMPLE_SAMPLE = eINSTANCE.getSimpleSample();

	}

} //InterfacePackage
