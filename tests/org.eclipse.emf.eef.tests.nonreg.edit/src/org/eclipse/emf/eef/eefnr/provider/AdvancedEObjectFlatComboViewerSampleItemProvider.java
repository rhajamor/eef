/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdvancedEObjectFlatComboViewerSampleItemProvider.java,v 1.2.2.1 2010/08/30 08:49:44 sbouchet Exp $
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
import org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.AdvancedEObjectFlatComboViewerSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdvancedEObjectFlatComboViewerSampleItemProvider
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
	public AdvancedEObjectFlatComboViewerSampleItemProvider(AdapterFactory adapterFactory) {
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

			addAdvancedeobjectflatcomboviewerRequiredPropertyPropertyDescriptor(object);
			addAdvancedeobjectflatcomboviewerOptionalPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Advancedeobjectflatcomboviewer Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedeobjectflatcomboviewerRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdvancedEObjectFlatComboViewerSample_advancedeobjectflatcomboviewerRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdvancedEObjectFlatComboViewerSample_advancedeobjectflatcomboviewerRequiredProperty_feature", "_UI_AdvancedEObjectFlatComboViewerSample_type"),
				 EefnrPackage.Literals.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advancedeobjectflatcomboviewer Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedeobjectflatcomboviewerOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdvancedEObjectFlatComboViewerSample_advancedeobjectflatcomboviewerOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdvancedEObjectFlatComboViewerSample_advancedeobjectflatcomboviewerOptionalProperty_feature", "_UI_AdvancedEObjectFlatComboViewerSample_type"),
				 EefnrPackage.Literals.ADVANCED_EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns AdvancedEObjectFlatComboViewerSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdvancedEObjectFlatComboViewerSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AdvancedEObjectFlatComboViewerSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AdvancedEObjectFlatComboViewerSample_type") :
			getString("_UI_AdvancedEObjectFlatComboViewerSample_type") + " " + label;
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
