/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfaceFactory.java,v 1.1.2.1 2011/10/26 16:16:45 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.interface_;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.interface_.InterfacePackage
 * @generated
 */
public interface InterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceFactory eINSTANCE = org.eclipse.emf.eef.eefnr.interface_.impl.InterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sample</em>'.
	 * @generated
	 */
	SimpleSample createSimpleSample();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterfacePackage getInterfacePackage();

} //InterfaceFactory
