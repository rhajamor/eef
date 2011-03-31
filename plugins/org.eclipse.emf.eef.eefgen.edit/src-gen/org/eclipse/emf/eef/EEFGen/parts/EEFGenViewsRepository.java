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
package org.eclipse.emf.eef.EEFGen.parts;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EEFGenViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * GenEditionContext view descriptor
	 * 
	 */
	public static class GenEditionContext {
		public static class Reference {
	
			
			public static String propertiesEditionContext = "EEFGen::GenEditionContext::Reference::properties Edition Context";
			
	
		}
	
		public static class Parameters {
	
			
			public static String basePackage = "EEFGen::GenEditionContext::Parameters::Base package";
			
			
			public static String descriptorsContributorID = "EEFGen::GenEditionContext::Parameters::Descriptors contributorID";
			
	
		}
	
		public static class Activation {
	
			
			public static String genericPropertiesViewsDescriptors = "EEFGen::GenEditionContext::Activation::Generic properties views descriptors";
			
			
			public static String gMFSpecificPropertiesViews = "EEFGen::GenEditionContext::Activation::GMF specific properties views";
			
			
			public static String jUnitTestCases = "EEFGen::GenEditionContext::Activation::JUnit test cases";
			
	
		}
	
		public static class Implementation {
	
			
			public static String leafComponentsSuperClass = "EEFGen::GenEditionContext::Implementation::leafComponentsSuperClass";
			
			
			public static String propertiesEditingProvidersSuperClass = "EEFGen::GenEditionContext::Implementation::propertiesEditingProvidersSuperClass";
			
	
		}
	
	}

	/**
	 * EEFGenModelReference view descriptor
	 * 
	 */
	public static class EEFGenModelReference {
		public static class Reference {
	
			
			public static String referencedEEFGenModel = "EEFGen::EEFGenModelReference::Reference::Referenced EEFGenModel";
			
	
		}
	
	}

	/**
	 * EEFGenModel view descriptor
	 * 
	 */
	public static class EEFGenModel {
		public static class Parameters {
	
			
			public static String generationDirectory = "EEFGen::EEFGenModel::Parameters::Generation directory";
			
			
			public static String testsGenerationDirectory = "EEFGen::EEFGenModel::Parameters::Tests generation directory";
			
			
			public static String useJMergeToManageUserCode = "EEFGen::EEFGenModel::Parameters::Use JMerge to manage user code";
			
	
		}
	
		public static class Legal {
	
			
			public static String author = "EEFGen::EEFGenModel::Legal::author";
			
			
			public static String license = "EEFGen::EEFGenModel::Legal::license";
			
	
		}
	
	}

	/**
	 * GenViewsRepository view descriptor
	 * 
	 */
	public static class GenViewsRepository {
		public static class Reference {
	
			
			public static String viewsRepository = "EEFGen::GenViewsRepository::Reference::Views repository";
			
	
		}
	
		public static class Parameters {
	
			
			public static String basePackage = "EEFGen::GenViewsRepository::Parameters::Base package";
			
			
			public static String helpStrategy = "EEFGen::GenViewsRepository::Parameters::Help strategy";
			
	
		}
	
		public static class Activation {
	
			
			public static String sWTViews = "EEFGen::GenViewsRepository::Activation::SWT views";
			
			
			public static String formsViews = "EEFGen::GenViewsRepository::Activation::Forms views";
			
	
		}
	
		public static class Implementation {
	
			
			public static String partsSuperClass = "EEFGen::GenViewsRepository::Implementation::partsSuperClass";
			
	
		}
	
	}

}
