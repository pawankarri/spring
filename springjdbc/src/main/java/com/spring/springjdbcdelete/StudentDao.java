package com.spring.springjdbcdelete;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int deleteStudent(Student s)
{
	String query="delete from student where id='"+s.getId()+"'";
	return jdbcTemplate.update(query);
}
}
