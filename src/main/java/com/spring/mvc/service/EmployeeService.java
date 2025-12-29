package com.spring.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.EmployeeDao;
import com.spring.mvc.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Transactional
	public void saveEmp(Employee employee) {
		System.out.println("EmployeeDao.saveEmpService()");
		if (employee != null) {
			empDao.saveEmp(employee);
		}
	}

}