package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.mvc.dao.StudentDao;
import com.spring.mvc.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao stuDao;

	@Transactional
	public void saveStudent(Student student) {
		System.out.println("stuDao.savestuService()");
		if (student != null) {
			stuDao.saveStudent(student);
		}
	}

}
