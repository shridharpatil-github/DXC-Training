package day3;

import java.util.Scanner;

// Enter 10 numbers from user
// If the numbers are even
// then only add the numbers
public class ContinueDemo {

	public static void main(String[] args) {
		int sum=0;
		int num;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the number");
			num=scan.nextInt();
			if(num%2!=0)
			{
				continue;
			}
			sum+=num;
		}
     System.out.println(sum);
	}

}
