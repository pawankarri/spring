package com.spring.springjdbcprepareinsert;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class StudentDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public Boolean saveStudentPrepareStatement(final Student s)
{
	String query="insert into student values(?,?,?)";
	return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			ps.setInt(1,s.getId());
			ps.setString(2,s.getName());
			ps.setString(3,s.getCity());
			return ps.execute();
		}
	});
}
}
