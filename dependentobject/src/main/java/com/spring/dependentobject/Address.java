package com.spring.dependentobject;

public class Address {
private String village;
private String state;
private String country;
public Address(String village, String state, String country) {
	super();
	this.village = village;
	this.state = state;
	this.country = country;
}
@Override
public String toString() {
	return "Address [village=" + village + ", state=" + state + ", country=" + country + "]";
}

}
