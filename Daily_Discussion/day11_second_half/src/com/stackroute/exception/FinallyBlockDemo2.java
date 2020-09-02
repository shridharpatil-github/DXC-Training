package com.stackroute.exception;
/*
 * 
 * Before exception
I should be executed
/ by zero

 */
class Demo1{
	
	public void display()
	{
		try
		{
		int i=10;
		int j=0;
		System.out.println("Before exception");
		int res=i/j;
		}finally
		{
		System.out.println("I should be executed");
		}
		}
}


public class FinallyBlockDemo2 {

	public static void main(String[] args) {
		try
		{
		Demo1 demo=new Demo1();
		demo.display();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
