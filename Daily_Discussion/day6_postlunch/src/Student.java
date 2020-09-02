// If we don;t provide any user defined constructor
// then constructor are provided with the code
// If the data type is of reference type, than
// they get initialised with null
// String ---> reference type
// Scanner ---- reference type/ Class ( predefined type )
// Primitive type data 
   // boolean
   // int 
   //char
   // byte
   // short
   // float
   // double
   // long
class Address{
	
	int hno;
	String locality;
	String city;
	
}

public class Student{  

int id;//field or data member or instance variable  
 String name;  // String is a predefined 
  Address address;  // Student and Address is a user defined
 public static void main(String args[]){  
  Student s1=new Student();//creating an object of Student  
  
 
  System.out.println(s1.id);//accessing member through reference variable  
  System.out.println(s1.name);   //null
  System.out.println(s1.address); //null
 }  
}  
