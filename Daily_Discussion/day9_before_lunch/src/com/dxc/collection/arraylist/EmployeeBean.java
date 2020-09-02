package com.dxc.collection.arraylist;

public class EmployeeBean implements Comparable<EmployeeBean> {
 
	private int id;
	private String name;
	
	@Override
	public int compareTo(EmployeeBean o) {
	if(this.id>o.id)
		return 1;
	else
		return -1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + "]";
	}
	
	
}
