
// char[] toCharArray()
public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="welcome";
        char ch[]=str.toCharArray();
        for(char c : ch)
        {
        	System.out.println(c);
        }
        System.out.println("----------");
        for(int ctr=0;ctr<ch.length;ctr++)
        	
        {
        	System.out.println(ch[ctr]);
        }
	}

}
