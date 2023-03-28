package com.spring.springorm.delete;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
public class EmployeeDao {
private HibernateTemplate hibernateTemplate;

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
@Transactional(readOnly = false)
public void deleteEmployee(Employee e)
{
	hibernateTemplate.delete(e);
}
}
