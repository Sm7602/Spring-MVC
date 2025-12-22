package com.spring.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class Employee_Controler {
	Map<Integer,Employee> map=new HashMap<>();
	int i=0;
	@RequestMapping("/emp")
	public String greetings() {
		System.out.println("running............");
		return "employe-form";
	}
	
//	@RequestMapping("/saveEmp")
//	public String form(@RequestParam("id")int id,@RequestParam("name")String name ,@RequestParam("age")int age,Model model) {
//		System.out.println("running............");
//		Employee employee=new Employee(id,name,age);
//		map.put(employee.getId(),employee);
//		model.addAttribute("emp", employee);
//		return "employe-profile";
//	}
	
	@PostMapping("/saveEmp")
	public String form(@ModelAttribute Employee employee,Model model) {
		System.out.println("running............");
		employee.setId(++i);
		map.put(employee.getId(),employee);
		model.addAttribute("emp", employee);
		return "employe-profile";
	}
	
	@GetMapping("/getEmp/{id}")
	public String getEmpByid(@PathVariable("id")int id,Model model) {
		System.out.println("getemp............"+id);
		Employee employee=map.get(id);
		model.addAttribute("emp", employee);
		return "employe-profile";
	}
	
	@GetMapping("/removeEmp/{id}")
	public String remove(@PathVariable("id")int id,Model model) {
		System.out.println("remove............"+id);
		Employee employee=map.remove(id);
		model.addAttribute("emp", employee);
		return "employe-profile";
	}

}

