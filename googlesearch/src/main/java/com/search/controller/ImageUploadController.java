package com.search.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class ImageUploadController {

	@RequestMapping("/fileuploadform")
	public String openFileUploadForm() {
		return "fileupload_form";
	}
	
	@RequestMapping(value = "/processfrom",method = RequestMethod.POST)
	public String process(@RequestParam( value="profilepic",required = false) CommonsMultipartFile file,HttpSession session,Model m) {
		
		System.out.println("inside processfrom");
		System.out.println(file.getOriginalFilename());
		
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" +  File.separator
				 + "images" + File.separator + file.getOriginalFilename();
		
		System.out.println(path);
		
		try {
			FileOutputStream fis = new FileOutputStream(path);
			byte[] filebyte = file.getBytes();
			fis.write(filebyte);
			fis.close();
			
			System.out.println("file created successfully");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		m.addAttribute("filename", file.getOriginalFilename());
		m.addAttribute("msg", "file uploaded successfully");
		return "file_success";
	}

}
