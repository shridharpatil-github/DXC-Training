package day3;

import java.util.Scanner;

public class Array2D3 {

	public static void main(String[] args) {
	
		int numbers[][]= new int[3][4];
// In 2D array if we write numbers.length
// it returns the number of rows
		Scanner scan=new Scanner(System.in);
		for(int row=0;row<numbers.length;row++)
	    {
	    	for(int col=0;col<numbers[row].length;col++)
	    	{
	    		System.out.println("Enter the value");
	    		// user input 
	    		numbers[row][col]=scan.nextInt();
	    	}
	    	
	    }		
		
System.out.println("The values are");
for(int row=0;row<numbers.length;row++)
    {
    	for(int col=0;col<numbers[row].length;col++)
    	{
    		System.out.print(numbers[row][col]+"\t");
    	}
    	System.out.println();
    }
		
	}

}
