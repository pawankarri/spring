package com.spring.springorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao {
	@Autowired
 private HibernateTemplate template;
	@Transactional(readOnly = false)
	public void updateEmployee(Employee e)
	{
		template.update(e);
	}
}
