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
package org.eclipse.emf.eef.mapping.navigation.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.mapping.EMFPropertyBinding;
import org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleModelNavigationItemProvider extends
		StructuredModelNavigationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleModelNavigationItemProvider(AdapterFactory adapterFactory) {
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

			addFeaturePropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
			addDiscriminatorTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(initFeatureItemDescriptor());
	}

	/**
	 * @return
	 * @generated NOT
	 */
	private ItemPropertyDescriptor initFeatureItemDescriptor() {
		return new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SimpleModelNavigation_feature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SimpleModelNavigation_feature_feature",
						"_UI_SimpleModelNavigation_type"),
				NavigationPackage.Literals.SIMPLE_MODEL_NAVIGATION__FEATURE,
				true, false, true, null, null, null) {

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(java.lang.Object)
			 */
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				Collection<?> comboBoxObjects = super
						.getComboBoxObjects(object);
				if (object instanceof SimpleModelNavigation) {
					SimpleModelNavigation smn = (SimpleModelNavigation) object;
					EClass currentClass = null;
					if (smn.eContainer() instanceof EMFPropertyBinding
							|| (smn.eContainer() instanceof ChainedModelNavigation && NavigationPackage.eINSTANCE
									.getChainedModelNavigation_Current() == smn
									.eContainingFeature()))
						currentClass = smn.owningEClass();
					else if (smn.eContainer() instanceof ChainedModelNavigation
							&& NavigationPackage.eINSTANCE
									.getChainedModelNavigation_Next() == smn
									.eContainingFeature())
						currentClass = ((ChainedModelNavigation) smn
								.eContainer()).currentEClass();
					if (currentClass != null) {
						EList<EStructuralFeature> allStructuralFeatures = currentClass
								.getEAllStructuralFeatures();
						List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
						for (Object object2 : comboBoxObjects) {
							if (object2 instanceof EStructuralFeature
									&& allStructuralFeatures.contains(object2))
								result.add((EStructuralFeature) object2);
						}
						return result;
					}
				}
				return comboBoxObjects;
			}

		};
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SimpleModelNavigation_index_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SimpleModelNavigation_index_feature",
						"_UI_SimpleModelNavigation_type"),
				NavigationPackage.Literals.SIMPLE_MODEL_NAVIGATION__INDEX,
				true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Discriminator Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDiscriminatorTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(initializeDiscriminatorTypePropertyDescriptor());
	}

	/**
	 * @return
	 * @generated NOT
	 */
	private ItemPropertyDescriptor initializeDiscriminatorTypePropertyDescriptor() {
		return new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SimpleModelNavigation_discriminatorType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SimpleModelNavigation_discriminatorType_feature",
						"_UI_SimpleModelNavigation_type"),
				NavigationPackage.Literals.SIMPLE_MODEL_NAVIGATION__DISCRIMINATOR_TYPE,
				true, false, true, null, null, null) {

			/**
			 * {@inheritDoc}
			 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(java.lang.Object)
			 */
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				Collection<?> comboBoxObjects = super
						.getComboBoxObjects(object);
				if (object instanceof SimpleModelNavigation) {
					SimpleModelNavigation smn = (SimpleModelNavigation) object;
					if (smn.getFeature() != null) {
						EClassifier type = smn.getFeature().getEType();
						if (type instanceof EClass) {
							EClass targetType = (EClass) type;
							List<EClassifier> result = new ArrayList<EClassifier>();
							for (Object object2 : comboBoxObjects) {
								if (object2 instanceof EClass
										&& targetType
												.isSuperTypeOf((EClass) object2))
									result.add((EClassifier) object2);
							}
							return result;
						}
					}
				}
				return comboBoxObjects;
			}

		};
	}

	/**
	 * This returns SimpleModelNavigation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"full/obj16/SimpleModelNavigation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SimpleModelNavigation simpleModelNavigation = (SimpleModelNavigation) object;
		return getString("_UI_SimpleModelNavigation_type") + " "
				+ simpleModelNavigation.getIndex();
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

		switch (notification.getFeatureID(SimpleModelNavigation.class)) {
		case NavigationPackage.SIMPLE_MODEL_NAVIGATION__INDEX:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	}

}
