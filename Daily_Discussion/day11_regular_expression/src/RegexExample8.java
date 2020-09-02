import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
  
class RegexExample8
{ 
    public static void main(String[] args) 
    { 
        String txt = "welcome to NIIT"; 
  
        // Demonstrating ^ 
        String regex1 = "^welcome"; 
        Pattern pattern1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE); 
        Matcher matcher1 = pattern1.matcher(txt); 
        while (matcher1.find()) 
        { 
            System.out.println("Start index: " + matcher1.start()); 
            System.out.println("End index: " + matcher1.end()); 
        } 
  
        // Demonstrating $ 
        String regex2 = "NIIT$"; 
        Pattern pattern2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE); 
        Matcher matcher2 = pattern2.matcher(txt); 
        while (matcher2.find()) 
        { 
            System.out.println("\nStart index: " + matcher2.start()); 
            System.out.println("End index: " + matcher2.end()); 
        } 
    } 
} 
