package com.spring.autowire;

public class Second {
First f;
public Second()
{
	System.out.println("second is created");
	System.out.println("inside constructor");
}
public First getF() {
	return f;
}
public void setF(First f) {
	this.f = f;
}
public void print()
{
	System.out.println("second is printed");
}
public void display()
{
	print();
	f.print();
}
}
