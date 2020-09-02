package com.dxc.baseclass;
public class Main {
    public static void main(String str[]) {

     Shape shape=null;
     shape=new Triangle(); // The reference variable of Shape type is
     // currently storing the address of Triangle type
     shape.setX(10);
     shape.setY(2);
     // error because we don't have areaCalculate in the
     // base class
     //shape.areaCalculate();
    }
   }
  

