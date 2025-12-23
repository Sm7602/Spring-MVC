package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Student;

@Controller
public class Student_Controler {
	Map<Integer,Student> map=new HashMap<>();
	int i=0;
	
	@RequestMapping("/")
	public String greetings() {
		System.out.println("public String greetings()........");
		return "student-form";
	}
	
	@PostMapping("/savestu")
	public String getstu(@ModelAttribute Student student,Model model) {
		System.out.println("public String getstu()........");
		student.setId(++i);
		map.put(student.getId(), student);
		model.addAttribute("stu", student);
		return "student-profile";
	}
	
	@GetMapping("/getstu/{id}")
	public String getstubyid(@PathVariable("id")int id,Model model) {
		System.out.println("public String getstu()........");
		Student student=map.get(id);
		model.addAttribute("stu", student);
		return "student-profile";
	}
	
	@GetMapping("/removestu/{id}")
	public String removestubyid(@PathVariable("id")int id,Model model) {
		System.out.println("public String getstu()........");
		Student student=map.remove(id);
		model.addAttribute("stu", student);
		return "student-profile";
	}
	
	

}
