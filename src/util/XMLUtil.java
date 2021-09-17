package util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author totoro
 * @date 2021-09-16 10:35
 */
public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src//config.xml"));

            NodeList className = document.getElementsByTagName("className");
            Node classNode = className.item(0).getFirstChild();
            String nodeValue = classNode.getNodeValue();

            Class c = Class.forName(nodeValue);
            Object object = c.newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
