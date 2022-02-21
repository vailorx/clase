package Archivos;

import java.io.File;

public class CreateDirs {
public static void main(String[] args) {
	File directorio = new File("directorio_nuevo\\Jesusperra");
	if (!directorio.exists()) {
		if (directorio.mkdirs()) {
			System.out.println("Directorio creado");
		} else {
			System.out.println("Error al crear directorio");
		}
	}
}
}
