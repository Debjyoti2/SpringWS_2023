package com.jdbc.com.pwb;

import java.util.ArrayList;
import java.util.List;

import com.jdbc.com.pwb.dao.UserDAOImpl;
import com.jdbc.com.pwb.vo.User;

public class TestRunner {
	
	
	
	public static void main(String[] args) {
		
		UserDAOImpl dao = new UserDAOImpl();
		
		
//		User user = new User();
//		user.setAt_userid(301);
//		user.setAt_username("Sunil");
//		user.setAt_email("a@tcs.com");
//		user.setAt_gender("M");
//		user.setAt_password("XYZ");
//		int rowinserted = dao.createUser(user);
//		System.out.println("User Created : " + rowinserted);
		
//		User user = dao.selectSingleUser(301);
//		System.out.println("User :: " + user);
		
		
		List<User> userList = new ArrayList<User>();
		userList = dao.selectAllUsers();
		for(User user : userList) {
			System.out.println("User :: " + user.toString());
		}
		
		
	}

}
