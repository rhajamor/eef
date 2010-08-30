/**
 * <copyright>
 * </copyright>
 *
 * $Id: TableCompositionExtensionEditorSampleItemProvider.java,v 1.1.2.1 2010/08/30 08:49:44 sbouchet Exp $
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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TableCompositionExtensionEditorSample;
import org.eclipse.emf.eef.eefnrext.EefnrextFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.TableCompositionExtensionEditorSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableCompositionExtensionEditorSampleItemProvider
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
	public TableCompositionExtensionEditorSampleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY);
			childrenFeatures.add(EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY);
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
	 * This returns TableCompositionExtensionEditorSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableCompositionExtensionEditorSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TableCompositionExtensionEditorSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TableCompositionExtensionEditorSample_type") :
			getString("_UI_TableCompositionExtensionEditorSample_type") + " " + label;
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

		switch (notification.getFeatureID(TableCompositionExtensionEditorSample.class)) {
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY:
			case EefnrPackage.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY:
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
				(EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY,
				 EefnrextFactory.eINSTANCE.createTableCompositionTargetExtensionEditorSample()));

		newChildDescriptors.add
			(createChildParameter
				(EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY,
				 EefnrextFactory.eINSTANCE.createTableCompositionTargetExtensionEditorSample()));
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
			childFeature == EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_REQUIRED_PROPERTY ||
			childFeature == EefnrPackage.Literals.TABLE_COMPOSITION_EXTENSION_EDITOR_SAMPLE__TABLECOMPOSITION_OPTIONAL_PROPERTY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
