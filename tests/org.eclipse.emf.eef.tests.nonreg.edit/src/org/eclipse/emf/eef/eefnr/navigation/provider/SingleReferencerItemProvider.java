/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleReferencerItemProvider.java,v 1.2.2.1 2011/10/26 16:23:04 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.navigation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.SingleReferencer;

import org.eclipse.emf.eef.eefnr.provider.EefnrEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.navigation.SingleReferencer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleReferencerItemProvider
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
	public SingleReferencerItemProvider(AdapterFactory adapterFactory) {
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

			addSingleReferenceForEObjectFlatComboViewerPropertyDescriptor(object);
			addSingleReferenceForAdvancedEObjectFlatComboViewerPropertyDescriptor(object);
			addBooleanAttributePropertyDescriptor(object);
			addEenumAttributePropertyDescriptor(object);
			addStringAttributePropertyDescriptor(object);
			addListAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Single Reference For EObject Flat Combo Viewer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingleReferenceForEObjectFlatComboViewerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleReferencer_singleReferenceForEObjectFlatComboViewer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleReferencer_singleReferenceForEObjectFlatComboViewer_feature", "_UI_SingleReferencer_type"),
				 NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_EOBJECT_FLAT_COMBO_VIEWER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Single Reference For Advanced EObject Flat Combo Viewer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingleReferenceForAdvancedEObjectFlatComboViewerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleReferencer_singleReferenceForAdvancedEObjectFlatComboViewer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleReferencer_singleReferenceForAdvancedEObjectFlatComboViewer_feature", "_UI_SingleReferencer_type"),
				 NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_REFERENCE_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleReferencer_booleanAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleReferencer_booleanAttribute_feature", "_UI_SingleReferencer_type"),
				 NavigationPackage.Literals.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eenum Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEenumAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleReferencer_eenumAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleReferencer_eenumAttribute_feature", "_UI_SingleReferencer_type"),
				 NavigationPackage.Literals.SINGLE_REFERENCER__EENUM_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the String Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleReferencer_stringAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleReferencer_stringAttribute_feature", "_UI_SingleReferencer_type"),
				 NavigationPackage.Literals.SINGLE_REFERENCER__STRING_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the List Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleReferencer_listAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleReferencer_listAttribute_feature", "_UI_SingleReferencer_type"),
				 NavigationPackage.Literals.SINGLE_REFERENCER__LIST_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION);
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION);
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE);
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE);
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE);
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER);
			childrenFeatures.add(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER);
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
	 * This returns SingleReferencer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SingleReferencer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SingleReferencer singleReferencer = (SingleReferencer)object;
		return getString("_UI_SingleReferencer_type") + " " + singleReferencer.isBooleanAttribute();
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

		switch (notification.getFeatureID(SingleReferencer.class)) {
			case NavigationPackage.SINGLE_REFERENCER__BOOLEAN_ATTRIBUTE:
			case NavigationPackage.SINGLE_REFERENCER__EENUM_ATTRIBUTE:
			case NavigationPackage.SINGLE_REFERENCER__STRING_ATTRIBUTE:
			case NavigationPackage.SINGLE_REFERENCER__LIST_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION:
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION:
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE:
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE:
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE:
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER:
			case NavigationPackage.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER:
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
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_TABLE_COMPOSITION ||
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_ADVANCED_TABLE_COMPOSITION ||
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_REFERENCES_TABLE ||
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_ADVANCED_REFERENCES_TABLE ||
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_SAMPLE_FOR_FLAT_REFERENCES_TABLE ||
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_EOBJECT_FLAT_COMBO_VIEWER ||
			childFeature == NavigationPackage.Literals.SINGLE_REFERENCER__SINGLE_CONTAINMENT_FOR_ADVANCED_EOBJECT_FLAT_COMBO_VIEWER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EefnrEditPlugin.INSTANCE;
	}

}
