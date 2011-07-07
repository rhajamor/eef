/*******************************************************************************
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.codegen.core.launcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * @deprecated use {@link org.eclipse.emf.eef.codegen.launcher.EEFLauncher}
 */
public class EEFLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			if (args.length != 3) {
				System.out.println("Arguments not valid : {model, folder, basePackage}.");
			} else {
				URI modelURI = URI.createFileURI(args[0]);
				File folder = new File(args[1]);
				BasicMonitor monitor = new BasicMonitor();
				List<Object> arguments = new ArrayList<Object>();
				arguments.add(args[2]);
				
				monitor.subTask("Loading templates...");
				org.eclipse.emf.eef.codegen.launcher.EEFLauncher launcher = new org.eclipse.emf.eef.codegen.launcher.EEFLauncher(modelURI, folder, arguments);
				monitor.worked(1);
				monitor.subTask("Generating using "
						+ modelURI.lastSegment() + "...");
				launcher.doGenerate(monitor);
				monitor.worked(1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
