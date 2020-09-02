package com.hasarelationship;
// Employee is having Name and Address
// Has-A relationship
public class Employee {
private int id; // primitive type
private Name name;  // User Defined class
private Address address; // User Defined clas


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Name getName() {
	return name;
}
public void setName(Name name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}


}
