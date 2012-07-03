/**
 * <copyright>
 * </copyright>
 *
 * $Id: FiltersAdapterFactory.java,v 1.2 2011/11/14 15:01:16 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.filters.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.filters.*;
import org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample;
import org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample;
import org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample;
import org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample1;
import org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample2;
import org.eclipse.emf.eef.eefnr.filters.FiltersPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.filters.FiltersPackage
 * @generated
 */
public class FiltersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiltersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FiltersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiltersSwitch<Adapter> modelSwitch =
		new FiltersSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractReferenceOwnerSample(AbstractReferenceOwnerSample object) {
				return createAbstractReferenceOwnerSampleAdapter();
			}
			@Override
			public Adapter caseAbstractReferenceTargetSample(AbstractReferenceTargetSample object) {
				return createAbstractReferenceTargetSampleAdapter();
			}
			@Override
			public Adapter caseConcreteReferenceOwnerSample(ConcreteReferenceOwnerSample object) {
				return createConcreteReferenceOwnerSampleAdapter();
			}
			@Override
			public Adapter caseConcreteReferenceTargetSample1(ConcreteReferenceTargetSample1 object) {
				return createConcreteReferenceTargetSample1Adapter();
			}
			@Override
			public Adapter caseConcreteReferenceTargetSample2(ConcreteReferenceTargetSample2 object) {
				return createConcreteReferenceTargetSample2Adapter();
			}
			@Override
			public Adapter caseAbstractSample(AbstractSample object) {
				return createAbstractSampleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample <em>Abstract Reference Owner Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.filters.AbstractReferenceOwnerSample
	 * @generated
	 */
	public Adapter createAbstractReferenceOwnerSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample <em>Abstract Reference Target Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.filters.AbstractReferenceTargetSample
	 * @generated
	 */
	public Adapter createAbstractReferenceTargetSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample <em>Concrete Reference Owner Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceOwnerSample
	 * @generated
	 */
	public Adapter createConcreteReferenceOwnerSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample1 <em>Concrete Reference Target Sample1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample1
	 * @generated
	 */
	public Adapter createConcreteReferenceTargetSample1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample2 <em>Concrete Reference Target Sample2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.filters.ConcreteReferenceTargetSample2
	 * @generated
	 */
	public Adapter createConcreteReferenceTargetSample2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.AbstractSample <em>Abstract Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.AbstractSample
	 * @generated
	 */
	public Adapter createAbstractSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FiltersAdapterFactory
