/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextSampleWithTwoTabsItemProvider.java,v 1.1.2.1 2010/08/30 08:49:45 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.provider;


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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextSampleWithTwoTabsItemProvider
	extends AbstractSampleItemProvider
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
	public TextSampleWithTwoTabsItemProvider(AdapterFactory adapterFactory) {
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

			addTextRequiredPropertyInFirstTabPropertyDescriptor(object);
			addTextOptionalPropertyInFirstTabPropertyDescriptor(object);
			addTextRequiredPropertyInSecondTabPropertyDescriptor(object);
			addTextOptionalPropertyInSecondTabPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Text Required Property In First Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextRequiredPropertyInFirstTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextSampleWithTwoTabs_textRequiredPropertyInFirstTab_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextSampleWithTwoTabs_textRequiredPropertyInFirstTab_feature", "_UI_TextSampleWithTwoTabs_type"),
				 EefnrPackage.Literals.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Optional Property In First Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextOptionalPropertyInFirstTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextSampleWithTwoTabs_textOptionalPropertyInFirstTab_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextSampleWithTwoTabs_textOptionalPropertyInFirstTab_feature", "_UI_TextSampleWithTwoTabs_type"),
				 EefnrPackage.Literals.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Required Property In Second Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextRequiredPropertyInSecondTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextSampleWithTwoTabs_textRequiredPropertyInSecondTab_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextSampleWithTwoTabs_textRequiredPropertyInSecondTab_feature", "_UI_TextSampleWithTwoTabs_type"),
				 EefnrPackage.Literals.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Optional Property In Second Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextOptionalPropertyInSecondTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextSampleWithTwoTabs_textOptionalPropertyInSecondTab_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextSampleWithTwoTabs_textOptionalPropertyInSecondTab_feature", "_UI_TextSampleWithTwoTabs_type"),
				 EefnrPackage.Literals.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TextSampleWithTwoTabs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextSampleWithTwoTabs"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TextSampleWithTwoTabs)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TextSampleWithTwoTabs_type") :
			getString("_UI_TextSampleWithTwoTabs_type") + " " + label;
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

		switch (notification.getFeatureID(TextSampleWithTwoTabs.class)) {
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_FIRST_TAB:
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_FIRST_TAB:
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_REQUIRED_PROPERTY_IN_SECOND_TAB:
			case EefnrPackage.TEXT_SAMPLE_WITH_TWO_TABS__TEXT_OPTIONAL_PROPERTY_IN_SECOND_TAB:
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
