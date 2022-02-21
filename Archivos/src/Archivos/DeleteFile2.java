package Archivos;

import java.io.File;
import java.io.IOException;

public class DeleteFile2 {
		private final static String FILE_NAME = "C:\\tusputosmuertos.txt";
		public static void main(String[] args) throws IOException {
			cleanUpFiles();
		}
		public static void cleanUpFiles() {
			File targetFile = new File(FILE_NAME);
			targetFile.delete();
	}

}
