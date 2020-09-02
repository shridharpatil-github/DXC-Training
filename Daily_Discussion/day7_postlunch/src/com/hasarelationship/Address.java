package com.hasarelationship;

public class Address {
private int hNo;
private String streetName;
private String city;
private String locality;



public Address() {
	super();
	// TODO Auto-generated constructor stub
}


public Address(int hNo, String streetName, String city, String locality) {
	super();
	this.hNo = hNo;
	this.streetName = streetName;
	this.city = city;
	this.locality = locality;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + hNo;
	result = prime * result + ((locality == null) ? 0 : locality.hashCode());
	result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
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
	Address other = (Address) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (hNo != other.hNo)
		return false;
	if (locality == null) {
		if (other.locality != null)
			return false;
	} else if (!locality.equals(other.locality))
		return false;
	if (streetName == null) {
		if (other.streetName != null)
			return false;
	} else if (!streetName.equals(other.streetName))
		return false;
	return true;
}


public int gethNo() {
	return hNo;
}
public void sethNo(int hNo) {
	this.hNo = hNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
@Override
public String toString() {
	return "Address [hNo=" + hNo + ", streetName=" + streetName + ", city=" + city + ", locality=" + locality + "]";
}

}
