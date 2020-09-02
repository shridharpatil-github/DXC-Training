package day2;


// Store the value of the counter in the array
public class ArrayDemo4 {

	public static void main(String[] args) {
		int array[]=new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i]=i;
		}
        System.out.println("The values are:");
		for (int num : array)
		{
			System.out.println(num);
		}
		
	}
	

}
