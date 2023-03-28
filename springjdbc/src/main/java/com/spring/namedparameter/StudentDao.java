package com.spring.namedparameter;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.mysql.jdbc.PreparedStatement;

public class StudentDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public void save(final Student s)
{
	String query="insert into employee values (:id,:name,:city)";  
	  
	Map<String,Object> map=new HashMap<String,Object>();  
	map.put("id",s.getId());  
	map.put("name",s.getName());  
	map.put("city",s.getCity());  
	  
	jdbcTemplate.execute(query, new PreparedStatementCallback() {  
	   
	    public Object doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	        return ps.executeUpdate();  
	    }

		public Object doInPreparedStatement(java.sql.PreparedStatement ps) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			return null;
		}  
	});  
}
}
