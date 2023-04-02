package com.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class CommonExceptionController {

	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerExc(Model m) {
		m.addAttribute("msg","Null Pointer exception occurred");
		return "error";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String handleNumberFormatExc(Model m) {
		m.addAttribute("msg","NumberFormat exception occurred");
		return "error";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleGenericExc(Model m) {
		m.addAttribute("msg","Some exception occurred");
		return "error";
	}
	
}
