import java.util.regex.Pattern;


public class RegexExample2 {

	public static void main(String[] args) {
		String regex = "\\d+";

		// positive test cases, should all be "true"
		System.out.println("1".matches(regex));
		System.out.println("12345".matches(regex));
		System.out.println("123456789".matches(regex));

		// negative test cases, should all be "false"
		System.out.println("".matches(regex));
		System.out.println("foo".matches(regex));
		System.out.println("aa123bb".matches(regex));

		
		Pattern pattern = Pattern.compile(regex);
		System.out.println(pattern.matcher("1").matches());
		System.out.println(pattern.matcher("12345").matches());
		System.out.println(pattern.matcher("123456789").matches());
	}

}
