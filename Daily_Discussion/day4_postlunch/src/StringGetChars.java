

// void getChars(int source,int sourceEnd, char target[], int targetStart)
public class StringGetChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="welcome";
     int start=1;
     int end=6;  // the data fetched will endIndex-1
     char ch[]=new char[end-start];
     str.getChars(start,end, ch, 0);
     for(char c : ch)
     {
    	 System.out.println(c);
     }
	}

}
