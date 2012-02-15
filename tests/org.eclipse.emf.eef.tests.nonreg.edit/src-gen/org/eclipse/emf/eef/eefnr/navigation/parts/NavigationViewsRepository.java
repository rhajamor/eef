/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.navigation.parts;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class NavigationViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * DeferedFlatReferencesTableSample view descriptor
	 * 
	 */
	public static class DeferedFlatReferencesTableSample {
		public static class Properties {
	
			
			public static String name = "navigation::DeferedFlatReferencesTableSample::properties::name";
			
			
			public static String flatReferencesTableSampleEditor = "navigation::DeferedFlatReferencesTableSample::properties::flatReferencesTableSampleEditor";
			
	
		}
	
	}

	/**
	 * DeferedReferencesTableSample view descriptor
	 * 
	 */
	public static class DeferedReferencesTableSample {
		public static class Properties {
	
			
			public static String name = "navigation::DeferedReferencesTableSample::properties::name";
			
			
			public static String referencesTableSampleEditor = "navigation::DeferedReferencesTableSample::properties::referencesTableSampleEditor";
			
	
		}
	
	}

	/**
	 * Owner view descriptor
	 * 
	 */
	public static class Owner {
		public static class Properties {
	
			
			public static String name = "navigation::Owner::properties::name";
			
			
			public static String multipleSampleForTableComposition = "navigation::Owner::properties::multipleSampleForTableComposition";
			
			
			public static String multipleSampleForAdvancedTableComposition = "navigation::Owner::properties::multipleSampleForAdvancedTableComposition";
			
			
			public static String multipleSampleForReferencesTable = "navigation::Owner::properties::multipleSampleForReferencesTable";
			
			
			public static String multipleSampleForAdvancedReferencesTable = "navigation::Owner::properties::multipleSampleForAdvancedReferencesTable";
			
			
			public static String multipleSampleForFlatReferencesTable = "navigation::Owner::properties::multipleSampleForFlatReferencesTable";
			
			
			public static String singleSampleForTableComposition = "navigation::Owner::properties::singleSampleForTableComposition";
			
			
			public static String singleSampleForAdvancedTableComposition = "navigation::Owner::properties::singleSampleForAdvancedTableComposition";
			
			
			public static String singleSampleForReferencesTable = "navigation::Owner::properties::singleSampleForReferencesTable";
			
			
			public static String singleSampleForAdvancedReferencesTable = "navigation::Owner::properties::singleSampleForAdvancedReferencesTable";
			
			
			public static String singleSampleForFlatReferencesTable = "navigation::Owner::properties::singleSampleForFlatReferencesTable";
			
			
			public static String singleContainmentForEObjectFlatComboViewer = "navigation::Owner::properties::singleContainmentForEObjectFlatComboViewer";
			
			
			public static String singleReferencesForEObjectFlatComboViewer = "navigation::Owner::properties::singleReferencesForEObjectFlatComboViewer";
			
			
			public static String singleContainmentForAdvancedEObjectFlatComboViewer = "navigation::Owner::properties::singleContainmentForAdvancedEObjectFlatComboViewer";
			
			
			public static String singleReferencesForAdvancedEObjectFlatComboViewer = "navigation::Owner::properties::singleReferencesForAdvancedEObjectFlatComboViewer";
			
	
		}
	
	}

	/**
	 * Subtype view descriptor
	 * 
	 */
	public static class Subtype {
	
	public static String ownerView = "navigation::Subtype::ownerView";
	
		public static class Specialisation {
	
			
			public static String specialisedElement = "navigation::Subtype::Specialisation::specialisedElement";
			
	
		}
	
	}

	/**
	 * AnotherSubtype view descriptor
	 * 
	 */
	public static class AnotherSubtype {
	
	public static String subtypeView = "navigation::AnotherSubtype::subtypeView";
	
		public static class AnotherSpecialisation {
	
			
			public static String anotherSpecialisationElement = "navigation::AnotherSubtype::Another specialisation::anotherSpecialisationElement";
			
	
		}
	
	}

	/**
	 * NamedElement view descriptor
	 * 
	 */
	public static class NamedElement {
		public static class Properties {
	
			
			public static String name = "navigation::NamedElement::properties::name";
			
	
		}
	
	}

	/**
	 * Element view descriptor
	 * 
	 */
	public static class Element {
		public static class Properties {
	
			
			public static String isVisible = "navigation::Element::properties::isVisible";
			
	
		}
	
	
	public static String namedElementView = "navigation::Element::namedElementView";
	
	}

	/**
	 * AttributeNavigationSample view descriptor
	 * 
	 */
	public static class AttributeNavigationSample {
		public static class Properties {
	
			
			public static String name = "navigation::AttributeNavigationSample::properties::name";
			
			
			public static String delegate1ForSingleValued = "navigation::AttributeNavigationSample::properties::delegate1ForSingleValued";
			
			
			public static String delegate2ForSingleValued = "navigation::AttributeNavigationSample::properties::delegate2ForSingleValued";
			
			
			public static String delegate1ForMultiValued = "navigation::AttributeNavigationSample::properties::delegate1ForMultiValued";
			
			
			public static String delegate2ForMultiValued = "navigation::AttributeNavigationSample::properties::delegate2ForMultiValued";
			
	
		}
	
	}

	/**
	 * DeferedMultivaluedEditor view descriptor
	 * 
	 */
	public static class DeferedMultivaluedEditor {
		public static class Properties {
	
			
			public static String multivaluedEditor = "navigation::DeferedMultivaluedEditor::properties::multivaluedEditor";
			
	
		}
	
	}

}
