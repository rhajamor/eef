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
package org.eclipse.emf.eef.EEFGen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.components.PropertiesEditionContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Edition Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditionContext <em>Properties Edition Context</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getEefGenModel <em>Eef Gen Model</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getDescriptorsContributorID <em>Descriptors Contributor ID</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isDescriptorsGenericPropertiesViews <em>Descriptors Generic Properties Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isGmfPropertiesViews <em>Gmf Properties Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isGenerateJunitTestCases <em>Generate Junit Test Cases</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getLeafComponentsSuperClass <em>Leaf Components Super Class</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditingProvidersSuperClass <em>Properties Editing Providers Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext()
 * @model
 * @generated
 */
public interface GenEditionContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties Edition Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Edition Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Edition Context</em>' reference.
	 * @see #setPropertiesEditionContext(PropertiesEditionContext)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_PropertiesEditionContext()
	 * @model required="true"
	 * @generated
	 */
	PropertiesEditionContext getPropertiesEditionContext();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditionContext <em>Properties Edition Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Edition Context</em>' reference.
	 * @see #getPropertiesEditionContext()
	 * @generated
	 */
	void setPropertiesEditionContext(PropertiesEditionContext value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Eef Gen Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getEditionContexts <em>Edition Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eef Gen Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eef Gen Model</em>' container reference.
	 * @see #setEefGenModel(EEFGenModel)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_EefGenModel()
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getEditionContexts
	 * @model opposite="editionContexts" required="true" transient="false"
	 * @generated
	 */
	EEFGenModel getEefGenModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getEefGenModel <em>Eef Gen Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eef Gen Model</em>' container reference.
	 * @see #getEefGenModel()
	 * @generated
	 */
	void setEefGenModel(EEFGenModel value);

	/**
	 * Returns the value of the '<em><b>Descriptors Contributor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptors Contributor ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptors Contributor ID</em>' attribute.
	 * @see #setDescriptorsContributorID(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_DescriptorsContributorID()
	 * @model
	 * @generated
	 */
	String getDescriptorsContributorID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getDescriptorsContributorID <em>Descriptors Contributor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptors Contributor ID</em>' attribute.
	 * @see #getDescriptorsContributorID()
	 * @generated
	 */
	void setDescriptorsContributorID(String value);

	/**
	 * Returns the value of the '<em><b>Descriptors Generic Properties Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptors Generic Properties Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptors Generic Properties Views</em>' attribute.
	 * @see #setDescriptorsGenericPropertiesViews(boolean)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_DescriptorsGenericPropertiesViews()
	 * @model
	 * @generated
	 */
	boolean isDescriptorsGenericPropertiesViews();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isDescriptorsGenericPropertiesViews <em>Descriptors Generic Properties Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptors Generic Properties Views</em>' attribute.
	 * @see #isDescriptorsGenericPropertiesViews()
	 * @generated
	 */
	void setDescriptorsGenericPropertiesViews(boolean value);

	/**
	 * Returns the value of the '<em><b>Gmf Properties Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gmf Properties Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gmf Properties Views</em>' attribute.
	 * @see #setGmfPropertiesViews(boolean)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_GmfPropertiesViews()
	 * @model
	 * @generated
	 */
	boolean isGmfPropertiesViews();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isGmfPropertiesViews <em>Gmf Properties Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gmf Properties Views</em>' attribute.
	 * @see #isGmfPropertiesViews()
	 * @generated
	 */
	void setGmfPropertiesViews(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Junit Test Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Junit Test Cases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Junit Test Cases</em>' attribute.
	 * @see #setGenerateJunitTestCases(boolean)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_GenerateJunitTestCases()
	 * @model
	 * @generated
	 */
	boolean isGenerateJunitTestCases();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#isGenerateJunitTestCases <em>Generate Junit Test Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Junit Test Cases</em>' attribute.
	 * @see #isGenerateJunitTestCases()
	 * @generated
	 */
	void setGenerateJunitTestCases(boolean value);

	/**
	 * Returns the value of the '<em><b>Leaf Components Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf Components Super Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf Components Super Class</em>' attribute.
	 * @see #setLeafComponentsSuperClass(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_LeafComponentsSuperClass()
	 * @model
	 * @generated
	 */
	String getLeafComponentsSuperClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getLeafComponentsSuperClass <em>Leaf Components Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf Components Super Class</em>' attribute.
	 * @see #getLeafComponentsSuperClass()
	 * @generated
	 */
	void setLeafComponentsSuperClass(String value);

	/**
	 * Returns the value of the '<em><b>Properties Editing Providers Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Editing Providers Super Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Editing Providers Super Class</em>' attribute.
	 * @see #setPropertiesEditingProvidersSuperClass(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenEditionContext_PropertiesEditingProvidersSuperClass()
	 * @model
	 * @generated
	 */
	String getPropertiesEditingProvidersSuperClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getPropertiesEditingProvidersSuperClass <em>Properties Editing Providers Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Editing Providers Super Class</em>' attribute.
	 * @see #getPropertiesEditingProvidersSuperClass()
	 * @generated
	 */
	void setPropertiesEditingProvidersSuperClass(String value);

} // GenEditionContext
