/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationFactoryImpl.java,v 1.4.6.1 2011/08/13 21:33:20 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.eefnr.navigation.*;
import org.eclipse.emf.eef.eefnr.navigation.AnotherSubType;
import org.eclipse.emf.eef.eefnr.navigation.DeferedFlatReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReference;
import org.eclipse.emf.eef.eefnr.navigation.DeferedReferenceTableEditorSample;
import org.eclipse.emf.eef.eefnr.navigation.Element;
import org.eclipse.emf.eef.eefnr.navigation.MultipleReferencer;
import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.Owner;
import org.eclipse.emf.eef.eefnr.navigation.SingleReferencer;
import org.eclipse.emf.eef.eefnr.navigation.Subtype;

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
			case NavigationPackage.DEFERED_REFERENCE_TABLE_EDITOR_SAMPLE: return createDeferedReferenceTableEditorSample();
			case NavigationPackage.OWNER: return createOwner();
			case NavigationPackage.MULTIPLE_REFERENCER: return createMultipleReferencer();
			case NavigationPackage.SUBTYPE: return createSubtype();
			case NavigationPackage.SINGLE_REFERENCER: return createSingleReferencer();
			case NavigationPackage.ANOTHER_SUB_TYPE: return createAnotherSubType();
			case NavigationPackage.ELEMENT: return createElement();
			case NavigationPackage.ATTRIBUTE_NAVIGATION_SAMPLE: return createAttributeNavigationSample();
			case NavigationPackage.ATTRIBUTE_DELEGATE: return createAttributeDelegate();
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
	public DeferedReferenceTableEditorSample createDeferedReferenceTableEditorSample() {
		DeferedReferenceTableEditorSampleImpl deferedReferenceTableEditorSample = new DeferedReferenceTableEditorSampleImpl();
		return deferedReferenceTableEditorSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleReferencer createMultipleReferencer() {
		MultipleReferencerImpl multipleReferencer = new MultipleReferencerImpl();
		return multipleReferencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype createSubtype() {
		SubtypeImpl subtype = new SubtypeImpl();
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleReferencer createSingleReferencer() {
		SingleReferencerImpl singleReferencer = new SingleReferencerImpl();
		return singleReferencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherSubType createAnotherSubType() {
		AnotherSubTypeImpl anotherSubType = new AnotherSubTypeImpl();
		return anotherSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNavigationSample createAttributeNavigationSample() {
		AttributeNavigationSampleImpl attributeNavigationSample = new AttributeNavigationSampleImpl();
		return attributeNavigationSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDelegate createAttributeDelegate() {
		AttributeDelegateImpl attributeDelegate = new AttributeDelegateImpl();
		return attributeDelegate;
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
