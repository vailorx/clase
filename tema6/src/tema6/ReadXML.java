package tema6;

public class ReadXML {
public static void main(String[] args) {
	String examplexml = "<?xml version=\"1.0\" ?> <root> <test attribute=\"name\">Bill Gates</test> <test attribute=\"RollNumber\">01</test> </root>";
							 System.out.println(examplexml);  //printing example of xml
							 //poner "" ' tabuladores..
	System.out.println("El siguiente texto esta entre \"comillas dobles\" y " + "este entre \'comillas simples\' \nSaltamos de linea y \ttabulamos");
}
}
