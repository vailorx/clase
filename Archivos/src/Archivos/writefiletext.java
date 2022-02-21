package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writefiletext {
public static void main(String[] args) {
	try { //tambien sirve para crear y escribir a la vez
		Writer w = new FileWriter("record.txt");
		String content = "ese miguelaaaange ahi";
		w.write(content);
		w.close();
		System.out.println("Done");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
