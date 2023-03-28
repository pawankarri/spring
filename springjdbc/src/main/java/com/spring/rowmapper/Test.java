package com.spring.rowmapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/rowmapper/resultContext.xml");
	StudentDao ss=(StudentDao) ac.getBean("sdao");
	List<Student> ll=ss.fetching();
	for(Student l:ll)
	{
		System.out.println(l);
	}
}
}
