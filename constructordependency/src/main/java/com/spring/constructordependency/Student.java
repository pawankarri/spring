package com.spring.constructordependency;

public class Student {
private int id;
private String name;
public Student()
{
	System.out.println("hi hello");
}
public Student(int id)
{
	this.id=id;
}
public Student(String name)
{
	this.name=name;
}
public Student(int id, String name) {
	this.id = id;
	this.name = name;
}
public void show()
{
	System.out.println(id+" "+name);
}

}
