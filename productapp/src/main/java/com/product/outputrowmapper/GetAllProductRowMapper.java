package com.product.outputrowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.product.vo.Product;

public class GetAllProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p = new Product();
		p.setProductid(rs.getInt("at_product_id"));
		p.setProductname(rs.getString("at_product_name"));
		p.setProductdesc(rs.getString("at_product_desc"));
		p.setProductprice(rs.getInt("at_product_price"));
		p.setProductCreationDate(rs.getString("at_created_on"));
		return p;
		
	}

}
