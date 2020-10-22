package programacionServiciosProcesos;

import java.io.IOException;

public class T1_7ComunicacionProcesos5 {

	public static void main(String[] args) throws IOException,InterruptedException {
		try {
			//Ruta y argumentos para lanzar aplicación
			String arg1 = "java";
			String arg2 = "-jar";
			String arg3 = "C:\\Users\\User\\Desktop\\aleatorio.jar";
			String[] param = { arg1, arg2, arg3 };
			Process process = new ProcessBuilder(param).start();
			int retorno = process.waitFor();
			System.out.println("Se obtuvo un " + retorno);
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Ejecución interrumpida: " + e.getMessage());
		}
	}
}