package com.spring.springorm.get;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springorm/get/applicationContext.xml");
	EmployeeDao da=(EmployeeDao) ac.getBean("dao");
	System.out.print(da.getAll());
}
}
