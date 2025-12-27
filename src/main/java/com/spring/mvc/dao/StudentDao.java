package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.spring.mvc.model.Student;


@Repository
public class StudentDao {
	
	@Autowired
	private final HibernateTemplate hibernateTemplate;
	
	public StudentDao(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public void saveStudent(Student student)
	{
		System.out.println("StudentDao.saveEmpDao()");
		hibernateTemplate.save(student);
	}

}
