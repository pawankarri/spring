package com.spring.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
EmployeeDao dao=(EmployeeDao)ac.getBean("d");
	
	Employee e=new Employee();
	e.setId(200);
	e.setName("vinay");
	e.setSalary(70000);
	dao.saveEmployee(e);
}
}
