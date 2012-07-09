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
package org.eclipse.emf.eef.modelingBot.EEFActions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.eef.modelingBot.ModelingBotPackage;

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
 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsFactory
 * @model kind="package"
 * @generated
 */
public interface EEFActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EEFActions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/test/EEFActions/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EEFActionsPackage eINSTANCE = org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionImpl <em>EEF Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getEEFAction()
	 * @generated
	 */
	int EEF_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ACTION__NAME = ModelingBotPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ACTION__DOCUMENTATION = ModelingBotPackage.ACTION__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>EEF Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ACTION_FEATURE_COUNT = ModelingBotPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.EditActionImpl <em>Edit Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EditActionImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getEditAction()
	 * @generated
	 */
	int EDIT_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_ACTION__NAME = EEF_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_ACTION__DOCUMENTATION = EEF_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_ACTION__PROPERTIES_EDITION_ELEMENT = EEF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_ACTION__REFERENCEABLE_OBJECT = EEF_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_ACTION_FEATURE_COUNT = EEF_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.AddImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TYPE = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EContaining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ECONTAINING_FEATURE = EDIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.RemoveImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetAttributeImpl <em>Set Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetAttributeImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getSetAttribute()
	 * @generated
	 */
	int SET_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__VALUES = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EContaining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__ECONTAINING_FEATURE = EDIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetAttributeImpl <em>Unset Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetAttributeImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getUnsetAttribute()
	 * @generated
	 */
	int UNSET_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE__VALUES = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EContaining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE__ECONTAINING_FEATURE = EDIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unset Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_ATTRIBUTE_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetImpl <em>Unset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getUnset()
	 * @generated
	 */
	int UNSET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET__FEATURE = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.CancelImpl <em>Cancel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.CancelImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getCancel()
	 * @generated
	 */
	int CANCEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__NAME = EEF_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__DOCUMENTATION = EEF_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__ACTION = EEF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_FEATURE_COUNT = EEF_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.CheckImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME = EEF_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__DOCUMENTATION = EEF_ACTION__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = EEF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.OpenEEFEditorImpl <em>Open EEF Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.OpenEEFEditorImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getOpenEEFEditor()
	 * @generated
	 */
	int OPEN_EEF_EDITOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_EEF_EDITOR__NAME = EEF_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_EEF_EDITOR__DOCUMENTATION = EEF_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Editor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_EEF_EDITOR__EDITOR_NAME = EEF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open EEF Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_EEF_EDITOR_FEATURE_COUNT = EEF_ACTION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetReferenceImpl <em>Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetReferenceImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getSetReference()
	 * @generated
	 */
	int SET_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__VALUES = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EContaining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__ECONTAINING_FEATURE = EDIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetReferenceImpl <em>Unset Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetReferenceImpl
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getUnsetReference()
	 * @generated
	 */
	int UNSET_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE__NAME = EDIT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE__DOCUMENTATION = EDIT_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties Edition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE__PROPERTIES_EDITION_ELEMENT = EDIT_ACTION__PROPERTIES_EDITION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referenceable Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE__REFERENCEABLE_OBJECT = EDIT_ACTION__REFERENCEABLE_OBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE__FEATURE = EDIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE__VALUES = EDIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unset Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_REFERENCE_FEATURE_COUNT = EDIT_ACTION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.EEFAction <em>EEF Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Action</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EEFAction
	 * @generated
	 */
	EClass getEEFAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction <em>Edit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Action</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EditAction
	 * @generated
	 */
	EClass getEditAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getPropertiesEditionElement <em>Properties Edition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties Edition Element</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getPropertiesEditionElement()
	 * @see #getEditAction()
	 * @generated
	 */
	EReference getEditAction_PropertiesEditionElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getReferenceableObject <em>Referenceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenceable Object</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.EditAction#getReferenceableObject()
	 * @see #getEditAction()
	 * @generated
	 */
	EReference getEditAction_ReferenceableObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Add#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Add#getType()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Add#getEContainingFeature <em>EContaining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EContaining Feature</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Add#getEContainingFeature()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_EContainingFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute <em>Set Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Attribute</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute
	 * @generated
	 */
	EClass getSetAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute#getValues()
	 * @see #getSetAttribute()
	 * @generated
	 */
	EAttribute getSetAttribute_Values();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute#getEContainingFeature <em>EContaining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EContaining Feature</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.SetAttribute#getEContainingFeature()
	 * @see #getSetAttribute()
	 * @generated
	 */
	EReference getSetAttribute_EContainingFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute <em>Unset Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Attribute</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute
	 * @generated
	 */
	EClass getUnsetAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getValues()
	 * @see #getUnsetAttribute()
	 * @generated
	 */
	EAttribute getUnsetAttribute_Values();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getEContainingFeature <em>EContaining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EContaining Feature</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.UnsetAttribute#getEContainingFeature()
	 * @see #getUnsetAttribute()
	 * @generated
	 */
	EReference getUnsetAttribute_EContainingFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Unset <em>Unset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Unset
	 * @generated
	 */
	EClass getUnset();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Unset#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Unset#getFeature()
	 * @see #getUnset()
	 * @generated
	 */
	EReference getUnset_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Cancel
	 * @generated
	 */
	EClass getCancel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Cancel#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Cancel#getAction()
	 * @see #getCancel()
	 * @generated
	 */
	EReference getCancel_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.OpenEEFEditor <em>Open EEF Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open EEF Editor</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.OpenEEFEditor
	 * @generated
	 */
	EClass getOpenEEFEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.modelingBot.EEFActions.OpenEEFEditor#getEditorName <em>Editor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Name</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.OpenEEFEditor#getEditorName()
	 * @see #getOpenEEFEditor()
	 * @generated
	 */
	EAttribute getOpenEEFEditor_EditorName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.SetReference <em>Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Reference</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.SetReference
	 * @generated
	 */
	EClass getSetReference();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.modelingBot.EEFActions.SetReference#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.SetReference#getValues()
	 * @see #getSetReference()
	 * @generated
	 */
	EReference getSetReference_Values();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.SetReference#getEContainingFeature <em>EContaining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EContaining Feature</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.SetReference#getEContainingFeature()
	 * @see #getSetReference()
	 * @generated
	 */
	EReference getSetReference_EContainingFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference <em>Unset Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Reference</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference
	 * @generated
	 */
	EClass getUnsetReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getFeature()
	 * @see #getUnsetReference()
	 * @generated
	 */
	EReference getUnsetReference_Feature();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.eclipse.emf.eef.modelingBot.EEFActions.UnsetReference#getValues()
	 * @see #getUnsetReference()
	 * @generated
	 */
	EReference getUnsetReference_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EEFActionsFactory getEEFActionsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionImpl <em>EEF Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getEEFAction()
		 * @generated
		 */
		EClass EEF_ACTION = eINSTANCE.getEEFAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.EditActionImpl <em>Edit Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EditActionImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getEditAction()
		 * @generated
		 */
		EClass EDIT_ACTION = eINSTANCE.getEditAction();

		/**
		 * The meta object literal for the '<em><b>Properties Edition Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_ACTION__PROPERTIES_EDITION_ELEMENT = eINSTANCE.getEditAction_PropertiesEditionElement();

		/**
		 * The meta object literal for the '<em><b>Referenceable Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_ACTION__REFERENCEABLE_OBJECT = eINSTANCE.getEditAction_ReferenceableObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.AddImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__TYPE = eINSTANCE.getAdd_Type();

		/**
		 * The meta object literal for the '<em><b>EContaining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__ECONTAINING_FEATURE = eINSTANCE.getAdd_EContainingFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.RemoveImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetAttributeImpl <em>Set Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetAttributeImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getSetAttribute()
		 * @generated
		 */
		EClass SET_ATTRIBUTE = eINSTANCE.getSetAttribute();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ATTRIBUTE__VALUES = eINSTANCE.getSetAttribute_Values();

		/**
		 * The meta object literal for the '<em><b>EContaining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ATTRIBUTE__ECONTAINING_FEATURE = eINSTANCE.getSetAttribute_EContainingFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetAttributeImpl <em>Unset Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetAttributeImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getUnsetAttribute()
		 * @generated
		 */
		EClass UNSET_ATTRIBUTE = eINSTANCE.getUnsetAttribute();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSET_ATTRIBUTE__VALUES = eINSTANCE.getUnsetAttribute_Values();

		/**
		 * The meta object literal for the '<em><b>EContaining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSET_ATTRIBUTE__ECONTAINING_FEATURE = eINSTANCE.getUnsetAttribute_EContainingFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetImpl <em>Unset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getUnset()
		 * @generated
		 */
		EClass UNSET = eINSTANCE.getUnset();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSET__FEATURE = eINSTANCE.getUnset_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.CancelImpl <em>Cancel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.CancelImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getCancel()
		 * @generated
		 */
		EClass CANCEL = eINSTANCE.getCancel();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANCEL__ACTION = eINSTANCE.getCancel_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.CheckImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.OpenEEFEditorImpl <em>Open EEF Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.OpenEEFEditorImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getOpenEEFEditor()
		 * @generated
		 */
		EClass OPEN_EEF_EDITOR = eINSTANCE.getOpenEEFEditor();

		/**
		 * The meta object literal for the '<em><b>Editor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_EEF_EDITOR__EDITOR_NAME = eINSTANCE.getOpenEEFEditor_EditorName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetReferenceImpl <em>Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.SetReferenceImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getSetReference()
		 * @generated
		 */
		EClass SET_REFERENCE = eINSTANCE.getSetReference();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_REFERENCE__VALUES = eINSTANCE.getSetReference_Values();

		/**
		 * The meta object literal for the '<em><b>EContaining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_REFERENCE__ECONTAINING_FEATURE = eINSTANCE.getSetReference_EContainingFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetReferenceImpl <em>Unset Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.UnsetReferenceImpl
		 * @see org.eclipse.emf.eef.modelingBot.EEFActions.impl.EEFActionsPackageImpl#getUnsetReference()
		 * @generated
		 */
		EClass UNSET_REFERENCE = eINSTANCE.getUnsetReference();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSET_REFERENCE__FEATURE = eINSTANCE.getUnsetReference_Feature();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSET_REFERENCE__VALUES = eINSTANCE.getUnsetReference_Values();

	}

} //EEFActionsPackage
