package com.jdbc.com.pwb.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.com.pwb.vo.User;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user  = new User();
		user.setAt_username(rs.getString("at_username"));
		user.setAt_userid(rs.getInt("at_userid"));
		user.setAt_email(rs.getString("at_email"));
		user.setAt_password(rs.getString("at_password"));
		user.setAt_gender(rs.getString("at_gender"));
		return user;
	}

}
