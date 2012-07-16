/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.modelingBot.batch;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.extended.editor.ReferenceableObject;
import org.eclipse.emf.eef.modelingBot.Action;
import org.eclipse.emf.eef.modelingBot.IModelingBot;
import org.eclipse.emf.eef.modelingBot.Processing;
import org.eclipse.emf.eef.modelingBot.SequenceType;
import org.eclipse.emf.eef.modelingBot.Wizard;
import org.eclipse.emf.eef.modelingBot.helper.EEFModelingBotHelper;
import org.eclipse.emf.eef.modelingBot.helper.EMFHelper;
import org.eclipse.emf.eef.modelingBot.interpreter.EEFInterpreter;
import org.eclipse.emf.eef.modelingBot.interpreter.IModelingBotInterpreter;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class BatchModelingBot implements IModelingBot {

	private EditingDomain editingDomain;

	private AdapterFactory adapterFactory;

	private Resource activeResource;

	private EEFInterpreter interpreter;

	/**
	 * Constructor.
	 */
	public BatchModelingBot() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack());
		interpreter = new EEFInterpreter(this, editingDomain);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#runModelingBot(java.lang.String)
	 */
	public void runModelingBot(String path) throws CoreException, IOException {
		interpreter.runModelingBot(path);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#createProject(java.lang.String)
	 */
	public void createProject(String projectName) {
		// try {
		// IProject project =
		// ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		// project.create(new NullProgressMonitor());
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#openProject(java.lang.String)
	 */
	public void openProject(String projectName) {
		// try {
		// IProject project =
		// ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		// project.open(monitor);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#closeProject(java.lang.String)
	 */
	public void closeProject(String projectName) {
		// try {
		// IProject project =
		// ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		// project.open(monitor);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#removeProject(java.lang.String)
	 */
	public void removeProject(String projectName) {
		// try {
		// IProject project =
		// ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		// project.delete(true, monitor);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#openPerspective(java.lang.String)
	 */
	public void openPerspective(String name) {
		// Nothing to do
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#openEEFEditor(java.lang.String)
	 */
	public void openEEFEditor(String path) {
		final URI uri = URI.createPlatformResourceURI(path, true);
		final Resource activeResource = editingDomain.getResourceSet().getResource(uri, true);
		this.activeResource = activeResource;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#closeEditor(java.lang.String)
	 */
	public void closeEditor(String path) {
		activeResource.unload();
		activeResource = null;
		editingDomain.getResourceSet().getResources().remove(activeResource);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#save()
	 */
	public void save() {
		// if (activeResource != null) {
		// try {
		// activeResource.save(Collections.EMPTY_MAP);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// } else {
		// //TODO: Error
		// }
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#add(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature,
	 *      org.eclipse.emf.ecore.EClass)
	 */
	public EObject add(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, EClass type) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		assertNotNull("the eObjectFromReferenceableEObject is null", eObjectFromReferenceableEObject);
		activeResource = eObjectFromReferenceableEObject.eResource();
		EClass mappedType = EMFHelper.map(EMFHelper.findInRegistry(type.getEPackage()), type);
		EStructuralFeature mappedContainingFeature = EMFHelper.map(EMFHelper.findInRegistry(type.getEPackage()), eContainingFeature);
		final EObject value = EcoreUtil.create(mappedType);
		final Command command = AddCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedContainingFeature, value);
		assertNotNull("The command is null", command);
		editingDomain.getCommandStack().execute(command);
		return value;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#remove(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject)
	 */
	public void remove(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		activeResource = eObjectFromReferenceableEObject.eResource();
		EcoreUtil.remove(eObjectFromReferenceableEObject);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#setAttribute(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature,
	 *      java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public void setAttribute(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, Collection<String> values) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		EStructuralFeature mappedFeature = EMFHelper.map(EMFHelper.findInRegistry(((EClass)eContainingFeature.eContainer()).getEPackage()), eContainingFeature);
		if (mappedFeature instanceof EAttribute) {
			activeResource = eObjectFromReferenceableEObject.eResource();
			Object createFromString = null;
			if (eContainingFeature.isMany()) {
				createFromString = new ArrayList<Object>();
				for (String value : values) {
					((ArrayList<Object>) createFromString).add(EcoreUtil.createFromString(((EAttribute)mappedFeature).getEAttributeType(), value));
				}
			} else {
				createFromString = EcoreUtil.createFromString(((EAttribute)mappedFeature).getEAttributeType(),
						values.iterator().next());
			}
			final Command command = SetCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature,
					createFromString);
			assertNotNull("The command is null", command);
			editingDomain.getCommandStack().execute(command);
		} else {
			fail("Cannot set without a eContainingFeature attribute");
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#set(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject)
	 */
	@SuppressWarnings("unchecked")
	public void setReference(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, Collection<ReferenceableObject> values) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		EStructuralFeature mappedFeature = EMFHelper.map(EMFHelper.findInRegistry(((EClass)eContainingFeature.eContainer()).getEPackage()), eContainingFeature);
		if (mappedFeature instanceof EReference) {
			activeResource = eObjectFromReferenceableEObject.eResource();
			Object refValue = null;
			if (eContainingFeature.isMany()) {
				refValue = new ArrayList<EObject>();
				for (ReferenceableObject ref: values) {
					((ArrayList<EObject>) refValue).add(interpreter.getEObjectFromReferenceableEObject(ref));
				}
			} else {
				refValue = interpreter.getEObjectFromReferenceableEObject(values.iterator().next());
			}
			final Command command = SetCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, refValue);
			assertNotNull("The command is null", command);
			editingDomain.getCommandStack().execute(command);
		} else {
			fail("Cannot set without a eContainingFeature reference");
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#unset(org.eclipse.emf.eef.components.PropertiesEditionElement,
	 *      org.eclipse.emf.eef.extended.editor.ReferenceableObject, org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public void unset(PropertiesEditionElement propertiesEditionElement, ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		EStructuralFeature mappedFeature = EMFHelper.map(EMFHelper.findInRegistry(((EClass)eContainingFeature.eContainer()).getEPackage()), eContainingFeature);
		activeResource = eObjectFromReferenceableEObject.eResource();
		if (mappedFeature instanceof EStructuralFeature) {
			if (mappedFeature.isMany()) {
				Collection<Object> valuesToRemove = RemoveCommand.getOwnerList(eObjectFromReferenceableEObject, mappedFeature);
				final Command command = RemoveCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, valuesToRemove);
				assertNotNull("The command is null", command);
				editingDomain.getCommandStack().execute(command);
			} else {
				final Command command = SetCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, null);
				assertNotNull("The command is null", command);
				editingDomain.getCommandStack().execute(command);
			}
		} else {
			fail("Cannot unset without a eContainingFeature attribute/reference");
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.modelingBot.IModelingBot#createModel(java.lang.String, java.lang.String,
	 *      org.eclipse.emf.ecore.EClass)
	 */
	public EObject createModel(String path, String modelName, EClass eClass) {
		// try {
		final URI uri = URI.createPlatformResourceURI(path + "/" + modelName, true);
		final Resource activeResource = editingDomain.getResourceSet().createResource(uri);
		EClass mappedType = EMFHelper.map(EMFHelper.findInRegistry(eClass.getEPackage()), eClass);
		final EObject create = EcoreUtil.create(mappedType);
		activeResource.getContents().add(create);
		// activeResource.save(Collections.EMPTY_MAP);
		this.activeResource = activeResource;
		return create;
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// return null;
	}

	public void cancel(Processing processing) {
		if (processing instanceof Wizard) {
			int numberOfActionsToCancel = EEFModelingBotHelper.getNumberOfActionToUndo(processing);
			for (int i = 0; i < numberOfActionsToCancel; i++) {
				editingDomain.getCommandStack().undo();;
			}
		} else {
			editingDomain.getCommandStack().undo();
		}
	}

	public void setSequenceType(SequenceType detailsPage) {

	}

	public void validateBatchEditing() {

	}

	public void check() {

	}

	public Resource getActiveResource() {
		return activeResource;
	}

	public IModelingBotInterpreter getModelingBotInterpreter() {
		return interpreter;
	}

	public EObject add(PropertiesEditionElement propertiesEditionElement,
			ReferenceableObject referenceableObjectContainer,
			ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, EClass type) {
		if (referenceableObjectContainer == null) {
			return add(propertiesEditionElement, referenceableObject, eContainingFeature, type);
		}
		final EObject container = interpreter.getEObjectFromReferenceableEObject(referenceableObjectContainer);
		assertNotNull("No container is found.", container);
		activeResource = container.eResource();
		EClass mappedType = EMFHelper.map(EMFHelper.findInRegistry(type.getEPackage()), type);
		EStructuralFeature mappedContainingFeature = EMFHelper.map(EMFHelper.findInRegistry(type.getEPackage()), eContainingFeature);
		final EObject value = EcoreUtil.create(mappedType);
		final Command command = AddCommand.create(editingDomain, container, mappedContainingFeature, value);
		assertNotNull("The command is null", command);
		editingDomain.getCommandStack().execute(command);
		return value;
	}

	public void unsetAttribute(PropertiesEditionElement propertiesEditionElement,
			ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, Collection<String> values) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		EStructuralFeature mappedFeature = EMFHelper.map(EMFHelper.findInRegistry(((EClass)eContainingFeature.eContainer()).getEPackage()), eContainingFeature);
		if (mappedFeature instanceof EAttribute) {
			activeResource = eObjectFromReferenceableEObject.eResource();
			if (mappedFeature.isMany()) {
				final Command command = RemoveCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, values);
				assertNotNull("The command is null", command);
				editingDomain.getCommandStack().execute(command);
			} else {
				final Command command = SetCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, null);
				assertNotNull("The command is null", command);
				editingDomain.getCommandStack().execute(command);
			}
		} else {
			fail("Cannot unset without a eContainingFeature attribute");
		}
		
	}
	
	public void unsetReference(PropertiesEditionElement propertiesEditionElement,
			ReferenceableObject referenceableObject,
			EStructuralFeature eContainingFeature, Collection<ReferenceableObject> values) {
		final EObject eObjectFromReferenceableEObject = interpreter.getEObjectFromReferenceableEObject(referenceableObject);
		EStructuralFeature mappedFeature = EMFHelper.map(EMFHelper.findInRegistry(((EClass)eContainingFeature.eContainer()).getEPackage()), eContainingFeature);
		if (mappedFeature instanceof EReference) {
			activeResource = eObjectFromReferenceableEObject.eResource();
			if (mappedFeature.isMany()) {
				Collection<EObject> valuesToUnset = new ArrayList<EObject>();
				for (ReferenceableObject value : values) {
					valuesToUnset.add(interpreter.getEObjectFromReferenceableEObject(value));
				}
				final Command command = RemoveCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, valuesToUnset);
				assertNotNull("The command is null", command);
				editingDomain.getCommandStack().execute(command);
			} else {
				final Command command = SetCommand.create(editingDomain, eObjectFromReferenceableEObject, mappedFeature, null);
				assertNotNull("The command is null", command);
				editingDomain.getCommandStack().execute(command);
			}
		} else {
			fail("Cannot unset without a eContainingFeature reference");
		}
		
	}

	public void undo(Action action) {
		Processing precedingEditActionOrSequence = EEFModelingBotHelper.getPrecedingEditActionOrSequence(action);
		if (EEFModelingBotHelper.isWizard(precedingEditActionOrSequence)) {
			int numberOfActionToUndo = EEFModelingBotHelper.getNumberOfActionToUndo(precedingEditActionOrSequence);
			for (int i = 0; i < numberOfActionToUndo; i++) {
				editingDomain.getCommandStack().undo();
			}
		} else {
			editingDomain.getCommandStack().undo();
		}
		
	}

	public void redo(Action action) {
		Processing precedingEditActionOrSequence = EEFModelingBotHelper.getPrecedingEditActionOrSequence(action);
		if (EEFModelingBotHelper.isWizard(precedingEditActionOrSequence)) {
			int numberOfActionToRedo = EEFModelingBotHelper.getNumberOfActionToUndo(precedingEditActionOrSequence);
			for (int i = 0; i < numberOfActionToRedo; i++) {
				editingDomain.getCommandStack().redo();
			}
		} else {
			editingDomain.getCommandStack().redo();
		}
		
	}

}
