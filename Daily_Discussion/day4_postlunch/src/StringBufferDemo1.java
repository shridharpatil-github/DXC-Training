
public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1); // empty string
		System.out.println(sb1.length()); //0
		sb1.append("hello");
		System.out.println(sb1.length()); //5
		System.out.println(sb1);

	}

}
