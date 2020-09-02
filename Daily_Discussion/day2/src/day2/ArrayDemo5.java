package day2;

public class ArrayDemo5 {

	
	//0,1,2,3,4,5,6,7,8,9
	//= 1,2,3,4,5,6,7,8,9,10( we dont have the 10th element)
	// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	// Throw an exception ----> ArrayIndexOutOfBoundsException
	// With the exception, the code stops working at the point of exception and
	// rest of the code is not executed
	
	public static void main(String[] args) {
	
    int num[]=new int[10];
    for(int i=1;i<=num.length;i++)
    {
    	System.out.println(num[i]);
    }
  System.out.println("The end of main");
	}

}
