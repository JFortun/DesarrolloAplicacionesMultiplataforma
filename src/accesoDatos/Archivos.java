package accesoDatos;

import java.io.File;

public class Archivos {

	public static void main(String[] args) {

		// Los m�todos de File permiten obtener toda la informaci�n sobre las caracter�sticas del archivo o directorio.
		// Un ejemplo de c�digo para la creaci�n de un objeto File con un archivo llamado libros.xml es el siguiente:

		File f = new File ("libros.xml");

		System.out.println ("Nombre:" + f.getName());
		System.out.println ("Directorio padre:" + f.getParent());
		System.out.println ("Ruta relativa:" + f.getPath());
		System.out.println ("Ruta absoluta:" + f.getAbsolutePath());
	}
}