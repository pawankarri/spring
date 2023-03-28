package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;
 
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/spring/springjdbc/insertContext.xml");
        StudentDao dao=(StudentDao) ac.getBean("sdao");
       Student s=new Student();
       s.setId(4);
       s.setName("nikhil");
       s.setCity("warangal");
       int status=dao.insertStudent(s);
       System.out.println(status);
    }
}