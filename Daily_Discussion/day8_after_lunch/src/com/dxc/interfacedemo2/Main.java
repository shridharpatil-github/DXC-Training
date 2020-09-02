package com.dxc.interfacedemo2;

public class Main {

	public static void main(String[] args) {
	Calculator1 cal=new MyNumber();
	cal.add(21,10);
	cal.subtract(20,10);
	// wIth the reference of cal will you be
	// able to call multiple and divide
	//cal.multiply();
	Calculator2 cal2=new MyNumber();
	cal2.divide(10, 2);
	cal2.multiply(2, 3);
	}

}
