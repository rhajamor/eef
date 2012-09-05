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
package org.eclipse.emf.eef.mapping.parts;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class MappingViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * EMFElementBinding view descriptor
	 * 
	 */
	public static class EMFElementBinding {
		public static class Properties {
	
			
			public static String name = "mapping::EMFElementBinding::Properties::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "mapping::EMFElementBinding::Binding::model";
			
			
			public static String views = "mapping::EMFElementBinding::Binding::views";
			
	
		}
	
	}

	/**
	 * EMFPropertyBinding view descriptor
	 * 
	 */
	public static class EMFPropertyBinding {
		public static class Properties {
	
			
			public static String name = "mapping::EMFPropertyBinding::Properties::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "mapping::EMFPropertyBinding::Binding::model";
			
			
			public static String views = "mapping::EMFPropertyBinding::Binding::views";
			
	
		}
	
	}

	/**
	 * StandardElementBinding view descriptor
	 * 
	 */
	public static class StandardElementBinding {
		public static class Properties {
	
			
			public static String name = "mapping::StandardElementBinding::Properties::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "mapping::StandardElementBinding::Binding::model";
			
			
			public static String views = "mapping::StandardElementBinding::Binding::views";
			
	
		}
	
	}

	/**
	 * StandardPropertyBinding view descriptor
	 * 
	 */
	public static class StandardPropertyBinding {
		public static class Properties {
	
			
			public static String name = "mapping::StandardPropertyBinding::Properties::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "mapping::StandardPropertyBinding::Binding::model";
			
			
			public static String views = "mapping::StandardPropertyBinding::Binding::views";
			
	
		}
	
	}

	/**
	 * Category view descriptor
	 * 
	 */
	public static class Category {
		public static class Properties {
	
			
			public static String name = "mapping::Category::Properties::name";
			
	
		}
	
	}

	/**
	 * ElementBindingReference view descriptor
	 * 
	 */
	public static class ElementBindingReference {
		public static class Reference {
	
			
			public static String binding = "mapping::ElementBindingReference::Réference::binding";
			
	
		}
	
	}

	/**
	 * EMFMultiPropertiesBinding view descriptor
	 * 
	 */
	public static class EMFMultiPropertiesBinding {
		public static class Properties {
	
			
			public static String name = "mapping::EMFMultiPropertiesBinding::Properties::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "mapping::EMFMultiPropertiesBinding::Binding::model";
			
			
			public static String views = "mapping::EMFMultiPropertiesBinding::Binding::views";
			
	
		}
	
	}


	/**
	 * Documentation view descriptor
	 * 
	 */
	public static class Documentation {
		public static class Documentation_ {
	
			
			public static String documentation__ = "mapping::Documentation::Documentation_::documentation__";
			
	
		}
	
	}

	/**
	 * Filter properties view descriptor
	 * 
	 */
	public static class FilterProperties {
		public static class FilterProperties_ {
	
			
			public static String name = "mapping::Filter properties::Filter Properties_::Name";
			
			
			public static String mandatory = "mapping::Filter properties::Filter Properties_::Mandatory";
			
	
		}
	
	}

}
