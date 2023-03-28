package com.spring.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public List<Student> studentDetails()
{
	return jdbcTemplate.query("select * from springjdbc.student",new ResultSetExtractor<List<Student>>()
			{
		public List<Student> extractData(ResultSet rs) throws SQLException,  
        DataAccessException {  
		      
    List<Student> list=new ArrayList<Student>();  
    while(rs.next()){  
    	Student e=new Student();  
    e.setId(rs.getInt(1));  
    e.setName(rs.getString(2));  
    e.setCity(rs.getString(3));  
    list.add(e);  
    }  
    return list;  
    }  
});  
}
}
