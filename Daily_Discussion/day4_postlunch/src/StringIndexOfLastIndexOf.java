

//int indexOf(char); ---> first occurance
// int indexOf(String str) --> first occurance
// int lastIndexOf(char)
// int lastIndexOf(String)
public class StringIndexOfLastIndexOf {

	public static void main(String[] args) {
		String str="welcome";
		int pos1=str.indexOf('e');
		System.out.println(pos1);
		int pos2=str.lastIndexOf('e');
		System.out.println(pos2);
		int pos3=str.indexOf("come");
		System.out.println(pos3);
		
	}

}
