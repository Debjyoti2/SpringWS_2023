package com.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.vo.EmployeeVO;

public class EmployeeRowMapper implements RowMapper<EmployeeVO> {

	public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		EmployeeVO emp  = new EmployeeVO();
		emp.setAt_username(rs.getString("at_username"));
		emp.setAt_userid(rs.getInt("at_userid"));
		emp.setAt_email(rs.getString("at_email"));
		emp.setAt_password(rs.getString("at_password"));
		emp.setAt_gender(rs.getString("at_gender"));
		return emp;
		
	}
	
	

}
