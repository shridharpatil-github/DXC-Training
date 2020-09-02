package com.dxc.withoutabstractclass;

public class Triangle {
// instance variable
	  private int x;
	  private int y;
	
	  
	  public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	  
	public int areaCalculate()
	{
		// area as local variable
		// local variable is confined to a method
		int area=(x*y)/2;
	   return area;
	}
	
}
