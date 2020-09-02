import java.util.Scanner;

// Base classes are always generic
// The Generic class keep all those attributes and methods
// which are common for the derived classes
// In Derived classes or subclasses
// we keep the attributes and methods
// which are specific to that derived class
// Conclusion is Derived class or subclasses
// are more specific as they have specific
// attributes
// whereas base class are much more generic
// and hold the properties and methods which
// can be shared by the all its sub classes

// Employee1 is the base class
// Clerk2 and Manager2 are the two subclasses of
// Employee1

public class Employee {
	    protected int id;
	    protected String name;
	   
	   public void setData()
	   {
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter the id for employee");
          id=scanner.nextInt();
          System.out.println("Enter the name for employee");
          name=scanner.next();
 }
	   
	   public void displayData()
	   {
		   System.out.println("Id "+id);
		   System.out.println("NAME "+name);
	   }
}
