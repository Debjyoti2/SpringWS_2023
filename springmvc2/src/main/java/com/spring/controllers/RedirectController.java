package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/pageone")
	public String pageone() {
		return "redirect:/pagetwo";
	}
	
	@RequestMapping("/pagetwo")
	public String pagetwo() {
		return "pagetwo";
	}
	
	
}

//   redirect:     this is called redirect prefix.