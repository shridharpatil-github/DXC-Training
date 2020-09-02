package com.dxc.abstractclass;
public class Main {
    public static void main(String str[]) {

    // Reference variable is of Base type 
    // and object is of derived type.
    // In our example shape is of type Shape class which is the
    	// base class for both Triangle and Rectangle
    	// we never faced any challenge in calling setX and setY because
    	// those methods are already available in the base class Shape
    	// but for areaCalculate we didn;t intially included this method in
    	// the base class and we started facing challenge in calling
    	// areaCalculate of both rectangle and triangle
    	// so we kept the method areaCalculate in the base class shape
    	// without any body because Shape is generic class */
    	// without a body means method needs to be declared as abstract
    	// If we have abstract method, class also needs to be declared as abstract
    	// Abstract classes are always base class
    	// WE CANNOT CREATE AN OBJECT CLASS which mean we cannot write
    	// Shape shape=new Shape();
    	// Shape is actually an incomplete class in the sense that areaCalculate don't 
    	// have any body
    	// Shape class which is abstract base class is most of the time is create
    	// to keep some concrete methods( methods with body) and some abstract methods
    	// We can create a reference variable of abstract class.
    	// and store the address of its derived class object
     Shape shape=null;
     shape=new Triangle(); // The reference variable of Shape type is
     // currently storing the address of Triangle type
     shape.setX(10);
     shape.setY(2);
     // error because we don't have areaCalculate in the
     // base class
     shape.areaCalculate();
     shape=new Rectangle();
     shape.setX(10);
     shape.setY(5);
     shape.areaCalculate();
     
    }
   }
  

