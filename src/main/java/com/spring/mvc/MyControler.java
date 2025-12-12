package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyControler {
	@RequestMapping
	public String greetings() {
		System.out.println("welcome running............");
		return "welcome";
	}
	@RequestMapping("/admin")
	public String admin( @RequestParam(name="username",defaultValue="geust")String username,Model model) {
		System.out.println("admin running............"+username);
		model.addAttribute("userName", username);
		return "admin-home";
	}

}

