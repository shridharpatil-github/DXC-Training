package com.dxc.collection.arraylist;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {
public static void main(String[] args) {
	
	Set<EmployeeBean> emp = new TreeSet<EmployeeBean>();
//	Set s = new TreeSet();
//	s.add("ss");
//	s.add(123);
	EmployeeBean emp1 = new EmployeeBean();
	EmployeeBean emp2 = new EmployeeBean();
	EmployeeBean emp3 = new EmployeeBean();
	emp1.setId(1);
	emp1.setName("Ram");
	emp2.setId(2);
	emp2.setName("Kumar");
	emp3.setId(3);
	emp3.setName("rakesh");
	emp.add(emp1);
	emp.add(emp2);
	emp.add(emp3);
	for (EmployeeBean employeeBean : emp) {
		System.out.println(employeeBean);
	}
	Iterator<EmployeeBean> it = emp.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}

}
}
