package com.rocel.apt.controler;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.rocel.apt.model.Lang;

public class AndroidProject {


	private static final String NODE_NAME = "name";
	private static final String NODE_STRING = "string";


	public static Lang initAndroidProject(String projectPath) {
		Lang lang = new Lang();

		System.out.println("****************************");
		System.out.println("Analyzing the Android Project : " + projectPath);
		System.out.println("****************************");

		return lang;
	}


	public static Map<String,String> getValues(String stringXMLPath){
		Map<String,String> values = new HashMap<String,String>();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			File file = new File(stringXMLPath);
			if (file.exists()) {
				Document doc = db.parse(file);
				Element docEle = doc.getDocumentElement();
				NodeList stringList = docEle.getElementsByTagName("string");
				if (stringList != null && stringList.getLength() > 0) {
					for (int i = 0; i < stringList.getLength(); i++) {
						Node node = stringList.item(i);
						if (node.getNodeType() == Node.ELEMENT_NODE) {
							Element e = (Element) node;
							values.put(e.getAttribute(NODE_NAME), node.getChildNodes().item(0).getNodeValue());
						}
					}
				} else {
					return null;
				}
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return values;
	}

}
