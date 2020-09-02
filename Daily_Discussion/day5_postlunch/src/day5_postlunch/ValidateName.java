package day5_postlunch;
import java.util.Scanner;
public class ValidateName {

	
	public boolean isAllAlphabets(String name)
	{
		for(int i=0;i<name.length();i++)
		{
			if(!Character.isAlphabetic(name.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	    ValidateName validate=new ValidateName();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=scanner.next();
		// to access the non static member we need to create an object of ValidateName
		boolean validName=validate.isAllAlphabets(name);
	      // validName==true
		if(validName)  // true
	    {
	    	System.out.println("The name is valid");
	    }
		else
		{
			System.out.println("The name is invalid");
		}
	}

}
