package tema6;

import java.util.Arrays;

public class Sarrays {
public static void main(String[] args) {
	//arrays
	String dia[] = {"lunes", "martes", "miercoles"};
	String[] strArray = {"one", "two", "three"};
	int[] arr = {13, 7, 6, 45, 21, 9};
	//array toString
	String joinedString = Arrays.toString(strArray);
	System.out.println(joinedString);
	//array sort (ordenador)
	Arrays.sort(arr);
	//Printing the aray after sorting
	System.out.printf("Modifie arr[] : %s", Arrays.toString(arr));
	String nombre = "alvaro ac";
	System.out.printf("Tu nombre : %s", nombre);
}
}
