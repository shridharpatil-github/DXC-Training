package com.dxc.withoutabstractclass;

public class Rectangle {

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
		int area=x*y;
		return area;
	}
	
}
