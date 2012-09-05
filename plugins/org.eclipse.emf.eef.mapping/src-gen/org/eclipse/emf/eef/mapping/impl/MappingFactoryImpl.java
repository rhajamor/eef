/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.mapping.*;
import org.eclipse.emf.eef.mapping.Category;
import org.eclipse.emf.eef.mapping.Databinding;
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.ElementBindingReference;
import org.eclipse.emf.eef.mapping.MappingFactory;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.StandardElementBinding;
import org.eclipse.emf.eef.mapping.StandardPropertyBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingFactory init() {
		try {
			MappingFactory theMappingFactory = (MappingFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/eef/mapping/1.0.0");
			if (theMappingFactory != null) {
				return theMappingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactoryImpl() {
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
		case MappingPackage.DATABINDING:
			return createDatabinding();
		case MappingPackage.EMF_ELEMENT_BINDING:
			return createEMFElementBinding();
		case MappingPackage.EMF_PROPERTY_BINDING:
			return createEMFPropertyBinding();
		case MappingPackage.STANDARD_ELEMENT_BINDING:
			return createStandardElementBinding();
		case MappingPackage.STANDARD_PROPERTY_BINDING:
			return createStandardPropertyBinding();
		case MappingPackage.CATEGORY:
			return createCategory();
		case MappingPackage.ELEMENT_BINDING_REFERENCE:
			return createElementBindingReference();
		case MappingPackage.EMF_MULTI_PROPERTIES_BINDING:
			return createEMFMultiPropertiesBinding();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Databinding createDatabinding() {
		DatabindingImpl databinding = new DatabindingImpl();
		return databinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFElementBinding createEMFElementBinding() {
		EMFElementBindingImpl emfElementBinding = new EMFElementBindingImpl();
		return emfElementBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFPropertyBinding createEMFPropertyBinding() {
		EMFPropertyBindingImpl emfPropertyBinding = new EMFPropertyBindingImpl();
		return emfPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardElementBinding createStandardElementBinding() {
		StandardElementBindingImpl standardElementBinding = new StandardElementBindingImpl();
		return standardElementBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPropertyBinding createStandardPropertyBinding() {
		StandardPropertyBindingImpl standardPropertyBinding = new StandardPropertyBindingImpl();
		return standardPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementBindingReference createElementBindingReference() {
		ElementBindingReferenceImpl elementBindingReference = new ElementBindingReferenceImpl();
		return elementBindingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFMultiPropertiesBinding createEMFMultiPropertiesBinding() {
		EMFMultiPropertiesBindingImpl emfMultiPropertiesBinding = new EMFMultiPropertiesBindingImpl();
		return emfMultiPropertiesBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPackage getMappingPackage() {
		return (MappingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingPackage getPackage() {
		return MappingPackage.eINSTANCE;
	}

} //MappingFactoryImpl
