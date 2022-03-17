package tema6;

public class arraybidrapido {
public static void main(String[] args) {
	int array[][]= {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15}};
for(int i=0;i<array.length;i++) {
	System.out.println();
	for(int j=0;j<array[0].length;j++) {
		System.out.print(array[i][j] + " ");
	}
}
	
}
}

