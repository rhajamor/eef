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

package org.eclipse.emf.eef.modelingBot.helper;


/**
 * Utility class for Styring Manipulations.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public final class StringHelper {

	/**
	 * Constructor.
	 */
	private StringHelper() {
		// avoid instanciation
	}

	/**
	 * Return the string with the firstChar Uppercased.
	 * 
	 * @param from
	 *            the string to modify
	 * @return the String with the first char uppercased.
	 */
	public static String toU1Case(String from) {
		if (from.length() > 0) {
			final StringBuilder sb = new StringBuilder(from.length());
			sb.append(Character.toUpperCase(from.charAt(0))).append(from.substring(1));
			return sb.toString();
		}
		return ""; //$NON-NLS-1$
	}
	
}
