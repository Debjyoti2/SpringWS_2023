package com.product.service;

import com.product.utilities.ResponseObject;
import com.product.vo.Product;

public interface ProductService {
	
	public ResponseObject saveNewProduct(Product product); 
	public ResponseObject getallproducts();
	public ResponseObject deleteProduct(Integer productid);
	public ResponseObject getsingleProductDetails(Integer productid);
	public ResponseObject saveEditProduct(Product product);
	
}
