package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.rowmapper.EmployeeRowMapper;
import com.spring.vo.EmployeeVO;

@Repository
public class HomeDAOImpl implements HomeDAO{

	
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<EmployeeVO> getAllEmployyes() {
		
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		String query="select at_userid,at_username,at_email,at_password,at_gender from t_usermst order by at_userid desc";
		empList = jdbc.query(query, new EmployeeRowMapper());
		return empList;

	}

}
