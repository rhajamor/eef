/**
 * <copyright>
 * </copyright>
 *
 * $Id: RootItemProvider.java,v 1.11.6.2 2012/02/15 13:37:43 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.Root;
import org.eclipse.emf.eef.eefnr.filters.FiltersFactory;
import org.eclipse.emf.eef.eefnr.naming.CustomNamingFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;
import org.eclipse.emf.eef.eefnr.references.ReferencesFactory;
import org.eclipse.emf.eef.eefnrext.EefnrextFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.Root} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RootItemProvider
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
	public RootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EefnrPackage.Literals.ROOT__SAMPLES);
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
	 * This returns Root.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Root"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Root_type");
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

		switch (notification.getFeatureID(Root.class)) {
			case EefnrPackage.ROOT__SAMPLES:
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
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createTotalSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createTextSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createCheckboxSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createTextareaSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createRadioSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createEObjectFlatComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createEMFComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createMultiValuedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createTableCompositionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createAdvancedReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createAdvancedEObjectFlatComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createAdvancedTableCompositionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createFlatReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createTextSampleWithTwoTabs()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createTableCompositionExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createImageViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createSelectionDialogSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrFactory.eINSTANCE.createSingleCompositionViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 ReferencesFactory.eINSTANCE.createReferenceEnabledSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 ReferencesFactory.eINSTANCE.createTests()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createDeferedFlatReferenceTableEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createDeferedReferenceTableEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createAttributeNavigationSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 NavigationFactory.eINSTANCE.createDeferedMultivaluedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 FiltersFactory.eINSTANCE.createConcreteReferenceOwnerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 FiltersFactory.eINSTANCE.createConcreteReferenceTargetSample1()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 FiltersFactory.eINSTANCE.createConcreteReferenceTargetSample2()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 CustomNamingFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrextFactory.eINSTANCE.createTableCompositionTargetExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrextFactory.eINSTANCE.createCheckBoxExtendedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.ROOT__SAMPLES,
				 EefnrextFactory.eINSTANCE.createFlatReferenceExtendedEditorSample()));
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
