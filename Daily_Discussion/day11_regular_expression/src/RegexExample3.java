import java.util.regex.*;  
class RegexExample3{  
   public static void main(String args[]){  
      String content = "This is Amit from dxc";
	    

      String pattern = ".*is.*";

      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("The text contains is? " + isMatch);
   }
}  
