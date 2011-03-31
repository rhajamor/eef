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
package org.eclipse.emf.eef.runtime.query.explicitpath.exception;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EvaluationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 800645398898568026L;

	/**
	 * 
	 */
	public EvaluationException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EvaluationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public EvaluationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public EvaluationException(Throwable cause) {
		super(cause);
	}

	/**
	 * {@inheritDoc}
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return "Error during model navigation : " + super.getMessage();
	}

	
	
}
