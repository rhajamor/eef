/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfaceFactoryImpl.java,v 1.1.4.2 2011/11/09 10:11:44 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.interface_.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnr.interface_.InterfaceFactory;
import org.eclipse.emf.eef.eefnr.interface_.InterfacePackage;
import org.eclipse.emf.eef.eefnr.interface_.SimpleSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceFactoryImpl extends EFactoryImpl implements InterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceFactory init() {
		try {
			InterfaceFactory theInterfaceFactory = (InterfaceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/nonreg/interface/1.0.0"); 
			if (theInterfaceFactory != null) {
				return theInterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFactoryImpl() {
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
			case InterfacePackage.SIMPLE_SAMPLE: return createSimpleSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSample createSimpleSample() {
		SimpleSampleImpl simpleSample = new SimpleSampleImpl();
		return simpleSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePackage getInterfacePackage() {
		return (InterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfacePackage getPackage() {
		return InterfacePackage.eINSTANCE;
	}

} //InterfaceFactoryImpl
