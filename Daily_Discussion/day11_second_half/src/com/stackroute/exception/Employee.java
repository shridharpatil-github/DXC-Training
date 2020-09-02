package com.stackroute.exception;

public class Employee {
private int id;
private String name;
private String desig;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(int id, String name, String desig) {
	super();
	this.id = id;
	this.name = name;
	this.desig = desig;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((desig == null) ? 0 : desig.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (desig == null) {
		if (other.desig != null)
			return false;
	} else if (!desig.equals(other.desig))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
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
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + "]";
}

}
