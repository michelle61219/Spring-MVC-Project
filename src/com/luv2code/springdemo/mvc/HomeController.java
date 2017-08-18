package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// Define a request mapping method to map the root 
	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; 	// Return view name
	}

}
