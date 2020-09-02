
// String[] split(separator);
public class StringSplitDemo1 {

	public static void main(String[] args) {
		String names="ravi;akash;ranjan;sumit";
		String namesArray[]=names.split(";");
		for(String name : namesArray)
		{
			System.out.println(name);
		}
	}

}
