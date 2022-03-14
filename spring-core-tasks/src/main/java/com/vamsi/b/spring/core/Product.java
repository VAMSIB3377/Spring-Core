package com.vamsi.b.spring.core;

public class Product 
{
	private String productId;
	private String productName;
	private String productDesc;
	
	public Product(String productId, String productName, String productDesc) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		
	}	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ "]";
	}


	
	public String getProductId() {
		return productId;
	}



	public String getProductName() {
		return productName;
	}



	public String getProductDesc() {
		return productDesc;
	}



	
	
	
}
