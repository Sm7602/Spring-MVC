package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.mvc.model.Employee;
import com.spring.mvc.service.EmployeeService;

@Controller
public class Employee_Controler {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/emp")
	public String greetings() {
		System.out.println("MyController.greetings()");
		return "employe-form";
	}

	@PostMapping("/saveEmp")
	public String formData(@ModelAttribute Employee employee, Model model) {
		System.out.println("MyController.formData");

		employeeService.saveEmp(employee);
		
		model.addAttribute("emp", employee);

		return "employe-profile";
	}

	@GetMapping("/getEmp/{id}")
	public String getEmpById(@PathVariable("id") int id, Model model) {

//		model.addAttribute("emp", hibernateTemplate.load(Employee.class, id));

		return "employee-profile";
	}
} 

