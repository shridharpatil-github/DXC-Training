package day2;

public class ArrayDemo2 {
// In java if you want to add or concatenate anything to string,
// we can make use + operator
// println() --> ln is similar to \n after printing the
// The content of the argument being passed to println,
// cursor is taken to a new line
// System.out.print("Hello");
// System.out.print("World");
// Output of the above lines will HelloWorld
	public static void main(String[] args) {
		
		int num[]= {1,2,10,5,6,7};
		System.out.println("The array length is "+num.length);
		System.out.println("The values are:");
		for(int i=0;i<num.length;i++)
		{
			//System.out.print(num[i]);  // all the numbers are printed in one line without any space
		    System.out.print(num[i]+"\t"); // the numbers will be printed with a spacing of tab in between
		}

	}

}
