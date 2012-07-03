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
package org.eclipse.emf.eef.modelingBot.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.eef.modelingBot.EEFActions.EEFActionsFactory;

import org.eclipse.emf.eef.modelingBot.EclipseActions.EclipseActionsFactory;

import org.eclipse.emf.eef.modelingBot.ModelingBotFactory;
import org.eclipse.emf.eef.modelingBot.ModelingBotPackage;
import org.eclipse.emf.eef.modelingBot.Sequence;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.modelingBot.Sequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceItemProvider
	extends DocumentedElementItemProvider
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
	public SequenceItemProvider(AdapterFactory adapterFactory) {
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

			addSequencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sequences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequence_sequences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequence_sequences_feature", "_UI_Sequence_type"),
				 ModelingBotPackage.Literals.SEQUENCE__SEQUENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sequence)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Sequence_type") :
			getString("_UI_Sequence_type") + " " + label;
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

		switch (notification.getFeatureID(Sequence.class)) {
			case ModelingBotPackage.SEQUENCE__PROCESSINGS:
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
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 ModelingBotFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 ModelingBotFactory.eINSTANCE.createWizard()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 ModelingBotFactory.eINSTANCE.createDetailsPage()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 ModelingBotFactory.eINSTANCE.createPropertiesView()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createRemove()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createSetAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createUnset()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createCancel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createCheck()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createOpenEEFEditor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createSetReference()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EEFActionsFactory.eINSTANCE.createUnsetReference()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createCreateProject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createOpenPerspective()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createCloseProject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createUndo()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createRedo()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createOpenProject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createRemoveProject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createCloseEditor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelingBotPackage.Literals.SEQUENCE__PROCESSINGS,
				 EclipseActionsFactory.eINSTANCE.createCreateModel()));
	}

}
