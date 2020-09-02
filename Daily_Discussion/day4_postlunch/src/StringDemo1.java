
// How to create string object
public class StringDemo1 {

	public static void main(String[] args) {
	  // hello literal itself is an object
	 // str1 is a reference variable pointing to the
     // string literal which is an object
		String str1="hello";
        System.out.println(str1);
        String str2=new String("hello"); // Parameterized constructor
	    System.out.println(str2);
	    char ch[]= {'a','b','c','d','e'};
	    String str3=new String(ch);
	    byte b[]= {65,66,67,68,69};
	    String str4=new String(b);
	    System.out.println(str4);
	    String str5=new String(str1);
	    System.out.println(str5);
	}

}
