// byte[] getBytes()
public class StringGetBytes {

	public static void main(String[] args) {
		
		String str="welcome";
	    byte byteArray[]=str.getBytes();
	    for ( byte byt : byteArray)
	    {
	    	System.out.println((char)byt);
	    }
	}

}
