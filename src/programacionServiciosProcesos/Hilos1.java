package programacionServiciosProcesos;

public class Hilos1 extends Thread
{
	// Se han creado tres objetos de la clase ThreadEjemplo1 y se han echado a correr, cada
	// uno en paralelo con los otros. Si ejecutamos de nuevo, podemos obtener un resultado
	// totalmente diferente a lo de antes. El caso es que independientemente de la aleatoriedad
	// del retardo, los hilos se ejecutan a la vez.

	String nombre;
	int retardo;
	// Constructor
	public Hilos1(String n, int r)
	{
		nombre = n;
		retardo = r;
	}
	// Método run
	public void run()
	{
		try
		{
			Thread.sleep(retardo);
		}
		catch(Exception e){}
		System.out.println("Hola mundo! "+ nombre+" "+retardo);
	}
	// Programa principal
	public static void main(String[] args)
	{
		// Creamos los objetos
		Hilos1 t1 = new Hilos1("Hilo 1 con retardo",(int)(Math.random()*2000));
		Hilos1 t2 = new Hilos1("Hilo 2 con retardo",(int)(Math.random()*2000));
		Hilos1 t3 = new Hilos1("Hilo 3 con retardo",(int)(Math.random()*2000));
		// Arrancamos los hilos
		t1.start();
		t2.start();
		t3.start();
	}
}