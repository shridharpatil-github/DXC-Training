import java.util.regex.*;  
public class RegexExample1{  
public static void main(String args[]){  
  
Pattern p = Pattern.compile("niit");
Matcher m = p.matcher("niit");  
boolean b = m.matches();  
System.out.println(b);  
}
}
