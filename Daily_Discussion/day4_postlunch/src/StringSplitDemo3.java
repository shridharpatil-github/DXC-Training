
// String[] split(separator);
public class StringSplitDemo3 {

	public static void main(String[] args) {
		String names="hello friend how are you?";
		String namesArray[]=names.split("friend | are "); // + 1 or more occurence
		for(String name : namesArray)
		{
			System.out.println(name);
		}
	}

}
