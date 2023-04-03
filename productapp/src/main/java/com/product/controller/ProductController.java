package com.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.service.ProductService;
import com.product.utilities.ResponseObject;
import com.product.vo.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	private String successmsg=null;
	
	@RequestMapping("/product")
	public String openProductListPage(Model m) {
		
		ResponseObject responseobj = new ResponseObject();
		responseobj = service.getallproducts();
		List<Product> productList = new ArrayList<Product>();
		
		productList = (List<Product>) responseobj.getResponseoutput1();
		
		m.addAttribute("productList", productList); 
		m.addAttribute("successmsg",successmsg);
		
		return "listProduct";
	}
	
	@RequestMapping("/createproduct")
	public String opencreateProductListPage() {
		return "createproduct";
	}
	
	@RequestMapping(value = "/savenewproduct",method = RequestMethod.POST)
	public String saveNewProduct(@ModelAttribute Product product) {
		
		ResponseObject responseobj = new ResponseObject();
		responseobj = service.saveNewProduct(product);
		successmsg = responseobj.getResponsemessage();
		
		return "redirect:/product";
	}
	
	@RequestMapping("/deleteproduct/{productid}")
	public String deleteProduct(@PathVariable("productid") Integer productid) {
		
		System.out.println("productid" + productid);
		ResponseObject responseobj = new ResponseObject();
		responseobj = service.deleteProduct(productid);
		
		successmsg = responseobj.getResponsemessage();
		return "redirect:/product";
		
	}
	
	@RequestMapping("/editproduct/{productid}")
	public String editproduct(@PathVariable("productid") Integer productid,Model m) {
	
	  ResponseObject responseobj = new ResponseObject();
	  responseobj= service.getsingleProductDetails(productid);
	  Product product   = (Product) responseobj.getResponseoutput1();
	  
	  m.addAttribute("productvo", product);
	  
	  return "/editproduct";	
		
	}
	
	@RequestMapping(value="/editproduct/saveeditproduct", method = RequestMethod.POST)
	public String saveEditProduct(@ModelAttribute Product product) {
		ResponseObject responseobj = new ResponseObject();
		responseobj = service.saveEditProduct(product);
		successmsg = responseobj.getResponsemessage();
		return "redirect:/product";
	}
	
	
}
