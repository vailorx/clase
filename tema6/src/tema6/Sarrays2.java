package tema6;

public class Sarrays2 {
public static void main(String[] args) {
	// Array original
	int[] array = {23, 43, 55};
	// Array copie del original
	int[] copiedArray = new int[3];
	//copia de los contenidos
	System.arraycopy(array, 0, copiedArray, 0, 3);
	//comprobar contenidos
	System.out.println(copiedArray[0]);
	System.out.println(copiedArray[1]);
	System.out.println(copiedArray[2]);
}
}
