/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationAdapterFactory.java,v 1.6 2011/11/14 15:01:16 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.eefnr.AbstractSample;
import org.eclipse.emf.eef.eefnr.NamedElement;
import org.eclipse.emf.eef.eefnr.navigation.*;
import org.eclipse.emf.eef.eefnr.navigation.AnotherSubType;
import org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate;
import org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReference;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.Element;
import org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.Owner;
import org.eclipse.emf.eef.eefnr.navigation.SingleReferencer;
import org.eclipse.emf.eef.eefnr.navigation.Subtype;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.eefnr.navigation.NavigationPackage
 * @generated
 */
public class NavigationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NavigationPackage.eINSTANCE;
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
	protected NavigationSwitch<Adapter> modelSwitch =
		new NavigationSwitch<Adapter>() {
			@Override
			public Adapter caseDeferedFlatReferenceTableEditorSample(DeferedFlatReferenceTableEditorSample object) {
				return createDeferedFlatReferenceTableEditorSampleAdapter();
			}
			@Override
			public Adapter caseDeferedReference(DeferedReference object) {
				return createDeferedReferenceAdapter();
			}
			@Override
			public Adapter caseDeferedReferenceTableEditorSample(DeferedReferenceTableEditorSample object) {
				return createDeferedReferenceTableEditorSampleAdapter();
			}
			@Override
			public Adapter caseOwner(Owner object) {
				return createOwnerAdapter();
			}
			@Override
			public Adapter caseMultipleReferencer(MultipleReferencer object) {
				return createMultipleReferencerAdapter();
			}
			@Override
			public Adapter caseSubtype(Subtype object) {
				return createSubtypeAdapter();
			}
			@Override
			public Adapter caseSingleReferencer(SingleReferencer object) {
				return createSingleReferencerAdapter();
			}
			@Override
			public Adapter caseAnotherSubType(AnotherSubType object) {
				return createAnotherSubTypeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseAttributeNavigationSample(AttributeNavigationSample object) {
				return createAttributeNavigationSampleAdapter();
			}
			@Override
			public Adapter caseAttributeDelegate(AttributeDelegate object) {
				return createAttributeDelegateAdapter();
			}
			@Override
			public Adapter caseAbstractSample(AbstractSample object) {
				return createAbstractSampleAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample <em>Defered Flat Reference Table Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample
	 * @generated
	 */
	public Adapter createDeferedFlatReferenceTableEditorSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReference <em>Defered Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReference
	 * @generated
	 */
	public Adapter createDeferedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample <em>Defered Reference Table Editor Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample
	 * @generated
	 */
	public Adapter createDeferedReferenceTableEditorSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Owner
	 * @generated
	 */
	public Adapter createOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer <em>Multiple Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer
	 * @generated
	 */
	public Adapter createMultipleReferencerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Subtype
	 * @generated
	 */
	public Adapter createSubtypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer <em>Single Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.SingleReferencer
	 * @generated
	 */
	public Adapter createSingleReferencerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.AnotherSubType <em>Another Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AnotherSubType
	 * @generated
	 */
	public Adapter createAnotherSubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample <em>Attribute Navigation Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeNavigationSample
	 * @generated
	 */
	public Adapter createAttributeNavigationSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate <em>Attribute Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.eef.eefnr.navigation.AttributeDelegate
	 * @generated
	 */
	public Adapter createAttributeDelegateAdapter() {
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

} //NavigationAdapterFactory
