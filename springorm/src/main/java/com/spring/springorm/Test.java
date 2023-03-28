package com.spring.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springorm/applicationContext.xml");
	EmployeeDao ed=(EmployeeDao) ac.getBean("dao");
	Employee eee=new Employee();
	eee.setId(147);
	eee.setName("nikhli");
	eee.setSalary(50000);
	ed.updateEmployee(eee);
}
}
