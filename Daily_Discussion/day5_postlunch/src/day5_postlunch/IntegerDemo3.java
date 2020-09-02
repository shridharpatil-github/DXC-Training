package day5_postlunch;

public class IntegerDemo3 {

	public static void main(String[] args) {
		
		String strNumbers="10;100;34;23;56";
		String array[]=strNumbers.split(";"); // array of strings
		int sum=0;
		for(String number : array)
		{
			sum+=Integer.parseInt(number);
		}
    System.out.println(sum);
	}

}
