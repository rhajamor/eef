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
package org.eclipse.emf.eef.runtime.notify.impl;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class PropertiesValidationEditingEvent implements PropertiesEditingEvent {

	private PropertiesEditingEvent event;

	private Diagnostic diagnostic;

	/**
	 * @return the diagnostic
	 */
	public Diagnostic getDiagnostic() {
		return diagnostic;
	}

	public PropertiesValidationEditingEvent(PropertiesEditingEvent event, Diagnostic diag) {
		this.event = event;
		this.diagnostic = diag;
	}

	/**
	 * @param newHolder
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#addHolder(org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener)
	 */
	public void addHolder(PropertiesEditingListener newHolder) {
		event.addHolder(newHolder);
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getAffectedEditor()
	 */
	public Object getAffectedEditor() {
		return event.getAffectedEditor();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getHolders()
	 */
	public List<PropertiesEditingListener> getHolders() {
		return event.getHolders();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getKind()
	 */
	public int getKind() {
		return event.getKind();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getNewIndex()
	 */
	public int getNewIndex() {
		return event.getNewIndex();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getNewValue()
	 */
	public Object getNewValue() {
		return event.getNewValue();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getOldValue()
	 */
	public Object getOldValue() {
		return event.getOldValue();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#getState()
	 */
	public int getState() {
		return event.getState();
	}

	/**
	 * @param toTest
	 * @return
	 * @see org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl#hold(org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener)
	 */
	public boolean hold(PropertiesEditingListener toTest) {
		return event.hold(toTest);
	}

}
