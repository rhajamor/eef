/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.nonreg.modelNavigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.nonreg.modelNavigation.ConcreteCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationFactory;
import org.eclipse.emf.eef.nonreg.modelNavigation.ModelNavigationPackage;
import org.eclipse.emf.eef.nonreg.modelNavigation.RealCible;
import org.eclipse.emf.eef.nonreg.modelNavigation.Source;
import org.eclipse.emf.eef.nonreg.modelNavigation.modelNavRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelNavigationFactoryImpl extends EFactoryImpl implements ModelNavigationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelNavigationFactory init() {
		try {
			ModelNavigationFactory theModelNavigationFactory = (ModelNavigationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/properties/1.0.0/modelnavigation"); 
			if (theModelNavigationFactory != null) {
				return theModelNavigationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelNavigationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNavigationFactoryImpl() {
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
			case ModelNavigationPackage.SOURCE: return createSource();
			case ModelNavigationPackage.REAL_CIBLE: return createRealCible();
			case ModelNavigationPackage.CONCRETE_CIBLE: return createConcreteCible();
			case ModelNavigationPackage.MODEL_NAV_ROOT: return createmodelNavRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealCible createRealCible() {
		RealCibleImpl realCible = new RealCibleImpl();
		return realCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteCible createConcreteCible() {
		ConcreteCibleImpl concreteCible = new ConcreteCibleImpl();
		return concreteCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelNavRoot createmodelNavRoot() {
		modelNavRootImpl modelNavRoot = new modelNavRootImpl();
		return modelNavRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNavigationPackage getModelNavigationPackage() {
		return (ModelNavigationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelNavigationPackage getPackage() {
		return ModelNavigationPackage.eINSTANCE;
	}

} //ModelNavigationFactoryImpl
