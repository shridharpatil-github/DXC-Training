package com.stackroute.exception;

/*
 *  if try catch and finally in the same block
 *  sequence will be 
 *  try
 *  catch
 *  finally
 * 
 * 
 */


class Demo4{
		public void display()
	{
		try
		{
		int i=10;
		int j=2;
		System.out.println("Before exception");
		int res=i/j;
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}finally
		{
		System.out.println("I should be executed");
		}
		}
}


public class FinallyBlockDemo4 {

	public static void main(String[] args) {
		try
		{
		Demo4 demo=new Demo4();
		demo.display();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
