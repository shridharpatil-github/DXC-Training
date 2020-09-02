package day2;

public class ArrayDemo3 {

	// for each loop
	// for
	// 1) declaring a variable of the type same as that of the array
	// 2) In our example as the array is of type int , so
	// 3) we declared a variable of type int to store the values
	// 4) passed from the array
	//  var : array
	//  int x : num
	// 5) for each is used for reading or accessing the data
	// 6) for storing the data , we don't use for each loop
	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5,10};
		for(int x : num )
		{
			System.out.println(x);
		}

	}

}
