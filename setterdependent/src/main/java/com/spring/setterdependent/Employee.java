package com.spring.setterdependent;

public class Employee {
private int id;
private String name;
private Address add;
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
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public void show()
{
	System.out.println(id+" "+name+" "+add);
}
}
