package com.example.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	@RequestMapping(value="/date")
	public String getDate(Model model)
	{
		model.addAttribute("date", "Today's Date is::"+new Date());
		
		String s=null;
		s.length();
		return "dates";
		
	}

}
