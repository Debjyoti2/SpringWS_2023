package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/searchgoogle")
	public String openSearchView() {
		System.out.println("inside openSearchView method");
		return "search";
	}
	
	@RequestMapping("/submitsearch")
	public RedirectView dosubmitsearch(@RequestParam("searchkey") String searchkey) {
		System.out.println("key given : "  + searchkey);
		
		String url="https://www.google.com/search?q=" +searchkey; 
		RedirectView view = new RedirectView();
		view.setUrl(url);
		
		return view;
	}
	
	//Notes
	
	//1. redirect:/   ei tag ta use korbo jodi project er moddhe kono onno page e redirect korate chai.. means in same conext root e
	
	//2. RedirectView  use korbo jodi onno kono website e redirect korate chai... project r baire kono new url e. 
	     // project er context root r baire

}
