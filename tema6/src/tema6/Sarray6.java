package tema6;

import java.util.Arrays;

public class Sarray6 {
public static void main(String[] args) {
	//equals
	Object[] arr1 = new Object[] { 1, 123 };
	Object[] arr2 = new Object[] { 1, 123, 22, 4 };
	Object[] arr3 = new Object[] { 1, 123 };
	//comparing arr1 and arr2
	boolean retval = Arrays.equals(arr1, arr2);
	System.out.println("arr1 and arr2 equals: " + retval);
	//comparing arr1 and arr3
	boolean retval1 = Arrays.equals(arr1, arr3);
	System.out.println("arr1 and arr2 equals: " + retval1);
	
}
}
