package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
//	@GetMapping("/")
	@RequestMapping(value = "/", method =RequestMethod.GET )
	public String getRequest(Model model) {
		String s = "Amit";
		model.addAttribute("name", s);
		
		return "home";
	}

}
