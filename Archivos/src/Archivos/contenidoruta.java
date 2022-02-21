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
