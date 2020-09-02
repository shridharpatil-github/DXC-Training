package com.stackroute.exception;

// If we don't have any exception
// finally block will execute
class Demo3{
	
	public void display()
	{
		try
		{
		int i=10;
		int j=2;
		System.out.println("Before exception");
		int res=i/j;
		}finally
		{
		System.out.println("I should be executed");
		}
		}
}


public class FinallyBlockDemo3 {

	public static void main(String[] args) {
		try
		{
		Demo3 demo=new Demo3();
		demo.display();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
