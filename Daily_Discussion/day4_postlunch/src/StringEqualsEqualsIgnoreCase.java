

// So for comparing string,
// 1) boolean equals(Object str)
// 2) boolean equalsIgnoreCase(Object str)
public class StringEqualsEqualsIgnoreCase {
	public static void main(String[] args) {
   // In the below 2 lines only one string literal object hello is created as
   // literals are constant and they are being kept in the string literal pool
	// When we write str1="Hello", The string pool is being checked for the existance of hello,
	// as it is not found so for the line 13th, hello is stored in the pool but
	// when we write the line 14th, string hello is already in the pool so no new hello literal is created
	String str1="hello";
	String str2="hello";
	boolean isEqual1=str1.equals(str2); 
	// whether the content of the object is same or not
	System.out.println(isEqual1);
	System.out.println(str1==str2);  // true because both str1 and str2 are pointing to the 
	// same literal hello
	// we are comparing that reference variables are pointing to the same 
	//object
    String str3=new String("hello");  // new two different objects are created
    String str4=new String("hello");
    boolean isEqual2=str3.equals(str4);
    System.out.println(isEqual2);    // true
    System.out.println(str3==str4);  // false   
 
    String str5="welcome";
    String str6="WElcome";
    System.out.println(str5.equals(str6));
    System.out.println(str5.equalsIgnoreCase(str6));  // compares without considering the case
    
	}
}
