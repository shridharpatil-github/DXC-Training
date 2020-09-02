import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexExample4 {

	public static void main(String[] args) {
		String content = "This is a tutorial for regular expression!";
		String patternString = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(content);  
		boolean b = m.matches();  
		System.out.println(b); 
	
	}

}
