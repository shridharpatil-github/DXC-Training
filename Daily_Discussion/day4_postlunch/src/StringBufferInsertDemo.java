
public class StringBufferInsertDemo {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("helo");
		System.out.println("Before Insert ");
		System.out.println(sb1);
		sb1.insert(2, 'l');
		System.out.println("After Insert");
		System.out.println(sb1);
	}

}
