/**
 * <copyright>
 * </copyright>
 *
 * $Id: TotalSampleItemProvider.java,v 1.3.2.1 2010/08/30 08:49:44 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.provider;


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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.eef.eefnr.EefnrFactory;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TotalSample;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.TotalSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalSampleItemProvider
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
	public TotalSampleItemProvider(AdapterFactory adapterFactory) {
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

			addTextRequiredPropertyPropertyDescriptor(object);
			addTextOptionalPropertyPropertyDescriptor(object);
			addCheckboxRequiredPropertyPropertyDescriptor(object);
			addCheckboxOptionalPropertyPropertyDescriptor(object);
			addTextareaRequiredPropertyPropertyDescriptor(object);
			addTextareaOptionalPropertyPropertyDescriptor(object);
			addRadioRequiredPropertyPropertyDescriptor(object);
			addRadioOptionalPropertyPropertyDescriptor(object);
			addEobjectflatcomboviewerRequiredPropertyPropertyDescriptor(object);
			addEobjectflatcomboviewerOptionalPropertyPropertyDescriptor(object);
			addReferencestableRequiredPropertyPropertyDescriptor(object);
			addReferencestableOptionalPropertyPropertyDescriptor(object);
			addEmfcomboviewerRequiredPropertyPropertyDescriptor(object);
			addEmfcomboviewerOptionalPropertyPropertyDescriptor(object);
			addMultivaluededitorRequiredPropertyPropertyDescriptor(object);
			addMultivaluededitorOptionalPropertyPropertyDescriptor(object);
			addAdvancedreferencestableRequiredPropertyPropertyDescriptor(object);
			addAdvancedreferencestableOptionalPropertyPropertyDescriptor(object);
			addAdvancedeobjectflatcomboviewerRequiredProperyPropertyDescriptor(object);
			addAdvancedeobjectflatcomboviewerOptionalProperyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Text Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_textRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_textRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_textOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_textOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Checkbox Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckboxRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_checkboxRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_checkboxRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Checkbox Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckboxOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_checkboxOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_checkboxOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Textarea Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextareaRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_textareaRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_textareaRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Textarea Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextareaOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_textareaOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_textareaOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radio Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadioRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_radioRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_radioRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radio Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadioOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_radioOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_radioOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eobjectflatcomboviewer Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEobjectflatcomboviewerRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_eobjectflatcomboviewerRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_eobjectflatcomboviewerRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eobjectflatcomboviewer Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEobjectflatcomboviewerOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_eobjectflatcomboviewerOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_eobjectflatcomboviewerOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referencestable Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencestableRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_referencestableRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_referencestableRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__REFERENCESTABLE_REQUIRED_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referencestable Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencestableOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_referencestableOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_referencestableOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__REFERENCESTABLE_OPTIONAL_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emfcomboviewer Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmfcomboviewerRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_emfcomboviewerRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_emfcomboviewerRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emfcomboviewer Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmfcomboviewerOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_emfcomboviewerOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_emfcomboviewerOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multivaluededitor Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultivaluededitorRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_multivaluededitorRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_multivaluededitorRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multivaluededitor Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultivaluededitorOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_multivaluededitorOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_multivaluededitorOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advancedreferencestable Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedreferencestableRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_advancedreferencestableRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_advancedreferencestableRequiredProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_REQUIRED_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advancedreferencestable Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedreferencestableOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_advancedreferencestableOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_advancedreferencestableOptionalProperty_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDREFERENCESTABLE_OPTIONAL_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advancedeobjectflatcomboviewer Required Propery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedeobjectflatcomboviewerRequiredProperyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_advancedeobjectflatcomboviewerRequiredPropery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_advancedeobjectflatcomboviewerRequiredPropery_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advancedeobjectflatcomboviewer Optional Propery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvancedeobjectflatcomboviewerOptionalProperyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TotalSample_advancedeobjectflatcomboviewerOptionalPropery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TotalSample_advancedeobjectflatcomboviewerOptionalPropery_feature", "_UI_TotalSample_type"),
				 EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDEOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY,
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
			childrenFeatures.add(EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);
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
	 * This returns TotalSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TotalSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TotalSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TotalSample_type") :
			getString("_UI_TotalSample_type") + " " + label;
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

		switch (notification.getFeatureID(TotalSample.class)) {
			case EefnrPackage.TOTAL_SAMPLE__TEXT_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__TEXT_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__CHECKBOX_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__TEXTAREA_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__RADIO_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__RADIO_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__MULTIVALUEDEDITOR_OPTIONAL_PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
			case EefnrPackage.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
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
				(EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTotalSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createTotalSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY,
				 EefnrFactory.eINSTANCE.createSample()));
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
			childFeature == EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_ON_SAME_TYPE_OPTIONAL_PROPERTY ||
			childFeature == EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_ON_SAMETYPE_OPTIONAL_PROPERTY ||
			childFeature == EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_REQUIRED_PROPERTY ||
			childFeature == EefnrPackage.Literals.TOTAL_SAMPLE__ADVANCEDTABLECOMPOSITION_OPTIONAL_PROPERTY ||
			childFeature == EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY ||
			childFeature == EefnrPackage.Literals.TOTAL_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
