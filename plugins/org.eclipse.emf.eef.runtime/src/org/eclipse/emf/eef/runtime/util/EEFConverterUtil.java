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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class EEFConverterUtil extends EcoreUtil {

	/**
	 * Converts from a string to an int
	 * 
	 * @param eInt
	 *            the EDatatype EInt
	 * @param literal
	 *            the literal to convert
	 * @return the primitive int representing the literal.
	 */
	public static int createIntFromString(EDataType eInt, String literal) {
		Integer value = (Integer)createFromString(eInt, literal);
		return value.intValue();
	}

	/**
	 * Converts from a string to a double
	 * 
	 * @param eDouble
	 *            the EDatatype EDouble
	 * @param literal
	 *            the literal to convert
	 * @return the primitive double representing the literal.
	 */
	public static double createDoubleFromString(EDataType eDouble, String literal) {
		Double value = (Double)createFromString(eDouble, literal);
		return value.doubleValue();
	}

	/**
	 * Converts from a string to a byte
	 * 
	 * @param eByte
	 *            the EDatatype EByte
	 * @param literal
	 *            the literal to convert
	 * @return the primitive byte representing the literal.
	 */
	public static byte createByteFromString(EDataType eByte, String literal) {
		Byte value = (Byte)createFromString(eByte, literal);
		return value.byteValue();
	}

	/**
	 * Converts from a string to a short
	 * 
	 * @param eShort
	 *            the EDatatype EShort
	 * @param literal
	 *            the literal to convert
	 * @return the primitive short representing the literal.
	 */
	public static short createShortFromString(EDataType eShort, String literal) {
		Short value = (Short)createFromString(eShort, literal);
		return value.shortValue();
	}

	/**
	 * Converts from a string to a long
	 * 
	 * @param eLong
	 *            the EDatatype ELong
	 * @param literal
	 *            the literal to convert
	 * @return the primitive long representing the literal.
	 */
	public static long createLongFromString(EDataType eLong, String literal) {
		Long value = (Long)createFromString(eLong, literal);
		return value.longValue();
	}

	/**
	 * Converts from a string to a float
	 * 
	 * @param eFloat
	 *            the EDatatype EFloat
	 * @param literal
	 *            the literal to convert
	 * @return the primitive float representing the literal.
	 */
	public static float createFloatFromString(EDataType eFloat, String literal) {
		Float value = (Float)createFromString(eFloat, literal);
		return value.floatValue();
	}

	/**
	 * Converts from a string to a char
	 * 
	 * @param eChar
	 *            the EDatatype EChar
	 * @param literal
	 *            the literal to convert
	 * @return the primitive char representing the literal.
	 */
	public static char createCharFromString(EDataType eChar, String literal) {
		Character value = (Character)createFromString(eChar, literal);
		return value.charValue();
	}

	/**
	 * Converts from a string to a boolean
	 * 
	 * @param eBoolean
	 *            the EDatatype EBoolean
	 * @param literal
	 *            the literal to convert
	 * @return the primitive boolean representing the literal.
	 */
	public static boolean createBooleanFromString(EDataType eBoolean, String literal) {
		Boolean value = (Boolean)createFromString(eBoolean, literal);
		return value.booleanValue();
	}
}
