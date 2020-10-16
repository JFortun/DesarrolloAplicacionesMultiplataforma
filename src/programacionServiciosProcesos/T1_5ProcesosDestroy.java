package programacionServiciosProcesos;

import java.io.IOException;
import java.util.Arrays;

public class T1_5ProcesosDestroy
{
	
	//  Creación de un proceso mediante Runtime para después destruirlo.
	
	public static void main(String[] args) throws InterruptedException
	{
		if (args.length <= 0)
		{
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();
		try
		{
			System.out.println("Ejecutando " + Arrays.toString(args));
			// Otra forma de crear un proceso
			Process process = runtime.exec(args);
			// Esperar 3 segundos...
			Thread.sleep(3000);
			System.out.println("Destruyendo " + Arrays.toString(args));
			process.destroy();
		}
		catch (IOException ex)
		{
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		}
	}
}
