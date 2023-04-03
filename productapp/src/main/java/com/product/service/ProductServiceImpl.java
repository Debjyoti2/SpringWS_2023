package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDAO;
import com.product.utilities.ResponseObject;
import com.product.vo.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public ResponseObject saveNewProduct(Product product) {
		
		ResponseObject responseobject = new ResponseObject();
		responseobject  = dao.saveNewProduct(product);
		return responseobject;
		
	}
	
	@Override
	public ResponseObject getallproducts() {
		ResponseObject responseobj = new ResponseObject();
		responseobj = dao.getallproducts();
		return responseobj;
	}
	
	@Override
	public ResponseObject deleteProduct(Integer productid) {
		ResponseObject responseobject = new ResponseObject();
		responseobject = dao.deleteProduct(productid);
		return responseobject;
		
	}
	
	
	public ResponseObject getsingleProductDetails(Integer productid) {
		ResponseObject responseobject  = new ResponseObject();
		responseobject =dao.getsingleProductDetails(productid);
		return responseobject;
	}
	
	public ResponseObject saveEditProduct(Product product) {
		ResponseObject responseobject  = new ResponseObject();
		responseobject =dao.saveEditProduct(product);
		return responseobject;
	}
			
	

}
