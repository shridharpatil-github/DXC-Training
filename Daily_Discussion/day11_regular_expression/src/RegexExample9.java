import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample9 {

     

        public static void main(String[] args) {

            // using pattern with flags
String regex="ab";
            Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

           
            Matcher matcher= pattern.matcher("ABcabdAb");
            // using Matcher find(), group(), start() and end() methods

            while (matcher.find()) 

            { 
                System.out.println("Found the text\" "+ matcher.group()

                        + "\"starting at " + matcher.start()

                        + " index and ending at index " + matcher.end());
            }
     
        }
}
