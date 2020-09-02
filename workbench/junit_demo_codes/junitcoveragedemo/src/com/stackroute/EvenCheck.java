package com.stackroute;

public class EvenCheck {

	
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public boolean isEven()
	{
		boolean isEven=false;
		if(num%2==0)
		{
			isEven=true;
		}
		return isEven;
	}
	
}
