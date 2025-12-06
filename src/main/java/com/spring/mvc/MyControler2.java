package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mobile")
public class MyControler2 {
	@RequestMapping
	public String greetings() {
		System.out.println("Mobile section running............");
		return "mobile";
	}
}

