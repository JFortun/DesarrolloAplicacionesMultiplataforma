package programacionServiciosProcesos;

public class T1_3Hilos implements Runnable
{
	// Algo parecido al anterior ejemplo, pero ahora usando la interface Runnable en vez
	// heredar de Thread.
	
	public T1_3Hilos()
	{
		super();
	}
	public static void main(String[] args)
	{
		new Thread(new T1_3Hilos(),"Uno").start();
		new Thread(new T1_3Hilos(),"Dos").start();
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