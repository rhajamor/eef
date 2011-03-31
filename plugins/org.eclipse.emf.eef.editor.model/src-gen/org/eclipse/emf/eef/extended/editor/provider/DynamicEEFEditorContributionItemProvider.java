/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.eef.extended.editor.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution;
import org.eclipse.emf.eef.extended.editor.EditorFactory;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.filters.FiltersFactory;
import org.eclipse.emf.eef.mapping.provider.EMFElementBindingItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.extended.editor.DynamicEEFEditorContribution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicEEFEditorContributionItemProvider
	extends EMFElementBindingItemProvider
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
	public DynamicEEFEditorContributionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EditorPackage.Literals.EEF_EDITOR_CONTRIBUTION__INPUT);
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
	 * This returns DynamicEEFEditorContribution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DynamicEEFEditorContribution"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DynamicEEFEditorContribution)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicEEFEditorContribution_type") :
			getString("_UI_DynamicEEFEditorContribution_type") + " " + label;
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

		switch (notification.getFeatureID(DynamicEEFEditorContribution.class)) {
			case EditorPackage.DYNAMIC_EEF_EDITOR_CONTRIBUTION__INPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
//		super.collectNewChildDescriptors(newChildDescriptors, object);
		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS,
				 EditorFactory.eINSTANCE.createPartFilter()));

		newChildDescriptors
				.add(createChildParameter(
						MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS,
						FiltersFactory.eINSTANCE.createJavaDeclarationFilter()));

		newChildDescriptors
				.add(createChildParameter(
						MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS,
						FiltersFactory.eINSTANCE.createJavaExpressionFilter()));

		newChildDescriptors
				.add(createChildParameter(
						MappingPackage.Literals.ABSTRACT_ELEMENT_BINDING__BINDING_FILTERS,
						FiltersFactory.eINSTANCE.createOCLFilter()));

		newChildDescriptors.add
			(createChildParameter
				(EditorPackage.Literals.EEF_EDITOR_CONTRIBUTION__INPUT,
				 EditorFactory.eINSTANCE.createAllResourcesRootsRelativeInput()));

		newChildDescriptors.add
			(createChildParameter
				(EditorPackage.Literals.EEF_EDITOR_CONTRIBUTION__INPUT,
				 EditorFactory.eINSTANCE.createFirstResourceRootRelativeInput()));
	}

}
