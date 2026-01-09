package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.model.Employee;


@Controller
public class Employee_Controler {
	
	@RequestMapping("/emp")
	@ResponseBody
	public Employee greetings() {
		System.out.println("running............");
		Employee kk=new Employee(1,51,"kk");
		return kk;
	}
	
} 

