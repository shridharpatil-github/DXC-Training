package com.dxc.cricketmatch.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * @author Paartha
 * User is model class used to transfer data.
 * {@Entity } Specifies that the class is an entity. This annotation is applied to the
 * entity class.
 */
@Entity
@Table(name = "user")
public class User {

	@ApiModelProperty(notes = "user id as email-id", name= "email", dataType = "String", required = true)
	@Id
	private String email;
	@ApiModelProperty(notes = "First name of user", name= "firstName", dataType = "String")
	private String firstName;
	@ApiModelProperty(notes = "Last name of user", name = "lastName" ,dataType = "String")
	private String lastName;
	@ApiModelProperty(notes = "Gender of user", name = "gender",dataType = "String")
	private String gender;
	@ApiModelProperty(notes = "First name of user", name = "password",dataType = "String")
	private String password;
	@ApiModelProperty(notes = "First name of user", name = "mobileNumber",dataType = "String")
	private String mobileNumber;
	

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param email
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param password
	 * @param mobileNumber
	 */

	public User(String email, String firstName, String lastName, String gender, String password, String mobileNumber) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}


	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}

	
	
	
}
