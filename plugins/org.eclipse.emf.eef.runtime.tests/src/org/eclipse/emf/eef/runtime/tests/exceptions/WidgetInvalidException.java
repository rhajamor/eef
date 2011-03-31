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
package org.eclipse.emf.eef.runtime.tests.exceptions;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
  *
 */
public class WidgetInvalidException extends Exception {

	/**
	 * Serialization
	 */
	private static final long serialVersionUID = 5938605662196039272L;
	
	private String messageInfo;
	
	/**
	 * default constructor 
	 */
	public WidgetInvalidException() {
		super();
	}

	/**
	 * constructor with info
	 * @param info the info
	 */
	public WidgetInvalidException(String info) {
		super();
		this.messageInfo = "The widget doesn't contain elements " + info;
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		String message = "The widget is invalid for test";
		if (messageInfo != null) {
			StringBuilder builder = new StringBuilder(message);
			builder.append(" : ");
			builder.append(messageInfo);
			return builder.toString();
		}
		return message;
	}
	
	

}
