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
package org.eclipse.emf.eef.mapping.parts;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class MappingViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


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
	 * ModelNavigation view descriptor
	 * 
	 */
	public static class ModelNavigation {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * SimpleModelNavigation view descriptor
	 * 
	 */
	public static class SimpleModelNavigation {
		public static class Properties {
	
			
			public static String index = "mapping::SimpleModelNavigation::Properties::index";
			
			
			public static String feature = "mapping::SimpleModelNavigation::Properties::feature";
			
			
			public static String discriminatorType = "mapping::SimpleModelNavigation::Properties::discriminatorType";
			
	
		}
	
	}

	/**
	 * OnlyReferenceTypeFilter view descriptor
	 * 
	 */
	public static class OnlyReferenceTypeFilter {
		public static class ReferencedFeature {
	
			
			public static String referencedFeature_ = "mapping::OnlyReferenceTypeFilter::Referenced feature::referencedFeature_";
			
	
		}
	
	
	public static String filterProperties = "mapping::OnlyReferenceTypeFilter::filter properties";
	
	}

	/**
	 * OCLFilter view descriptor
	 * 
	 */
	public static class OCLFilter {
		public static class FilterExpression {
	
			
			public static String oCLExpressionBody = "mapping::OCLFilter::Filter expression::OCLExpressionBody";
			
	
		}
	
	
	public static String filterProperties = "mapping::OCLFilter::filter properties";
	
	}

	/**
	 * JavaExpressionFilter view descriptor
	 * 
	 */
	public static class JavaExpressionFilter {
		public static class FilterExpression {
	
			
			public static String javaExpressionBody = "mapping::JavaExpressionFilter::Filter expression::javaExpressionBody";
			
	
		}
	
	
	public static String filterProperties = "mapping::JavaExpressionFilter::filter properties";
	
	}

	/**
	 * JavaDeclarationFilter view descriptor
	 * 
	 */
	public static class JavaDeclarationFilter {
		public static class FilterExpression {
	
			
			public static String methodName = "mapping::JavaDeclarationFilter::Filter expression::methodName";
			
	
		}
	
	
	public static String filterProperties = "mapping::JavaDeclarationFilter::filter properties";
	
	}

	/**
	 * StrictTypingFilter view descriptor
	 * 
	 */
	public static class StrictTypingFilter {
		public static class Type {
	
			
			public static String restriction = "mapping::StrictTypingFilter::Type::Restriction";
			
	
		}
	
	
	public static String filterProperties = "mapping::StrictTypingFilter::filter properties";
	
	}

}
