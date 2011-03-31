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

import org.eclipse.ui.forms.events.HyperlinkEvent;

/**
 * @author glefur
 *
 */
public abstract class MessageHandler {
	
	protected MessageProcessor processor;
	
	/**
	 * @param event the event to handle
	 * @return <code>true</code> if the handle have to be processed.
	 */
	public abstract boolean handle(HyperlinkEvent event);
	
	/**
	 * Process the given message.
	 * @param event the event to handle.
	 */
	public abstract void process(HyperlinkEvent event);

	/**
	 * @param superHandler the superHandler to set
	 */
	public void setProcessor(MessageProcessor superHandler) {
		this.processor = superHandler;
	}
	
}
