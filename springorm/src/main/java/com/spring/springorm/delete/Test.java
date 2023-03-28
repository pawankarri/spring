package com.spring.springorm.delete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springorm/delete/applicationContext.xml");
	EmployeeDao dao=(EmployeeDao) ac.getBean("dao");
	Employee e=new Employee();
	e.setId(147);
	e.setName("nikhil");
	e.setSalary(50000);
	dao.deleteEmployee(e);
}
}
