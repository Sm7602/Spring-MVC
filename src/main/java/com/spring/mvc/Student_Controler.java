package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Student;

@Controller
public class Student_Controler {
	@RequestMapping("/")
	public String greetings() {
		System.out.println("public String greetings()........");
		return "student-form";
	}
	
	@RequestMapping("/getstu")
	public String getstu(@RequestParam("name")String name,@RequestParam("department")String department ,@RequestParam("age")int age,@RequestParam("mark")int mark,@RequestParam("address")String address,@RequestParam("phnum")int phnum,Model model) {
		System.out.println("public String getstu()........");
		Student student=new Student(name,department,age,mark,address,phnum);
		model.addAttribute("stu", student);
		return "student-profile";
	}

}
