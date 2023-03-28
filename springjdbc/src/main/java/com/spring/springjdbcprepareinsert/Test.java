package com.spring.springjdbcprepareinsert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springjdbcprepareinsert/insertContext.xml");
	StudentDao ss=(StudentDao) ac.getBean("sdao");
	ss.saveStudentPrepareStatement(new Student(2,"imran","ongole"));
	
}
}
