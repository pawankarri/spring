package com.spring.constructorcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext as=new ClassPathXmlApplicationContext("applicationContext.xml");
	Question qq=(Question) as.getBean("q");
	qq.display();
}
}
