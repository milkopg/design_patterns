package design_patterns.com.milko.training.design_patterns.standard.creational.abstractfactory.main;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class AbstractFactoryEverydayDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String xml = "<document><body><stock>AAPL</stock></body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
		
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();
		Document doc = factory.parse(bais);
		
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());
	}

}
