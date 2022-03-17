package tema6;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class LeerXMLEXT {

	public static void main(String[] args) throws ParserConfigurationException, SAXException{
		
		try {
			File file = new File("C:\\Users\\The_D\\Documents\\Clase DAM\\Programacion\\LeerXML\\company.xml");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			document.getDocumentElement().normalize();
			
			//Obtener nodo principal
			System.out.println("Root Element: " + document.getDocumentElement().getNodeName());
			
			NodeList nList = document.getElementsByTagName("employee");
			
			System.out.println("-------------------------------------------------------------");
			
			for(int i = 0; i<nList.getLength(); i++) {
				Node nNode = nList.item(i);
				System.out.println("Current Element: " + nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					
					System.out.println("Employee id: " + eElement.getAttribute("id"));
					
					System.out.println("First name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Salary: " + eElement.getElementsByTagName("salary").item(0).getTextContent());
				}
			}
			
			}catch (Exception e) {
			System.out.println(e);
		}

	}

}