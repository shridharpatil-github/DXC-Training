import java.util.regex.*;  


/* .   ->	Any character (may or may not match line terminators)
\d  ->	A digit: [0-9]
\D  ->	A non-digit: [^0-9]
\s  ->	A whitespace character: [ \t\n\x0B\f\r]
\S  ->	A non-whitespace character: [^\s]
\w  ->	A word character: [a-zA-Z_0-9]
\W  ->	A non-word character: [^\w]
^	->    Matches the beginning of a line.
$	-> Matches then end of a line.
\b	-> Matches a word boundary.

*/

class RegexExample7{  
public static void main(String args[]){  
   // It would return true if string matches exactly "tom"
   System.out.println(
     Pattern.matches("tom", "Tom")); //False
	
   /* returns true if the string matches exactly 
    * "tom" or "Tom"
    */
   System.out.println(
     Pattern.matches("[Tt]om", "Tom")); //True
   System.out.println(
     Pattern.matches("[Tt]om", "Tom")); //True
	
   /* Returns true if the string matches exactly "tim" 
    * or "Tim" or "jin" or "Jin"
    */
   System.out.println(
     Pattern.matches("[tT]im|[jJ]in", "Tim"));//True
   System.out.println(
     Pattern.matches("[tT]im|[jJ]in", "jin"));//True
	
   /* returns true if the string contains "abc" at 
    * any place
    */
   System.out.println(
     Pattern.matches(".*abc.*", "deabcpq"));//True
	
   /* returns true if the string does not have a 
    * number at the beginning
    */
   System.out.println(
     Pattern.matches("^[^\\d].*", "123abc")); //False
   System.out.println(
     Pattern.matches("^[^\\d].*", "abc123")); //True
	
   // returns true if the string contains of three letters
   System.out.println(
     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));//True
   System.out.println(
     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));//True
   System.out.println(
     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));//False
	
   // returns true if the string contains 0 or more non-digits
   System.out.println(
     Pattern.matches("\\D*", "abcde")); //True
   System.out.println(
     Pattern.matches("\\D*", "abcde123")); //False
	
   /* Boundary Matchers example
    * ^ denotes start of the line
    * $ denotes end of the line
    */
   System.out.println(
     Pattern.matches("^This$", "This is Ravi")); //False
   System.out.println(
     Pattern.matches("^This$", "This")); //True
   System.out.println(
     Pattern.matches("^This$", "Is This Ravi")); //False
}
}
