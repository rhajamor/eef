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
package org.eclipse.emf.eef.EEFGen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenEditionContext;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.EEFGen.GenEditionContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenEditionContextItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditionContextItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPropertiesEditionContextPropertyDescriptor(object);
			addBasePackagePropertyDescriptor(object);
			addDescriptorsContributorIDPropertyDescriptor(object);
			addDescriptorsGenericPropertiesViewsPropertyDescriptor(object);
			addGmfPropertiesViewsPropertyDescriptor(object);
			addGenerateJunitTestCasesPropertyDescriptor(object);
			addLeafComponentsSuperClassPropertyDescriptor(object);
			addPropertiesEditingProvidersSuperClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Properties Edition Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesEditionContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_PropertiesEditionContext_feature"),
				 getString("_UI_GenEditionContext_PropertiesEditionContext_description"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__PROPERTIES_EDITION_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ReferencesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_basePackage_feature"),
				 getString("_UI_GenEditionContext_basePackage_description"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__BASE_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ParametersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Descriptors Contributor ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptorsContributorIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_descriptorsContributorID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEditionContext_descriptorsContributorID_feature", "_UI_GenEditionContext_type"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Descriptors Generic Properties Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptorsGenericPropertiesViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_descriptorsGenericPropertiesViews_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEditionContext_descriptorsGenericPropertiesViews_feature", "_UI_GenEditionContext_type"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gmf Properties Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGmfPropertiesViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_gmfPropertiesViews_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEditionContext_gmfPropertiesViews_feature", "_UI_GenEditionContext_type"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Junit Test Cases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateJunitTestCasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_generateJunitTestCases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEditionContext_generateJunitTestCases_feature", "_UI_GenEditionContext_type"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leaf Components Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeafComponentsSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_leafComponentsSuperClass_feature"),
				 getString("_UI_GenEditionContext_leafComponentsSuperClass_description"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_implementationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties Editing Providers Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesEditingProvidersSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEditionContext_propertiesEditingProvidersSuperClass_feature"),
				 getString("_UI_GenEditionContext_propertiesEditingProvidersSuperClass_description"),
				 EEFGenPackage.Literals.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_implementationPropertyCategory"),
				 null));
	}

	/**
	 * This returns GenEditionContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenEditionContext"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenEditionContext)object).getBasePackage();
		return label == null || label.length() == 0 ?
			getString("_UI_GenEditionContext_type") :
			getString("_UI_GenEditionContext_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GenEditionContext.class)) {
			case EEFGenPackage.GEN_EDITION_CONTEXT__BASE_PACKAGE:
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_CONTRIBUTOR_ID:
			case EEFGenPackage.GEN_EDITION_CONTEXT__DESCRIPTORS_GENERIC_PROPERTIES_VIEWS:
			case EEFGenPackage.GEN_EDITION_CONTEXT__GMF_PROPERTIES_VIEWS:
			case EEFGenPackage.GEN_EDITION_CONTEXT__GENERATE_JUNIT_TEST_CASES:
			case EEFGenPackage.GEN_EDITION_CONTEXT__LEAF_COMPONENTS_SUPER_CLASS:
			case EEFGenPackage.GEN_EDITION_CONTEXT__PROPERTIES_EDITING_PROVIDERS_SUPER_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EEFGenEditPlugin.INSTANCE;
	}

}
