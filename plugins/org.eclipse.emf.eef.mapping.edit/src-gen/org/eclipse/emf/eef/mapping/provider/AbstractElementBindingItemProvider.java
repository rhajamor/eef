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
package org.eclipse.emf.eef.mapping.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.eef.mapping.AbstractElementBinding;
import org.eclipse.emf.eef.mapping.MappingFactory;
import org.eclipse.emf.eef.mapping.MappingPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.mapping.AbstractElementBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractElementBindingItemProvider extends
		DocumentedElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementBindingItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addViewsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractElementBinding_name_feature"),
				getString("_UI_AbstractElementBinding_name_description"),
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractElementBinding_views_feature"),
				getString("_UI_AbstractElementBinding_views_description"),
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__VIEWS, true,
				false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS);
			childrenFeatures
					.add(MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__PROPERTIES);
			childrenFeatures
					.add(MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING);
			childrenFeatures
					.add(MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AbstractElementBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"full/obj16/AbstractElementBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractElementBinding) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractElementBinding_type")
				: getString("_UI_AbstractElementBinding_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractElementBinding.class)) {
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__NAME:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS:
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__PROPERTIES:
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING:
		case MappingPackage.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS,
				MappingFactory.eINSTANCE.createEMFElementBinding()));

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__SUB_ELEMENTS,
				MappingFactory.eINSTANCE.createStandardElementBinding()));

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__PROPERTIES,
				MappingFactory.eINSTANCE.createEMFPropertyBinding()));

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__PROPERTIES,
				MappingFactory.eINSTANCE.createStandardPropertyBinding()));

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__PROPERTIES,
				MappingFactory.eINSTANCE.createEMFMultiPropertiesBinding()));

		newChildDescriptors
				.add(createChildParameter(
						MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__REFERENCED_BINDING,
						MappingFactory.eINSTANCE
								.createElementBindingReference()));
	}

}
