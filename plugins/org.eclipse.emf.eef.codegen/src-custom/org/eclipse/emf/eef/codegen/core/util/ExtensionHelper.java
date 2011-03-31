/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.codegen.core.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class ExtensionHelper {
	
	private static final String POINT_ATTRIBUTE_NAME = "point";

	private static final String EXTENSION_TAG = "extension";

	private static final String PLUGIN_TAG_NAME = "plugin";

	private static final String PLUGIN_XML_FILE_PATH = "plugin.xml";
	
	private IProject bundleProject;
	private Document document;
	private IFile pluginXML;

	/**
	 * @param pluginProject
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public ExtensionHelper(IProject pluginProject) throws ParserConfigurationException, SAXException, IOException {
		this.bundleProject = pluginProject;
		this.pluginXML = pluginXML();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(false);
		DocumentBuilder builder = factory.newDocumentBuilder();
		document = builder.parse(pluginXML.getLocation().toFile());
	}
	
	public ExtensionHelper(IFile pluginXML) throws ParserConfigurationException, SAXException, IOException {
		this.bundleProject = pluginXML.getProject();
		this.pluginXML = pluginXML;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		document = builder.parse(pluginXML.getLocation().toFile());
	}

	
	/**
	 * @return
	 */
	public List<Node> extensions() {
		List<Node> result = new ArrayList<Node>();
		Node pluginTag = pluginTag();
		if (pluginTag != null && pluginTag.hasChildNodes()) {
			NodeList elementsByTagName = document.getElementsByTagName(EXTENSION_TAG);
			int i = 0;
			Node next = elementsByTagName.item(i);
			while (next != null) {
				result.add(next);
				i++;
				next = elementsByTagName.item(i);
			}
		}
		return result;
	}
	
	/**
	 * @param id
	 * @return
	 */
	public List<Node> extensionsWithID(String id) {
		List<Node> result = new ArrayList<Node>();
		for (Node node : extensions()) {
			NamedNodeMap attributes = node.getAttributes();
			Node namedItem = attributes.getNamedItem(POINT_ATTRIBUTE_NAME);
			if (namedItem != null && namedItem.getNodeValue().equals(id)) {
				result.add(node);
			}
		}
		return result;
	}
	
	/**
	 * @param n1
	 * @return
	 */
	public boolean hasExtension(Node n1) {
		for (Node node : extensions()) {
			if (extensionsEqual(n1, node)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return the "plugin.xml" file of the plugin
	 */
	public IFile pluginXML() {
		if (pluginXML == null) {
			return bundleProject.getFile(new Path(PLUGIN_XML_FILE_PATH));
		} else {
			return pluginXML;
		}
	}
	
	/**
	 * @param helper
	 * @return
	 */
	public List<Node> diff(ExtensionHelper helper) {
		List<Node> extensions = helper.extensions();
		List<Node> res = new ArrayList<Node>(extensions.size());
		for (Node ext : extensions) {
			if (!hasExtension(ext)) {
				res.add(ext);
			}
		}
		return res;
	}
	
	
	/**
	 * @param extensions
	 * @throws TransformerException 
	 * @throws TransformerFactoryConfigurationError 
	 * @throws TransformerConfigurationException 
	 */
	public void append(List<Node> extensions) throws TransformerConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		for (Node node : extensions) {
			Node importNode = document.importNode(node, true);
			pluginTag().appendChild(importNode);
		}
		save();
	}

	public void save() throws TransformerConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		StreamResult result = new StreamResult(pluginXML.getLocation().toFile());
		DOMSource source = new DOMSource(document);
		transformer.transform(source, result);
	}
	
	/**
	 * @param n1
	 * @param n2
	 * @return
	 */
	private boolean extensionsEqual(Node n1, Node n2) {
		boolean res = extensionAttributesEquals(n1, n2);
		if (res) {
			// All attributes are equals, comparing sub-nodes
			NodeList childNodes = n1.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node childNode = childNodes.item(i);
				if (!hasAMatchingSubNode(childNode, n2)) {
					return false;
				}
			}	
		}
		return res;
	}

	private boolean extensionAttributesEquals(Node n1, Node n2) {
		NamedNodeMap n1Attributes = n1.getAttributes();
		NamedNodeMap n2Attributes = n2.getAttributes();
		if (n1Attributes == null) {
			if (n2Attributes == null) {
				return true;
			}
			else {
				return false;
			}
		}
		else if (n2Attributes == null) {
			return false;
		} else {
			for (int i = 0; i < n1Attributes.getLength(); i++) {
				Node item = n1Attributes.item(i);
				String nodeName = item.getNodeName();
				Node matchingItem = n2Attributes.getNamedItem(nodeName);
				if (!item.getNodeValue().equals(matchingItem.getNodeValue())) {
					return false;
				}
			}
			return true;
		}
	}
	
	/**
	 * @param subNode
	 * @param processingNode
	 * @return
	 */
	private boolean hasAMatchingSubNode(Node subNode, Node processingNode) {
		NodeList childNodes = processingNode.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node childNode = childNodes.item(i);
			if (extensionsEqual(subNode, childNode)) {
				return true;
			}
		}	
		return false;
	}
	
	/**
	 * @return
	 */
	private Node pluginTag() {
		NodeList pluginTags = document.getElementsByTagName(PLUGIN_TAG_NAME);
		if (pluginTags.item(0) != null)
			return pluginTags.item(0);
		return null;
	}	

}
