package day3;

import java.util.Scanner;

// In Calculator2 the member variables are private
// so they are not accessible/visible in CalculatorMain2
// To access the member of a class first we have to create an object

public class CalculatorMain4 {
	public static void main(String[] args) {
	Calculator4 calc=new Calculator4();
    calc.setData(); //accept the value for num1 and num2
    calc.displayData(); // display the value for num1 and num2
    calc.add(); // which will perform addition of num1 and num2
    calc.subtract();
    }

}
