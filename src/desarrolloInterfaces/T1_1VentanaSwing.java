package desarrolloInterfaces;

import javax.swing.JButton;
import javax.swing.JFrame;

public class T1_1VentanaSwing
{
	// Constantes y componentes (objetos)
	JButton miBoton;
	// Constructor
	public T1_1VentanaSwing()
	{
		JFrame ventanaJ = new JFrame("Ejemplo 1");
		miBoton = new JButton("Aceptar");
		ventanaJ.add(miBoton);
		ventanaJ.setSize(300,200);
		ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaJ.setVisible(true);
	}
	public static void main(String args[])
	{
		new T1_1VentanaSwing();
	}
}