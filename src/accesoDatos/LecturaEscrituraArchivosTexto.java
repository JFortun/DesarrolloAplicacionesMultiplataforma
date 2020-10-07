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
		// Esta clase hereda los m�todos necesarios para ello de la clase Writer.
		// El m�todo m�s popular de FileWriter, heredado de Writer, es el m�todo write() que puede aceptar un solo car�cter,
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

		// Dado un archivo de texto, contar el n�mero de veces que aparecen la letra 'a' en �l.
		// Leeremos cada uno de los caracteres hasta llegar al �ltimo.
		// Para cada car�cter si se trata del car�cter a considerar, incrementamos el contador.

		try {

			int contador = 0;
			FileReader input = new FileReader(FILE_NAME);
			int c = input.read();
			while (c != -1) {
				// Vemos si es el que buscamos
				if ((char) c == BUSCAR) 
					contador++;
				// leemos otro car�cter
				c = input.read();
			}

			// Cerramos el flujo
			input.close();
			System.out.println("El car�cter (" + BUSCAR + ") se ha encontrado " + contador + " veces en el fichero " + FILE_NAME);
		} 

		catch (IOException ex) {

			System.out.println("Se ha producido un ERROR");
		}

		// Una vez creado el objeto, puede utilizarse el m�todo readLine() para leer l�neas de texto del archivo.
		// En el caso de un archivo, y dado que �ste puede estar formado por m�s de una l�nea,
		// ser� necesario utilizar un bucle while para recuperar todas las l�neas de texto de forma secuencial,
		// teniendo en cuenta que cuando la l�nea sea nula es que ya hemos llegado al final.

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

			System.out.println("Total de l�neas: " + contador);
		}

		catch (IOException ex) {
			System.out.println("Se ha producido un ERROR");
		}
	}
}