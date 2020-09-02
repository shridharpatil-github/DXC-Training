import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class RegexExample10  {

         public static void main(String[] args) {
         String date="12/10/2018";
         Pattern datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
         Matcher mat=datePatt.matcher(date);

          if(mat.matches())
     {
         System.out.println(mat.group(0));
                  int dd=Integer.parseInt(mat.group(1));
         int mm=Integer.parseInt(mat.group(2));
         int yy=Integer.parseInt(mat.group(3));
        System.out.println(dd);
        System.out.println(mm);
        System.out.println(yy);





     }

         }

 }
