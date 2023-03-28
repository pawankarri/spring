package com.spring.springorm.get;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao {
private HibernateTemplate template;
	
public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


public EmployeeDao() {
	super();
	// TODO Auto-generated constructor stub
}


public EmployeeDao(HibernateTemplate template) {
	super();
	this.template = template;
}

@Transactional(readOnly = false)
public List<Employee> getAll()
{
	List<Employee> list=new ArrayList<Employee>();
	list=template.loadAll(Employee.class);
	return list;
}

}
