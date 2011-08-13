/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationFactory.java,v 1.4.6.1 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage
 * @generated
 */
public interface NavigationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NavigationFactory eINSTANCE = org.eclipse.emf.eef.eefnr.navigation.impl.NavigationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Defered Flat Reference Table Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defered Flat Reference Table Editor Sample</em>'.
	 * @generated
	 */
	DeferedFlatReferenceTableEditorSample createDeferedFlatReferenceTableEditorSample();

	/**
	 * Returns a new object of class '<em>Defered Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defered Reference</em>'.
	 * @generated
	 */
	DeferedReference createDeferedReference();

	/**
	 * Returns a new object of class '<em>Defered Reference Table Editor Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defered Reference Table Editor Sample</em>'.
	 * @generated
	 */
	DeferedReferenceTableEditorSample createDeferedReferenceTableEditorSample();

	/**
	 * Returns a new object of class '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owner</em>'.
	 * @generated
	 */
	Owner createOwner();

	/**
	 * Returns a new object of class '<em>Multiple Referencer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Referencer</em>'.
	 * @generated
	 */
	MultipleReferencer createMultipleReferencer();

	/**
	 * Returns a new object of class '<em>Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype</em>'.
	 * @generated
	 */
	Subtype createSubtype();

	/**
	 * Returns a new object of class '<em>Single Referencer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Referencer</em>'.
	 * @generated
	 */
	SingleReferencer createSingleReferencer();

	/**
	 * Returns a new object of class '<em>Another Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Another Sub Type</em>'.
	 * @generated
	 */
	AnotherSubType createAnotherSubType();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Attribute Navigation Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Navigation Sample</em>'.
	 * @generated
	 */
	AttributeNavigationSample createAttributeNavigationSample();

	/**
	 * Returns a new object of class '<em>Attribute Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Delegate</em>'.
	 * @generated
	 */
	AttributeDelegate createAttributeDelegate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NavigationPackage getNavigationPackage();

} //NavigationFactory
