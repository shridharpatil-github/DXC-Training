package com.stackroute.exception;

class Data
{
	
	public void method1()
	{
		// In method1 again no user defined
		// handler is being found , so 
		// control goes to main
		method2();
	}

	private void method2() {
		// In method2 again it is checked for the
		// handler , but handler is not found
		// now the control will go to method1
		method3();
		
	}

	private void method3() {
// first it will check whether we have the handler
	// present , currently not getting
		// now the control will move to method2
		int i=10;
		int j=0;
		int result=i/j;
		
	}
	
}

public class ExceptionChainOfMethods {

	public static void main(String str[])
	{
		// In main there is no handler , then
		// control goes to the default handler
		// which is part of JVM.
             Data data=new Data();
             data.method1();
	}
}
