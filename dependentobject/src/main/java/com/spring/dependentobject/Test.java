package com.spring.dependentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext as=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e=(Employee) as.getBean("emp");
	e.show();
}
}
