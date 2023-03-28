package com.spring.resultset;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/resultset/retriveContextxml.xml");
	StudentDao s=(StudentDao) ac.getBean("sdao");
	List<Student> l=s.studentDetails();
	for(Student ss:l)
	{
		System.out.println(ss);
	}
}
}
