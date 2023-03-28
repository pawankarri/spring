package com.spring.springjdbcupdate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springjdbcupdate/update.xml");
	StudentDao sd=(StudentDao) ac.getBean("sdao");
	int status=sd.updateStudent(new Student(2,"imran","ongole"));
	System.out.println(status);
}
}
