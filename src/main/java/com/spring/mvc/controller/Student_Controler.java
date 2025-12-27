package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.mvc.model.Student;
import com.spring.mvc.service.StudentService;

@Controller
public class Student_Controler {
	
	@Autowired
	private StudentService StudentService;
	
	@RequestMapping("/")
	public String greetings() {
		System.out.println("public String greetings()........");
		return "student-form";
	}
	
	@PostMapping("/savestu")
	public String saveStudent(@ModelAttribute Student student,Model model) {
		System.out.println("public String getstu()........");
		
		StudentService.saveStudent(student);
		model.addAttribute("stu", student);
		return "student-profile";
	}
	
//	@GetMapping("/getstu/{id}")
//	public String getstubyid(@PathVariable("id")int id,Model model) {
//		System.out.println("public String getstu()........");
//		model.addAttribute("stu", hibernateTemplate.load(Student.class, id));
//		return "student-profile";
//	}
//
//	
	

}
