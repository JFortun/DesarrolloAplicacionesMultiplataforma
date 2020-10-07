package programacionServiciosProcesos;

public class Hilos2 extends Thread
{
	public Hilos2(String cadena)
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
		new Hilos2("Uno").start();
		new Hilos2("Dos").start();
		System.out.println("Termina el programa principal");
	}
}