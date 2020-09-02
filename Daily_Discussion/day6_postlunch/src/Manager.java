import java.util.Scanner;
/*
 * illogical to have scanner
 * attribute for the manager
 */
public class Manager extends Employee{
private int id;
private String name;
private int yrsOfExperience;
// manager is a property called scanner
//private Scanner scanner=new Scanner(System.in);
public void setData()
{
	//Scanner object is a  Local object
	// local variable or local object
	// which is restricted within a method
	Scanner scanner=new Scanner(System.in);

	System.out.println("Enter the id for the employee");
	id=scanner.nextInt();
	System.out.println("Enter the name for the employee");
	name=scanner.next();
	System.out.println("Enter yrsOf Experience");
	yrsOfExperience=scanner.nextInt();
}
public void displayData()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(yrsOfExperience);
}
}
