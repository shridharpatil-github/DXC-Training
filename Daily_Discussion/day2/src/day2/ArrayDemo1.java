package day2;

public class ArrayDemo1 {

	// length is predefined attribute which
	// we can access and make use of
	// here the int array elements get a default value of 0
	// here the boolean array elements get a default value of 0
	public static void main(String[] args) {
	
		int num[]=new int[5];
		boolean b[]=new boolean[5];
		System.out.println("Integer array with default value-------");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
   		}

		System.out.println("-----Boolean array with default value-------");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
   		}

	}

}
