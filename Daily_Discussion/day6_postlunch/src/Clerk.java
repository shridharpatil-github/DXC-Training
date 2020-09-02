import java.util.Scanner;
// In the subclass clerk
// we kept only the specific
// attribute which is required
// by the subclass Clerk
public class Clerk extends Employee{
	
	private int typingSpeed;
	
	public void setData()
	{
		super.setData();
		//Scanner object is a  Local object
		// local variable or local object
		// which is restricted within a method
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Enter the typing speed");
		typingSpeed=scanner.nextInt();
	}

	public void displayData()
	{
		super.displayData();
		System.out.println(typingSpeed);
	}


	
}
