/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.components.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.command.StandardEditingCommand;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingSemanticListener;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesValidationEditingEvent;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.util.StringTools;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public abstract class StandardPropertiesEditingComponent implements PropertiesEditingComponent {

	private static final long DELAY = 500L;

	public static final Object FIRE_PROPERTIES_CHANGED_JOB_FAMILY = new Object();

	/**
	 * List of PropertiesEditingListener
	 */
	private List<PropertiesEditingListener> listeners;

	/**
	 * the semantic listener dedicated to update view
	 */
	protected PropertiesEditingSemanticListener semanticAdapter;

	/**
	 * the editing domain where to perform live update
	 */
	protected EditingDomain liveEditingDomain;

	/**
	 * the job that will fire the property changed event
	 */
	protected FirePropertiesChangedJob firePropertiesChangedJob;

	/**
	 * Editing context
	 */
	protected PropertiesEditingContext editingContext;

	/**
	 * the editing mode
	 */
	protected String editing_mode;

	/**
	 * Is the component is current initializing
	 */
	protected boolean initializing = false;

	/**
	 * List of {@link PropertiesEditingPart}'s key managed by the component.
	 */
	protected String[] parts;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject)
	 */
	public void initPart(Object key, int kind, EObject element) {
		this.initPart(key, kind, element, editingContext.getResourceSet());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#partsList()
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#addListener(org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener)
	 */
	public void addListener(PropertiesEditingListener listener) {
		if (listeners == null)
			listeners = new ArrayList<PropertiesEditingListener>();
		listeners.add(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#removeListener(org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener)
	 */
	public void removeListener(PropertiesEditingListener listener) {
		if (listeners != null)
			listeners.remove(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#setLiveEditingDomain(org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public void setLiveEditingDomain(EditingDomain editingDomain) {
		this.liveEditingDomain = editingDomain;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 */
	protected PropertiesEditingSemanticListener initializeSemanticAdapter() {
		return new PropertiesEditingSemanticListener(this) {

			public void runUpdateRunnable(Notification msg) {
				updatePart(msg);
			}
		};
	}

	/**
	 * Update the part in response to a semantic event
	 * 
	 * @param msg
	 *            the semantic event
	 */
	public abstract void updatePart(Notification msg);

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 */
	private void propagateEvent(PropertiesEditingEvent event) {
		event.addHolder(this);
		for (PropertiesEditingListener listener : listeners) {
			if (!event.hold(listener))
				listener.firePropertiesChanged(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 */
	public void firePropertiesChanged(final PropertiesEditingEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				propagateEvent(new PropertiesValidationEditingEvent(event, valueDiagnostic));
			else {
				if (PropertiesEditingComponent.BATCH_MODE.equals(editing_mode)) {
					updateSemanticModel(event);
				} else if (PropertiesEditingComponent.LIVE_MODE.equals(editing_mode)) {
					liveEditingDomain.getCommandStack().execute(new StandardEditingCommand(new EObjectPropertiesEditingContext(editingContext, this, editingContext.getEObject(), editingContext.getAdapterFactory())) {

						public void execute() {
							updateSemanticModel(event);
							description = context.getChangeRecorder().endRecording();
							context.getChangeRecorder().dispose();
						}						
						
					});
				}
				Diagnostic validate = validate();
				propagateEvent(new PropertiesValidationEditingEvent(event, validate));
			}
			propagateEvent(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#lazyFirePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 */
	public void delayedFirePropertiesChanged(PropertiesEditingEvent event) {
		if (PropertiesEditingComponent.BATCH_MODE.equals(editing_mode)) {
			firePropertiesChanged(event);
		} else if (PropertiesEditingComponent.LIVE_MODE.equals(editing_mode)) {
			if (getFirePropertiesChangedJob().cancel()) {
				getFirePropertiesChangedJob().setEvent(event);
				getFirePropertiesChangedJob().schedule(DELAY);
			} else {
				try {
					getFirePropertiesChangedJob().join();
					getFirePropertiesChangedJob().setEvent(event);
					getFirePropertiesChangedJob().schedule();
				} catch (InterruptedException e) {
					getFirePropertiesChangedJob().setEvent(null);
				}
			}
		}
	}

	protected FirePropertiesChangedJob getFirePropertiesChangedJob() {
		if (firePropertiesChangedJob == null) {
			firePropertiesChangedJob = new FirePropertiesChangedJob("Fire properties changed...");
		}
		return firePropertiesChangedJob;
	}

	protected class FirePropertiesChangedJob extends Job {

		private PropertiesEditingEvent fEvent;

		public FirePropertiesChangedJob(String name) {
			super(name);
		}

		@Override
		public boolean belongsTo(Object family) {
			return family == FIRE_PROPERTIES_CHANGED_JOB_FAMILY;
		}

		@Override
		public boolean shouldSchedule() {
			return fEvent != null;
		}

		@Override
		public boolean shouldRun() {
			return fEvent != null;
		}

		@Override
		protected void canceling() {
			super.canceling();
			fEvent = null;
		}

		public void setEvent(PropertiesEditingEvent event) {
			fEvent = event;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			deactivate();
			firePropertiesChanged(fEvent);
			activate();
			fEvent = null;
			return Status.OK_STATUS;
		}
	}

	/**
	 * Update the model in response to a view event
	 * 
	 * @param event
	 *            the view event
	 */
	public abstract void updateSemanticModel(PropertiesEditingEvent event);

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#mustBeComposed(java.lang.Object,
	 *      int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#isRequired(java.lang.String,
	 *      int)
	 */
	public boolean isRequired(Object key, int kind) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#getHelpContent(java.lang.String,
	 *      int)
	 */
	public String getHelpContent(Object key, int kind) {
		return StringTools.EMPTY_STRING;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#translatePart(java.lang.String)
	 */
	public Object translatePart(String key) {
		return null;
	}

	/**
	 * @return the initializing
	 */
	public boolean isInitializing() {
		return initializing;
	}

	/**
	 * @param initializing
	 *            the initializing to set
	 */
	public void setInitializing(boolean initializing) {
		this.initializing = initializing;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#setPropertiesEditingPart(java.lang.Object,
	 *      int, org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart)
	 */
	public void setPropertiesEditingPart(Object key, int kind, PropertiesEditingPart propertiesEditingPart) {
		// Default case : nothing to do
	}

}
