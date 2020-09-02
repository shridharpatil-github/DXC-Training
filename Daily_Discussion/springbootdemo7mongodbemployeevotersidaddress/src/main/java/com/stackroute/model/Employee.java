package com.stackroute.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	
    private int _id;
	private String empName;
	private String designation;
	private String department;
	private int basic;
	private VotersIdCard votersIdCard;
	private List<Address> addresses;
	
	

	
	  public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public VotersIdCard getVotersIdCard() { return votersIdCard; }
	  public void 	  setVotersIdCard(VotersIdCard votersIdCard) { this.votersIdCard =
	  votersIdCard; }
	 
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	
}
