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
package org.eclipse.emf.eef.extended.editor.parts;

/**
 * 
 * 
 */
public class EditorViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * StandardFormPage view descriptor
	 * 
	 */
	public static class StandardFormPage {
		public static class Naming {
	
			
			public static String name = "editor::StandardFormPage::Naming::name";
			
			
			public static String title_ = "editor::StandardFormPage::Naming::title";
			
	
		}
	
	}

	/**
	 * EEFMasterPage view descriptor
	 * 
	 */
	public static class EEFMasterPage {
		public static class Naming {
	
			
			public static String name = "editor::EEFMasterPage::Naming::name";
			
			
			public static String title_ = "editor::EEFMasterPage::Naming::title";
			
	
		}
	
		public static class Settings {
	
			
			public static String orientable = "editor::EEFMasterPage::Settings::orientable";
			
			
			public static String showValidatePage = "editor::EEFMasterPage::Settings::showValidatePage";
			
	
		}
	
	}

	/**
	 * TreeMasterPage view descriptor
	 * 
	 */
	public static class TreeMasterPage {
		public static class Naming {
	
			
			public static String name = "editor::TreeMasterPage::Naming::name";
			
			
			public static String title_ = "editor::TreeMasterPage::Naming::title";
			
	
		}
	
		public static class Settings {
	
			
			public static String toolbarVisible = "editor::TreeMasterPage::Settings::toolbarVisible";
			
	
		}
	
	}

	/**
	 * PartFilter view descriptor
	 * 
	 */
	public static class PartFilter {
		public static class Naming {
	
			
			public static String name = "editor::PartFilter::Naming::name";
			
	
		}
	
		public static class Filter {
	
			
			public static String contextualComponent = "editor::PartFilter::Filter::contextualComponent";
			
			
			public static String filteredPart = "editor::PartFilter::Filter::filteredPart";
			
	
		}
	
		public static class Settings {
	
			
			public static String mandatory = "editor::PartFilter::Settings::mandatory";
			
	
		}
	
	}

	/**
	 * EEFEditorContributions view descriptor
	 * 
	 */
	public static class EEFEditorContributions {
		public static class Naming {
	
			
			public static String name = "editor::EEFEditorContributions::Naming::name";
			
	
		}
	
	}

	/**
	 * EEFEditorPages view descriptor
	 * 
	 */
	public static class EEFEditorPages {
		public static class Properties {
	
			
			public static String name = "editor::EEFEditorPages::properties::name";
			
	
		}
	
	}

	/**
	 * StaticEEFEditorContribution view descriptor
	 * 
	 */
	public static class StaticEEFEditorContribution {
		public static class Naming {
	
			
			public static String name = "editor::StaticEEFEditorContribution::Naming::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String views = "editor::StaticEEFEditorContribution::Binding::views";
			
	
		}
	
	}

	/**
	 * DynamicEEFEditorContribution view descriptor
	 * 
	 */
	public static class DynamicEEFEditorContribution {
		public static class Naming {
	
			
			public static String name = "editor::DynamicEEFEditorContribution::Naming::name";
			
	
		}
	
		public static class Binding {
	
			
			public static String model = "editor::DynamicEEFEditorContribution::Binding::model";
			
			
			public static String views = "editor::DynamicEEFEditorContribution::Binding::views";
			
	
		}
	
	}

}
