package accesoDatos;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class T1_4_3AbrirDOMJava {
	
	public static int abrir_XML_DOM(File fichero) {
		// Representa al árbol DOM
		Document documento = null;
		try {
			// Se crea un objeto DocumentBuilderFactory
			DocumentBuilderFactory tienda = DocumentBuilderFactory.newInstance();
			// Indica que el modelo DOM no debe contemplar los comentarios que tenga el XML
			tienda.setIgnoringComments(true);
			// Ignorar los espacios en blanco
			tienda.setIgnoringElementContentWhitespace(true);
			// Se crea un objeto DocumentBuilder para cargar en él la estructura de árbol DOM a partir del XML seleccionado
			DocumentBuilder builder = tienda.newDocumentBuilder();
			// Interpreta el XML y genera el DOM equivalente
			documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			// Ahora doc apunta al árbol DOM, listo para recorrer
			return 0;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}