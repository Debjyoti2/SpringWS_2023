package com.jdbc.com.pwb.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.com.pwb.DynamikApplicationContext;
import com.jdbc.com.pwb.rowmapper.UserRowMapper;
import com.jdbc.com.pwb.vo.User;

public class UserDAOImpl{

	private JdbcTemplate jdbc =(JdbcTemplate) DynamikApplicationContext.returnObject("jdbctemplate");
	
	public int createUser(User user) {
		String query = "insert into t_usermst (at_userid,at_username,at_email,at_password,at_gender) values(?,?,?,?,?)";
		int rowinserted = jdbc.update(query,
				user.getAt_userid(),
				user.getAt_username(),
				user.getAt_email(),
				user.getAt_password(),
				user.getAt_gender());
		return rowinserted;
		
	}
	
	public User selectSingleUser(int userId) {
		
		String sql="select at_userid,at_username,at_email,at_password,at_gender from t_usermst where at_userid=?";
		User user = jdbc.queryForObject(sql, new UserRowMapper(), userId);
		return user;
		
	}
	
	public List<User> selectAllUsers(){
		String sql="select at_userid,at_username,at_email,at_password,at_gender from t_usermst"; 
		List<User> userList = new ArrayList<User>();
		userList = jdbc.query(sql,new UserRowMapper());
		return userList;
		
	}

}
