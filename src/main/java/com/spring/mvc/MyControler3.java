package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodware")
public class MyControler3 {
	@RequestMapping
	public String greetings() {
		System.out.println("foodware section running............");
		return "foodware";
	}

}

