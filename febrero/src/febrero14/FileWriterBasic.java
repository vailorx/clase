package febrero14;

import java.io.FileWriter;
//crear mierda
public class FileWriterBasic {
public static void main(String[] args) {
	try {
	FileWriter fw = new FileWriter("C:\\tusputosmuertos.txt");
	
	//windows
	//FileWriter fw=new FileWriter("D:\\testout.txt");
	
	//Linux
	//FileWriter fw=new FileWrite("//users//file1.txt");
	
	//para introducir texto
	fw.write("vaya puta basura de programa xd");
	fw.close();
}catch(Exception e) {System.out.println(e);}
	System.out.println("Succes...");
}
}
