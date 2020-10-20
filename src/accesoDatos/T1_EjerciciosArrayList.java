package accesoDatos;

import java.util.ArrayList;
import java.util.List;

public class T1_EjerciciosArrayList {

	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<String>();

		palabras.add("Programaci�n");
		palabras.add("Perro");
		palabras.add("Insignia");
		palabras.add("Numerable");
		palabras.add("Autom�vil");
		palabras.add("ACL");
		palabras.add("Decronomic�n");

		System.out.println("==> Todo el array: ");
		System.out.println(palabras);

		System.out.println("==> Modificar un valor: ");
		cambiarPalabra(palabras, "Insignia", "Javier");

		System.out.println(palabras);

		System.out.println("==> A�adir valor: ");
		// Como primer par�metro del m�todo add() indicamos en qu� posici�n quermeos a�adir el elemento y como
		// segundo par�metro indicamos el valor que queremos a�adir*/
		palabras.add(2, "Studium");
		System.out.println(palabras);

		System.out.println("==> Eliminar valor: ");
		palabras.remove("Studium");
		System.out.println(palabras);

		System.out.println("==> Ordenar: ");
		palabras.sort(null);
		System.out.println(palabras);

		System.out.println("==> Ordenar: ");
		List<String> sublista = palabras.subList(1, 3);
		System.out.println(sublista);

		System.out.println("==> �Contiene...?: ");
		System.out.println(palabras.contains("Studium"));

		System.out.println("==> Est� vac�o: ");
		System.out.println(palabras.isEmpty());

		System.out.println("==> Tama�o: ");
		System.out.println(palabras.size());

		System.out.println("==> Limpiar: ");
		palabras.clear();
		System.out.println(palabras);
		System.out.println(palabras.isEmpty());
	}

	public static void cambiarPalabra (ArrayList<String> al, String antiguo, String nuevo) {
		// indexOf() devuelve el �ndice de la posci�n del elemento de la lista que queremos modificar.
		// Como primer par�metro del m�todo set() indicamos la posici�n del elemento que quermeos modificar y como
		// segundo par�metro del m�todo set() pasamos el nuevo valor*/
		al.set(al.indexOf(antiguo), nuevo);
	}
}