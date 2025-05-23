package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerSubham {
	
	
	
	@GetMapping("subham")
	public String method() {
		
		
	return "subham";	
		
	}
	

}
