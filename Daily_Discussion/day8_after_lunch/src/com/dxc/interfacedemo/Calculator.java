package com.dxc.interfacedemo;

// In interfaces all the methods are abstract
// Interface provide rules or protocols
// in the form of method declarations
// add and subtract can be considered as
// protocol for the interface Calculator
// That means which so ever class implements
// Calculator , that class needs to 
// implement all the methods of the interface
// otherwise again that class needs to be declared
// as an abstract 
public interface Calculator {
int add(int a,int b);  // method is abstract
int substract(int a,int b); // method is abstract
}
