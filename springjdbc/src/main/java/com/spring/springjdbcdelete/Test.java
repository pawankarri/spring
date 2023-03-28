package com.spring.springjdbcdelete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springjdbcdelete/deleteContext.xml");
	StudentDao s=(StudentDao) ac.getBean("sdao");
	Student ss=new Student();
	ss.setId(2);
	int status=s.deleteStudent(ss);
	System.out.println(status);
}
}
