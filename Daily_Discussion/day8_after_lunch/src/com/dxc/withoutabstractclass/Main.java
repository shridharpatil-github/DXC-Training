package com.dxc.withoutabstractclass;

public class Main {

	public static void main(String[] args) {
		
		Triangle triangle=new Triangle();
		Rectangle rectangle=new Rectangle();
		
		
		triangle.setX(10);
		triangle.setY(2);
		System.out.println("The area for triangle :");
		System.out.println(triangle.areaCalculate());
		
		rectangle.setX(4);
		rectangle.setY(2);
		System.out.println("The area for the rectangle");
		System.out.println(rectangle.areaCalculate());
     
		
		 
		
	}

}
