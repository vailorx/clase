package tema6;
import java.util.HashSet;
public class arraylistnew {
public static void main(String[] args) {
	// A HashSet is a collection of items
	HashSet<String> cars = new HashSet<String>();
	//la diferencia 
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("BMW");
	cars.add("Mazda");
	System.out.println(cars);
}
}
