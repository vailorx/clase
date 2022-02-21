package Archivos;

import java.io.File;
import java.io.IOException;

public class Createfile {
public static void main(String[] args) {
	//averiguar si un archivo existe o no en el disco o directorio (se genera en el paquete)
	try {
		File file = new File("record.txt");
		if (file.createNewFile()) {
			System.out.println("has creado un archivo que crack xd");
		} else {
			System.out.println("el archivo se fue a la puta");
		}
	} catch (IOException e) { // e es un objeto puedes poner lo que quieras
		e.printStackTrace(); //te imprime un mensaje de error se puede buscar con ctrl shift t
		
	}
	
	
	
}
}
