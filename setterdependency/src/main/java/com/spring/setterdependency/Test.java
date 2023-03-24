package com.spring.setterdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee ee=(Employee) ac.getBean("emp");
	ee.show();
}
}
