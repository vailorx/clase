package tema6;

import java.io.BufferedReader;
import java.io.FileReader;

public class bufferedreader {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C://file1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}
		br.close();
		fr.close(); 
	}
}
