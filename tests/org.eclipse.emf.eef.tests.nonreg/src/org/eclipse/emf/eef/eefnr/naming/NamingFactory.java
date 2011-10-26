/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamingFactory.java,v 1.1.2.1 2011/10/26 16:16:45 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.naming;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.naming.NamingPackage
 * @generated
 */
public interface NamingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NamingFactory eINSTANCE = org.eclipse.emf.eef.eefnr.naming.impl.NamingFactoryImpl.init();

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
	NamingPackage getNamingPackage();

} //NamingFactory
