package day3;

//have a number an check whether it is 
// even or odd through a method called evenCheck
// if it is even return true otherwise return false
public class Revise2 {

	public static void main(String[] args) {
	  int i=10;
	  boolean isEven=true;
	  isEven=evenCheck(i);
	  System.out.println(isEven);
	}

	private static boolean evenCheck(int i) {
		if(i%2==0)
		{
			return true;
		}
		return false;
	}

	

}
