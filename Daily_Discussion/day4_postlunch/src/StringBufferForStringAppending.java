
public class StringBufferForStringAppending {

	public static void main(String[] args) {
		
		String str1="hello";
		String str2="world";
		String str3=str1+" "+str2;
		System.out.println(str3);
		String str4=str1.concat(" ").concat(str2);
		System.out.println(str4);
		
		StringBuffer sb1=new StringBuffer();
		// toString is method of the Object class
		// which is here overridden by the String class
		String str5=sb1.append(str1).append(" ").append(str2).toString();
       System.out.println(str5);
	}

}
