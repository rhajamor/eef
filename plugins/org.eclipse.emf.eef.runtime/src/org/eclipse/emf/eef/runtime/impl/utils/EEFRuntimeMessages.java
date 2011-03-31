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
package org.eclipse.emf.eef.runtime.impl.utils;

import org.eclipse.osgi.util.NLS;

public class EEFRuntimeMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.eef.runtime.impl.utils.eefRuntimeMessages"; //$NON-NLS-1$

	public static String ComposedPropertiesEditionComponent_cmd_not_performed;

	public static String ComposedPropertiesEditionComponent_eef_validation_diagnostic;

	public static String ComposedPropertiesEditionComponent_no_problem;

	public static String CurrentModelViewerFilter_name;

	public static String ModelViewerHelper_name_feature;

	public static String ReferencedModelsViewerFilter_name;

	public static String StringTools_color_delim;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, EEFRuntimeMessages.class);
	}

	private EEFRuntimeMessages() {
	}
}
