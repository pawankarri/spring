package com.spring.springhibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
public class EmployeeDao {
HibernateTemplate template;
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
@Transactional(readOnly = false)
public void saveEmployee(Employee e){
	template.save(e);
}
}

