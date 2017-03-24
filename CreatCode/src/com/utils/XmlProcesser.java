package com.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XmlProcesser {

	public static String getCondition(String gmsfhm, String xm)
			throws ParserConfigurationException, SAXException, IOException,
			TransformerException {
		String con = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><INFO><SBM>XXXXXX</SBM></INFO><ROW><GMSFHM>������ݺ���</GMSFHM><XM>����</XM></ROW><ROW FSD=\"XXXXXX\" YWLX=\"XXXXXX\"><GMSFHM>XXXXXX</GMSFHM><XM>XXXXXX</XM></ROW></ROWS>";

		// �����������document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new ByteArrayInputStream(con
				.getBytes("UTF-8")));

		// ��д��������֤����
		Element element = document.getDocumentElement();
		element.getElementsByTagName("GMSFHM").item(1).getFirstChild()
				.setNodeValue(gmsfhm);
		element.getElementsByTagName("XM").item(1).getFirstChild()
				.setNodeValue(xm);

		// documentת�����ַ�
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		transformer
				.transform(new DOMSource(document), new StreamResult(writer));
		String output = writer.getBuffer().toString().replaceAll("\n|\r", "");

		return output;
	}

	public static Boolean getResult(String data)
			throws ParserConfigurationException, SAXException, IOException {
		Boolean result = false;

		// �����������document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new ByteArrayInputStream(data
				.getBytes("UTF-8")));

		// ��ȡ��֤���
		Element element = document.getDocumentElement();
		Node node = element.getElementsByTagName("result_xm").item(0);
		if (node != null) {
			if ("һ��".endsWith(node.getFirstChild().getNodeValue())) {
				result = true;
			}
		}
		return result;
	}

}
