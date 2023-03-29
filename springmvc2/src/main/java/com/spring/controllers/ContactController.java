package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.vo.UserVO;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String getcontact() {
		return "contact";
	}
	
	/*
	@RequestMapping(value = "/processdata",method = RequestMethod.POST)
	public String processData(@RequestParam("userName") String userName, @RequestParam("userEmail") String userEmail,Model m) {
		m.addAttribute("userName", userName);
		m.addAttribute("userEmail", userEmail);
		
		return "success";
	}
	*/
	
	@RequestMapping(value = "/processdata",method = RequestMethod.POST)
	public String processData(@ModelAttribute UserVO user,Model m) {
		if(user.getUserName().isBlank()) {
		   m.addAttribute("ERROR_SHOW","Please provide user name");
		   return "redirect:/contact";
		}
		System.out.println(user); 
		return "success";
	}
	
	
	
	
	
	
	
	
}
