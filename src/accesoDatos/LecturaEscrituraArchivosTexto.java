package accesoDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LecturaEscrituraArchivosTexto {

	private static String FILE_NAME = "C:\\prueba.txt";
	private static char BUSCAR = 'a';

	public static void main(String[] args) {

		// El flujo FileWriter permite escribir caracteres en un archivo de modo secuencial.
		// Esta clase hereda los métodos necesarios para ello de la clase Writer.
		// El método más popular de FileWriter, heredado de Writer, es el método write() que puede aceptar un solo carácter,
		// un array de caracteres (buffer), e incluso un String.

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Introduzca texto: ");
			String text = sc.nextLine();
			FileWriter output = new FileWriter(FILE_NAME);
			output.write(text);
			// Cerramos el flujo
			sc.close();
			output.close();
		} 

		catch (IOException ex) {
			System.out.println("Se ha producido un ERROR");
		}

		// Dado un archivo de texto, contar el número de veces que aparecen la letra 'a' en él.
		// Leeremos cada uno de los caracteres hasta llegar al último.
		// Para cada carácter si se trata del carácter a considerar, incrementamos el contador.

		try {

			int contador = 0;
			FileReader input = new FileReader(FILE_NAME);
			int c = input.read();
			while (c != -1) {
				// Vemos si es el que buscamos
				if ((char) c == BUSCAR) 
					contador++;
				// leemos otro carácter
				c = input.read();
			}

			// Cerramos el flujo
			input.close();
			System.out.println("El carácter (" + BUSCAR + ") se ha encontrado " + contador + " veces en el fichero " + FILE_NAME);
		} 

		catch (IOException ex) {

			System.out.println("Se ha producido un ERROR");
		}

		// Una vez creado el objeto, puede utilizarse el método readLine() para leer líneas de texto del archivo.
		// En el caso de un archivo, y dado que éste puede estar formado por más de una línea,
		// será necesario utilizar un bucle while para recuperar todas las líneas de texto de forma secuencial,
		// teniendo en cuenta que cuando la línea sea nula es que ya hemos llegado al final.

		try {

			File archivo1 = new File("C:\\prueba.txt");
			FileReader fileReader1 = new FileReader(archivo1);
			BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
			int contador = 0;
			while (bufferedReader1.readLine() != null) {
				contador++;
			}
			// Cerramos el BufferedReader
			bufferedReader1.close();

			System.out.println("Total de líneas: " + contador);
		}

		catch (IOException ex) {
			System.out.println("Se ha producido un ERROR");
		}
	}
}