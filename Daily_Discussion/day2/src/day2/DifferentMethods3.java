package day2;

import java.util.Scanner;


// accept a number and an array and search
// whether the number is there in the array or not 
// if the number is there in the array return true 
// otherwise return false
// searchNumberFromArray(int num, int numArray[])
public class DifferentMethods3 {

	
	
	public static void main(String[] args) {
		int numberArray[]=new int[10];
		int searchNumber;
		boolean found;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 10 numbers in the array");
		for(int i=0;i<numberArray.length;i++)
		{
		  numberArray[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the number to be searched");
		searchNumber=scanner.nextInt();
		found= searchNumberFromArray(searchNumber,numberArray);
		System.out.println(found);

	}

	private static boolean searchNumberFromArray(int searchNumber, int[] numberArray) {
		
		for(int i=0;i<numberArray.length;i++)
		{
			if(searchNumber==numberArray[i])
			{
				return true;
			}
		}
		return false;
	}

	

}
