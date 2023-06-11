package com.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.HomeService;
import com.spring.utility.UtilityClass;
import com.spring.vo.EmployeeVO;

@Controller
public class HomeController {
	
	@Autowired
	private  HomeService service;
	
	@Autowired
	private UtilityClass util;
	
	@RequestMapping("/home")
	public String home(Model model) {
		String name = "Debrup";
		model.addAttribute("EMPNAME", name);
		
		List<String> names = new ArrayList<String>();
		names.add("Vanu");
		names.add("Avik");
		model.addAttribute("NAMES",names);
		
		//git chk
		
		return "home";
	}
	
	@RequestMapping(value = "/getemployees", method = RequestMethod.GET, produces = "application/json")
	public List<EmployeeVO> getAllEmployyes(){
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		
		System.out.println(util.firstUtilityMethod());  
		
		empList = service.getAllEmployyes();
		return empList;
		
		
	}
	

}
