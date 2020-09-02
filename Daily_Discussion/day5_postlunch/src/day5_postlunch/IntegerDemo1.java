package day5_postlunch;

public class IntegerDemo1 {

	public static void main(String[] args) {
		// While creating the Integer
		// object we are invoking the
		// parameterized constructor
		// the data type of the argument
		// is the primitive int
		
		Integer intObj1=new Integer(4); // wrapping primitive int
		Integer intObj2=new Integer(intObj1); // wrapping again an object which is of Integer type
		Integer intObj3=new Integer("1000"); // 1000 is a number but currently as a string
		System.out.println(intObj1);
		System.out.println(intObj2);
		System.out.println(intObj3);
		// again convert from Integer object back to int primitive type
		 int i= intObj1.intValue();  // it was member method and not a static method
		System.out.println(i);
		
		Float floatObj=new Float("120.45");  // constructor which takes a string
		System.out.println(floatObj);
		float fl=floatObj.floatValue();
       System.out.println(floatObj);
       
        Byte byteObj=new Byte("100");  // constructor which takes a string representation of byte value
       System.out.println(byteObj);
       byte b=byteObj.byteValue();
       System.out.println(b);
	}

}
