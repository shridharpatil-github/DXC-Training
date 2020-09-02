package com.dxc.abstractclass;
// Abstract classes are the generic base classes
// Why we need abstract class ?
// We need abstract class because sometime while designing
// the base class it is not possible to think of the implementation
// of some of the methods but we know what the method will do but
// we don;t know how the task will be achieved because the task or 
// the implementation will vary from one subclass to another subclass.
public abstract class Shape {
    protected int x;
    protected int y;
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

	 // this is a method without a body
	// we are not clear about the implementation
	// we cannot plan for implementation
	// a method without a body is called abstract method
	// method needs to be declared with the keyword abstract
	// a class having atleast one abstract method
	  // needs to be declared as abstract class
	 public abstract int areaCalculate();
   // setter/getter

   }