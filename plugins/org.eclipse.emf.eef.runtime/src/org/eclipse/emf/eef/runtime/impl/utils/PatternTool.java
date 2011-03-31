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

import org.eclipse.jdt.core.search.SearchPattern;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class PatternTool {

	/**
	 * @param text
	 *            : the element name
	 * @param pattern
	 * @return if name match the pattern
	 */
	public static boolean getPattern(String text, String pattern) {
		if (text == null) {
			return false;
		}
		if (pattern == null || pattern == "") { //$NON-NLS-1$
			return true;
		}
		PatternMatcher fNameMatcher = new PatternMatcher(pattern, true);
		return fNameMatcher.matches(text);
	}

	private static class PatternMatcher {

		private String fPattern;

		private int fMatchKind;

		private StringMatcher fStringMatcher;

		private static final char END_SYMBOL = '<';

		private static final char ANY_STRING = '*';

		private static final char BLANK = ' ';

		public PatternMatcher(String pattern, boolean ignoreCase) {
			this(pattern, SearchPattern.R_EXACT_MATCH | SearchPattern.R_PREFIX_MATCH
					| SearchPattern.R_PATTERN_MATCH | SearchPattern.R_CAMELCASE_MATCH);
		}

		public PatternMatcher(String pattern, int allowedModes) {
			initializePatternAndMatchKind(pattern);
			fMatchKind = fMatchKind & allowedModes;
			if (fMatchKind == SearchPattern.R_PATTERN_MATCH) {
				fStringMatcher = new StringMatcher(fPattern, true, false);
			}
		}

		public String getPattern() {
			return fPattern;
		}

		public int getMatchKind() {
			return fMatchKind;
		}

		public boolean matches(String text) {
			switch (fMatchKind) {
				case SearchPattern.R_PATTERN_MATCH:
					return fStringMatcher.match(text);
				case SearchPattern.R_EXACT_MATCH:
					return fPattern.equalsIgnoreCase(text);
				case SearchPattern.R_CAMELCASE_MATCH:
					if (SearchPattern.camelCaseMatch(fPattern, text)) {
						return true;
					}
					// fall through to prefix match if camel case failed (bug
					// 137244)
				default:
					return startsWithIgnoreCase(text, fPattern);
			}
		}

		public static boolean startsWithIgnoreCase(String text, String prefix) {
			int textLength = text.length();
			int prefixLength = prefix.length();
			if (textLength < prefixLength)
				return false;
			for (int i = prefixLength - 1; i >= 0; i--) {
				if (Character.toLowerCase(prefix.charAt(i)) != Character.toLowerCase(text.charAt(i)))
					return false;
			}
			return true;
		}

		private void initializePatternAndMatchKind(String pattern) {
			int length = pattern.length();
			if (length == 0) {
				fMatchKind = SearchPattern.R_EXACT_MATCH;
				fPattern = pattern;
				return;
			}
			char last = pattern.charAt(length - 1);

			if (pattern.indexOf('*') != -1 || pattern.indexOf('?') != -1) {
				fMatchKind = SearchPattern.R_PATTERN_MATCH;
				switch (last) {
					case END_SYMBOL:
						fPattern = pattern.substring(0, length - 1);
						break;
					case BLANK:
						fPattern = pattern.trim();
						break;
					case ANY_STRING:
						fPattern = pattern;
						break;
					default:
						fPattern = pattern + ANY_STRING;
				}
				return;
			}

			if (last == END_SYMBOL) {
				fMatchKind = SearchPattern.R_EXACT_MATCH;
				fPattern = pattern.substring(0, length - 1);
				return;
			}

			if (last == BLANK) {
				fMatchKind = SearchPattern.R_EXACT_MATCH;
				fPattern = pattern.trim();
				return;
			}

			if (isCamelCasePattern(pattern)) {
				fMatchKind = SearchPattern.R_CAMELCASE_MATCH;
				fPattern = pattern;
				return;
			}

			fMatchKind = SearchPattern.R_PREFIX_MATCH;
			fPattern = pattern;
		}

		/**
		 * Returns whether the given pattern is a camel case pattern or not.
		 * 
		 * @param pattern
		 *            the pattern to inspect
		 * @return whether it is a camel case pattern or not
		 */
		public static boolean isCamelCasePattern(String pattern) {
			return SearchPattern.validateMatchRule(pattern, SearchPattern.R_CAMELCASE_MATCH) == SearchPattern.R_CAMELCASE_MATCH;
		}
	}

}
