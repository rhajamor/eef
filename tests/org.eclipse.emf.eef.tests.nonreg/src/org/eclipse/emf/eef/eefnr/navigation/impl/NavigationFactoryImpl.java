/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationFactoryImpl.java,v 1.1.2.1 2010/08/30 08:48:25 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReference;
import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationFactoryImpl extends EFactoryImpl implements NavigationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationFactory init() {
		try {
			NavigationFactory theNavigationFactory = (NavigationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/nonreg/navigation/1.0.0"); 
			if (theNavigationFactory != null) {
				return theNavigationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NavigationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFactoryImpl() {
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
			case NavigationPackage.DEFERED_FLAT_REFERENCE_TABLE_EDITOR_SAMPLE: return createDeferedFlatReferenceTableEditorSample();
			case NavigationPackage.DEFERED_REFERENCE: return createDeferedReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferedFlatReferenceTableEditorSample createDeferedFlatReferenceTableEditorSample() {
		DeferedFlatReferenceTableEditorSampleImpl deferedFlatReferenceTableEditorSample = new DeferedFlatReferenceTableEditorSampleImpl();
		return deferedFlatReferenceTableEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferedReference createDeferedReference() {
		DeferedReferenceImpl deferedReference = new DeferedReferenceImpl();
		return deferedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationPackage getNavigationPackage() {
		return (NavigationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NavigationPackage getPackage() {
		return NavigationPackage.eINSTANCE;
	}

} //NavigationFactoryImpl
