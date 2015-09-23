package com.jweinfurtner.jenkinstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/")
	public String homepage(Model model)
	{
		model.addAttribute("test", "test1234");
		model.addAttribute("testProperty", environment.getProperty("my.test.property"));
		return "home";
	}
	
	@RequestMapping(value = "/test")
	public String test(Model model)
	{
		return "test";
	}
}
