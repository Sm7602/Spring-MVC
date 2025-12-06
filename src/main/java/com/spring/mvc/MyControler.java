package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControler {
	@RequestMapping("/")
	public String greetings() {
		System.out.println("running............");
		return "welcome";
	}

}

