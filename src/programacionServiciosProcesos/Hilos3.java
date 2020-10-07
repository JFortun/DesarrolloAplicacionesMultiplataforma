package programacionServiciosProcesos;

public class Hilos3 implements Runnable
{
	// Algo parecido al anterior ejemplo, pero ahora usando la interface Runnable en vez
	// heredar de Thread.
	
	public Hilos3()
	{
		super();
	}
	public static void main(String[] args)
	{
		new Thread(new Hilos3(),"Uno").start();
		new Thread(new Hilos3(),"Dos").start();
		System.out.println("Termina el programa principal");
	}

	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Paso "+ i + " del proceso "+ Thread.currentThread().getName());
		}
		System.out.println("Termina el hilo "+ Thread.currentThread().getName());
	}
}