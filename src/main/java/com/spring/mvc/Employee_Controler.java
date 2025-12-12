package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class Employee_Controler {
	@RequestMapping("/")
	public String greetings() {
		System.out.println("running............");
		return "employe-form";
	}
	
	@RequestMapping("/getEmp")
	public String form(@RequestParam("name")String name ,@RequestParam("age")int age,Model model) {
		System.out.println("running............");
		
		Employee employee=new Employee(name,age);
		model.addAttribute("emp", employee);
		return "employe-profile";
	}

}

