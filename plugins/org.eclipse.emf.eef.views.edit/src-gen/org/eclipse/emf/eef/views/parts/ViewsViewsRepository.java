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
package org.eclipse.emf.eef.views.parts;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ViewsViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Documentation view descriptor
	 * 
	 */
	public static class Documentation {
		public static class Documentation_ {
	
			
			public static String documentation__ = "views::Documentation::Documentation_::documentation__";
			
	
		}
	
	}

	/**
	 * ViewsRepository view descriptor
	 * 
	 */
	public static class ViewsRepository {
		public static class Properties {
	
			
			public static String name = "views::ViewsRepository::Properties::name";
			
			
			public static String repositoryKind = "views::ViewsRepository::Properties::RepositoryKind";
			
	
		}
	
	}

	/**
	 * View view descriptor
	 * 
	 */
	public static class View {
		public static class Properties {
	
			
			public static String name = "views::View::Properties::name";
			
			
			public static String representation = "views::View::Properties::representation";
			
			
			public static String explicit = "views::View::Properties::explicit";
			
	
		}
	
	}

	/**
	 * ElementEditor view descriptor
	 * 
	 */
	public static class ElementEditor {
		public static class Properties {
	
			
			public static String name = "views::ElementEditor::Properties::name";
			
			
			public static String representation = "views::ElementEditor::Properties::representation";
			
			
			public static String readOnly = "views::ElementEditor::Properties::readOnly";
			
	
		}
	
	}

	/**
	 * Category view descriptor
	 * 
	 */
	public static class Category {
		public static class Properties {
	
			
			public static String name = "views::Category::Properties::name";
			
	
		}
	
	}

	/**
	 * Container view descriptor
	 * 
	 */
	public static class Container {
		public static class Properties {
	
			
			public static String name = "views::Container::Properties::name";
			
			
			public static String representation = "views::Container::Properties::representation";
			
	
		}
	
	}

	/**
	 * CustomElementEditor view descriptor
	 * 
	 */
	public static class CustomElementEditor {
		public static class Properties {
	
			
			public static String name = "views::CustomElementEditor::Properties::name";
			
			
			public static String representation = "views::CustomElementEditor::Properties::representation";
			
			
			public static String readOnly = "views::CustomElementEditor::Properties::readOnly";
			
	
		}
	
	}

	/**
	 * CustomView view descriptor
	 * 
	 */
	public static class CustomView {
		public static class Properties {
	
			
			public static String name = "views::CustomView::Properties::name";
			
	
		}
	
	}

	/**
	 * ViewReference view descriptor
	 * 
	 */
	public static class ViewReference {
		public static class Properties {
	
			
			public static String name = "views::ViewReference::Properties::name";
			
			
			public static String referencedView = "views::ViewReference::Properties::referencedView";
			
	
		}
	
	}

}
