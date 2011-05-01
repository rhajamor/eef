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
package org.eclipse.emf.eef.runtime.util;

import java.util.StringTokenizer;

import org.eclipse.swt.graphics.RGB;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class StringTools {

	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	public static RGB toRGB(String s) {
		if (s != null) {
			StringTokenizer st = new StringTokenizer(s, EEFRuntimeMessages.StringTools_color_delim);
			if (st.countTokens() == 3) {
				try {
					int red = Integer.parseInt(st.nextToken());
					int green = Integer.parseInt(st.nextToken());
					int blue = Integer.parseInt(st.nextToken());
					return new RGB(red, green, blue);
				} catch (NumberFormatException e) {
					return null;
				}
			}
		}
		return null;
	}

	public static boolean isInt(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isFloat(String text) {
		try {
			Float.parseFloat(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isByte(String text) {
		try {
			Byte.parseByte(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isDouble(String text) {
		try {
			Double.parseDouble(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isLong(String text) {
		try {
			Long.parseLong(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isShort(String text) {
		try {
			Short.parseShort(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static String toL1Case(String name) {
		StringBuffer buf = new StringBuffer();
		buf.append(name.substring(0, 1).toLowerCase());
		buf.append(name.substring(1));
		return buf.toString();
	}

	public static String toU1Case(String name) {
		StringBuffer buf = new StringBuffer();
		buf.append(name.substring(0, 1).toUpperCase());
		buf.append(name.substring(1));
		return buf.toString();
	}
}
