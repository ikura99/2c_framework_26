package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {
	
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String gitloginGet() {
		
	return "gitlogin";

	}
	

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String gitloginPost() {
		
	return "gititemlist";

	}
}
