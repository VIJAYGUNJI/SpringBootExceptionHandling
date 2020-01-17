package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/getWelcomeMsg")
	public String getWelcomeMsg(Model model)
	{
		model.addAttribute("wMsg", "Welcome to Spring Boot Exception Handling");
		String s=null;
		s.length();
		
		return "welcome";
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandling(Model model)
	{
		String desc="Some problem is occuring please try after  some time";
		model.addAttribute("eMsg",desc);
		return "error";
	}

}
