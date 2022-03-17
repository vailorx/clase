package tema6;

public class Stringbuffered {
public static void main(String[] args) {
	StringBuffer bu1, bu2, bu3;

    bu1 = new StringBuffer(); //Capacidad de 16 caracteres
    bu2 = new StringBuffer(10); //Capacidad de 10 caracteres
    bu3 = new StringBuffer("Hola a todos"); 

    System.out.println(bu3);

    System.out.println("Lenght: " + bu1.length());

    System.out.println("Lenght: " + bu3.length());
    
    System.out.println("Lenght: " + bu1.length());

    System.out.println("Lenght: " + bu3.length());

    System.out.println("Capacity: " + bu3.capacity());

    System.out.println("Tamaño: " + bu3.toString());

    System.out.println("Char in Position: " + bu3.charAt(3));
}
}
