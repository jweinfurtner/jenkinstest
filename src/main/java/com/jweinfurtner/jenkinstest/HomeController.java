package com.jweinfurtner.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String homepage(Model model)
	{
		return "home";
	}
	
	@RequestMapping(value = "/test")
	public String test(Model model)
	{
		return "test";
	}
}
