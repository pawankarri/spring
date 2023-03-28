package com.spring.springjdbcupdate;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int updateStudent(Student s)
{
	String query="update student set name='"+s.getName()+"',city='"+s.getCity()+"' where id='"+s.getId()+"'";
	return jdbcTemplate.update(query);
}
}
