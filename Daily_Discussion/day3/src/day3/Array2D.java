package day3;

public class Array2D {

	public static void main(String[] args) {
	
		int numbers[][]=new int[3][4];
// In 2D array if we write numbers.length
// it returns the number of rows
for(int row=0;row<numbers.length;row++)
    {
    	for(int col=0;col<numbers[row].length;col++)
    	{
    		System.out.print(numbers[row][col]+"\t");
    	}
    	System.out.println();
    }
		
	}

}
