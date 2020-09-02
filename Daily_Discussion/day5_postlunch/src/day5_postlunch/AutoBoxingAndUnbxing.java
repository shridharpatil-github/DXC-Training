package day5_postlunch;

public class AutoBoxingAndUnbxing {

	public static void main(String[] args) {
		int num=10;
		Integer intObj=new Integer(10); // converting a primitive type to object
        int num2=intObj.intValue();
        num2++;
        intObj=new Integer(num);
		
		Integer intObj2=num;  // Autoboxing ---> we are packing/boxing/enclosing primitive into object type
		System.out.println("Before incrementing");
		System.out.println(intObj2);
		intObj2++;
		System.out.println(intObj2);
		
		// Unboxing ==> converting from object to primitive type
		Integer intObj3=400;
		int num3=intObj3; // Unboxing the int variable
				
		
	}

}
