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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getEditionContexts <em>Edition Contexts</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getViewsRepositories <em>Views Repositories</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getGenDirectory <em>Gen Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getLicense <em>License</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getTestsGenDirectory <em>Tests Gen Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#isUseJMergeForUserCode <em>Use JMerge For User Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel()
 * @model
 * @generated
 */
public interface EEFGenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Edition Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.EEFGen.GenEditionContext}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.EEFGen.GenEditionContext#getEefGenModel <em>Eef Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Contexts</em>' containment reference list.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_EditionContexts()
	 * @see org.eclipse.emf.eef.EEFGen.GenEditionContext#getEefGenModel
	 * @model opposite="eefGenModel" containment="true"
	 * @generated
	 */
	EList<GenEditionContext> getEditionContexts();

	/**
	 * Returns the value of the '<em><b>Views Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.EEFGen.GenViewsRepository}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getEefGenModel <em>Eef Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views Repositories</em>' containment reference list.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_ViewsRepositories()
	 * @see org.eclipse.emf.eef.EEFGen.GenViewsRepository#getEefGenModel
	 * @model opposite="eefGenModel" containment="true"
	 * @generated
	 */
	EList<GenViewsRepository> getViewsRepositories();

	/**
	 * Returns the value of the '<em><b>Gen Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Directory</em>' attribute.
	 * @see #setGenDirectory(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_GenDirectory()
	 * @model required="true"
	 * @generated
	 */
	String getGenDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getGenDirectory <em>Gen Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Directory</em>' attribute.
	 * @see #getGenDirectory()
	 * @generated
	 */
	void setGenDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.EEFGen.EEFGenModelReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<EEFGenModelReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Tests Gen Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests Gen Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Gen Directory</em>' attribute.
	 * @see #setTestsGenDirectory(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_TestsGenDirectory()
	 * @model
	 * @generated
	 */
	String getTestsGenDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getTestsGenDirectory <em>Tests Gen Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests Gen Directory</em>' attribute.
	 * @see #getTestsGenDirectory()
	 * @generated
	 */
	void setTestsGenDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Use JMerge For User Code</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use JMerge For User Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use JMerge For User Code</em>' attribute.
	 * @see #setUseJMergeForUserCode(boolean)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getEEFGenModel_UseJMergeForUserCode()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseJMergeForUserCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#isUseJMergeForUserCode <em>Use JMerge For User Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use JMerge For User Code</em>' attribute.
	 * @see #isUseJMergeForUserCode()
	 * @generated
	 */
	void setUseJMergeForUserCode(boolean value);

} // EEFGenModel
