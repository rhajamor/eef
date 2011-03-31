/**
 *  Copyright (c) 2008 - 2011 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.toolkits.providers;

import org.eclipse.osgi.util.NLS;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ToolkitsMessages extends NLS {
	
	private static final String BUNDLE_NAME = "org.eclipse.emf.eef.toolkits.providers.toolkitsMessages"; //$NON-NLS-1$

	
	public static String ToolkitPropertiesEditionPart_PropertiesGroupLabel;

	
	public static String WidgetPropertiesEditionPart_PropertiesGroupLabel;

	
	public static String Toolkit_ReadOnly;

	
	public static String Toolkit_Part_Title;

	
	public static String Widget_ReadOnly;

	
	public static String Widget_Part_Title;

	
	public static String ToolkitPropertiesEditionPart_NameLabel;

	
	public static String WidgetPropertiesEditionPart_NameLabel;

	
	public static String PropertiesEditionPart_DocumentationLabel;

	
	public static String PropertiesEditionPart_IntegerValueMessage;

	
	public static String PropertiesEditionPart_FloatValueMessage;

	
	public static String PropertiesEditionPart_ShortValueMessage;

	
	public static String PropertiesEditionPart_LongValueMessage;

	
	public static String PropertiesEditionPart_ByteValueMessage;

	
	public static String PropertiesEditionPart_BigIntegerValueMessage;

	
	public static String PropertiesEditionPart_BigDecimalValueMessage;

	
	public static String PropertiesEditionPart_DoubleValueMessage;

	
	public static String PropertiesEditionPart_PropertiesGroupLabel;

	
	public static String PropertiesEditionPart_RequiredFeatureMessage;

	
	public static String PropertiesEditionPart_AddTableViewerLabel;

	
	public static String PropertiesEditionPart_EditTableViewerLabel;

	
	public static String PropertiesEditionPart_RemoveTableViewerLabel;

	
	public static String PropertiesEditionPart_AddListViewerLabel;

	
	public static String PropertiesEditionPart_RemoveListViewerLabel;

	// Start of user code for additionnal NLS Constants

// End of user code

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, ToolkitsMessages.class);
	}

	
	private ToolkitsMessages() {
		//protect instanciation
	}
}
