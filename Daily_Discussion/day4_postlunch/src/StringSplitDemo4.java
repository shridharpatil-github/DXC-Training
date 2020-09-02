
// String[] split(separator);
public class StringSplitDemo4 {

	public static void main(String[] args) {
		String names="ravi;akash#ranjan:sumit";
		String namesArray[]=names.split("[;:#]+"); // + 1 or more occurence
		for(String name : namesArray)
		{
			System.out.println(name);
		}
	}

}
