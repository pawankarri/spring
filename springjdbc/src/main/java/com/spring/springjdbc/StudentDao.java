package com.spring.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public int insertStudent(Student e)
{
	String query="insert into student values('"+e.getId()+"','"+e.getName()+"','"+e.getCity()+"')";
	return jdbcTemplate.update(query);
}
}
