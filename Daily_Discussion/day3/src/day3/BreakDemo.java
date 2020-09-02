package day3;

import java.util.Scanner;

// Enter either 10 numbers and perform sum or 
// if we enter 0, come out of the loop
public class BreakDemo {

	public static void main(String[] args) {
		int sum=0;
		int num;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the number");
			num=scan.nextInt();
			if(num==0)
			{
				break;
			}
			sum+=num;
		}
     System.out.println(sum);

	}

}
