/**
 *  Copyright (c) 2008 - 2010 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 *
 */
package org.eclipse.emf.eef.components.parts;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ComponentsViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;



	/**
	 * PropertiesEditionContext view descriptor
	 * 
	 */
	public static class PropertiesEditionContext {
		public static class Binding {
	
			
			public static String model = "components::PropertiesEditionContext::Binding::model";
			
	
		}
	
	}

	/**
	 * PropertiesEditionComponent view descriptor
	 * 
	 */
	public static class PropertiesEditionComponent {
		public static class Properties {
	
			
			public static String name = "components::PropertiesEditionComponent::Properties::name";
			
			
			public static String helpID = "components::PropertiesEditionComponent::Properties::helpID";
			
			
			public static String explicit = "components::PropertiesEditionComponent::Properties::explicit";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "components::PropertiesEditionComponent::Binding::model";
			
			
			public static String views = "components::PropertiesEditionComponent::Binding::views";
			
	
		}
	
	}

	/**
	 * PropertiesEditionElement view descriptor
	 * 
	 */
	public static class PropertiesEditionElement {
		public static class Properties {
	
			
			public static String name = "components::PropertiesEditionElement::Properties::name";
			
			
			public static String helpID = "components::PropertiesEditionElement::Properties::helpID";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "components::PropertiesEditionElement::Binding::model";
			
			
			public static String views = "components::PropertiesEditionElement::Binding::views";
			
	
		}
	
	}

	/**
	 * PropertiesMultiEditionElement view descriptor
	 * 
	 */
	public static class PropertiesMultiEditionElement {
		public static class Properties {
	
			
			public static String name = "components::PropertiesMultiEditionElement::Properties::name";
			
			
			public static String helpID = "components::PropertiesMultiEditionElement::Properties::helpID";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "components::PropertiesMultiEditionElement::Binding::model";
			
			
			public static String views = "components::PropertiesMultiEditionElement::Binding::views";
			
	
		}
	
	}

}
