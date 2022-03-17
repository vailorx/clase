package tema6;

import java.util.Arrays;

public class Sarrays4 {
public static void main(String[] args) {
	int ar[] = {2, 5, 1, 7, 3};
	Arrays.fill(ar, 10);
	System.out.println(Arrays.toString(ar));
	//fill from index 0 to index 2
	Arrays.fill(ar, 0, 2, 10);
}
}
