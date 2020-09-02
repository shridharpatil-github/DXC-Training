package com.isarelationship;

public class Employee extends Person {
private int id;
private String desig;
private String dept;
private int basic;



public Employee() {
	super();
	id=1;
	desig="Manager";
	dept="Sales";
	basic=29000;
	// TODO Auto-generated constructor stub
}


public Employee(int age, String name,int id, String desig, String dept, int basic) {
	super(age,name);
	this.id = id;
	this.desig = desig;
	this.dept = dept;
	this.basic = basic;
}

public Employee(int id, String name) {
	super(id, name);
	// TODO Auto-generated constructor stub
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + basic;
	result = prime * result + ((dept == null) ? 0 : dept.hashCode());
	result = prime * result + ((desig == null) ? 0 : desig.hashCode());
	result = prime * result + id;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (basic != other.basic)
		return false;
	if (dept == null) {
		if (other.dept != null)
			return false;
	} else if (!dept.equals(other.dept))
		return false;
	if (desig == null) {
		if (other.desig != null)
			return false;
	} else if (!desig.equals(other.desig))
		return false;
	if (id != other.id)
		return false;
	return true;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", desig=" + desig + ", dept=" + dept + ", basic=" + basic + "]";
}

}
