package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.HomeDAO;
import com.spring.vo.EmployeeVO;

//@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private HomeDAO dao;

	public List<EmployeeVO> getAllEmployyes() {
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		empList= dao.getAllEmployyes();
		return empList;
	}

}
