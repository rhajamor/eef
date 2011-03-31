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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationFactory;
import org.eclipse.emf.eef.mapping.navigation.StructuredModelNavigation;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.mapping.EMFPropertyBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFPropertyBindingItemProvider extends
		AbstractPropertyBindingItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFPropertyBindingItemProvider(AdapterFactory adapterFactory) {
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

			addModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(initModelPropertyDescriptor());
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
					.add(MappingPackage.Literals.EMF_PROPERTY_BINDING__NAVIGATION);
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
	 * @generated NOT
	 */
	private ItemPropertyDescriptor initModelPropertyDescriptor() {
		return new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EMFPropertyBinding_model_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_EMFPropertyBinding_model_feature",
						"_UI_EMFPropertyBinding_type"),
				MappingPackage.Literals.EMF_PROPERTY_BINDING__MODEL, true,
				false, true, null, null, null) {

			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				if (object instanceof EMFPropertyBinding) {
					EMFPropertyBinding propertyBinding = (EMFPropertyBinding) object;
					EClassifier model = null;
					if (propertyBinding.getNavigation() != null
							&& !(propertyBinding.getNavigation() instanceof CustomModelNavigation)) {
						if (propertyBinding.getNavigation() != null)
							model = ((StructuredModelNavigation) propertyBinding
									.getNavigation()).evaluate();
						else
							model = ((EMFElementBinding) propertyBinding
									.getElement()).getModel();
						if (model instanceof EClass) {
							Collection<?> comboBoxObjects = super
									.getComboBoxObjects(object);
							Collection<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
							for (Object feature : comboBoxObjects) {
								if (((EClass) model)
										.getEAllStructuralFeatures().contains(
												feature))
									result.add((EStructuralFeature) feature);
							}
							return result;
						}
					} else {
						model = ((EMFElementBinding) propertyBinding
								.getElement()).getModel();
						if (model != null) {
							if (model instanceof EClass)
								return ((EClass) model)
										.getEAllStructuralFeatures();
						}
					}
				}
				return super.getComboBoxObjects(object);
			}

		};
	}

	/**
	 * This returns EMFPropertyBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/EMFPropertyBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EMFPropertyBinding) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_EMFPropertyBinding_type")
				: getString("_UI_EMFPropertyBinding_type") + " " + label;
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

		switch (notification.getFeatureID(EMFPropertyBinding.class)) {
		case MappingPackage.EMF_PROPERTY_BINDING__NAVIGATION:
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
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.EMF_PROPERTY_BINDING__NAVIGATION,
				NavigationFactory.eINSTANCE.createSimpleModelNavigation()));

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.EMF_PROPERTY_BINDING__NAVIGATION,
				NavigationFactory.eINSTANCE.createChainedModelNavigation()));

		newChildDescriptors.add(createChildParameter(
				MappingPackage.Literals.EMF_PROPERTY_BINDING__NAVIGATION,
				NavigationFactory.eINSTANCE.createCustomModelNavigation()));
	}

}
