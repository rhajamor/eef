/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.editor.messages;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;


/**
 * @author glefur
 *
 */
public class MessageProcessor extends HyperlinkAdapter {

	private FormEditor formEditor;
	private Collection<MessageHandler> handlers; 
	
	/**
	 * 
	 */
	public MessageProcessor() {
		handlers = new HashSet<MessageHandler>();
	}
	
	/**
	 * @param editor
	 */
	public void init(InteractiveEEFEditor editor) {
		this.formEditor = editor;
		for (@SuppressWarnings("rawtypes") Iterator iterator = editor.getPages().iterator(); iterator.hasNext();) {
			Object page = iterator.next();
			//TODO: reactivate this
//			if (page instanceof FormPage)
//				((FormPage)page).getManagedForm().getForm().getForm().addMessageHyperlinkListener(this);
		}
	}

	/**
	 * @param handler the handler to add.
	 */
	public void addHandler(MessageHandler handler) {
		handler.setProcessor(this);
		handlers.add(handler);
	}
	
	/**
	 * @param handler the handler to remove.
	 */
	public void removeHandler(MessageHandler handler) {
		handlers.remove(handler);
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.forms.events.HyperlinkAdapter#linkActivated(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	public void linkActivated(HyperlinkEvent event) {
		for (MessageHandler handler : handlers) {
			if (handler.handle(event))
				handler.process(event);
		}
	}
	
	/**
	 * Add a message to the form editor header	
	 * @param key a unique key to identify message
	 * @param message the message to display
	 * @param severity the message severity
	 */
	public void addMessage(final Object key, final String message, final int severity) {
		if (formEditor.getSelectedPage() instanceof FormPage) {
			final FormPage selectedPage = (FormPage) formEditor.getSelectedPage();
			selectedPage.getPartControl().getDisplay().asyncExec(new Runnable() {
				
				public void run() {
					IMessageManager messageManager = selectedPage.getManagedForm().getMessageManager();
					messageManager.addMessage(key, message, null, severity);
				}
			});
		}
	}

	/**
	 * Remove the messages associated to the given event.
	 * @param control the key control.
	 */
	public void removeAssociatedMessages(Control control) {
		if (formEditor.getSelectedPage() instanceof FormPage) {
			((FormPage) formEditor.getSelectedPage()).getManagedForm().getMessageManager().removeMessages(control);
		}
	}
	
}
