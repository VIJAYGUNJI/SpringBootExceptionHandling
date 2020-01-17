package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/welcome")
	public String getWelocmeMsg(Model model)
	{
		model.addAttribute("wMsg", "Welcome to Spring  Exception Global Handling");
		String s=null;
		s.length();
		return "welcome";
	}

}
