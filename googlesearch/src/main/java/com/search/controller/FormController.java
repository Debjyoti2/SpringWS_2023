package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.search.vo.StudentVO;

@Controller
public class FormController {

	@RequestMapping("/viewform")
	public String showForm(Model m) {
		return "studentForm";
	}
	
	@RequestMapping(value="/submitform",method = RequestMethod.POST)
	public String processData(@ModelAttribute StudentVO student) {

		String b="abc";
		Integer.valueOf(b);
		
		String a =null;
		a.length();
		
		System.out.println(student);
		
		return "success";
		
	}
	


}
