/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.components.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.eef.components.ComponentsFactory;
import org.eclipse.emf.eef.components.ComponentsPackage;
import org.eclipse.emf.eef.components.PropertiesEditionComponent;
import org.eclipse.emf.eef.components.PropertiesEditionContext;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.components.PropertiesMultiEditionElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsFactoryImpl extends EFactoryImpl implements ComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentsFactory init() {
		try {
			ComponentsFactory theComponentsFactory = (ComponentsFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/eef/components/1.0.0");
			if (theComponentsFactory != null) {
				return theComponentsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactoryImpl() {
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
		case ComponentsPackage.PROPERTIES_EDITION_CONTEXT:
			return createPropertiesEditionContext();
		case ComponentsPackage.PROPERTIES_EDITION_COMPONENT:
			return createPropertiesEditionComponent();
		case ComponentsPackage.PROPERTIES_EDITION_ELEMENT:
			return createPropertiesEditionElement();
		case ComponentsPackage.PROPERTIES_MULTI_EDITION_ELEMENT:
			return createPropertiesMultiEditionElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionContext createPropertiesEditionContext() {
		PropertiesEditionContextImpl propertiesEditionContext = new PropertiesEditionContextImpl();
		return propertiesEditionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionComponent createPropertiesEditionComponent() {
		PropertiesEditionComponentImpl propertiesEditionComponent = new PropertiesEditionComponentImpl();
		return propertiesEditionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesEditionElement createPropertiesEditionElement() {
		PropertiesEditionElementImpl propertiesEditionElement = new PropertiesEditionElementImpl();
		return propertiesEditionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesMultiEditionElement createPropertiesMultiEditionElement() {
		PropertiesMultiEditionElementImpl propertiesMultiEditionElement = new PropertiesMultiEditionElementImpl();
		return propertiesMultiEditionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsPackage getComponentsPackage() {
		return (ComponentsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentsPackage getPackage() {
		return ComponentsPackage.eINSTANCE;
	}

} //ComponentsFactoryImpl
