package tema6;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
public static void main(String[] args) {
	//creating a list
	List<String> list=new ArrayList<String>();
	list.add("Mango");
	list.add("Apple");
	list.add("Banana");
	list.add("Grapes");
	//accesing the element 
	System.out.println("Returning element: " + list.get(1));
	//changing the element
	list.set(1, "Dates");
	//Iterating the list element using for-each loop
	//for orientada a objeto: variable fruit que recorre lista
	for(String fruit:list)
		System.out.println(fruit);
}
}
