package Archivos;

import java.io.*;
//exporta todos, pero consume mas
public class readfiletext {
public static void main(String[] args) {
	
	try {
		Reader reader = new FileReader("record.txt");
		int data = reader.read();
		while (data != -1) { //el -1 es el final del archivo
			System.out.println((char) data);
			data = reader.read();
		}
		
		reader.close();
	} catch (Exception ex) { // ex es un objeto puedes poner lo que quieras
		System.out.println(ex.getMessage()); //el exception te dice cual es el error
	}
}
}
