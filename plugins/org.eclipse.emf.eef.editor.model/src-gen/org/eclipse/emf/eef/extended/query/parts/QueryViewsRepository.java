/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 ******************************************************************************
 */
package org.eclipse.emf.eef.extended.query.parts;

/**
 * 
 * 
 */
public class QueryViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * OCLQuery view descriptor
	 * 
	 */
	public static class OCLQuery {
		public static class Properties {
	
			
			public static String context = "query::OCLQuery::Properties::context";
			
			
			public static String query_ = "query::OCLQuery::Properties::query_";
			
	
		}
	
	}

	/**
	 * ExplicitPathQuery view descriptor
	 * 
	 */
	public static class ExplicitPathQuery {
		public static class Properties {
	
			
			public static String query_ = "query::ExplicitPathQuery::Properties::query_";
			
	
		}
	
	}

}
