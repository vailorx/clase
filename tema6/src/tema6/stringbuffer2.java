package tema6;

public class stringbuffer2 {
	 public static void main(String[] args) {
	        System.out.println();
	        StringBuffer strBuffer1 = new StringBuffer("DAM 2022");
	        strBuffer1.setCharAt(7, '0');
	        System.out.println("After setCharAt() String = " + strBuffer1.toString());
	        strBuffer1.deleteCharAt(5);
	        System.out.println("After deletion String = " + strBuffer1.toString());
	        strBuffer1.append(" - hola");
	        System.out.println(strBuffer1.toString());
	        strBuffer1.deleteCharAt(5);
	        System.out.println("after deletion new StringBuffer = " + strBuffer1);
	        //append
	        strBuffer1.append(" - hola");
	        System.out.println("Output: " + strBuffer1);
	        //Insert
	        strBuffer1.insert(3, "123");
	        System.out.println(strBuffer1);
	        //Reverse
	        strBuffer1.reverse();
	        System.out.println(strBuffer1);
	        //Deleting characters from index 6 to 8
	        strBuffer1.delete(6, 8);
	        System.out.println("after deletion is = " + strBuffer1);
	        //Reverse
	        strBuffer1.reverse();
	        System.out.println(strBuffer1);
	        //replace substring from index 5 to index 9
	        strBuffer1.replace(5,9, "Lang");
	        System.out.println("After replacing: " + strBuffer1);
	        
	    }

	
}
