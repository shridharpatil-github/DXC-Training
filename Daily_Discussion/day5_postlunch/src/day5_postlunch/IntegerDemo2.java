package day5_postlunch;

public class IntegerDemo2 {

	public static void main(String[] args) {
		String str1="1000";
		String str2="2000";
		System.out.println(str1+str2); //10002000
		// 
		int num1=Integer.parseInt(str1); // parseInt method
		int num2=Integer.parseInt(str2);
		int result=num1+num2;
		// it is an untility method which performing just to convert
		// a string to an int for which we don't require different diffrent object
		

	}

}
