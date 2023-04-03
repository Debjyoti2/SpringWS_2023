package com.product.vo;

public class Product {
	
	private Integer productid;
	private String productname;
	private String productdesc;
	private Integer productprice;
	private String productCreationDate;
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public Integer getProductprice() {
		return productprice;
	}
	public void setProductprice(Integer productprice) {
		this.productprice = productprice;
	}
	
	
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductCreationDate() {
		return productCreationDate;
	}
	public void setProductCreationDate(String productCreationDate) {
		this.productCreationDate = productCreationDate;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productdesc=" + productdesc
				+ ", productprice=" + productprice + ", productCreationDate=" + productCreationDate + "]";
	}


	
	

}
