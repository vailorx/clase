package Archivos;

public class rename {
	public static void main(String[] args) {

        File oldfile = new File("C:\\test.txt");
        File newfile = new File("C:\\NewTest.txt");

        if(oldfile.renameTo(newfile)) {
            System.out.println("archivo renombrado");
        } else {
            System.out.println("error");
        }

    }


}
