
// String[] split(separator);
public class StringSplitDemo2 {

	public static void main(String[] args) {
		String names="ravi;akash;ranjan#sumit:Rajan";
		String namesArray[]=names.split(";|#|:");
		for(String name : namesArray)
		{
			System.out.println(name);
		}
	}

}
