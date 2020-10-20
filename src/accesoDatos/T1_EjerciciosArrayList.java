package accesoDatos;

import java.util.ArrayList;
import java.util.List;

public class T1_EjerciciosArrayList {

	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<String>();

		palabras.add("Programación");
		palabras.add("Perro");
		palabras.add("Insignia");
		palabras.add("Numerable");
		palabras.add("Automóvil");
		palabras.add("ACL");
		palabras.add("Decronomicón");

		System.out.println("==> Todo el array: ");
		System.out.println(palabras);

		System.out.println("==> Modificar un valor: ");
		cambiarPalabra(palabras, "Insignia", "Javier");

		System.out.println(palabras);

		System.out.println("==> Añadir valor: ");
		// Como primer parámetro del método add() indicamos en qué posición quermeos añadir el elemento y como
		// segundo parámetro indicamos el valor que queremos añadir*/
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

		System.out.println("==> ¿Contiene...?: ");
		System.out.println(palabras.contains("Studium"));

		System.out.println("==> Está vacío: ");
		System.out.println(palabras.isEmpty());

		System.out.println("==> Tamaño: ");
		System.out.println(palabras.size());

		System.out.println("==> Limpiar: ");
		palabras.clear();
		System.out.println(palabras);
		System.out.println(palabras.isEmpty());
	}

	public static void cambiarPalabra (ArrayList<String> al, String antiguo, String nuevo) {
		// indexOf() devuelve el índice de la posción del elemento de la lista que queremos modificar.
		// Como primer parámetro del método set() indicamos la posición del elemento que quermeos modificar y como
		// segundo parámetro del método set() pasamos el nuevo valor*/
		al.set(al.indexOf(antiguo), nuevo);
	}
}