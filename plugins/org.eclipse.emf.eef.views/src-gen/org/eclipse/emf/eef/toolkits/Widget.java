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
package org.eclipse.emf.eef.toolkits;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.toolkits.Widget#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.toolkits.Widget#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.toolkits.Widget#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.toolkits.Widget#getToolkit <em>Toolkit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.eef.toolkits.ToolkitsPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.eef.toolkits.ToolkitsPackage#getWidget_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.toolkits.Widget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.eclipse.emf.eef.toolkits.ToolkitsPackage#getWidget_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.toolkits.Widget#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see org.eclipse.emf.eef.toolkits.ToolkitsPackage#getWidget_Implementation()
	 * @model
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.toolkits.Widget#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Toolkit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.toolkits.Toolkit#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolkit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolkit</em>' container reference.
	 * @see #setToolkit(Toolkit)
	 * @see org.eclipse.emf.eef.toolkits.ToolkitsPackage#getWidget_Toolkit()
	 * @see org.eclipse.emf.eef.toolkits.Toolkit#getWidgets
	 * @model opposite="widgets" transient="false"
	 * @generated
	 */
	Toolkit getToolkit();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.toolkits.Widget#getToolkit <em>Toolkit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolkit</em>' container reference.
	 * @see #getToolkit()
	 * @generated
	 */
	void setToolkit(Toolkit value);

} // Widget
