package accesoDatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class T1_3_3LecturaEscrituraArchivosAleatorio {

	static Scanner sc = new Scanner(System.in);
	static RandomAccessFile archivo = null;
	private static String FILE_NAME = "C:\\datos.dat";

	// M�todo que crea un fichero binario cuyo nombre lo recibe como
	// par�metro y que contiene los 100 primeros n�meros (en orden)

	static void creaArchivoBinario(String ruta) throws IOException {
		RandomAccessFile f = new RandomAccessFile(ruta, "rw");
		for (int i = 1; i<= 100; i++) {
			f.write(i);
		}
		f.close();
	}

	static void imprimeEntero(String ruta, long cual) throws IOException {
		RandomAccessFile f = new RandomAccessFile(ruta, "r");
		System.out.print("El archivo " + ruta +" ocupa " + f.length() + " bytes.");
		// Me posiciono cual - 1 porque empieza en 0
		f.seek(cual - 1);
		System.out.println(" En la posici�n " + f.getFilePointer()+ " est� el numero " + f.readByte());
		// Salto 9, 10 elementos m�s all�
		f.skipBytes(9);
		System.out.println(" 10 elementos m�s all�, est� el " + f.readByte());
		f.close();
	}

	public static void main(String[] args) {

		try {
			creaArchivoBinario("Aleatorio.dat");

			imprimeEntero("Aleatorio.dat", 20);

		} catch(IOException e) {
			e.getMessage();
		}


		// Programa Java para modificar un entero dentro del fichero enteros.dat con acceso aleatorio.
		// Primero muestra la cantidad de n�meros de enteros que tiene.
		// Luego le pide al usuario que indique la posici�n que ocupa el entero a modificar dentro del fichero,
		// a continuaci�n se lee y muestra el valor actual, se pide el nuevo valor y finalmente se escribe el nuevo
		// valor en la posici�n indicada, modificando de esta forma el valor antiguo por el nuevo.

		int pos, numero;
		long size;
		try {
			archivo = new RandomAccessFile(FILE_NAME, "rw");
			// Calcular cu�ntos enteros tiene el fichero
			size = archivo.length();
			// Dividimos entre 4 (int, 32 bits = 4 bytes)
			size = size / 4;
			System.out.println("El fichero tiene " + size + " enteros");
			// Modificar el entero
			do {
				System.out.println("Introduce una posici�n (>=1 y <= " + size + "): ");
				pos = sc.nextInt();
			} while (pos < 1 || pos > size);
			// La posici�n 1 realmente es la 0
			pos--;
			// Nos situamos en la posici�n a modificar
			archivo.seek(pos * 4);
			// Leemos y mostramos el valor actual
			System.out.println("Valor actual: " + archivo.readInt());
			// Pedimos nuevo valor
			System.out.println("Introduce nuevo valor: ");
			numero = sc.nextInt();
			// Nos situamos de nuevo en la posici�n del entero a modificar, ya que al hacer readInt hemos avanzado una posici�n
			archivo.seek(pos * 4);
			// Escribimos el entero
			archivo.writeInt(numero);
			archivo.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
