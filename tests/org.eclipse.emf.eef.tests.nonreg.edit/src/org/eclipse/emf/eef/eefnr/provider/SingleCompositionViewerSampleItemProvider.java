/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleCompositionViewerSampleItemProvider.java,v 1.1.2.4 2012/02/15 13:25:36 glefur Exp $
 */
package org.eclipse.emf.eef.eefnr.provider;


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

import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.SingleCompositionViewerSample;

import org.eclipse.emf.eef.eefnr.filters.FiltersFactory;

import org.eclipse.emf.eef.eefnr.naming.CustomNamingFactory;
import org.eclipse.emf.eef.eefnr.navigation.NavigationFactory;

import org.eclipse.emf.eef.eefnr.references.ReferencesFactory;

import org.eclipse.emf.eef.eefnrext.EefnrextFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.SingleCompositionViewerSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleCompositionViewerSampleItemProvider
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
	public SingleCompositionViewerSampleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY);
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
	 * This returns SingleCompositionViewerSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SingleCompositionViewerSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SingleCompositionViewerSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SingleCompositionViewerSample_type") :
			getString("_UI_SingleCompositionViewerSample_type") + " " + label;
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

		switch (notification.getFeatureID(SingleCompositionViewerSample.class)) {
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY:
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY:
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY:
			case EefnrPackage.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY:
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
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createTotalSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createTextSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createCheckboxSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createTextareaSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createRadioSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createEObjectFlatComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createEMFComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createMultiValuedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createTableCompositionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createAdvancedReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createAdvancedEObjectFlatComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createAdvancedTableCompositionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createFlatReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createTextSampleWithTwoTabs()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createTableCompositionExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createImageViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createSelectionDialogSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createSingleCompositionViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 ReferencesFactory.eINSTANCE.createReferenceEnabledSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 ReferencesFactory.eINSTANCE.createTests()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createDeferedFlatReferenceTableEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createDeferedReferenceTableEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createAttributeNavigationSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 NavigationFactory.eINSTANCE.createDeferedMultivaluedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 FiltersFactory.eINSTANCE.createConcreteReferenceOwnerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 FiltersFactory.eINSTANCE.createConcreteReferenceTargetSample1()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 FiltersFactory.eINSTANCE.createConcreteReferenceTargetSample2()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 CustomNamingFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrextFactory.eINSTANCE.createTableCompositionTargetExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrextFactory.eINSTANCE.createCheckBoxExtendedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY,
				 EefnrextFactory.eINSTANCE.createFlatReferenceExtendedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTotalSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTextSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createCheckboxSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTextareaSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createRadioSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createEObjectFlatComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createEMFComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createMultiValuedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTableCompositionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createAdvancedReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createAdvancedEObjectFlatComboViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createAdvancedTableCompositionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createFlatReferencesTableSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTextSampleWithTwoTabs()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTableCompositionExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createImageViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createSelectionDialogSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createSingleCompositionViewerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 ReferencesFactory.eINSTANCE.createReferenceEnabledSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 ReferencesFactory.eINSTANCE.createTests()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createDeferedFlatReferenceTableEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createDeferedReferenceTableEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createAnotherSubType()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createAttributeNavigationSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 NavigationFactory.eINSTANCE.createDeferedMultivaluedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 FiltersFactory.eINSTANCE.createConcreteReferenceOwnerSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 FiltersFactory.eINSTANCE.createConcreteReferenceTargetSample1()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 FiltersFactory.eINSTANCE.createConcreteReferenceTargetSample2()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 CustomNamingFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrextFactory.eINSTANCE.createTableCompositionTargetExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrextFactory.eINSTANCE.createCheckBoxExtendedEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY,
				 EefnrextFactory.eINSTANCE.createFlatReferenceExtendedEditorSample()));
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
			childFeature == EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_REQUIRED_PROPERTY ||
			childFeature == EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_SINGLE_OPTIONAL_PROPERTY ||
			childFeature == EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_REQUIRED_PROPERTY ||
			childFeature == EefnrPackage.Literals.SINGLE_COMPOSITION_VIEWER_SAMPLE__SINGLECOMPOSITIONVIEW_MULTI_OPTIONAL_PROPERTY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
