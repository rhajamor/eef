/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomNamingFactory.java,v 1.2.2.4 2012/02/15 13:37:46 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.naming;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.naming.CustomNamingPackage
 * @generated
 */
public interface CustomNamingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomNamingFactory eINSTANCE = org.eclipse.emf.eef.eefnr.naming.impl.CustomNamingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomNamingPackage getCustomNamingPackage();

} //CustomNamingFactory
