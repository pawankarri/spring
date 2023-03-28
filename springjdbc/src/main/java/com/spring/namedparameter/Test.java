package com.spring.namedparameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/namedparameter/namedParameterContext.xml");
	StudentDao sd=(StudentDao) ac.getBean("sdao");
	sd.save(new Student(5,"mahesh","vizag"));
}
}
