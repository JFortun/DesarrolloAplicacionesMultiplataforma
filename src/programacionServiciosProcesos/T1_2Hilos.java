package programacionServiciosProcesos;

public class T1_2Hilos extends Thread
{
	// En este caso los dos procesos Uno y Dos van paso a paso en paralelo realizando las tareas
	// indicadas.
	
	public T1_2Hilos(String cadena)
	{
		super(cadena);
	}
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Paso "+ i + " del proceso "+ Thread.currentThread().getName());
		}
		System.out.println("Termina el thread "+ Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		new T1_2Hilos("Uno").start();
		new T1_2Hilos("Dos").start();
		System.out.println("Termina el programa principal");
	}
}