// method overloading
// 1) method name is same
// 2) return type can be same or different
// 3) number of arguments are different with different datatype
// String substring(int startIndex);
// String substring(int startIndex, int endIndex); endIndex-1
public class StringSubstring {

	public static void main(String[] args) {
		String str="welcome";
		String subString1=str.substring(3); // passing the startIndex only, it takes the substring from the startIndex to end of the string
        System.out.println(subString1);
        String subString2=str.substring(1,4);
        System.out.println(subString2);
        String subString3=str.substring(4,9); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
        System.out.println(subString3);
        String subString4=str.substring(4,-1); // Exception 
        
	}

}
