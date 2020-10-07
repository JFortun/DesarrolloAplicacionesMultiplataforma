package accesoDatos;

import java.io.File;

public class Archivos {

	public static void main(String[] args) {

		// Los métodos de File permiten obtener toda la información sobre las características del archivo o directorio.
		// Un ejemplo de código para la creación de un objeto File con un archivo llamado libros.xml es el siguiente:

		File f = new File ("libros.xml");

		System.out.println ("Nombre:" + f.getName());
		System.out.println ("Directorio padre:" + f.getParent());
		System.out.println ("Ruta relativa:" + f.getPath());
		System.out.println ("Ruta absoluta:" + f.getAbsolutePath());
	}
}