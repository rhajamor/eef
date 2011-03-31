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
import org.eclipse.emf.eef.views.ViewsRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Views Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getViewsRepository <em>Views Repository</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#isSwtViews <em>Swt Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#isFormViews <em>Form Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getHelpStrategy <em>Help Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getEefGenModel <em>Eef Gen Model</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getPartsSuperClass <em>Parts Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository()
 * @model
 * @generated
 */
public interface GenViewsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Views Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views Repository</em>' reference.
	 * @see #setViewsRepository(ViewsRepository)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_ViewsRepository()
	 * @model required="true"
	 * @generated
	 */
	ViewsRepository getViewsRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getViewsRepository <em>Views Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views Repository</em>' reference.
	 * @see #getViewsRepository()
	 * @generated
	 */
	void setViewsRepository(ViewsRepository value);

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
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Swt Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swt Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swt Views</em>' attribute.
	 * @see #setSwtViews(boolean)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_SwtViews()
	 * @model
	 * @generated
	 */
	boolean isSwtViews();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#isSwtViews <em>Swt Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swt Views</em>' attribute.
	 * @see #isSwtViews()
	 * @generated
	 */
	void setSwtViews(boolean value);

	/**
	 * Returns the value of the '<em><b>Form Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Views</em>' attribute.
	 * @see #setFormViews(boolean)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_FormViews()
	 * @model
	 * @generated
	 */
	boolean isFormViews();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#isFormViews <em>Form Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Views</em>' attribute.
	 * @see #isFormViews()
	 * @generated
	 */
	void setFormViews(boolean value);

	/**
	 * Returns the value of the '<em><b>Help Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.eef.EEFGen.HELP_STRATEGY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Strategy</em>' attribute.
	 * @see org.eclipse.emf.eef.EEFGen.HELP_STRATEGY
	 * @see #setHelpStrategy(HELP_STRATEGY)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_HelpStrategy()
	 * @model required="true"
	 * @generated
	 */
	HELP_STRATEGY getHelpStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getHelpStrategy <em>Help Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Strategy</em>' attribute.
	 * @see org.eclipse.emf.eef.EEFGen.HELP_STRATEGY
	 * @see #getHelpStrategy()
	 * @generated
	 */
	void setHelpStrategy(HELP_STRATEGY value);

	/**
	 * Returns the value of the '<em><b>Eef Gen Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.EEFGen.EEFGenModel#getViewsRepositories <em>Views Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eef Gen Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eef Gen Model</em>' container reference.
	 * @see #setEefGenModel(EEFGenModel)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_EefGenModel()
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenModel#getViewsRepositories
	 * @model opposite="viewsRepositories" required="true" transient="false"
	 * @generated
	 */
	EEFGenModel getEefGenModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getEefGenModel <em>Eef Gen Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eef Gen Model</em>' container reference.
	 * @see #getEefGenModel()
	 * @generated
	 */
	void setEefGenModel(EEFGenModel value);

	/**
	 * Returns the value of the '<em><b>Parts Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts Super Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts Super Class</em>' attribute.
	 * @see #setPartsSuperClass(String)
	 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage#getGenViewsRepository_PartsSuperClass()
	 * @model
	 * @generated
	 */
	String getPartsSuperClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.EEFGen.GenViewsRepository#getPartsSuperClass <em>Parts Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parts Super Class</em>' attribute.
	 * @see #getPartsSuperClass()
	 * @generated
	 */
	void setPartsSuperClass(String value);

} // GenViewsRepository
