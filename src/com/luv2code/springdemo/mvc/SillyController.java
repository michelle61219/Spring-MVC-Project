/*
 * Try to see what happens if there are two controllers that have the same mapping. 
 * 
 */
package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SillyController {
	
	// This will cause ambiguous mapping .. 
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
