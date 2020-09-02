package com.dxc.interfacedemo3;


// One interface can extend another interface
// but not implement
public interface Calculator2 extends Calculator1 {
int multiply(int a,int b);
int divide(int a,int b);	
}
