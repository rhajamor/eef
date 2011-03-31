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
 * @see org.eclipse.emf.eef.toolkits.ToolkitsFactory
 * @model kind="package"
 * @generated
 */
public interface ToolkitsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toolkits"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/views/toolkits/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-views"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolkitsPackage eINSTANCE = org.eclipse.emf.eef.toolkits.impl.ToolkitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.toolkits.impl.ToolkitImpl <em>Toolkit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.toolkits.impl.ToolkitImpl
	 * @see org.eclipse.emf.eef.toolkits.impl.ToolkitsPackageImpl#getToolkit()
	 * @generated
	 */
	int TOOLKIT = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLKIT__WIDGETS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLKIT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Toolkit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLKIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.toolkits.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.toolkits.impl.WidgetImpl
	 * @see org.eclipse.emf.eef.toolkits.impl.ToolkitsPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ICON = 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Toolkit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TOOLKIT = 3;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.toolkits.Toolkit <em>Toolkit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolkit</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Toolkit
	 * @generated
	 */
	EClass getToolkit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.eef.toolkits.Toolkit#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Toolkit#getWidgets()
	 * @see #getToolkit()
	 * @generated
	 */
	EReference getToolkit_Widgets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.toolkits.Toolkit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Toolkit#getName()
	 * @see #getToolkit()
	 * @generated
	 */
	EAttribute getToolkit_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.toolkits.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.toolkits.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.toolkits.Widget#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Widget#getIcon()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.toolkits.Widget#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Widget#getImplementation()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Implementation();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.eef.toolkits.Widget#getToolkit <em>Toolkit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Toolkit</em>'.
	 * @see org.eclipse.emf.eef.toolkits.Widget#getToolkit()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Toolkit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolkitsFactory getToolkitsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.toolkits.impl.ToolkitImpl <em>Toolkit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.toolkits.impl.ToolkitImpl
		 * @see org.eclipse.emf.eef.toolkits.impl.ToolkitsPackageImpl#getToolkit()
		 * @generated
		 */
		EClass TOOLKIT = eINSTANCE.getToolkit();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLKIT__WIDGETS = eINSTANCE.getToolkit_Widgets();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLKIT__NAME = eINSTANCE.getToolkit_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.toolkits.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.toolkits.impl.WidgetImpl
		 * @see org.eclipse.emf.eef.toolkits.impl.ToolkitsPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ICON = eINSTANCE.getWidget_Icon();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__IMPLEMENTATION = eINSTANCE.getWidget_Implementation();

		/**
		 * The meta object literal for the '<em><b>Toolkit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__TOOLKIT = eINSTANCE.getWidget_Toolkit();

	}

} //ToolkitsPackage
