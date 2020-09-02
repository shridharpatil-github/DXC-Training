package day3;

/*
 * In java we have 8 primitive data types
 *  char,byte(1),short(2),int(4),long(8),float,double
 *  boolean ---> true or false ( smallcase)
 * 
 */

/* type casting/explicit conversion/narrowing
 * When we try to convert a datatype of higher size( no of bytes are
 * more to a datatype where the number of bytes are less)
 * 
 *  long=2000;  ( 8 bytes/64bits----> 4 bytes)
 *  int i=l;   // compilation error
 *   i=(int)l; // type casting ---> ( I know what I am doing and I may loose
 *   some data and I am OK with that)
 *   
 * 
 * implicit conversion/widening 
 * When we assign a datatype of smaller size
 * into data type of higher size
 * int i=10;
 * long l=i;  // implicit conversion
 */
public class Revise1 {

	public static void main(String[] args) {
	
		char ch='a';
		byte b=1;
		//float f=12.4; // Compilation error because 12.4 is consider as double 
	    float fl1=12.4f;
	    float fl2=12.4F;
	    boolean b1=false;
	    boolean b2=true;
	    System.out.println(b1);
	    System.out.println(b2);
	}

}




