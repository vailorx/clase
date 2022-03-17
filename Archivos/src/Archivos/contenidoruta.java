package Archivos;

import java.io.File;
import java.util.Arrays;

public class contenidoruta {
	public static void main(String[] args) {

        File directorio = new File("C:\\");
        String[] lista = directorio.list();
        Arrays.sort(lista);

        for (int i = 0; i < lista.length; i++) {

            System.out.println(lista[i]);

        }

    }


}
 /**
  * package Archivos;

import java.io.*;
//exporta todos, pero consume mas
public class readfiletext {
public static void main(String[] args) {
	
	try {
		Reader reader = new FileReader("record.txt");
		int data = reader.read();
		while (data != -1) { //el -1 es el final del archivo
			System.out.print((char) data);
			data = reader.read();
		}
		
		reader.close();
	} catch (Exception ex) { // ex es un objeto puedes poner lo que quieras
		System.out.println(ex.getMessage()); //el exception te dice cual es el error
	}
}
}
  * 
  * package Archivos;

public class detectarsistema {
	public static void main(String[] args) {
		System.out.println(getOperatingSystem());
	}
	public static String getOperatingSystem() {
		String os = System.getProperty("os.name");
		// Sysout("Using System property: " + os );
		return os;
		
	}
	}
package Archivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class tamañoarchivo {
	


		public static void main(String[] args) {
			
			String fileName = "C:\\JAVASamples\\Phones.txt";
			printFileSizeNIO(fileName);

		}

		private static void printFileSizeNIO(String fileName) {
			
			Path path = Paths.get(fileName);
			
			try {
				long bytes = Files.size(path);
				
				System.out.println(String.format("%,d bytes", bytes));
				System.out.println(String.format("%,d kilobytes", bytes / 1024));
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}
  * */
