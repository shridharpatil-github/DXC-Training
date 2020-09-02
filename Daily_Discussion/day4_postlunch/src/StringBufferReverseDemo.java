
public class StringBufferReverseDemo {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println("Without reverse");
		System.out.println(sb1);
		System.out.println("With reverse");
		sb1.reverse();
		System.out.println(sb1);
	}

}
