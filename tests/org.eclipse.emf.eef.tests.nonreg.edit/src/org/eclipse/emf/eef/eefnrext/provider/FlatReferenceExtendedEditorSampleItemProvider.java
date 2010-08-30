/**
 * <copyright>
 * </copyright>
 *
 * $Id: FlatReferenceExtendedEditorSampleItemProvider.java,v 1.1.2.1 2010/08/30 08:49:44 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnrext.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.eef.eefnrext.EefnrextPackage;
import org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnrext.FlatReferenceExtendedEditorSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlatReferenceExtendedEditorSampleItemProvider
	extends CheckBoxExtendedEditorSampleItemProvider
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
	public FlatReferenceExtendedEditorSampleItemProvider(AdapterFactory adapterFactory) {
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

			addFlatReferenceEditorSamplePropertyDescriptor(object);
			addDemoPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Flat Reference Editor Sample feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlatReferenceEditorSamplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlatReferenceExtendedEditorSample_flatReferenceEditorSample_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlatReferenceExtendedEditorSample_flatReferenceEditorSample_feature", "_UI_FlatReferenceExtendedEditorSample_type"),
				 EefnrextPackage.Literals.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__FLAT_REFERENCE_EDITOR_SAMPLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Demo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDemoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlatReferenceExtendedEditorSample_demo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlatReferenceExtendedEditorSample_demo_feature", "_UI_FlatReferenceExtendedEditorSample_type"),
				 EefnrextPackage.Literals.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlatReferenceExtendedEditorSample_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlatReferenceExtendedEditorSample_size_feature", "_UI_FlatReferenceExtendedEditorSample_type"),
				 EefnrextPackage.Literals.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FlatReferenceExtendedEditorSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FlatReferenceExtendedEditorSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FlatReferenceExtendedEditorSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FlatReferenceExtendedEditorSample_type") :
			getString("_UI_FlatReferenceExtendedEditorSample_type") + " " + label;
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

		switch (notification.getFeatureID(FlatReferenceExtendedEditorSample.class)) {
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__DEMO:
			case EefnrextPackage.FLAT_REFERENCE_EXTENDED_EDITOR_SAMPLE__SIZE:
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

}
