package com.stackroute;

public class EvenCheck {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public boolean isEven()
	{
		boolean isEven=false;
		if(number%2==0)
		{
			isEven=true;
		}
		return isEven;
	}
}
