/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomNamingPackage.java,v 1.2 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.naming;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

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
 * @see org.eclipse.emf.eef.eefnr.naming.CustomNamingFactory
 * @model kind="package"
 * @generated
 */
public interface CustomNamingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "naming";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/nonreg/naming/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eefnr-name";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomNamingPackage eINSTANCE = org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.eefnr.naming.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.eefnr.naming.impl.EventImpl
	 * @see org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = EefnrPackage.ABSTRACT_SAMPLE__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = EefnrPackage.ABSTRACT_SAMPLE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.eefnr.naming.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eclipse.emf.eef.eefnr.naming.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomNamingFactory getCustomNamingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.eefnr.naming.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.eefnr.naming.impl.EventImpl
		 * @see org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

	}

} //CustomNamingPackage
