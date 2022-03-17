package tema6;

public class Sarrays5 {
public static void main(String[] args) {
	//Array clone
	int num_array[] = {5,10,15,20,25,30};
	int clone_array[] = num_array.clone();
	System.out.println("original num_array: ");
	for(int i=0; i<num_array.length;i++) {
		System.out.println(num_array[i]+" ");
	}
	System.out.println();
	System.out.println("Clone num_array: ");
	for(int i=0;i<clone_array.length;i++) {
		System.out.println(clone_array[i]+" ");
	}
}
}
