package com.product.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.product.outputrowmapper.GetAllProductRowMapper;
import com.product.utilities.ResponseObject;
import com.product.vo.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public ResponseObject saveNewProduct(Product product) {

		ResponseObject responseobject = new ResponseObject();

		LocalDateTime ldt = LocalDateTime.now();

		String query = "insert into t_product(at_product_name,at_product_desc,at_product_price,at_active_flag,at_created_on,at_modified_on)"
				+ " values(?,?,?,?,?,?)";

		int insertedRowcount = jdbc.update(query, product.getProductname(), product.getProductdesc(),
				product.getProductprice(), "Y", ldt, ldt);

		if (insertedRowcount > 0) {
			responseobject.setResponsecode(1000);
			responseobject.setResponsemessage("Data Saved Sucessfully");
		} else {
			responseobject.setResponsecode(999);
			responseobject.setResponsemessage("Opps ! Some error occurred");
		}
 
		return responseobject;

	}
	
	@Override
	public ResponseObject getallproducts() {
		ResponseObject responseobject = new ResponseObject();
		String query="select at_product_id,at_product_name,at_product_desc,at_product_price,at_created_on,at_modified_on from t_product p where p.at_active_flag='Y' order by p.at_modified_on desc";
		List<Product> productList = new ArrayList<Product>();
		productList = jdbc.query(query, new GetAllProductRowMapper());
		
		if(productList.size()>0) {
			responseobject.setResponseoutput1(productList);
			responseobject.setResponsecode(1000);
			responseobject.setResponsemessage("Data fetched Sucessfully");
		}
		else {
			responseobject.setResponsecode(999);
			responseobject.setResponsemessage("Opps ! Some error occurred");
		}
		
		return responseobject;
		
	}
	
	
	public ResponseObject deleteProduct(Integer productid) {
		ResponseObject responseobject = new ResponseObject();
		
		LocalDateTime ldt = LocalDateTime.now();
		String sql= "update t_product p set p.at_active_flag='N',p.at_modified_on=? where p.at_product_id=?";
		
		int deletedrowcount = jdbc.update(sql, ldt,productid);
		
		if(deletedrowcount>0) {
			responseobject.setResponsecode(1000);
			responseobject.setResponsemessage("Data deleted Sucessfully");
		}
		else {
			responseobject.setResponsecode(999);
			responseobject.setResponsemessage("Opps ! Some error occurred");
		}
		
		return responseobject;
		
	}
	
	
	public ResponseObject getsingleProductDetails(Integer productid) {
		ResponseObject responseobject = new ResponseObject();
		
		String query="select at_product_id,at_product_name,at_product_desc,at_product_price,at_created_on,at_modified_on from t_product p where p.at_product_id=?";
		Product product = jdbc.queryForObject(query, new Object[] {productid}, new GetAllProductRowMapper());
		
		if(product.getProductid() !=null) {
			responseobject.setResponseoutput1(product);
			responseobject.setResponsecode(1000);
			responseobject.setResponsemessage("Data fetched Sucessfully");
		}
		else {
			responseobject.setResponsecode(999);
			responseobject.setResponsemessage("Opps ! Some error occurred");
		}
		
		return responseobject;
	}
	
	
	public ResponseObject saveEditProduct(Product product) {
		ResponseObject responseobject = new ResponseObject();
		LocalDateTime ldt = LocalDateTime.now();
		String query="update  t_product p set p.at_product_name=?,p.at_product_desc=?,p.at_product_price=?,p.at_modified_on=? where p.at_product_id=?";
		int rowupdatedcount = jdbc.update(query,product.getProductname(),product.getProductdesc(),product.getProductprice(),ldt,product.getProductid());
		
		if(rowupdatedcount>0) {
			responseobject.setResponsecode(1000);
			responseobject.setResponsemessage("Data updated Sucessfully");
		}
		else {
			responseobject.setResponsecode(999);
			responseobject.setResponsemessage("Opps ! Some error occurred");
		}
		return responseobject;
	}

}
