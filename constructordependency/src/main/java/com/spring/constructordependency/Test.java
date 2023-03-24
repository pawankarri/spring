package com.spring.constructordependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext as=new ClassPathXmlApplicationContext("applicationContext.xml");
	Student s=(Student) as.getBean("std");
	s.show();
}
}
