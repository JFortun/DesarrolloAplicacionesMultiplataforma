package programacionServiciosProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class T1_6ComunicacionProcesos
{
	public static void main(String[] args)
	{
		try
		{
			Process process = Runtime.getRuntime().exec("cmd /c dir");
			// Flujo de entrada(padre) para la salida estándar (hijo)
			InputStream is = process.getInputStream();
			// Flujo de lectura para esa entrada
			InputStreamReader isr = new InputStreamReader(is);
			// Buffer para leer línea a línea
			BufferedReader br = new BufferedReader(isr);
			String line;
			System.out.println("Salida del proceso: ");
			while ((line = br.readLine()) != null)
			{
				line = line.replace('I', 'O');
				System.out.println(line);
			}
			is.close();
		}
		catch (IOException e)
		{
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		}
	}
}