package accesoDatos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class T1_4_5ModificarSerializarDOM { /*

	public static int annadirDOM (Document doc, String titulo, String autor, String anno) {
		try {
			// Se crea un nodo Elemento con nombre 'titulo'
			Node ntitulo = doc.createElement("Titulo");
			// Se crea un nodo tipo texto con el título del libro
			Node ntitulo_text = doc.createTextNode(titulo);
			// Se añade el nodo de texto como hijo del elemento
			Titulo ntitulo.appendChild(ntitulo_text);

			// Se hace lo mismo con autor
			Node nautor = doc.createElement("Autor");
			Node nautor_text = doc.createTextNode(autor);
			nautor.appendChild(nautor_text);

			// Se crea un nodo de tipo elemento (<libro>)
			Node nlibro = doc.createElement("Libro");
			// Al nuevo nodo se le añade atributo publicado_en
			((Element) nlibro).setAttribute("publicado_en", anno);
			// Se añade a libro los nodos autor y titulo
			nlibro.appendChild(ntitulo);
			nlibro.appendChild(nautor);
			// Finalmente se obtiene el primer nodo del elemento y se le añade como hijo el nodo libro que ya tiene colgando todos sus hijos y atributos creados antes
			Node raiz = doc.getFirstChild();
			raiz.appendChild(nlibro);
			return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}


	public static int guardarDOMcomoFILE(Document doc) {
		try {
			// Crea un fichero llamado salida.xml
			File archivo_xml = new File("proyecto//salida.xml");
			// Especifica el formato de salida
			OutputFormat format = new OutputFormat(doc);
			// Especifica que la salida esté indentada
			format.setIndenting(true);
			// Escribe el contenido en el FILE
			XMLSerializer serializer = new XMLSerializer (new FileOutputStream(archivo_xml),format);
			serializer.serialize(doc);
			return 0;
		} catch (Exception e) {
			return -1;
		}
	}

	/* Guardar el contenido en un archivo XML
	TransformerFactory transformerFactory = TransformerFactory.newInstance();
	Transformer transformer = transformerFactory.newTransformer();
	DOMSource source = new DOMSource(documento);
	StreamResult result = new StreamResult(new File("C:\\librosEditado.xml"));
	transformer.transform(source, result);

	System.out.println("Hecho"); */
}
