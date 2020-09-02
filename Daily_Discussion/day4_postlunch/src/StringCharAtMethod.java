
public class StringCharAtMethod {
// char charAt( int pos)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="welcome";
    char ch=str.charAt(0);
    System.out.println(ch);
    //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
    //ch=str.charAt(20);
    //System.out.println(ch);
	}

}
