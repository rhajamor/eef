package org.eclipse.emf.eef.modelingBot.helper;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.modelingBot.SequenceType;
import org.eclipse.emf.eef.modelingBot.EEFActions.EditAction;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

public class EMFHelper {

	public static EPackage findInRegistry(EPackage ePackage) {
		return EPackage.Registry.INSTANCE.getEPackage(ePackage.getNsURI());
	}
	
	public static EClass map(EPackage ePackage, EClass clazz) {
		TreeIterator<EObject> eAllContents = ePackage.eAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			if (next instanceof EClass && uniqueId(clazz).equals(uniqueId((EClass) next))) {
				return (EClass) next;
			}
		}
		return null;
	}
	
	public static EStructuralFeature map(EPackage ePackage, EStructuralFeature feature) {
		TreeIterator<EObject> eAllContents = ePackage.eAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			if (next instanceof EStructuralFeature && uniqueId(feature).equals(uniqueId((EStructuralFeature) next))) {
				return (EStructuralFeature) next;
			}
		}
		return null;
	}
	
	private static String uniqueId(EClass clazz) {
		return clazz.getName() + clazz.getEPackage().getName(); 
	}
	
	private static String uniqueId(EStructuralFeature feature) {
		return feature.getName() + ((EClass)feature.eContainer()).getName() + ((EClass)feature.eContainer()).getEPackage().getName(); 
	}

	public static Collection<EObject> followingSiblings(EObject eObject) {
		Collection<EObject> followingSiblings = new ArrayList<EObject>();
		if (eObject.eContainingFeature()!=null && eObject.eContainingFeature().isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> siblings = (List<EObject>) eObject.eContainer().eGet(eObject.eContainingFeature());
			int indexOf = siblings.indexOf(eObject);
			if (indexOf != -1) {
				for (int i = indexOf + 1; i < siblings.size(); i++) {
					followingSiblings.add(siblings.get(i));
				}
			}
		}
		return followingSiblings;
	}
	
	public static Collection<EObject> precedingSiblings(EObject eObject) {
		Collection<EObject> precedingSiblings = new ArrayList<EObject>();
		if (eObject.eContainingFeature()!=null && eObject.eContainingFeature().isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> siblings = (List<EObject>) eObject.eContainer().eGet(eObject.eContainingFeature());
			int indexOf = siblings.indexOf(eObject);
			if (indexOf != -1) {
				for (int i = indexOf - 1; i >= 0; i--) {
					precedingSiblings.add(siblings.get(i));
				}
			}
		}
		return precedingSiblings;
	}
	
	@SuppressWarnings("unchecked")
	public static String getCreateChildLabel(EditingDomain editingDomain, EClass type, final EObject container) {
		Collection<?> newChildDescriptors = editingDomain.getNewChildDescriptors(container, null);
		CommandParameter next = null;
		for (CommandParameter param : ((Collection<CommandParameter>)newChildDescriptors)) {
			if (param.getEValue() != null && type.getName().equals(param.getEValue().eClass().getName())) {
				next = param;
				break;
			}
		}
		String text = type.getName();
		if (next != null) {
			Command create = CreateChildCommand.create(editingDomain, container, next, Collections.emptyList());
			if (create instanceof CommandActionDelegate) {
				text = ((CommandActionDelegate) create).getText();
			}
			
		}
		return text;
	}

	public static String getEditorLabel(PropertiesEditionElement propertiesEditionElement, EObject referenceableObject, EObject container, SequenceType sequenceType) {
		AdapterFactory adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
		EObject target = null;
		if (SequenceType.DETAILS_PAGE == sequenceType) {
			target = container;
		} else if (SequenceType.WIZARD == sequenceType) {
			target = (EObject)EEFModelHelper.eGet(container, ((EditAction)referenceableObject).getPropertiesEditionElement().getModel());
		}
		assertFalse(target == null);
		EStructuralFeature model = EMFHelper.map(target.eClass().getEPackage(), propertiesEditionElement.getModel());
		return getEditorLabel(adapterFactory, target, model);
	}
	
	private static String getEditorLabel(AdapterFactory factory, EObject target, EStructuralFeature feature) {
		IItemPropertySource adapt = (IItemPropertySource) factory.adapt(target, IItemPropertySource.class);
		IItemPropertyDescriptor propertyDescriptor = adapt.getPropertyDescriptor(target, feature);
		String displayName = propertyDescriptor.getDisplayName(target);
		return displayName;
	}
	

}
