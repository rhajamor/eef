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
package org.eclipse.emf.eef.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/mapping/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = org.eclipse.emf.eef.mapping.impl.MappingPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.DocumentedElementImpl <em>Documented Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.DocumentedElementImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getDocumentedElement()
	 * @generated
	 */
	int DOCUMENTED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Documented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.DatabindingImpl <em>Databinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.DatabindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getDatabinding()
	 * @generated
	 */
	int DATABINDING = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABINDING__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABINDING__BINDINGS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABINDING__CATEGORIES = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Databinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABINDING_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.ModelElementImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__PROPERTIES = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SUB_ELEMENTS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SUPER_ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl <em>Abstract Element Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getAbstractElementBinding()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__PROPERTIES = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__DATABINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__NAME = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Referenced Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__VIEWS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__CATEGORY = DOCUMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Abstract Element Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.ModelPropertyImpl <em>Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.ModelPropertyImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getModelProperty()
	 * @generated
	 */
	int MODEL_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__BINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__MODEL_ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl <em>Abstract Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getAbstractPropertyBinding()
	 * @generated
	 */
	int ABSTRACT_PROPERTY_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_BINDING__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_BINDING__NAME = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_BINDING__VIEWS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_BINDING__ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.EMFElementBindingImpl <em>EMF Element Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.EMFElementBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getEMFElementBinding()
	 * @generated
	 */
	int EMF_ELEMENT_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__DOCUMENTATION = ABSTRACT_ELEMENT_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__SUB_ELEMENTS = ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__PROPERTIES = ABSTRACT_ELEMENT_BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__DATABINDING = ABSTRACT_ELEMENT_BINDING__DATABINDING;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__SUPER_ELEMENT = ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__NAME = ABSTRACT_ELEMENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__REFERENCED_BINDING = ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__VIEWS = ABSTRACT_ELEMENT_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__CATEGORY = ABSTRACT_ELEMENT_BINDING__CATEGORY;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__BINDING_FILTERS = ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING__MODEL = ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Element Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ELEMENT_BINDING_FEATURE_COUNT = ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.EMFPropertyBindingImpl <em>EMF Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.EMFPropertyBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getEMFPropertyBinding()
	 * @generated
	 */
	int EMF_PROPERTY_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__DOCUMENTATION = ABSTRACT_PROPERTY_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__NAME = ABSTRACT_PROPERTY_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__VIEWS = ABSTRACT_PROPERTY_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__ELEMENT = ABSTRACT_PROPERTY_BINDING__ELEMENT;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__BINDING_FILTERS = ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__MODEL = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING__NAVIGATION = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_PROPERTY_BINDING_FEATURE_COUNT = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.StandardElementBindingImpl <em>Standard Element Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.StandardElementBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getStandardElementBinding()
	 * @generated
	 */
	int STANDARD_ELEMENT_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__DOCUMENTATION = ABSTRACT_ELEMENT_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__SUB_ELEMENTS = ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__PROPERTIES = ABSTRACT_ELEMENT_BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__DATABINDING = ABSTRACT_ELEMENT_BINDING__DATABINDING;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__SUPER_ELEMENT = ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__NAME = ABSTRACT_ELEMENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__REFERENCED_BINDING = ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__VIEWS = ABSTRACT_ELEMENT_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__CATEGORY = ABSTRACT_ELEMENT_BINDING__CATEGORY;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__BINDING_FILTERS = ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING__MODEL = ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Element Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_ELEMENT_BINDING_FEATURE_COUNT = ABSTRACT_ELEMENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.StandardPropertyBindingImpl <em>Standard Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.StandardPropertyBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getStandardPropertyBinding()
	 * @generated
	 */
	int STANDARD_PROPERTY_BINDING = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING__DOCUMENTATION = ABSTRACT_PROPERTY_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING__NAME = ABSTRACT_PROPERTY_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING__VIEWS = ABSTRACT_PROPERTY_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING__ELEMENT = ABSTRACT_PROPERTY_BINDING__ELEMENT;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING__BINDING_FILTERS = ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING__MODEL = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PROPERTY_BINDING_FEATURE_COUNT = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.CategoryImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__BINDINGS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Databinding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DATABINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIES = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.ElementBindingReferenceImpl <em>Element Binding Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.ElementBindingReferenceImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getElementBindingReference()
	 * @generated
	 */
	int ELEMENT_BINDING_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BINDING_REFERENCE__DOCUMENTATION = DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BINDING_REFERENCE__BINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Binding Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BINDING_REFERENCE_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.impl.EMFMultiPropertiesBindingImpl <em>EMF Multi Properties Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.impl.EMFMultiPropertiesBindingImpl
	 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getEMFMultiPropertiesBinding()
	 * @generated
	 */
	int EMF_MULTI_PROPERTIES_BINDING = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__DOCUMENTATION = ABSTRACT_PROPERTY_BINDING__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__NAME = ABSTRACT_PROPERTY_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__VIEWS = ABSTRACT_PROPERTY_BINDING__VIEWS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__ELEMENT = ABSTRACT_PROPERTY_BINDING__ELEMENT;

	/**
	 * The feature id for the '<em><b>Binding Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__BINDING_FILTERS = ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__MODEL = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING__NAVIGATION = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF Multi Properties Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_PROPERTIES_BINDING_FEATURE_COUNT = ABSTRACT_PROPERTY_BINDING_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.Databinding <em>Databinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databinding</em>'.
	 * @see org.eclipse.emf.eef.mapping.Databinding
	 * @generated
	 */
	EClass getDatabinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.Databinding#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.emf.eef.mapping.Databinding#getBindings()
	 * @see #getDatabinding()
	 * @generated
	 */
	EReference getDatabinding_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.Databinding#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.emf.eef.mapping.Databinding#getCategories()
	 * @see #getDatabinding()
	 * @generated
	 */
	EReference getDatabinding_Categories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.ModelElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelElement#getProperties()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.ModelElement#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelElement#getSubElements()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_SubElements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.ModelElement#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelElement#getBinding()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Binding();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.ModelElement#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Element</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelElement#getSuperElement()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_SuperElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding <em>Abstract Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding
	 * @generated
	 */
	EClass getAbstractElementBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getSubElements()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_SubElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getProperties()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_Properties();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getDatabinding <em>Databinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Databinding</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getDatabinding()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_Databinding();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Element</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getSuperElement()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_SuperElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getName()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EAttribute getAbstractElementBinding_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getReferencedBinding <em>Referenced Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getReferencedBinding()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_ReferencedBinding();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getViews()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_Views();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getCategory()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.AbstractElementBinding#getBindingFilters <em>Binding Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Filters</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractElementBinding#getBindingFilters()
	 * @see #getAbstractElementBinding()
	 * @generated
	 */
	EReference getAbstractElementBinding_BindingFilters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.ModelProperty <em>Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Property</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelProperty
	 * @generated
	 */
	EClass getModelProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.ModelProperty#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelProperty#getBinding()
	 * @see #getModelProperty()
	 * @generated
	 */
	EReference getModelProperty_Binding();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.ModelProperty#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Element</em>'.
	 * @see org.eclipse.emf.eef.mapping.ModelProperty#getModelElement()
	 * @see #getModelProperty()
	 * @generated
	 */
	EReference getModelProperty_ModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding <em>Abstract Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Property Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractPropertyBinding
	 * @generated
	 */
	EClass getAbstractPropertyBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getName()
	 * @see #getAbstractPropertyBinding()
	 * @generated
	 */
	EAttribute getAbstractPropertyBinding_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getViews()
	 * @see #getAbstractPropertyBinding()
	 * @generated
	 */
	EReference getAbstractPropertyBinding_Views();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getElement()
	 * @see #getAbstractPropertyBinding()
	 * @generated
	 */
	EReference getAbstractPropertyBinding_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getBindingFilters <em>Binding Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Filters</em>'.
	 * @see org.eclipse.emf.eef.mapping.AbstractPropertyBinding#getBindingFilters()
	 * @see #getAbstractPropertyBinding()
	 * @generated
	 */
	EReference getAbstractPropertyBinding_BindingFilters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.EMFElementBinding <em>EMF Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Element Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFElementBinding
	 * @generated
	 */
	EClass getEMFElementBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.EMFElementBinding#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFElementBinding#getModel()
	 * @see #getEMFElementBinding()
	 * @generated
	 */
	EReference getEMFElementBinding_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding <em>EMF Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Property Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFPropertyBinding
	 * @generated
	 */
	EClass getEMFPropertyBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFPropertyBinding#getModel()
	 * @see #getEMFPropertyBinding()
	 * @generated
	 */
	EReference getEMFPropertyBinding_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.EMFPropertyBinding#getNavigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFPropertyBinding#getNavigation()
	 * @see #getEMFPropertyBinding()
	 * @generated
	 */
	EReference getEMFPropertyBinding_Navigation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.StandardElementBinding <em>Standard Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Element Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.StandardElementBinding
	 * @generated
	 */
	EClass getStandardElementBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.StandardElementBinding#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.emf.eef.mapping.StandardElementBinding#getModel()
	 * @see #getStandardElementBinding()
	 * @generated
	 */
	EReference getStandardElementBinding_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.StandardPropertyBinding <em>Standard Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Property Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.StandardPropertyBinding
	 * @generated
	 */
	EClass getStandardPropertyBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.StandardPropertyBinding#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.emf.eef.mapping.StandardPropertyBinding#getModel()
	 * @see #getStandardPropertyBinding()
	 * @generated
	 */
	EReference getStandardPropertyBinding_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.emf.eef.mapping.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.mapping.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.Category#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.emf.eef.mapping.Category#getBindings()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Bindings();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.mapping.Category#getDatabinding <em>Databinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Databinding</em>'.
	 * @see org.eclipse.emf.eef.mapping.Category#getDatabinding()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Databinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.mapping.Category#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.emf.eef.mapping.Category#getCategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Categories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.ElementBindingReference <em>Element Binding Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Binding Reference</em>'.
	 * @see org.eclipse.emf.eef.mapping.ElementBindingReference
	 * @generated
	 */
	EClass getElementBindingReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.ElementBindingReference#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.ElementBindingReference#getBinding()
	 * @see #getElementBindingReference()
	 * @generated
	 */
	EReference getElementBindingReference_Binding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.DocumentedElement <em>Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Element</em>'.
	 * @see org.eclipse.emf.eef.mapping.DocumentedElement
	 * @generated
	 */
	EClass getDocumentedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.DocumentedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.emf.eef.mapping.DocumentedElement#getDocumentation()
	 * @see #getDocumentedElement()
	 * @generated
	 */
	EAttribute getDocumentedElement_Documentation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding <em>EMF Multi Properties Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Multi Properties Binding</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding
	 * @generated
	 */
	EClass getEMFMultiPropertiesBinding();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding#getModel()
	 * @see #getEMFMultiPropertiesBinding()
	 * @generated
	 */
	EReference getEMFMultiPropertiesBinding_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding#getNavigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation</em>'.
	 * @see org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding#getNavigation()
	 * @see #getEMFMultiPropertiesBinding()
	 * @generated
	 */
	EReference getEMFMultiPropertiesBinding_Navigation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.DatabindingImpl <em>Databinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.DatabindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getDatabinding()
		 * @generated
		 */
		EClass DATABINDING = eINSTANCE.getDatabinding();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABINDING__BINDINGS = eINSTANCE.getDatabinding_Bindings();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABINDING__CATEGORIES = eINSTANCE
				.getDatabinding_Categories();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.ModelElementImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__PROPERTIES = eINSTANCE
				.getModelElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__SUB_ELEMENTS = eINSTANCE
				.getModelElement_SubElements();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__BINDING = eINSTANCE.getModelElement_Binding();

		/**
		 * The meta object literal for the '<em><b>Super Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__SUPER_ELEMENT = eINSTANCE
				.getModelElement_SuperElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl <em>Abstract Element Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.AbstractElementBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getAbstractElementBinding()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT_BINDING = eINSTANCE.getAbstractElementBinding();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS = eINSTANCE
				.getAbstractElementBinding_SubElements();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__PROPERTIES = eINSTANCE
				.getAbstractElementBinding_Properties();

		/**
		 * The meta object literal for the '<em><b>Databinding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__DATABINDING = eINSTANCE
				.getAbstractElementBinding_Databinding();

		/**
		 * The meta object literal for the '<em><b>Super Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__SUPER_ELEMENT = eINSTANCE
				.getAbstractElementBinding_SuperElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT_BINDING__NAME = eINSTANCE
				.getAbstractElementBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Referenced Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING = eINSTANCE
				.getAbstractElementBinding_ReferencedBinding();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__VIEWS = eINSTANCE
				.getAbstractElementBinding_Views();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__CATEGORY = eINSTANCE
				.getAbstractElementBinding_Category();

		/**
		 * The meta object literal for the '<em><b>Binding Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS = eINSTANCE
				.getAbstractElementBinding_BindingFilters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.ModelPropertyImpl <em>Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.ModelPropertyImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getModelProperty()
		 * @generated
		 */
		EClass MODEL_PROPERTY = eINSTANCE.getModelProperty();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PROPERTY__BINDING = eINSTANCE
				.getModelProperty_Binding();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PROPERTY__MODEL_ELEMENT = eINSTANCE
				.getModelProperty_ModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl <em>Abstract Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.AbstractPropertyBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getAbstractPropertyBinding()
		 * @generated
		 */
		EClass ABSTRACT_PROPERTY_BINDING = eINSTANCE
				.getAbstractPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY_BINDING__NAME = eINSTANCE
				.getAbstractPropertyBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROPERTY_BINDING__VIEWS = eINSTANCE
				.getAbstractPropertyBinding_Views();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROPERTY_BINDING__ELEMENT = eINSTANCE
				.getAbstractPropertyBinding_Element();

		/**
		 * The meta object literal for the '<em><b>Binding Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROPERTY_BINDING__BINDING_FILTERS = eINSTANCE
				.getAbstractPropertyBinding_BindingFilters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.EMFElementBindingImpl <em>EMF Element Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.EMFElementBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getEMFElementBinding()
		 * @generated
		 */
		EClass EMF_ELEMENT_BINDING = eINSTANCE.getEMFElementBinding();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_ELEMENT_BINDING__MODEL = eINSTANCE
				.getEMFElementBinding_Model();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.EMFPropertyBindingImpl <em>EMF Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.EMFPropertyBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getEMFPropertyBinding()
		 * @generated
		 */
		EClass EMF_PROPERTY_BINDING = eINSTANCE.getEMFPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_PROPERTY_BINDING__MODEL = eINSTANCE
				.getEMFPropertyBinding_Model();

		/**
		 * The meta object literal for the '<em><b>Navigation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_PROPERTY_BINDING__NAVIGATION = eINSTANCE
				.getEMFPropertyBinding_Navigation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.StandardElementBindingImpl <em>Standard Element Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.StandardElementBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getStandardElementBinding()
		 * @generated
		 */
		EClass STANDARD_ELEMENT_BINDING = eINSTANCE.getStandardElementBinding();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_ELEMENT_BINDING__MODEL = eINSTANCE
				.getStandardElementBinding_Model();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.StandardPropertyBindingImpl <em>Standard Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.StandardPropertyBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getStandardPropertyBinding()
		 * @generated
		 */
		EClass STANDARD_PROPERTY_BINDING = eINSTANCE
				.getStandardPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_PROPERTY_BINDING__MODEL = eINSTANCE
				.getStandardPropertyBinding_Model();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.CategoryImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__BINDINGS = eINSTANCE.getCategory_Bindings();

		/**
		 * The meta object literal for the '<em><b>Databinding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__DATABINDING = eINSTANCE.getCategory_Databinding();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORIES = eINSTANCE.getCategory_Categories();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.ElementBindingReferenceImpl <em>Element Binding Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.ElementBindingReferenceImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getElementBindingReference()
		 * @generated
		 */
		EClass ELEMENT_BINDING_REFERENCE = eINSTANCE
				.getElementBindingReference();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_BINDING_REFERENCE__BINDING = eINSTANCE
				.getElementBindingReference_Binding();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.DocumentedElementImpl <em>Documented Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.DocumentedElementImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getDocumentedElement()
		 * @generated
		 */
		EClass DOCUMENTED_ELEMENT = eINSTANCE.getDocumentedElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_ELEMENT__DOCUMENTATION = eINSTANCE
				.getDocumentedElement_Documentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.impl.EMFMultiPropertiesBindingImpl <em>EMF Multi Properties Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.impl.EMFMultiPropertiesBindingImpl
		 * @see org.eclipse.emf.eef.mapping.impl.MappingPackageImpl#getEMFMultiPropertiesBinding()
		 * @generated
		 */
		EClass EMF_MULTI_PROPERTIES_BINDING = eINSTANCE
				.getEMFMultiPropertiesBinding();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_MULTI_PROPERTIES_BINDING__MODEL = eINSTANCE
				.getEMFMultiPropertiesBinding_Model();

		/**
		 * The meta object literal for the '<em><b>Navigation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_MULTI_PROPERTIES_BINDING__NAVIGATION = eINSTANCE
				.getEMFMultiPropertiesBinding_Navigation();

	}

} //MappingPackage
