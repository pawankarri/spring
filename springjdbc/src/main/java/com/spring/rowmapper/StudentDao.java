package com.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public List<Student> fetching()
{
	return jdbcTemplate.query("select * from springjdbc.student",new RowMapper<Student>()
			{
		public Student mapRow(ResultSet rs,int rownumber) throws SQLException
		{
			Student s=new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setCity(rs.getString(3));
			return s;
		}
			});
}
}
