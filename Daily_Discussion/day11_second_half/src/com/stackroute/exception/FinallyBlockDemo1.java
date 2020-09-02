package com.stackroute.exception;

class Demo{
	
	public void display()
	{
		int i=10;
		int j=0;
		System.out.println("Before exception");
		int res=i/j;
		System.out.println("I should be executed");
	}
}


public class FinallyBlockDemo1 {

	public static void main(String[] args) {
		try
		{
		Demo demo=new Demo();
		demo.display();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
